grammar Calculator;

@header {
}

@parser::members { 
    AST ast = new AST();
}

// A program is a list of statements
program
    : (topStatement)*
    ;

topStatement: statement { ast.push($statement.rval); };

statement returns [Statement rval]
    : block delimiter                       { $rval = $block.rval; ast.push($rval); }
    | whileLoop delimiter                   { $rval = $whileLoop.rval; ast.push($whileLoop.rval);} //# while
    | forLoop delimiter                     { ast.push($forLoop.rval); } //# for
    | ifStatement delimiter                 { ast.push($ifStatement.rval); } //# branch
    | defineFunction delimiter              { ast.push($defineFunction.rval);} //# fndef
    | 'break' delimiter                     { ast.push(new BreakStatement());} //#break
    | 'continue' delimiter                  { ast.push(new ContinueStatement()); } //#continue
    | 'halt' delimiter                      { ast.push(new HaltStatement()); } //#halt
    | 'return' expression delimiter         { ast.push(new ReturnStatement($expression.rval));} //#returnExpression
    | 'return' delimiter                    { ast.push(new ReturnStatement());} //#returnVoid
    // expression statements are printed on execution
    | expression delimiter                  { $rval = $expression.rval; ast.push($rval); }
    ;

expression returns [Expression rval]
    : NUM                                   { $rval = new ExpressionConstant(Double.parseDouble($NUM.text)); }
    | fname '(' parameters ')'          { $rval = new ExpressionFunctionCall($fname.text, $parameters.rval); }
    | variable                              { $rval = new ExpressionVariable($variable.text); }
    | '(' expression ')'                    { $rval = $expression.rval; }
    | operand1=expression binaryOperator1 operand2=expression { $rval = new Expression($operand1.rval, $binaryOperator1.text, $operand2.rval); }
    | operand1=expression binaryOperator2 operand2=expression { $rval = new Expression($operand1.rval, $binaryOperator2.text, $operand2.rval); }
    | operand1=expression binaryOperator3 operand2=expression { $rval = new Expression($operand1.rval, $binaryOperator3.text, $operand2.rval); }
    | variable unaryOperator                { $rval = new ExpressionVariableUnary(new ExpressionVariable($variable.text), $unaryOperator.text); }
    | expression unaryOperator              { $rval = new ExpressionUnary($expression.rval, $unaryOperator.text); }
    | unaryOperator variable                { $rval = new ExpressionVariableUnary($unaryOperator.text, new ExpressionVariable($variable.text)); }
    | unaryOperator expression              { $rval = new ExpressionUnary($unaryOperator.text, $expression.rval); }
    | variable operatorAssignment1 expression    { $rval = new ExpressionAssignment(new ExpressionVariable($variable.text), $operatorAssignment1.text, $expression.rval); }
    | variable operatorAssignment2 expression    { $rval = new ExpressionAssignment(new ExpressionVariable($variable.text), $operatorAssignment2.text, $expression.rval); }
    | variable operatorAssignment3 expression    { $rval = new ExpressionAssignment(new ExpressionVariable($variable.text), $operatorAssignment3.text, $expression.rval); }
    | variable operatorAssignment4 expression    { $rval = new ExpressionAssignment(new ExpressionVariable($variable.text), $operatorAssignment4.text, $expression.rval); }
    ;

statementList returns [List<Statement> rval]
    : statement delimiter                   { $rval = new LinkedList<Statement>(); $rval.add($statement.rval); }
    | statement delimiter statementList     { $rval = $statementList.rval; $rval.add($statement.rval); }
    ;

block returns [Block rval]
    : '{' ('\n')* statementList? '}' { $rval = new Block($statementList.rval); }
    ;

whileLoop returns [WhileLoop rval]
    : 'while' '(' condition ')' '\n'* statement   { $rval = new WhileLoop($condition.rval, $statement.rval); }
    ;

forLoop returns [ForLoop rval]
    : 'for' '(' (expr1=statement)? ';' (expr2=condition)? ';' (expr3=statement)? ')' '\n'*  statement    { $rval = new ForLoop($expr1.rval, $expr2.rval, $expr3.rval, $statement.rval); }
    ;

ifStatement returns [IfStatement rval]
    : 'if' '(' condition ')' '\n'* trueBranch=statement ('else' '\n'* falseBranch=statement)?                   { $rval = new IfStatement($condition.rval, $trueBranch.rval, $falseBranch.rval); }
    ;

defineFunction returns [Function rval]
    : 'define' fname '(' (parameters)? ')' '\n'* block                 { $rval = new Function($fname.text, $parameters.rval, $block.rval); }
    ;

condition returns [Condition rval]
    : 'true'                                        { $rval = new ConditionConstant(true); }
    | 'false'                                       { $rval = new ConditionConstant(false); }
    | '(' condition ')'                             { $rval = $condition.rval; }
    | booleanUnaryOperator condition                { $rval = new ConditionUnary($booleanUnaryOperator.text, $condition.rval);
                                                    } // !true
    | lexpr=expression comparisonOperator rexpr=expression      { $rval = new ConditionComparison($lexpr.rval, $comparisonOperator.text, $rexpr.rval);
                                                    }// i < 0
    | leftCondition=condition booleanBinaryOperator1 rightCondition=condition 
{ $rval = new ConditionBinary($leftCondition.rval, $booleanBinaryOperator1.text, $rightCondition.rval);
                                                    }// b1 && b2
    | leftCondition=condition booleanBinaryOperator2 rightCondition=condition 
{ $rval = new ConditionBinary($leftCondition.rval, $booleanBinaryOperator2.text, $rightCondition.rval);
                                                    }// b1 || b2
    ;

unaryOperator
    : ('++' | '--' | '-' | '+')
    ;

binaryOperator1: '^' ;
binaryOperator2: '*' | '/' | '%';
binaryOperator3: '+' | '-' ;


operatorAssignment1: '^=' ;
operatorAssignment2: '*=' | '/=' | '%=' ;
operatorAssignment3: '+=' | '-=' ;
operatorAssignment4:  '=' ;

comparisonOperator
    : ('<' | '<=' | '==' | '!=' | '>=' | '>' )
    ;

booleanUnaryOperator
    : '!'
    ;

booleanBinaryOperator1: '&&' ;
booleanBinaryOperator2: '||' ;

variable: ID;
fname: ID;
parameters returns [List<Expression> rval]
    : NUM               { $rval = new LinkedList<>(); $rval.add(new ExpressionConstant(Double.parseDouble($NUM.text))); }
    | ID                { $rval = new LinkedList<>(); $rval.add(new ExpressionVariable($ID.text));}
    | ID ',' parameters { $rval = $parameters.rval; $rval.add(new ExpressionVariable($ID.text)); }
    | NUM ',' parameters { $rval = $parameters.rval; $rval.add(new ExpressionConstant(Double.parseDouble($NUM.text))); }
    ;

delimiter
    : (';' | NEWLINE | <EOF>)
    ;
    
COMMENT: '/*' (.)*? '*/' -> skip;
QUIT: 'quit' -> skip;

ID: ([a-z]+[_0-9a-zA-Z]*); 
NUM: [0-9]+('.'[0-9]+)? ;
WS : [ \t]+ -> skip ;
NEWLINE: [\r\n];
