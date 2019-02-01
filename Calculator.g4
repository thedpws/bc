grammar Calculator;

@header {
    import java.util.*;
    import java.lang.*;
}

@parser::members { 
    Map<String, Double> memory = new HashMap<String, Double>(); 
    Scanner sc = new Scanner(System.in);
    final static double EPSILON = 0.0;
}



program: line*;
line: (topExpr | topBoolExpr)? (COMMENT)? NEWLINE;

topBoolExpr: boolExpr { System.out.println($boolExpr.b); };
topExpr: expr { if ($expr.i % 1 < EPSILON) System.out.println((int)$expr.i); else System.out.println((double)$expr.i);} ;



expr returns [double i]: 
    el=expr op='^' er=expr      { $i=Math.pow($el.i, $er.i); }
    | el=expr op='*' er=expr    { $i=$el.i*$er.i; }
    | el=expr op='/' er=expr    { $i=$el.i/$er.i; }
    | el=expr op='+' er=expr    { $i=$el.i+$er.i; }
    | el=expr op='-' er=expr    { $i=$el.i-$er.i; }
    | el=expr op='%' er=expr    { $i=$el.i%$er.i; }
    | NUM                       { $i=Double.parseDouble($NUM.text); }
    | 'read()'                  { $i = sc.nextDouble(); }
    | 'sqrt(' expr ')'          { $i = Math.sqrt($expr.i); }
    | ID                        { $i = memory.get($ID.text); } 
    | '(' e=expr ')'            { $i=$expr.i; } 
    | ID '=' expr               { $i=$expr.i; memory.put($ID.text, $expr.i); }
    | '-' ID                    { $i=-1.0*memory.get($ID.text); }
    | '+' ID                    { $i=memory.get($ID.text); }
    | ID '--'                   { $i=memory.put($ID.text, memory.get($ID.text)-1); }
    | ID '++'                   { $i=memory.put($ID.text, memory.get($ID.text)+1); }
    | '--' ID                   { memory.put($ID.text, memory.get($ID.text)-1); $i=memory.get($ID.text); }
    | '++' ID                   { memory.put($ID.text, memory.get($ID.text)+1); $i=memory.get($ID.text); }
    | ID '^=' expr              { memory.put($ID.text, Math.pow(memory.get($ID.text), $expr.i)); $i=memory.get($ID.text); }
    | ID '%=' expr              { memory.put($ID.text, memory.get($ID.text)%$expr.i); $i=memory.get($ID.text); }
    | ID '*=' expr              { memory.put($ID.text, memory.get($ID.text)*$expr.i); $i=memory.get($ID.text); }
    | ID '/=' expr              { memory.put($ID.text, memory.get($ID.text)/$expr.i); $i=memory.get($ID.text); }
    | ID '+=' expr              { memory.put($ID.text, memory.get($ID.text)+$expr.i); $i=memory.get($ID.text); }
    | ID '-=' expr              { memory.put($ID.text, memory.get($ID.text)-$expr.i); $i=memory.get($ID.text); }
    ;

boolExpr returns [boolean b]
    : el=expr '<' er=expr       { $b=$el.i<$er.i; }
    | el=expr '<=' er=expr      { $b=$el.i<=$er.i; }
    | el=expr '>' er=expr       { $b=$el.i>$er.i; }
    | el=expr '>=' er=expr      { $b=$el.i>=$er.i; }
    | el=expr '==' er=expr      { $b=$el.i==$er.i; }
    | el=expr '!=' er=expr      { $b=$el.i!=$er.i; }
    | '!' boolExpr              { $b=!$boolExpr.b; }
    | elb=boolExpr '&&' erb=boolExpr { $b=$elb.b&&$erb.b; }
    | elb=boolExpr '||' erb=boolExpr { $b=$elb.b||$erb.b; }
    | 'true'                    { $b=true; }
    | 'false'                   { $b=false; }
    | ID '=' boolExpr           { memory.put($ID.text, $boolExpr.b ? 1.0:0.0); $b=$boolExpr.b;}
    ;



BOOLEXP                             // Boolean Expressions
    : '!' 
    | '&&' 
    | '||'
    ;      
    
COMMENT: '/*' (.)*? '*/' -> skip;   //Comment

ID: [_A-Za-z]+;
NUM: [0-9]+('.'[0-9]+)? ;
WS : [ \t]+ -> skip ;
NEWLINE: [\r\n];
