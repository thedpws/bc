public class ConditionUnary implements Condition{
  String unaryOp;
  Condition condition;
  public ConditionUnary(String unaryOp, Condition condition){
    this.unaryOp = unaryOp;
    this.condition = condition;
  }

  @Override
  public void execute(Memory scope){
      System.out.print(this.evaluate(scope));
  }

  @Override
  public void print(){
      System.out.print(unaryOp);
      condition.print();
  }

  @Override
  public boolean evaluate(Memory scope){
      if(this.unaryOp.equals("!")){
          return !(this.condition.evaluate(scope));
      }
      else{
          return this.condition.evaluate(scope);
      }
  }

}
