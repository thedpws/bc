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

    public Expression getReturnExpression(){
        for (Statement s : statements) 
            if (s typeof Return) return ((Return) s).getExpression();
        return new ExpressionConstant(0);
    }
}
