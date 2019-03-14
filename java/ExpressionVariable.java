
public class ExpressionVariable implements Expression {
    String varId;
    public ExpressionVariable(String varId){
      this.varId = varId;
    }
    
    @Override
    public void execute(){
  //    System.out.println(evaluate(globalScope));
    }

    @Override
    public void print(){
      System.out.println(varId);
    }

    @Override
    public double evaluate(Environment scope){
      return (double)scope.getSymbol(varId);
    }
}