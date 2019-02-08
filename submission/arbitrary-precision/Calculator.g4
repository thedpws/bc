grammar Calculator;

@header {
    import java.util.*;
    import java.lang.*;
    import java.math.*;
}

@parser::members { 
    static Map<String, BigDecimal> memory = new HashMap<String, BigDecimal>(); 
    Scanner sc = new Scanner(System.in);
    final static double EPSILON = 0.0000000000000000;
    static boolean print = false;
    static boolean printDouble = false;
    final static BigDecimal SQRT_DIG = new BigDecimal(150);
    final static BigDecimal SQRT_PRE = new BigDecimal(10).pow(SQRT_DIG.intValue());
    final static MathContext MC = new MathContext(30);

    //returns the previous value or 0
    private static BigDecimal insert(String key, BigDecimal value){ 
        if (!has(key)) memory.put(key, new BigDecimal(0));
        return memory.put(key, value);
    }

    private static boolean has(String key){ 
        return memory.get(key) != null;
    }

    private static BigDecimal lookup(String key){ 
        if (!has(key)) insert(key, new BigDecimal(0));
        return memory.get(key);
    }

    private static BigDecimal sqrt(BigDecimal bd){
        return sqrtNewtonRaphson(bd, new BigDecimal(1));
    }

    //Taken from user "haventchecked" at https://stackoverflow.com/questions/13649703/square-root-of-bigdecimal-in-java
    private static BigDecimal sqrtNewtonRaphson  (BigDecimal c, BigDecimal xn){
    BigDecimal precision = new BigDecimal(1).divide(SQRT_PRE, MC);
    BigDecimal fx = xn.pow(2).add(c.negate());
    BigDecimal fpx = xn.multiply(new BigDecimal(2));
    BigDecimal xn1 = fx.divide(fpx,2*SQRT_DIG.intValue(),RoundingMode.HALF_DOWN);
    xn1 = xn.add(xn1.negate());
    BigDecimal currentSquare = xn1.pow(2);
    BigDecimal currentPrecision = currentSquare.subtract(c);
    currentPrecision = currentPrecision.abs();
    if (currentPrecision.compareTo(precision) <= -1){
        return xn1;
    }
    return sqrtNewtonRaphson(c, xn1);
}

private static BigDecimal pow(BigDecimal base, BigDecimal exponent){
    if (exponent.scale() != 0) return base;
    BigDecimal ans = BigDecimal.ONE;
    BigDecimal count = BigDecimal.ZERO;
    while (count.compareTo(exponent)<0){
        ans = ans.multiply(base);
        count = count.add(BigDecimal.ONE);
    }
    return ans;
}

private static BigDecimal cos(BigDecimal x){
    final BigDecimal twoPI = new BigDecimal(2.0*Math.PI);
    while (x.compareTo(twoPI) > 0){
        x = x.subtract(twoPI);
    }
    double d = x.doubleValue();
    return new BigDecimal(Math.cos(d));
}

private static BigDecimal sin(BigDecimal x){
    final BigDecimal twoPI = new BigDecimal(2.0*Math.PI);
    while (x.compareTo(twoPI) > 0){
        x = x.subtract(twoPI);
    }
    double d = x.doubleValue();
    return new BigDecimal(Math.sin(d));
}

private static BigDecimal exp(BigDecimal x){
    double d = x.doubleValue();
    return new BigDecimal(Math.exp(d));
}

private static BigDecimal log(BigDecimal x){
    double d = x.doubleValue();
    return new BigDecimal(Math.log(d));
}


private static String processToString(BigDecimal bd){
    int scale = bd.scale();
    if (bd.scale() != 20 && bd.scale() != 0) bd = bd.setScale(20, RoundingMode.HALF_UP);
    String nm = bd.toPlainString();
    StringBuilder output = new StringBuilder();
    for (char c : nm.toCharArray()){
        if (output.length() != 0 && output.length() % 68 == 0) output.append("\\\n");
        output.append(c);
    }
    String outputString = output.toString();
    if (!bd.equals(new BigDecimal(0)) && outputString.charAt(0) == '0') outputString = outputString.substring(1);
    return outputString;
}
}


program: line*;

line: (topExpr | topBoolExpr)? (COMMENT)? NEWLINE;

topBoolExpr
@after{ print=false; printDouble=false; }: boolExpr { if (print) System.out.println($boolExpr.b); };

topExpr
@after{ print=false; printDouble=false; }: expr { 
    if (print) System.out.println(processToString($expr.i));
};



