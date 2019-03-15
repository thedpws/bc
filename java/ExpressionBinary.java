import java.lang.Math;
public class ExpressionBinary implements Expression {
    // 4 * 3
    Expression leftExpression;
    String op;
    Expression rightExpression;
    public ExpressionBinary(Expression leftExpression, String op, Expression rightExpression){
        this.leftExpression = leftExpression;
        this.op = op;
        this.rightExpression = rightExpression;   
    }
    @Override
    public void execute(Environment scope) {
        System.out.println(this.evaluate(scope));
    }
  
    @Override
    public void print() {
        leftExpression.print();
        System.out.print(op);
        rightExpression.print();
        //System.out.println(leftExpression.toString() + op + rightExpression.toString());
    }
  
    @Override
    public double evaluate(Environment scope) {
        switch(op){
            case "^":
                return Math.pow(this.leftExpression.evaluate(scope), this.rightExpression.evaluate(scope));
            case "*":
                return (this.leftExpression.evaluate(scope) * this.rightExpression.evaluate(scope));
            case "/":
                return (this.leftExpression.evaluate(scope) / this.rightExpression.evaluate(scope));
            case "+":
                return (this.leftExpression.evaluate(scope) + this.rightExpression.evaluate(scope));
            case "-":
                return (this.leftExpression.evaluate(scope) - this.rightExpression.evaluate(scope));
            default:
                System.out.println("bitch");
                return 0;                                                               

        }
    }
  }
