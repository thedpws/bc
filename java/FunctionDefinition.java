import java.util.*;

public class FunctionDefinition implements Statement {
  // define e(x) { return x; } All function code blocks end in an explicit return 0 as per bc manual.
    String fname;
    List<Expression> params;
    Block Statements;
    FunctionDefinition(String fname, List<Expression> params, Block statements){
        this.fname = fname;
        this. params = params;
        this.Statements = statements;
    }

    @Override
    public void execute(){

    }
    
    @Override
    public void print(){
        
    }
}