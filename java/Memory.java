import java.util.*;

public class Memory {
    protected Map<String, Object> symbolTable;
    private Map<String, Function> functions;
    public int pc;
    protected double register;
    
    public Memory(){
        this.symbolTable = new HashMap<>();
        this.functions = new HashMap<>();
    }

    final void putSymbol(String key, Object val){
        symbolTable.put(key, val);
    }

    final boolean hasSymbol(String key){
        return symbolTable.containsKey(key);
    }

    public Boolean getBoolean(String key){
        return (Boolean) symbolTable.getOrDefault(key, false);
    }

    public Double getDouble(String key){
        return (Double) symbolTable.getOrDefault(key, 0.0);
    }

    public Function getFunction(String fname){
        return functions.get(fname);
    }

    public void putFunction(String fname, Function f){
        functions.put(fname, f);
    }

    public void setRval(double d){
        register = d;
    }

    public void terminateRoutine(){
        pc = Integer.MAX_VALUE - 1;
    }
}
