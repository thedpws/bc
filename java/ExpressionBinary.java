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
    public void execute() {
 //     System.out.println(evaluate(globalScope));
    }
  
    @Override
    public void print() {
        leftExpression.print();
        rightExpression.print();
    }
  
    @Override
    public double evaluate(Environment scope) {
        // switch(op){
        //     case "^":
        //         return Math.pow(this.leftExpression.evaluate(), this.rightExpression.evaluate());
        //     case "*":
        //         return (this.leftExpression.evaluate() * this.rightExpression.evaluate());
        //     case "/":
        //         return (this.leftExpression.evaluate() / this.rightExpression.evaluate());
        //     case "+":
        //         return (this.leftExpression.evaluate() + this.rightExpression.evaluate());
        //     case "-":
        //         return (this.leftExpression.evaluate() - this.rightExpression.evaluate());
        //     default:
        //         return 0;                                                                   //Maybe don't have this
        // }
        return 0;
    }
  }