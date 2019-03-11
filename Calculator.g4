grammar Calculator;

@header {
}

@parser::members { 
}

// A program is a list of statements
program: statement*;

// Statements don't get printed
statement
    : ';'
    | expression ';'
    | '{' statement* '}' // block
    | while_
    | for_
    | if_
    | define
    ;

expression
    : NUM
    | variable
    | '(' expression ')'
    | variable unaryOperator             // i++
    | unaryOperator variable             // ++i
    | expression binaryOperator expression          // 5+5
    | variable operatorAssignment expression     // i += 1
    | function '(' expression* ')'          // e(5)
    ;

while_
    : 'while' '(' condition ')' statement
    ;

for_
    : 'for' '(' expression? ';' condition? ';' expression? ')' statement
    ;

if_
    : 'if' '(' condition ')' statement ('else' if_)* ('else' statement)?
    ;

define
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
    
COMMENT: '/*' (.)*? '*/' -> skip;
QUIT: 'quit' -> skip;

ID: ([a-z]+[_0-9a-zA-Z]*); 
NUM: [0-9]+('.'[0-9]+)? ;
WS : [ \t]+ -> skip ;
NEWLINE: [\r\n] -> skip ;
