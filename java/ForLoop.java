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
    public void execute(Memory scope){
        scope.enterBlock();
        for(this.s1.execute(scope); this.c.evaluate(scope); this.s2.execute(scope)){
            this.s3.execute(scope);
        }
        scope.exitBlock();
    }
    @Override
    public void print(){
        System.out.print("for ( ");
        this.s1.print();
        System.out.print("; ");
        this.c.print();
        System.out.print("; ");
        this.s2.print();
        System.out.print(" ) ");
        this.s3.print();
    }
}
