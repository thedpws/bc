
public class FunctionMemory extends Memory {

    private Memory head;

    public FunctionMemory
(Memory head){
        super();
        this.head = head;
        // DO NOT USE THIS REGISTER
        this.returnVal = -1;
    }

    public void putParam(String key, Object val){
        symbolTable.put(key, val);
    }

    @Override
    public void putSymbol(String key, Object val){
        if (hasSymbol(key)) symbolTable.put(key, val);
        else head.putSymbol(key, val);
    }
    @Override
    public Boolean getBoolean(String key){
        return (Boolean) symbolTable.getOrDefault(key, head.getBoolean(key));
    }

    @Override
    public Double getDouble(String key){
        //System.out.printf("FM.getDouble(%s) returns %s%n", key, (Double)symbolTable.getOrDefault(key, head.getDouble(key)));
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

    @Override
    public double getRval(){
        return head.getRval();
    }

    @Override
    public int enterBlock(){
        return head.enterBlock();
    }

    @Override
    public void exitBlock(){
        head.exitBlock();
    }
    @Override
    public void exitBlock(int depth){
        head.exitBlock(depth);
    }

    @Override
    public void enterFunction(){
        head.enterFunction();
    }

    @Override
    public void exitFunction(){
        head.exitFunction();
    }

    @Override
    public void resetCounter(){
        head.resetCounter();
    }

    @Override
    public void incCounter(){
        head.incCounter();
    }

    @Override
    public int getPC(){
        return head.getPC();
    }

    @Override
    public void terminateBlock(){
        head.terminateBlock();
    }

}
