import java.util.LinkedList;

public class Block implements Statement {
    LinkedList<Statement> statements;
    Block(LinkedList<Statement> statements){
        this.statements = new LinkedList<>();
    }
    public void execute(){
        
    }
    public void print(){

    }
}