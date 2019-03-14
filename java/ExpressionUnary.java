import java.lang.Math.*;

public class ExpressionUnary implements Expression {
  String unaryOp;
  Expression val;
  public ExpressionUnary(String unaryOp, Expression val){
    this.unaryOp = unaryOp;
    this.val = val;
  }

  @Override
  public void execute(){
    //System.out.println(evaluate(globalScope));
  }

  @Override
  public void print(){
   // System.out.println(unaryOp + val.print());
  }

  @Override
  public double evaluate(Environment scope){                  //Handle if val is a number
    if(this.unaryOp == "+"){
      return (double)Math.abs((double)scope.getSymbol(val.toString()));
    }
    else if(this.unaryOp == "-"){
      return (double)(-1 * (double)scope.getSymbol(val.toString()));
    }
    return 0;
  }

}