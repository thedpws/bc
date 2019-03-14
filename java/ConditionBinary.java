public class ConditionBinary implements Condition {
  // b && c; b || c;
    Condition leftCondition;
    String binaryOp;
    Condition rightCondition;
    public ConditionBinary(Condition leftCondition, String binaryOp, Condition rightCondition){
        this.leftCondition = leftCondition;
        this.binaryOp = binaryOp;
        this.rightCondition = rightCondition;
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