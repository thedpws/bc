import java.util.*;

public class Block implements Statement {

    List<Statement> statements;

    Block(List<Statement> statements){
        this.statements = statements;
    }

    public void execute(Memory scope){
        for (Statement s : statements){
            s.execute(scope);
            if (s instanceof ReturnStatement) return;
        }
    }

    public void print(){
        for (Statement s : statements)
            System.out.println(s.toString() + ";");
    }

    public Expression getReturnExpression(){
        for (Statement s : statements) 
            if (s instanceof ReturnStatement) {
                System.out.print("Found return");
                return ((ReturnStatement) s).getExpression();
            }
        System.out.print("No return");
        return new ExpressionConstant(0);
    }
}
