grammar Calculator;

@header {
}

@parser::members { 
}

// A program is a list of statements
program
    : (topStatement)*
    ;

topStatement: statement ;

// Statements don't get printed
statement 
    : block delimiter                                
    | whileLoop delimiter                           
    | forLoop delimiter                            
    | ifStatement delimiter                       
    | defineFunction      delimiter            
    | 'break'                     delimiter   
    | 'continue'                   delimiter 
    | 'halt'                      delimiter 
    | 'return' expression        delimiter 
    | 'return'                  delimiter 
    | expression delimiter
    ;

expression 
    : NUM                       
    | fname '(' parameters ')'          
    | variable                 
    | '(' expression ')'      
    | l=expression binaryOperator1 r=expression
    | l=expression binaryOperator2 r=expression
    | l=expression binaryOperator3 r=expression
    | variable unaryOperator 
    | expression unaryOperator             
    | unaryOperator variable
    | unaryOperator expression              
    | variable operatorAssignment expression    
    ;

statementList 
    : statement delimiter 
    | statement delimiter statementList 
    ;

block 
    : '{'('\n')? statementList? '}' 
    ;

whileLoop 
    : 'while' '(' condition ')' '\n'* statement   
    ;

forLoop 
    : 'for' '(' (expr1=statement)? ';' (expr2=condition)? ';' (expr3=statement)? ')' statement    
    ;

ifStatement 
    : 'if' '(' condition ')' trueBranch=statement ('else' falseBranch=statement)?                   
    ;

defineFunction 
    : 'define' fname '(' (parameters)? ')' '\n'* block                 
    ;

condition 
    : 'true'                                        
    | 'false'                                      
    | '(' condition ')'                           
    | booleanUnaryOperator condition             
                                                
    | lexpr=expression comparisonOperator rexpr=expression      
    | leftCondition=condition booleanBinaryOperator1 rightCondition=condition 
    | leftCondition=condition booleanBinaryOperator2 rightCondition=condition 
    ;

unaryOperator
    : ('++' | '--' | '-' | '+')
    ;

binaryOperator1
    : ('^')
    ;
binaryOperator2
    : ('*' | '/' | '%')
    ;
binaryOperator3
    : ('+' | '-')
    ;
operatorAssignment
    : ('=' | '^=' | '*=' | '/=' | '%=' | '+=' | '-=')
    ;
comparisonOperator
    : ('<' | '<=' | '==' | '!=' | '>=' | '>' )
    ;
booleanUnaryOperator
    : '!'
    ;

booleanBinaryOperator1: '&&';
booleanBinaryOperator2: '||';

variable: ID;
fname: ID;
parameters 
    : expression               
    | expression ',' parameters 
    ;

delimiter
    : ';' '\n'*
    | '\n'*
    ;
    
COMMENT: '/*' (.)*? '*/' -> skip;
QUIT: 'quit' -> skip;

ID: ([a-z]+[_0-9a-zA-Z]*); 
NUM: [0-9]+('.'[0-9]+)? ;
WS : [ \t]+ -> skip ;
NEWLINE: [\r\n];
