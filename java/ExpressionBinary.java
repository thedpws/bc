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
    public void execute(Memory scope) {
        System.out.println(this.evaluate(scope));
    }
  
    @Override
    public void print() {
        leftExpression.print();
        System.out.print(op);
        rightExpression.print();
    }
  
    @Override
    public double evaluate(Memory scope) {
        //System.out.printf("Evaluating binop! %s %s %s!\n", this.leftExpression.evaluate(scope), op, this.rightExpression.evaluate(scope));
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
