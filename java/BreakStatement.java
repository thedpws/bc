public class BreakStatement implements Statement {
    
    // break loop on execute
    public BreakStatement(){
        
    }

    @Override
    public void execute(Memory scope){
        scope.terminateRoutine();
    }

    @Override
    public void print(){
        System.out.print("Break");       
    }
}
