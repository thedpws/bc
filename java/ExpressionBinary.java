import java.lang.Math;
public class ExpressionBinary implements Expression {
    // 4 * 3
    Expressiont leftExpression;
    String op;
    Expression rightExpression;
    public ExpressionBinary(Expression leftExpression, String op, Expression rightExpression){
        this.leftExpression = leftExpression;
        this.op = op;
        this.rightExpression = rightExpression;   
    }
    @Override
    public void execute() {
      System.out.println();
    }
  
    @Override
    public void print() {
      System.out.println();
    }
  
    @Override
    public double evaluate(Environemnt scope) {
        switch(op){
            case "^":
                return Math.pow(leftExpression.evaluate(), rightExpression.evaluate());
            case "*":
                return (leftExpression.evaluate() * rightExpression.evaluate());
            case "/":
                return (leftExpression.evaluate() / rightExpression.evaluate());
            case "+":
                return (leftExpression.evaluate() + rightExpression.evaluate());
            case "-":
                return (leftExpression.evaluate() - rightExpression.evaluate());
            default:
                return 0;                                                                   //Maybe don't have this
        }
    }
  }