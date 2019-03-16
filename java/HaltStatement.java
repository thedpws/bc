public class HaltStatement implements Statement {
    public HaltStatement(){
    }

    @Override
    public void execute(Memory scope){
        System.exit(0);
        // while(!scope.pc.empty()){
        //     scope.exitBlock();
        // }
    //    scope.pc = Integer.MAX_VALUE;
        
    }

    @Override
    public void print(){
        System.out.println("Halt.");
        
    }
}
