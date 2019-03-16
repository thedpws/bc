import java.util.*;

public class Block implements Statement {

    List<Statement> statements;

    Block(List<Statement> statements){
        this.statements = statements;
    }

    Statement initial;

    public void execute(Memory scope){

        // execute the statements
        // init pc to 0. 
        // remove pc from stack after block ends
        if (this.initial != null) initial.execute(scope);
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

    public void toWhile(Condition c){
        // if (!c) break;
        Statement s = new IfStatement(new ConditionUnary("!", c), new BreakStatement());
        statements.add(0, s);
    }

    public void toFor(Statement initial, Condition c, Statement inc){
        this.initial = initial;
        Statement ifs = new IfStatement(new ConditionUnary("!", c), new BreakStatement());
        statements.add(0, ifs);
        statements.add(0, inc);
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
