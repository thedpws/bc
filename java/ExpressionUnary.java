import java.lang.Math.abs;

public class ExpressionUnary implements Expression {
  String unaryOp;
  Expression val;
  public ExpressionUnary(String unaryOp, Expression val){
    this.unaryOp = unaryOp;
    this.val = val;
  }

  @Override
  public void execute() {
    System.out.println(Math.abs(scope.getSymbol(val.evaluate())));
  }

  @Override
  public void print() {
    System.out.println(Math.abs(scope.getSymbol(val.evaluate())));
  }

  @Override
  public double evaluate(Environment scope) {
    if(this.unaryOp == "+"){
      return Math.abs(scope.getSymbol(val.evaluate()));
    }
    else if(this.unaryOp == "-"){
      return -1 * scope.getSymbol(val.evaluate());
    }
  }

}