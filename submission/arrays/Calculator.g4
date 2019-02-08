grammar Calculator;

@header {
    import java.util.*;
    import java.lang.*;
    import java.util.function.*;
}

@parser::members { 
    static Scanner sc = new Scanner(System.in);
    static Map<String, Double> memory = new HashMap<String, Double>(); 
    static Map<String, DoubleFunction<Double>> fx = new HashMap<String, DoubleFunction<Double>>(){
    {
            //insert s(), c(), l(), e() into functions
            put("s", d -> Math.sin(d));
            put("c", d -> Math.cos(d));
            put("l", d -> Math.log(d));
            put("e", d -> Math.exp(d));
            put("read", d -> sc.nextDouble());
            put("sqrt", d -> Math.sqrt(d));

    }
    };
    final static double EPSILON = 0.0000000000000000;
    static boolean print = false;
    static boolean printDouble = false;

    

    private static Double functions(String fName, double d){

        return fx.get(fName).apply(d);
    }


    //returns the previous value
    private static Double insert(String key, Double value){ return memory.put(key, value); }

    private static boolean has(String key){ return memory.get(key) != null; }

    private static Double lookup(String key){ if (!has(key)) insert(key, 0.0); return memory.get(key); }
}


program: line*;

line: (topExpr | topBoolExpr | print)?  NEWLINE;

topBoolExpr
@after{ print=false; printDouble=false; }: boolExpr { if (print) System.out.println($boolExpr.b); };
topExpr
@after{ print=false; printDouble=false; }: expr { if (print) if (Math.abs($expr.i % 1) <= EPSILON) System.out.println((int)$expr.i); else System.out.printf("%.20f%n", $expr.i);} ;

print: 'print ' (printExpr (',' printExpr)*);

printExpr: expr { System.out.print($expr.i); };

expr returns [double i]
    : '(' e=expr ')'             { $i=$expr.i; print=true;} 
    | var '--'                   { $i=insert($var.s, lookup($var.s)-1); print=true;}
    | var '++'                   { $i=insert($var.s, lookup($var.s)+1); print=true;}
    | '--' var                   { insert($var.s, lookup($var.s)-1); $i=lookup($var.s); print=true;}
    | '++' var                   { insert($var.s, lookup($var.s)+1); $i=lookup($var.s); print=true;}
    | '-' var                    { $i=-1.0*lookup($var.s); print=true;}
    | '+' var                    { $i=lookup($var.s); print=true;}
    | el=expr op='^' er=expr      { $i=Math.pow($el.i, $er.i); print=true;}
    | el=expr op=('*'|'/'|'%') er=expr    { if($op.text.equals("*")) $i=$el.i*$er.i; else if($op.text.equals("/")) $i=$el.i/$er.i; else if($op.text.equals("%")) $i=$el.i%$er.i; print=true;}
    | el=expr op=('+'|'-') er=expr    { if($op.text.equals("+")) $i=$el.i+$er.i; else if($op.text.equals("-")) $i=$el.i-$er.i; print=true; }
    | function                  { $i=$function.i; print=true; }
    | NUM                       { $i=Double.parseDouble($NUM.text); print=true;}
    | var                       { $i=lookup($var.s); print=true;} 
    | var '=' expr              { $i=$expr.i; insert($var.s, $expr.i); print=false;}
    | var '^=' expr             { insert($var.s, Math.pow(lookup($var.s), $expr.i)); $i=lookup($var.s); print=false;}
    | var '%=' expr             { insert($var.s, lookup($var.s)%$expr.i); $i=lookup($var.s); print=false;}           
    | var '*=' expr             { insert($var.s, lookup($var.s)*$expr.i); $i=lookup($var.s); print=false;}
    | var '/=' expr             { insert($var.s, lookup($var.s)/$expr.i); $i=lookup($var.s); print=false;}
    | var '+=' expr             { insert($var.s, lookup($var.s)+$expr.i); $i=lookup($var.s); print=false;}
    | var '-=' expr             { insert($var.s, lookup($var.s)-$expr.i); $i=lookup($var.s); print=false;}
    ;

var returns [String s]
    : ID                        { $s = $ID.text; }
    | arr                       { $s = $arr.s; }
    ;

arr returns [String s]
    : ID '[' expr ']'           { $s = $ID.text + '[' + (int)Math.floor($expr.i) + ']'; }
    ;

function returns [double i]
    : ID '(' expr ')'           { $i = functions($ID.text, $expr.i); }
    | ID '()'                   { $i = functions($ID.text, -1.0); }
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
    
COMMENT: '/*' (.)*? '*/' -> skip;
QUIT: 'quit' -> skip;

ID: ([a-z]+[_0-9a-z]*); 
NUM: [0-9]+('.'[0-9]+)? ;
WS : [ \t]+ -> skip ;
NEWLINE: [\r\n];
