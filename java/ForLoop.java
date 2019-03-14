import java.beans.Statement;

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
    public void execute(){
        s1.execute();
        if(c1.evaluate()){
            s3.execute();
            s2.execute();
        }
    }
    @Override
    public void print(){
        
    }
}