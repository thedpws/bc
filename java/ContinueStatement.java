public class ContinueStatement implements Statement {
    
    public ContinueStatement(){
        
    }

    @Override
    public void execute(Memory scope){
        // Set PC to 0.
        scope.resetCounter();
        //System.out.println("YOoo the scope be " + scope.getPC());
    }

    @Override
    public void print(){
        System.out.print("Continue.");       
    }
}
