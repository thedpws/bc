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

    public Expression getReturnExpression(){
        for (Statement s : statements) 
            if (s instanceof ReturnStatement) return ((ReturnStatement) s).getExpression();
        return new ExpressionConstant(0);
    }
}
