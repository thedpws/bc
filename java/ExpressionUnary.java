public class ExpressionUnary implements Expression {
  String unaryOp;
  Expression val;
  public ExpressionUnary(String unaryOp, Expression val){
    this.unaryOp = unaryOp;
    this.val = val;
  }

  @Override
  public void execute(Memory scope){
    System.out.println(evaluate(scope));
  }

  @Override
  public void print(){
    System.out.print(this.unaryOp);
    this.val.print();

  }

  @Override
  public double evaluate(Memory scope){
    if(this.unaryOp == "-"){
      return (-1 * this.val.evaluate(scope));
    }
    return 0;
  }

}
