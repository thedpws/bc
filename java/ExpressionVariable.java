
public class ExpressionVariable implements Expression {
    String varId;
    public ExpressionVariable(String varId){
      this.varId = varId;
    }
    
    @Override
    public void execute(Environment scope){
      System.out.println(this.evaluate(scope));
    }

    @Override
    public void print(){
      System.out.print(varId);
    }

    @Override
    public double evaluate(Environment scope){
      return scope.getDouble(varId);
    }
}