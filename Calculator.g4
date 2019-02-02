grammar Calculator;

@header {
    import java.util.*;
    import java.lang.*;
}

@parser::members { 
    Map<String, Double> memory = new HashMap<String, Double>(); 
    Scanner sc = new Scanner(System.in);
    final static double EPSILON = 0.0000000000000010;
    static boolean print = false;
}


program: line*;

line: (topExpr | topBoolExpr)? (COMMENT)? NEWLINE;

topBoolExpr
@after{ print=false; }: boolExpr { if (print) System.out.println($boolExpr.b); };
topExpr
@after{ print=false; }: expr { if (print) if ($expr.i % 1 < EPSILON) System.out.println((int)$expr.i); else System.out.println((double)$expr.i);} ;



expr returns [double i]
    : '(' e=expr ')'            { $i=$expr.i; print=true;} 
    | ID '--'                   { $i=memory.put($ID.text, memory.get($ID.text)-1); print=true;}
    | ID '++'                   { $i=memory.put($ID.text, memory.get($ID.text)+1); print=true;}
    | '--' ID                   { memory.put($ID.text, memory.get($ID.text)-1); $i=memory.get($ID.text); print=true;}
    | '++' ID                   { memory.put($ID.text, memory.get($ID.text)+1); $i=memory.get($ID.text); print=true;}
    | '-' ID                    { $i=-1.0*memory.get($ID.text); print=true;}
    | '+' ID                    { $i=memory.get($ID.text); print=true;}
    | el=expr op='^' er=expr      { $i=Math.pow($el.i, $er.i); print=true;}
    | el=expr op=('*'|'/'|'%') er=expr    { if($op.text.equals("*")) $i=$el.i*$er.i; else if($op.text.equals("/")) $i=$el.i/$er.i; else if($op.text.equals("%")) $i=$el.i%$er.i; print=true;}
    | el=expr op=('+'|'-') er=expr    { if($op.text.equals("+")) $i=$el.i+$er.i; else if($op.text.equals("-")) $i=$el.i-$er.i; print=true; }
    | NUM                       { $i=Double.parseDouble($NUM.text); print=true;}
    | 'read()'                  { $i = sc.nextDouble(); print=true;}
    | 'sqrt(' expr ')'          { $i = Math.sqrt($expr.i); print=true;}
    | 's(' expr ')'             { $i = Math.sin($expr.i); print=true;}
    | 'c(' expr ')'             { $i = Math.cos($expr.i); print=true;}
    | 'l(' expr ')'             { $i = Math.log($expr.i); print=true;}
    | 'e(' expr ')'             { $i = Math.exp($expr.i); print=true;}
    | ID                        { $i = memory.get($ID.text); print=true;} 
    | ID '=' expr               { $i=$expr.i; memory.put($ID.text, $expr.i); print=false;}
    | ID '^=' expr              { memory.put($ID.text, Math.pow(memory.get($ID.text), $expr.i)); $i=memory.get($ID.text); }
    | ID '%=' expr              { memory.put($ID.text, memory.get($ID.text)%$expr.i); $i=memory.get($ID.text); print=false;}
    | ID '*=' expr              { memory.put($ID.text, memory.get($ID.text)*$expr.i); $i=memory.get($ID.text); print=false;}
    | ID '/=' expr              { memory.put($ID.text, memory.get($ID.text)/$expr.i); $i=memory.get($ID.text); print=false;}
    | ID '+=' expr              { memory.put($ID.text, memory.get($ID.text)+$expr.i); $i=memory.get($ID.text); print=false;}
    | ID '-=' expr              { memory.put($ID.text, memory.get($ID.text)-$expr.i); $i=memory.get($ID.text); print=false;}
    | ID '=' expr               { $i=$expr.i; memory.put($ID.text, $expr.i); print=false;}

    ;

boolExpr returns [boolean b]
    : el=expr '<' er=expr       { $b=$el.i<$er.i; print=true;}
    | el=expr '<=' er=expr      { $b=$el.i<=$er.i; print=true;}
    | el=expr '>' er=expr       { $b=$el.i>$er.i; print=true;}
    | el=expr '>=' er=expr      { $b=$el.i>=$er.i; print=true;}
    | el=expr '==' er=expr      { $b=$el.i==$er.i; print=true;}
    | el=expr '!=' er=expr      { $b=$el.i!=$er.i; print=true;}
    | '!' boolExpr              { $b=!$boolExpr.b; print=true;}
    | elb=boolExpr '&&' erb=boolExpr { $b=$elb.b&&$erb.b; print=true;}
    | elb=boolExpr '||' erb=boolExpr { $b=$elb.b||$erb.b; print=true;}
    | 'true'                    { $b=true; print=true;}
    | 'false'                   { $b=false; print=true;}
    | ID '=' boolExpr           { memory.put($ID.text, $boolExpr.b ? 1.0:0.0); $b=$boolExpr.b;print=false;}
    ;

    
COMMENT: '/*' (.)*? '*/' -> skip;   //Comment

ID: [_A-Za-z]+;
NUM: [0-9]+('.'[0-9]+)? ;
WS : [ \t]+ -> skip ;
NEWLINE: [\r\n];
