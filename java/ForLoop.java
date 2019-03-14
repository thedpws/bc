public class ForLoop implements Statement{
    // for(s1; c; s2) s3
    Statement s1;
    Condition c;
    Statement s2;
    Statement s3;
    ForLoop(Statement s1, Condition c, Statement s2, Statement s3){
        this.s1 = s1;
        this.c = c;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public void execute(Environment scope){
        for(s1.execute(scope); c.evaluate(scope); s2.execute(scope)){
            s3.execute(scope);
        }
    }
    @Override
    public void print(){
        System.out.print("for ( " + s1.toString() + "; " + c.toString() + "; " + s2.toString() + " ) " + s3.toString());
    }
}