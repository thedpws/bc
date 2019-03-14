public class ConditionUnary implements Condition{
  String unaryOp;
  Condition condition;
  public ConditionUnary(String unaryOp, Condition condition){
    this.unaryOp = unaryOp;
    this.condition = condition;
  }

  @Override
  public void execute(){

  }

  @Override
  public void print(){

  }

  @Override
  public boolean evaluate(){
    return false;
  }

}