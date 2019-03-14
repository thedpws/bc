public class IfStatement implements Statement{
    // if ( c ) s1 [ else s2 ]
    Condition c;
    Statement s1;
    Statement s2;
    IfStatement(Condition c, Statement s1, Statement s2){
        this.c = c;
        this.s1 = s1;
        this.s2 = s2;
    }
    IfStatement(Condition c, Statement s){
        this.c = c;
        this.s1 = s;
        this.s2 = BlankStatement();
    }

    @Override
    public void execute() {
        if(c.evaluate()){
            s1.execute();
        }
        else{
            s2.execute();
        }
        
    }

    @Override
    public void print() {
        
    }

}