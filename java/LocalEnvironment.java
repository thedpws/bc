public class LocalEnvironment extends Environment{
    public LocalEnvironment(Environment head){
        super();
        this.head = head;
    }

    @Override
    Object getSymbol(String key){
        return symbolTable.getOrDefault(key, head.getSymbol(key));
    }
}
