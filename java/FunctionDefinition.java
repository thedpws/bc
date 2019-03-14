import java.util.*;

public class FunctionDefinition implements Statement {
  // define e(x) { return x; } All function code blocks end in an explicit return 0 as per bc manual.
    String fname;
    List<ExpressionVariable> params;
    Block statements;
    FunctionDefinition(String fname, List<ExpressionVariable> params, Block statements){
        this.fname = fname;
        this. params = params;
        this.statements = statements;
    }

    @Override
    public void execute(Environment scope){
      AST.functions.put(fname, new Function(fname, params, statements));
    }
    
    @Override
    public void print(){
        
    }
}