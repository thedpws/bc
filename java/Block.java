import java.util.*;

public class Block implements Statement {
    List<Statement> statements;
    Block(List<Statement> statements){
        this.statements = new LinkedList<>();
    }
    public void execute(){
        
    }
    public void print(){

    }
}