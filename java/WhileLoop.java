public class WhileLoop implements Statement{
    Condition c;
    Statement s;
    WhileLoop(Condition c, Statement s){
        this.c = c;
        this.s = s;
    }
    public void execute(Memory scope){
        while(c.evaluate(scope)){
            s.execute(scope);
        }
    }
    public void print(){
        System.out.print("while ( ");
        this.c.print();
        System.out.print(" ) ");
        this.s.print();
    }
}
