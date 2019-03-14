import java.lang.Math.*;

public class ExpressionUnary implements Expression {
  String unaryOp;
  Expression val;
  public ExpressionUnary(String unaryOp, Expression val){
    this.unaryOp = unaryOp;
    this.val = val;
  }

  @Override
  public void execute(Environment scope){
    System.out.println(evaluate(scope));
  }

  @Override
  public void print(){
    System.out.print(this.unaryOp + this.val.toString());

  }

  @Override
  public double evaluate(Environment scope){
    if(this.unaryOp == "-"){
      return (-1 * scope.getDouble(val.toString()));
    }
    return 0;
  }

}