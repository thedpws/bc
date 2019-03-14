public class ExpressionVariableUnary extends ExpressionUnary {
    ExpressionVariable var;
    String unaryOp;
    public ExpressionVariableUnary(ExpressionVariable var, String unaryOp){
      this.var = var;
      this.unaryOp = unaryOp;
    }
    public ExpressionVariableUnary(String unaryOp, ExpressionVariable var){
        this.var = var;
        this.unaryOp = unaryOp;
    }

    @Override
    public void execute(){
      
    }
  
    @Override
    public void print(){
      
    }
  
    @Override
    public double evaluate(Environemnt scope){
      
    }
  }