import java.util.*;

public class AST{
    public static GlobalEnvironment globalScope;
    List<Statement> statementList;
    public static Map<String, Function> functions;
    AST(){
        this.statementList = new LinkedList<>();
        functions = new HashMap<>();
        globalScope = new GlobalEnvironment();
    }
    void execute(){
        for (Statement s : statementList) 
            s.execute(globalScope);
    }
    void push(Statement s){
        this.statementList.add(s);
    }
    void print(){
        for(int i = 0; i < statementList.size(); i++){
            statementList.get(i).print();
        }
    }
}
