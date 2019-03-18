import java.util.*;

public class Memory {
    protected Map<String, Object> symbolTable;
    private Map<String, Function> functions;
    public Stack<ProgramCounter> pc;
    protected double returnVal;
    
    public Memory(){
        this.symbolTable = new HashMap<>();
        this.functions = new HashMap<>();
        this.pc = new Stack<>();
    }

    void putSymbol(String key, Object val){
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

    public double getRval(){
        return this.returnVal;
    }

    //Entering and exiting non-function
    public int enterBlock(){
        pc.push(new ProgramCounter(false));
        //System.out.printf("EnterBlock %d%n", pc.size());
        return pc.size();
    }
    public void exitBlock(int depth){
        while (!pc.isEmpty() && pc.size() >= depth) exitBlock();
    }

    public void exitBlock(){
        //System.out.printf("ExitBlock %d%n", pc.size());
        pc.pop();
    }

    public void terminateBlock(){
        pc.peek().counter = Integer.MAX_VALUE - 1;
    }

    //Entering and exit function
    public void enterFunction(){
        pc.push(new ProgramCounter(true));
        //System.out.printf("EnterFunction %d%n", pc.size());
    }
    public void exitFunction(){
        //System.out.printf("ExitFunction %d%n", pc.size());
        Stack<ProgramCounter> stack = new Stack<>();
        
        while (!pc.peek().isFunction) {
            ProgramCounter p = pc.pop();
            p.counter = Integer.MAX_VALUE - 2;
            stack.push(p);
        }
        pc.peek().counter = Integer.MAX_VALUE - 2;
        //the function pc
        while (!stack.isEmpty()) pc.push(stack.pop());
        pc.pop();
        //while(!pc.pop().isFunction) {}
    }

    public void resetCounter(){
        pc.peek().counter = -1;
        /*
        pc.pop();
        this.enterBlock();
        */
    }


    public void incCounter(){
        pc.peek().counter++;
    }

    public int getPC(){
        return pc.peek().counter;
    }
}
