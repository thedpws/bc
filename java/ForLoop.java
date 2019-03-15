public class ForLoop implements Statement{
    // for(s1; c; s2) s3
    String s1, c, s2;
    Block s3;
    ForLoop(Statement s1, Condition c, Statement s2, Block s3){
        this.s1 = s1.toString();
        this.c = c.toString();
        this.s2 = s2.toString();
        this.s3.toFor(s1, c, s2);
    }

    @Override
    public void execute(Memory scope){
        s3.execute(scope);
    }
    @Override
    public void print(){
        System.out.printf("for (%s;%s;%s) %s", s1, c, s2, s3);
    }
}
