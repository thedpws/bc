grammar Calculator;

@header { import java.util.*; }

@parser::members { AST ast = new AST(); }

// A program is a list of statements
program
@after { System.out.println("\nAST:"); ast.print(); System.out.println("\nExecution:"); ast.execute(); }
    : (topStatement)*
    ;

topStatement: statement delimiter+ { ast.push($statement.rval); };

statement returns [Statement rval]
    : block                         { $rval = $block.rval;}
    | whileLoop                     { $rval = $whileLoop.rval;} //# while
    | forLoop                       { $rval = $forLoop.rval; } //# for
    | ifStatement                   { $rval = $ifStatement.rval; } //# branch
    | defineFunction                { $rval = $defineFunction.rval;} //# fndef
    | 'break'                       { $rval = new BreakStatement();} //#break
    | 'continue'                    { $rval = new ContinueStatement(); } //#continue
    | 'halt'                        { $rval = new HaltStatement(); } //#halt
    | 'return' expression           { $rval = new ReturnStatement($expression.rval);} //#returnExpression
    | 'return'                      { $rval = new ReturnStatement();} //#returnVoid
    // expression statements are printed on execution
    | condition                     { $rval = $condition.rval; }
    | expression                    { $rval = $expression.rval;}
    ;

expression returns [Expression rval]
    : NUM                                   { $rval = new ExpressionConstant(Double.parseDouble($NUM.text)); }
    | fname '(' parameters ')'          { $rval = new ExpressionFunctionCall($fname.text, $parameters.rval); }
    | variable                              { $rval = new ExpressionVariable($variable.text); }
    | '(' expression ')'                    { $rval = $expression.rval; }
    | operand1=expression binaryOperator1 operand2=expression { $rval = new ExpressionBinary($operand1.rval, $binaryOperator1.text, $operand2.rval); }
    | operand1=expression binaryOperator2 operand2=expression { $rval = new ExpressionBinary($operand1.rval, $binaryOperator2.text, $operand2.rval); }
    | operand1=expression binaryOperator3 operand2=expression { $rval = new ExpressionBinary($operand1.rval, $binaryOperator3.text, $operand2.rval); }
    | variable unaryOperator                { $rval = new ExpressionVariableUnary(new ExpressionVariable($variable.text), $unaryOperator.text); }
    | unaryOperator variable                { $rval = new ExpressionVariableUnary($unaryOperator.text, new ExpressionVariable($variable.text)); }
    | unaryOperator expression              { $rval = new ExpressionUnary($unaryOperator.text, $expression.rval); }
    | variable operatorAssignment1 expression    { $rval = new ExpressionAssignment(new ExpressionVariable($variable.text), $operatorAssignment1.text, $expression.rval); }
    | variable operatorAssignment2 expression    { $rval = new ExpressionAssignment(new ExpressionVariable($variable.text), $operatorAssignment2.text, $expression.rval); }
    | variable operatorAssignment3 expression    { $rval = new ExpressionAssignment(new ExpressionVariable($variable.text), $operatorAssignment3.text, $expression.rval); }
    | variable operatorAssignment4 expression    { $rval = new ExpressionAssignment(new ExpressionVariable($variable.text), $operatorAssignment4.text, $expression.rval); }
    ;

/*
statementList returns [List<Statement> rval]
    : statement delimiter                   { $rval = new LinkedList<Statement>(); $rval.add($statement.rval); }
    | statement delimiter statementList     { $rval = $statementList.rval; $rval.add($statement.rval); }
    | delimiter { $rval = new LinkedList<Statement>(); $rval.add(new BlankStatement()); }
    ;
    */
statementList returns [LinkedList<Statement> rval]
    : (statement delimiter+) statementList {$rval = $statementList.rval; $rval.addFirst($statement.rval);  }
    | statement delimiter+              { $rval = new LinkedList<Statement>(); $rval.add($statement.rval);  }
    | ()                                { $rval = new LinkedList<Statement>(); }
    ;

block returns [Block rval]
    : '{' '\n'* (statementList) '\n'* '}' { $rval = new Block($statementList.rval); }
    ;

