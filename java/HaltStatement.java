public class HaltStatement implements Statement {
    public HaltStatement(){
    }

    @Override
    public void execute(Memory scope){
        scope.pc = Integer.MAX_VALUE;
        
    }

    @Override
    public void print(){
        System.out.println("Halt.");
        
    }
}
