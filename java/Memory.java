import java.util.*;

public class Memory {
    protected Map<String, Object> symbolTable;
    private Map<String, Function> functions;
    //public Stack<Integer> pc;
    public Stack<ProgramCounter> pc;
    protected double returnVal;
    
    public Memory(){
        this.symbolTable = new HashMap<>();
        this.functions = new HashMap<>();
        this.pc = new Stack<>();
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
        returnVal = d;
    }

    //Entering and exiting non-function
    public void enterBlock(){
        pc.push(new ProgramCounter(false));
    }
    public void exitBlock(){
        pc.pop();
    }

    //Entering and exit function
    public void enterFunction(){
        pc.push(new ProgramCounter(true));
    }
    public void terminateRoutine(){
        while(!pc.pop().isFunction) {}
    }

    public void resetCounter(){
        pc.pop();
        this.enterBlock();
    }

    public void incCounter(){
        pc.peek().counter++;
    }

    public int getPC(){
        return pc.peek().counter;
    }
}
