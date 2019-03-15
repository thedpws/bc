import java.util.*;

public class FunctionDefinition implements Statement {
  // define e(x) { return x; } All function code blocks end in an explicit return 0 as per bc manual.
    String fname;
    List<ExpressionVariable> params;
    Block statements;
    FunctionDefinition(String fname, List<ExpressionVariable> params, Block statements){
        this.fname = fname;
        this.params = params;
        this.statements = statements;
    }

    @Override
    public void execute(Environment scope){
        System.out.println("FunctionDefinition: Put function into global scope");
      AST.globalScope.putFunction(fname, new Function(fname, params, statements));
    }
    
    @Override
    public void print(){
        
        System.out.printf("Define %s.", fname);
        for (ExpressionVariable param : params) param.print();
        statements.print();
    }
}