expr returns [BigDecimal i]
    : '(' e=expr ')'            { $i=$expr.i; print=true;} 
    | ID '--'                   { $i=insert($ID.text, lookup($ID.text).subtract(new BigDecimal(1))); print=true;}
    | ID '++'                   { $i=insert($ID.text, lookup($ID.text).add(new BigDecimal(1))); print=true;}
    | '--' ID                   { insert($ID.text, lookup($ID.text).subtract(new BigDecimal(1))); $i=lookup($ID.text); print=true;}
    | '++' ID                   { insert($ID.text, lookup($ID.text).add(new BigDecimal(1))); $i=lookup($ID.text); print=true;}
    | '-' ID                    { $i=lookup($ID.text).negate(); print=true;}
    | '+' ID                    { $i=lookup($ID.text); print=true;}
    | el=expr op='^' er=expr      { if ($er.i.scale() != 0) System.out.println("WARNING: Non-zero scale in exponent!"); $i=pow($el.i, $er.i); print=true;}
    | el=expr op=('*'|'/'|'%') er=expr    { if($op.text.equals("*")) $i=$el.i.multiply($er.i); else if($op.text.equals("/")) $i=$el.i.divide($er.i, MC); else if($op.text.equals("%")) $i=$el.i.remainder($er.i); print=true;}
    | el=expr op=('+'|'-') er=expr    { if($op.text.equals("+")) $i=$el.i.add($er.i); else if($op.text.equals("-")) $i=$el.i.subtract($er.i); print=true; }
    | NUM                       { $i=new BigDecimal(Double.parseDouble($NUM.text)); print=true;}
    | 'read()'                  { $i = new BigDecimal(sc.nextDouble()); print=true;}
    | 'sqrt(' expr ')'          { $i = sqrt($expr.i); print=true; printDouble=true;}
    | 's(' expr ')'             { $i = new BigDecimal(Math.sin($expr.i.doubleValue())); print=true;}
    | 'c(' expr ')'             { $i = cos($expr.i); print=true;}
    | 'l(' expr ')'             { $i = log($expr.i); print=true;}
    | 'e(' expr ')'             { $i = exp($expr.i); print=true;}
    | ID                        { $i = lookup($ID.text); print=true;} 
    | '(' e=expr ')'            { $i=$expr.i; print=true;} 
    | ID '=' expr               { $i=$expr.i; insert($ID.text, $expr.i); print=false;}
    | '-' ID                    { $i=lookup($ID.text).negate(); print=true;}
    | '+' ID                    { $i=lookup($ID.text); print=true;}
    | ID '--'                   { $i=insert($ID.text, lookup($ID.text).subtract(new BigDecimal(1))); print=true;}
    | ID '++'                   { $i=insert($ID.text, lookup($ID.text).add(new BigDecimal(1))); print=true;}
    | '--' ID                   { insert($ID.text, lookup($ID.text).subtract(new BigDecimal(1))); $i=lookup($ID.text); print=true;}
    | '++' ID                   { insert($ID.text, lookup($ID.text).add(new BigDecimal(1))); $i=lookup($ID.text); print=true;}
    | ID '^=' expr              { insert($ID.text, pow(lookup($ID.text), $expr.i)); $i=lookup($ID.text); print=false;}
    | ID '%=' expr              { insert($ID.text, lookup($ID.text).remainder($expr.i)); $i=lookup($ID.text); print=false;}
    | ID '*=' expr              { insert($ID.text, lookup($ID.text).multiply($expr.i)); $i=lookup($ID.text); print=false;}
    | ID '/=' expr              { insert($ID.text, lookup($ID.text).divide($expr.i, MC)); $i=lookup($ID.text); print=false;}
    | ID '+=' expr              { insert($ID.text, lookup($ID.text).add($expr.i)); $i=lookup($ID.text); print=false;}
    | ID '-=' expr              { insert($ID.text, lookup($ID.text).subtract($expr.i)); $i=lookup($ID.text); print=false;}
    ;

boolExpr returns [boolean b]
    : el=expr '<' er=expr       { $b=$el.i.compareTo($er.i)<0; print=true;}
    | el=expr '<=' er=expr      { $b=$el.i.compareTo($er.i)<=0; print=true;}
    | el=expr '>' er=expr       { $b=$el.i.compareTo($er.i)>0; print=true;}
    | el=expr '>=' er=expr      { $b=$el.i.compareTo($er.i)>=0; print=true;}
    | el=expr '==' er=expr      { $b=$el.i.compareTo($er.i)==0; print=true;}
    | el=expr '!=' er=expr      { $b=$el.i.compareTo($er.i)!=0; print=true;}
    | '!' boolExpr              { $b=!$boolExpr.b; print=true;}
    | elb=boolExpr '&&' erb=boolExpr { $b=$elb.b&&$erb.b; print=true;}
    | elb=boolExpr '||' erb=boolExpr { $b=$elb.b||$erb.b; print=true;}
    | 'true'                    { $b=true; print=true;}
    | 'false'                   { $b=false; print=true;}
    | ID '=' boolExpr           { insert($ID.text, $boolExpr.b ? new BigDecimal(1):new BigDecimal(0)); $b=$boolExpr.b;print=false;}
    ;

    
COMMENT: '/*' (.)*? '*/' -> skip;   //Comment
QUIT: 'quit' -> skip;

ID: [_A-Za-z]+;
NUM: [0-9]+('.'[0-9]+)? ;
WS : [ \t]+ -> skip ;
NEWLINE: [\r\n];
