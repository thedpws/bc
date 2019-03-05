public class LocalEnvironment extends Environment{
    public LocalEnvironment(Environment head){
        this.head = head;
        super();
    }

    @Override
    Object getSymbol(String key){
        return symbolTable.getOrDefault(key, head.getSymbol(key));
    }
}
