import java.util.Map;
import java.util.HashMap;
/* Differen environment types differ in how they scope.*/
public class Environment {
    private Map<String, Object> symbolTable;
    private Environment head;
    private GlobalEnvironment global;

    public Environment(){
        this.symbolTable = new HashMap<>();
    }

    public Environment(Environment head){
        this();
        this.head = head;
        while (!(head instanceof GlobalEnvironment)) head = head.head;
        this.global = (GlobalEnvironment) head;
    }

    final void putSymbol(String key, Object val){
        this.symbolTable.put(key, val);
    }

    final boolean hasSymbol(String key){
        return this.symbolTable.containsKey(key);
    }

    Object getSymbol(String key){
        return this.symbolTable.get(key);
    }

    public boolean getBoolean(String key){
        Object o = this.getSymbol(key);
        if (o == null) return false;
        return (Boolean) o;
    }
    public double getDouble(String key){
        Object o = this.getSymbol(key);
        if (o == null) return 0;
        return (Double) o;
    }


    public Function getFunction(String id){
        return global.getFunction(id);
    }
    // TODO functions
    // Global env -> check self; return null
    // Local env -> check self; check head; return null
    // Funct env -> check self (local and params); return null
}
	
