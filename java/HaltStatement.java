public class HaltStatement implements Statement {
    public HaltStatement(){
    }

    @Override
    public void execute(Memory scope){
        
    }

    @Override
    public void print(){
        System.out.println("Halt.");
        
    }
}
