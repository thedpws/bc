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
    '(' e=expr ')'            { $i=$expr.i; } 
    | ID '--'                   { $i=memory.put($ID.text, memory.get($ID.text)-1); }
    | ID '++'                   { $i=memory.put($ID.text, memory.get($ID.text)+1); }
    | '--' ID                   { memory.put($ID.text, memory.get($ID.text)-1); $i=memory.get($ID.text); }
    | '++' ID                   { memory.put($ID.text, memory.get($ID.text)+1); $i=memory.get($ID.text); }
    | '-' ID                    { $i=-1*memory.get($ID.text); }
    | '+' ID                    { $i=memory.get($ID.text); }
    | el=expr op='^' er=expr { $i=(int)Math.pow($el.i, $er.i); }
    | el=expr op=('*'|'/'|'%') er=expr    { if($op.text.equals("*")) $i=$el.i*$er.i; else if($op.text.equals("/")) $i=$el.i/$er.i; else if($op.text.equals("%")) $i=$el.i%$er.i; }
    | el=expr op=('+'|'-') er=expr    { if($op.text.equals("+")) $i=$el.i+$er.i; else if($op.text.equals("-")) $i=$el.i-$er.i; }
    | INT                       { $i=Integer.parseInt($INT.text); }
    | ID                        { $i = memory.get($ID.text); } 
    | ID '=' expr               { $i=$expr.i; memory.put($ID.text, $expr.i); }
    | ID '^=' expr              { memory.put($ID.text, (int)Math.pow(memory.get($ID.text), $expr.i)); $i=memory.get($ID.text); }    
    | ID '%=' expr              { memory.put($ID.text, memory.get($ID.text)%$expr.i); $i=memory.get($ID.text); }
    | ID '*=' expr              { memory.put($ID.text, memory.get($ID.text)*$expr.i); $i=memory.get($ID.text); }
    | ID '/=' expr              { memory.put($ID.text, memory.get($ID.text)/$expr.i); $i=memory.get($ID.text); }
    | ID '+=' expr              { memory.put($ID.text, memory.get($ID.text)+$expr.i); $i=memory.get($ID.text); }
    | ID '-=' expr              { memory.put($ID.text, memory.get($ID.text)-$expr.i); $i=memory.get($ID.text); }
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
