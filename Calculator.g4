grammar Calculator;

@header {
}

@parser::members { 
    //AST ast = new AST();
}

// A program is a list of statements
program: statement*;

// Statements don't get printed
statement
    : delimiter
    | expression delimiter //{ ast.push(new Statement(new Expression($expression.text))); }
    | '{' statement* '}'
    | whileLoop
    | forLoop
    | ifStatement
    | defineFunction
    ;

expression
    : NUM
    | variable
    | '(' expression ')'
    | variable unaryOperator             // i++
    | unaryOperator expression             // ++i
    | expression binaryOperator expression          // 5+5
    | variable operatorAssignment expression     // i += 1
    | function '(' expression* ')'          // e(5)
    ;

whileLoop
    : 'while' '(' condition ')' statement
    ;

forLoop
    : 'for' '(' expression? ';' condition? ';' expression? ')' statement
    ;

ifStatement
    : 'if' '(' condition ')' statement ('else' statement)?
    ;

defineFunction
    : 'define' ID '(' (parameters)? ')' '{' statement* 'return' expression? ';' '}'
    ;

condition
    : 'true'
    | 'false'
    | '(' condition ')'
    | booleanUnaryOperator condition            // !true
    | expression comparisonOperator expression  // i < 0
    | condition booleanBinaryOperator condition // lo < hi && hi > lo
    ;

unaryOperator
    : '++'
    | '--'
    | '-'
    | '+'
    ;

binaryOperator
    : '+'
    | '-'
    | '*'
    | '/'
    | '^'
    | '%'
    ;
operatorAssignment
    : '='
    | '+='
    | '-='
    | '*='
    | '/='
    | '^='
    | '%='
    ;
comparisonOperator
    : '<'
    | '<='
    | '=='
    | '!='
    | '>='
    | '>'
    ;
booleanUnaryOperator
    : '!'
    ;

booleanBinaryOperator
    : '&&'
    | '||'
    ;

variable: ID;
function: ID;
parameters: ID (',' ID)*;

delimiter
    : ';'
    | NEWLINE
    ;
    
COMMENT: '/*' (.)*? '*/' -> skip;
QUIT: 'quit' -> skip;

ID: ([a-z]+[_0-9a-zA-Z]*); 
NUM: [0-9]+('.'[0-9]+)? ;
WS : [ \t]+ -> skip ;
NEWLINE: [\r\n] -> skip ;
