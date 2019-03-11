public class FunctionEnvironment extends Environment{

    GlobalEnvironment head;

    public FunctionEnvironment(Environment head){
        // get the global environment
        super();
        while (!(head instanceof GlobalEnvironment)) head = head.head;
        this.head = (GlobalEnvironment) head;
    }

    @Override
    Object getSymbol(String key){
        return symbolTable.getOrDefault(key, head.getSymbol(key));
    }
}
