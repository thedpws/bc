grammar Calculator;
program: line*;
line: (topExpr | varDef)? (COMMENT)? NEWLINE;

varDef: id=ID '=' expr { System.out.println("*stores " +$id.text + " in symbol table*"); };

topExpr: expr 
    { System.out.println(Integer.toString($expr.i));}
;

expr returns [int i]: 
    el=expr op='^' er=expr { $i=1; for (int j=0; j<$er.i; j++) $i *= $el.i;}
    | el=expr op='*' er=expr { $i=$el.i*$er.i; }
    | el=expr op='/' er=expr { $i=$el.i/$er.i; }
    | el=expr op='+' er=expr { $i=$el.i+$er.i; }
    | el=expr op='-' er=expr { $i=$el.i-$er.i; }
    | el=expr op='%' er=expr { $i=$el.i%$er.i; }
    | INT { $i=Integer.parseInt($INT.text); }
    | id=ID { System.out.println("*looks up " + $id.text + " in symbol table*"); } 
    | '(' e=expr ')'    
    ;

BASICEXP                            // Basic Expressions
    : '-'
    | '+'
    | '--'
    | '++'
    ;                                  
BOOLEXP                             // Boolean Expressions
    : '!' 
    | '&&' 
    | '||'
    ;      
    
COMMENT: '/*' (.)*? '*/' -> skip;   //Comment

ID: [_A-Za-z]+;
INT: [0-9]+ ;
WS : [ \t]+ -> skip ;
NEWLINE: [\r\n];
