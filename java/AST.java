import java.util.*;

public class AST{
    public static Environment globalScope = new Environment();
    List<Statement> statementList;
    Map<String, Function> functions;
    AST(){
        this.statementList = new LinkedList<>();
        this.functions = new HashMap<>();
        globalScope = new Environment();
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
