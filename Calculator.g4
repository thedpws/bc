grammar Calculator;

@header {
    import java.util.*;
    import java.lang.*;
}

@parser::members { 
    static Map<String, Double> memory = new HashMap<String, Double>(); 
    Scanner sc = new Scanner(System.in);
    final static double EPSILON = 0.0000000000000000;
    static boolean print = false;
    static boolean printDouble = false;

    //returns the previous value
    private static Double insert(String key, Double value){ return memory.put(key, value); }

    private static boolean has(String key){ return memory.get(key) != null; }

    private static Double lookup(String key){ if (!has(key)) insert(key, 0.0); return memory.get(key); }
}


program: line*;

line: (topExpr | topBoolExpr)? (COMMENT)? NEWLINE;

topBoolExpr
@after{ print=false; printDouble=false; }: boolExpr { if (print) System.out.println($boolExpr.b); };
topExpr
@after{ print=false; printDouble=false; }: expr { if (print) if ($expr.i % 1 <= EPSILON) System.out.println((int)$expr.i); else System.out.printf("%.20f%n", $expr.i);} ;



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
    | 'sqrt(' expr ')'          { $i = Math.sqrt($expr.i); print=true; printDouble=true;}
    | 's(' expr ')'             { $i = Math.sin($expr.i); print=true;}
    | 'c(' expr ')'             { $i = Math.cos($expr.i); print=true;}
    | 'l(' expr ')'             { $i = Math.log($expr.i); print=true;}
    | 'e(' expr ')'             { $i = Math.exp($expr.i); print=true;}
    | ID                        { $i = lookup($ID.text); print=true;} 
    | '(' e=expr ')'            { $i=$expr.i; print=true;} 
    | ID '=' expr               { $i=$expr.i; insert($ID.text, $expr.i); print=false;}
    | '-' ID                    { $i=-1.0*lookup($ID.text); print=true;}
    | '+' ID                    { $i=lookup($ID.text); print=true;}
    | ID '--'                   { $i=insert($ID.text, lookup($ID.text)-1); print=true;}
    | ID '++'                   { $i=insert($ID.text, lookup($ID.text)+1); print=true;}
    | '--' ID                   { insert($ID.text, lookup($ID.text)-1); $i=lookup($ID.text); print=true;}
    | '++' ID                   { insert($ID.text, lookup($ID.text)+1); $i=lookup($ID.text); print=true;}
    | ID '^=' expr              { insert($ID.text, Math.pow(lookup($ID.text), $expr.i)); $i=lookup($ID.text); print=false;}
    | ID '%=' expr              { insert($ID.text, lookup($ID.text)%$expr.i); $i=lookup($ID.text); print=false;}
    | ID '*=' expr              { insert($ID.text, lookup($ID.text)*$expr.i); $i=lookup($ID.text); print=false;}
    | ID '/=' expr              { insert($ID.text, lookup($ID.text)/$expr.i); $i=lookup($ID.text); print=false;}
    | ID '+=' expr              { insert($ID.text, lookup($ID.text)+$expr.i); $i=lookup($ID.text); print=false;}
    | ID '-=' expr              { insert($ID.text, lookup($ID.text)-$expr.i); $i=lookup($ID.text); print=false;}
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
    | ID '=' boolExpr           { insert($ID.text, $boolExpr.b ? 1.0:0.0); $b=$boolExpr.b;print=false;}
    ;

    
COMMENT: '/*' (.)*? '*/' -> skip;   //Comment
QUIT: 'quit' -> skip;

ID: [_A-Za-z]+;
NUM: [0-9]+('.'[0-9]+)? ;
WS : [ \t]+ -> skip ;
NEWLINE: [\r\n];
