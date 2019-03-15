public class ConditionVariable implements Condition{
  // b = true;
  String varId;
  public ConditionVariable(String varId){
    this.varId = varId;
  }
  @Override
  public void execute(Memory scope){
    System.out.print(this.evaluate(scope));
  }

  @Override
  public void print(){
      System.out.print(this.varId);
  }

  @Override
  public boolean evaluate(Memory scope){
    return scope.getBoolean(this.varId);
  }
}
