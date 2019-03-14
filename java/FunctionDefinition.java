public class FunctionDefinition implements Statement {
  // define e(x) { return x; }
    String fname;
    List<Expression> params;
    Block Statements;
    FunctionDefinition(String fname, List<Expression> params, Block statements){
        this.fname = fname;
        this. params = params;
        this.Statements = statements;
    }

    @Override
    void execute(){

    }
    
    @Override
    void print(){
        
    }
}