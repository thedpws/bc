public class WhileLoop implements Statement{
    String condition, block;
    Block b;
    WhileLoop(Condition c, Block b){
        this.condition = c.toString();
        this.block = b.toString();
        this.b = b.toWhile(c);
    }
    public void execute(Memory scope){
        b.execute(scope);
    }
    public void print(){
        System.out.printf("while (%s) %s", condition, block);
    }
}
