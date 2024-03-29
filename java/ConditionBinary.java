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
    public void execute(Memory scope){
        System.out.println(this.evaluate(scope));
    }

    @Override
    public void print(){
        leftCondition.print();
        System.out.print(binaryOp);
        rightCondition.print();
    }

    @Override
    public boolean evaluate(Memory scope){
       if(binaryOp.equals("&&")){
          return (this.leftCondition.evaluate(scope) && this.rightCondition.evaluate(scope)) ? true : false;
       }
       else if(binaryOp.equals("||")){
          return (this.leftCondition.evaluate(scope) || this.rightCondition.evaluate(scope)) ? true : false;
       }
       return false;          //Shouldn't be reached
    }
}
