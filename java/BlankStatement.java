public class BlankStatement implements Statement{
    BlankStatement(){
        
    }
    @Override
    public void execute(Memory scope){

    }
    @Override
    public void print(){
        System.out.print("blank");       
    }
}
