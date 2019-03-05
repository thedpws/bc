public class GlobalEnvironment extends Environment{
    public GlobalEnvironment(){
        this.global = this;
        // TODO function table
        //this.functionTable
        super();
    }

    @Override
    Function getFunction(String id){
        return null; //TODO function
    }
}
