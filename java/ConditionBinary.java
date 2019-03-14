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
    public void execute(Environment scope){
      // if(binaryOp == "&&"){
      //   if(this.leftCondition.evaluate() && this.rightCondition.evaluate()){
      //       System.out.println("true");
      //   }
      //   else{
      //       System.out.println("false");
      //   }
      // }
      // else if(binaryOp == "||"){
      //     if(this.leftCondition.evaluate() || this.rightCondition.evaluate()){
      //         System.out.println("true");
      //     }
      //     else{
      //         System.out.println("false");
      //     }
      // }
        System.out.println(this.evaluate(scope));
    }

    @Override
    public void print(){
        System.out.println(leftCondition.toString() + binaryOp + rightCondition.toString());
    }

    @Override
    public boolean evaluate(Environment scope){
       if(binaryOp == "&&"){
          if(this.leftCondition.evaluate(scope) && this.rightCondition.evaluate(scope)){
              return true;
          }
          return false;
       }
       else if(binaryOp == "||"){
          if(this.leftCondition.evaluate(scope) || this.rightCondition.evaluate(scope)){
            return true;
          }
          return false;
       }
       return false;          //Shouldn't be reached
    }
}