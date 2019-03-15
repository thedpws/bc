grammar CalculatorNoActions;

@header {}

@parser::members {}

// A program is a list of statements
program
@after {}
    : (topStatement)*
    ;

topStatement: statement delimiter+ {};

statement  
    : block                         {}
    | whileLoop                     {} //# while
    | forLoop                       {} //# for
    | ifStatement                   {} //# branch
    | defineFunction                {} //# fndef
    | 'break'                       {} //#break
    | 'continue'                    {} //#continue
    | 'halt'                        {} //#halt
    | 'return' expression           {} //#returnExpression
    | 'return'                      {} //#returnVoid
    // expression statements are printed on execution
    | expression                    {}
    ;

expression  
    : NUM                                   {}
    | fname '(' parameters ')'          {}
    | variable                              {}
    | '(' expression ')'                    {}
    | operand1=expression binaryOperator1 operand2=expression {}
    | operand1=expression binaryOperator2 operand2=expression {}
    | operand1=expression binaryOperator3 operand2=expression {}
    | variable unaryOperator                {}
    | unaryOperator variable                {}
    | unaryOperator expression              {}
    | variable operatorAssignment1 expression    {}
    | variable operatorAssignment2 expression    {}
    | variable operatorAssignment3 expression    {}
    | variable operatorAssignment4 expression    {}
    ;

/*
statementList  
    : statement delimiter                   {}
    | statement delimiter statementList     {}
    | delimiter {}
    ;
    */
statementList  
    : (statement delimiter+) statementList {}
    | statement delimiter+              {}
    ;

block  
    : '{' '\n'* (statementList) '\n'* '}' {}
    ;

whileLoop  
    : 'while' '(' condition ')' '\n'* statement   {}
    ;

forLoop  
    : 'for' '(' (expr1=statement)? ';' (expr2=condition)? ';' (expr3=statement)? ')' '\n'*  statement    {}
    ;

ifStatement  
    : 'if' '(' condition ')' delimiter* trueBranch=statement 'else' '\n'* falseBranch=statement                   {}
    | 'if' '(' condition ')' delimiter* trueBranch=statement                  {}
    ;

defineFunction  
    : 'define' fname '(' (defParameters)? ')' delimiter* block                 {}
    ;

condition  
    : 'true'                                        {}
    | 'false'                                       {}
    | '(' condition ')'                             {}
    | booleanUnaryOperator condition                {} // !true
    | lexpr=expression comparisonOperator rexpr=expression      {}// i < 0
    | leftCondition=condition booleanBinaryOperator1 rightCondition=condition 
{}// b1 && b2
    | leftCondition=condition booleanBinaryOperator2 rightCondition=condition 
{}// b1 || b2
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
parameters  
    : expression ',' parameters {}
    | expression               {}
    ;

defParameters  
    : variable ',' defParameters {}
    | variable               {}
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
