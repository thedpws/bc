import java.util.*;

public class Block implements Statement {

    List<Statement> statements;

    Block(List<Statement> statements){
        this.statements = statements;
    }

    public void execute(Memory scope){
        for (scope.pc = 0; scope.pc < statements.size(); scope.pc++){
            int i = scope.pc;
            Statement s = statements.get(i);
            s.execute(scope);
        }
    }

    public void print(){
        for (Statement s : statements)
            System.out.println(s.toString() + ";");
    }

    /*
    public Expression getReturnExpression(){
        for (Statement s : statements) 
            if (s instanceof ReturnStatement) {
                System.out.print("Found return");
                return ((ReturnStatement) s).getExpression();
            }
        System.out.print("No return");
        return new ExpressionConstant(0);
    }
    */
}
