import java.util.*;

public class AST{
    Environment globalScope;
    LinkedList<Statement> statementList;
    Map<String, Function> functions;
    AST(){
        this.statementList = new LinkedList<>();
        this.functions = new HashMap<>();
    }
    void execute(){
        for(int i = 0; i < statementList.size(); i++){
            statementList.get(i).execute();
        }
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