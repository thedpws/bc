public class ProgramCounter{
    boolean isFunction;
    int counter;
    int depth;
    public ProgramCounter(boolean isFunction){
        this.isFunction = isFunction;
        this.counter = 0;
    }

    // public ProgramCounter(boolean isFunction, int counter){
    //     this.isFunction = isFunction;
    //     this.counter = counter;
    // }
}
