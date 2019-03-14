public class WhileLoop implements Statement{
    Condition c;
    Statement s;
    WhileLoop(Condition c, Statement s){
        this.c = c;
        this.s = s;
    }
    public void execute(Environment scope){
        while(c.evaluate(scope)){
            s.execute(scope);
        }
    }
    public void print(){
        System.out.println("while ( " + c.toString() + " ) " + s.toString());
    }
}