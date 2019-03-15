import java.util.*;

public class Block implements Statement {

    List<Statement> statements;

    Block(List<Statement> statements){
        this.statements = statements;
    }

    public void execute(Memory scope){
        // execute the statements
        // init pc to 0. 
        // remove pc from stack after block ends
        for (scope.enterBlock(); scope.getPC() < statements.size(); scope.incCounter()){
            Statement s = statements.get(scope.getPC());
            s.execute(scope);
        }
        scope.exitBlock();
    }

    public void print(){
        for (Statement s : statements)
            System.out.println(s.toString() + ";");
    }

    public void enterBlock(){

    }

    public void exitBlock(){

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
