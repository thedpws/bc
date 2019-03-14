import java.util.*;

public class Block implements Statement {
    List<Statement> statements;
    Block(List<Statement> statements){
        this.statements = new LinkedList<>();
    }
    public void execute(Environment scope){
        for(int i = 0; i < statements.size(); i++){
            statements.get(i).execute(scope);
        }
    }
    public void print(){
        for(int i = 0; i < statements.size(); i++){
            statements.get(i).print();
            System.out.print("; ");
        }
    }
}