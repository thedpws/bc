import java.util.*;

public class AST{
    public static Memory globalScope;
    List<Statement> statementList;
    AST(){
        this.statementList = new LinkedList<>();
        globalScope = new Memory();
    }
    void execute(){
        // Set PC to 0. Execute statements.
        for (globalScope.enterBlock(); globalScope.getPC() < statementList.size(); globalScope.incCounter()){
            System.out.printf("Global PC: %d\n", globalScope.getPC());
            Statement current = statementList.get(globalScope.getPC());
            current.execute(globalScope);
        }
    }

    void push(Statement s){
        this.statementList.add(s);
    }

    void print(){
        for (Statement s : statementList) s.print();
    }
}
