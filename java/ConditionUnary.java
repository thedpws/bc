public class ConditionUnary implements Condition{
  String unaryOp;
  Condition condition;
  public ConditionUnary(String unaryOp, Condition condition){
    this.unaryOp = unaryOp;
    this.condition = condition;
  }

  @Override
  public void execute(Environment scope){
      System.out.print(this.evaluate(scope));
  }

  @Override
  public void print(){
      System.out.print(this.unaryOp + this.condition.toString());
  }

  @Override
  public boolean evaluate(Environment scope){
      if(this.unaryOp == "!"){
          return !this.condition.evaluate(scope);
      }
      else{
          return this.condition.evaluate(scope);
      }
  }

}