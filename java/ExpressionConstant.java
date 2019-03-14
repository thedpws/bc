public class ExpressionConstant implements Expression {
  double val;

  public ExpressionConstant(double val){
    this.val = val;
  }

  @Override
  public void execute() {
    System.out.println(this.val);
  }

  @Override
  public void print() {
    System.out.println(this.val);
  }

  @Override
  double evaluate(Environment scope){
    return this.val;
  }
}