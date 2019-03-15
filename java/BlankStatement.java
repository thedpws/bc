public class BlankStatement implements Statement{
    BlankStatement(){
        
    }
    @Override
    public void execute(Environment scope){

    }
    @Override
    public void print(){
        System.out.print("blank");       
    }
}
