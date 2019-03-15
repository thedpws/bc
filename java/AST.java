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
        for (globalScope.pc = 0; globalScope.pc < statementList.size(); globalScope.pc++){
            System.out.printf("Global PC: %d\n", globalScope.pc);
            Statement current = statementList.get(globalScope.pc);
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
