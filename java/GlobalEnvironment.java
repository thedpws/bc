public class GlobalEnvironment extends Environment{
    public GlobalEnvironment(){
        super();
        this.global = this;
        // TODO function table
        //this.functionTable
    }

    @Override
    public Function getFunction(String id){
        return null; //TODO function
    }
}
