
public class SubMemory extends Memory {

    private Memory head;

    public SubMemory(Memory head){
        super();
        this.head = head;
        // DO NOT USE THIS REGISTER
        this.register = -1;
    }

    @Override
    public Boolean getBoolean(String key){
        return (Boolean) symbolTable.getOrDefault(key, head.getBoolean(key));
    }

    @Override
    public Double getDouble(String key){
        return (Double) symbolTable.getOrDefault(key, head.getDouble(key));
    }

    @Override
    public Function getFunction(String key){
        return head.getFunction(key);
    }
    
    @Override
    public void putFunction(String key, Function f){
        head.putFunction(key, f);
    }

    @Override
    public void setRval(double d){
        head.setRval(d);
    }
}
