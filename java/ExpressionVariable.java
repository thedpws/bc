
public class ExpressionVariable implements Expression {
    String varId;
    public ExpressionVariable(String varId){
      this.varId = varId;
    }
    
    @Override
    public void execute(Memory scope){
      System.out.println(this.evaluate(scope));
    }

    @Override
    public void print(){
      System.out.print(varId);
    }

    @Override
    public double evaluate(Memory scope){
      return scope.getDouble(varId);
    }
    public String getId(){
      return this.varId;
    }
}
