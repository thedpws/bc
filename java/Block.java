import java.io.*;
import java.util.*;
import java.lang.*;
public class Block implements Statement {

    List<Statement> statements;

    Block(List<Statement> statements){
        this.statements = statements;
    }

    Statement initial;

    public void execute(Memory scope){
        int depth = scope.enterBlock();
        if (isForLoop()) {
            initial.execute(scope);
            scope.incCounter();
        }
        // init pc to 0. 
        for (; scope.getPC() < statements.size(); scope.incCounter()){
            Statement s = statements.get(scope.getPC());
            //System.out.printf("Frame %d\tInstruction %d\tBlock executing %s\n", scope.pc.size(), scope.getPC(), s);
            //For loop: don't print when executing the inner statements.
            if (isForLoop() && scope.getPC() == 0){
                PrintStream stdout = System.out;
                System.setOut(new PrintStream(new NullOutputStream()));
                s.execute(scope);
                System.setOut(stdout);
                continue;
            }            

            s.execute(scope);
        }
        scope.exitBlock(depth);
    }

    public void print(){
        for (Statement s : statements)
            System.out.println(s.toString() + ";");
    }

    public void toWhile(Condition c){
        // if (!c) break;
        Statement s = new IfStatement(new ConditionUnary("!", c), new BreakStatement());
        statements.add(0, s);
        statements.add(new ContinueStatement());
    }

    public void toFor(Statement initial, Condition c, Statement inc){
        this.initial = initial;
        Statement ifs = new IfStatement(new ConditionUnary("!", c), new BreakStatement());
        statements.add(0, ifs);
        statements.add(0, inc);
        statements.add(new ContinueStatement());
    }

    private boolean isForLoop(){
        return this.initial != null;
    }
}
