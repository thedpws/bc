import java.util.*;
public class GlobalEnvironment extends Environment{
    public static Map<String, Function> functions;
    public static Stack<Environment> environments;
    public GlobalEnvironment(){
        super();
        this.global = this;
        functions = new HashMap<>();
    }

    @Override
    public Function getFunction(String id){
        return functions.get(id);
    }

    public void putFunction(String id, Function f){
        functions.put(id, f);
    }
}