whileLoop returns [WhileLoop rval]
    : 'while' '(' condition ')' '\n'* block   { $rval = new WhileLoop($condition.rval, $block.rval); }
    | 'while' '(' condition ')' '\n'* statement { List<Statement> statements = new LinkedList<>(); statements.add($statement.rval); $rval = new WhileLoop($condition.rval, new Block(statements)); }
    ;

forLoop returns [ForLoop rval]
    : 'for' '(' (expr1=statement)? ';' (expr2=condition)? ';' (expr3=statement)? ')' '\n'*  block    { if ($expr1.rval == null) $expr1.rval = new BlankStatement(); if ($expr2.rval == null) $expr2.rval = new ConditionConstant(false); if ($expr3.rval == null) $expr3.rval = new BlankStatement(); $rval = new ForLoop($expr1.rval, $expr2.rval, $expr3.rval, $block.rval); }
    | 'for' '(' (expr1=statement)? ';' (expr2=condition)? ';' (expr3=statement)? ')' '\n'*  statement    { if ($expr1.rval == null) $expr1.rval = new BlankStatement();  if ($expr2.rval == null) $expr2.rval = new ConditionConstant(false); if ($expr3.rval == null) $expr3.rval = new BlankStatement(); List<Statement> statements = new LinkedList<>(); statements.add($statement.rval); Block block = new Block(statements); $rval = new ForLoop($expr1.rval, $expr2.rval, $expr3.rval, block); }
    ;

ifStatement returns [IfStatement rval]
    : 'if' '(' condition ')' delimiter* trueBranch=statement 'else' '\n'* falseBranch=statement                   { $rval = new IfStatement($condition.rval, $trueBranch.rval, $falseBranch.rval); }
    | 'if' '(' condition ')' delimiter* trueBranch=statement                  { $rval = new IfStatement($condition.rval, $trueBranch.rval); }
    ;

defineFunction returns [FunctionDefinition rval]
    : 'define' fname '(' (defParameters)? ')' delimiter* block                 { $rval = new FunctionDefinition($fname.text, $defParameters.rval, $block.rval); }
    ;

condition returns [Condition rval]
    : 'true'                                        { $rval = new ConditionConstant(true); }
    | 'false'                                       { $rval = new ConditionConstant(false); }
    | '(' condition ')'                             { $rval = $condition.rval; }
    | booleanUnaryOperator condition                { $rval = new ConditionUnary($booleanUnaryOperator.text, $condition.rval); } // !true
    | lexpr=expression comparisonOperator rexpr=expression      { $rval = new ConditionComparison($lexpr.rval, $comparisonOperator.text, $rexpr.rval); }// i < 0
    | leftCondition=condition booleanBinaryOperator1 rightCondition=condition 
{ $rval = new ConditionBinary($leftCondition.rval, $booleanBinaryOperator1.text, $rightCondition.rval); }// b1 && b2
    | leftCondition=condition booleanBinaryOperator2 rightCondition=condition 
{ $rval = new ConditionBinary($leftCondition.rval, $booleanBinaryOperator2.text, $rightCondition.rval); }// b1 || b2
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
parameters returns [LinkedList<Expression> rval]
    : expression ',' parameters { $rval = $parameters.rval; $rval.addFirst($expression.rval); }
    | expression               { $rval = new LinkedList<>(); $rval.add($expression.rval); }
    ;

defParameters returns [LinkedList<ExpressionVariable> rval]
    : variable ',' defParameters { $rval = $defParameters.rval; $rval.addFirst(new ExpressionVariable($variable.text)); }
    | variable               { $rval = new LinkedList<>(); $rval.add(new ExpressionVariable($variable.text)); }
    ;
delimiter
    : ';'
    | '\n'
    ;
    
COMMENT: '/*' (.)*? '*/' -> skip;
QUIT: 'quit' -> skip;

ID: ([a-z]+[_0-9a-zA-Z]*); 
NUM: [0-9]+('.'[0-9]+)? ;
WS : [ \t]+ -> skip ;
NEWLINE: [\r\n];
