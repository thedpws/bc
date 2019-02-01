grammar Calculator;

@header {
    import java.util.*;
    import java.lang.*;
}

@parser::members { Map<String, Integer> memory = new HashMap<String, Integer>(); }


program: line*;
line: (topExpr | varDef)? (COMMENT)? NEWLINE;

varDef: ID '=' expr { 
    //System.out.println("*stores " +$ID.text + " in symbol table*");
    memory.put($ID.text, $expr.i);
};

topExpr: expr { System.out.println(Integer.toString($expr.i));} ;

expr returns [int i]: 
    el=expr op='^' er=expr { $i=1; for (int j=0; j<$er.i; j++) $i *= $el.i;}
    | el=expr op='*' er=expr    { $i=$el.i*$er.i; }
    | el=expr op='/' er=expr    { $i=$el.i/$er.i; }
    | el=expr op='+' er=expr    { $i=$el.i+$er.i; }
    | el=expr op='-' er=expr    { $i=$el.i-$er.i; }
    | el=expr op='%' er=expr    { $i=$el.i%$er.i; }
    | INT                       { $i=Integer.parseInt($INT.text); }
    | ID                        { $i = memory.get($ID.text); } 
    | '(' e=expr ')'            { $i=$expr.i; } 
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
