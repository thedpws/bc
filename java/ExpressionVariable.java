
public class ExpressionVariable implements Expression {
    String varId;

    public ExpressionVariable(String varId){
      this.varId = varId;
    }
    
    @Override
    public void execute() {
      System.out.println(varId);
    }

    @Override
    public void print() {
      System.out.println(varId);
    }

    @Override
    public double evaluate(Environemnt scope) {
      return scope.getSymbol(varId);
    }
}