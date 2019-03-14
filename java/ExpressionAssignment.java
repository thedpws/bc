public class ExpressionAssignment implements Expression {
    // i = 0; i += 2;
    ExpressionVariable var;
    String assignOp;
    Expression val;
    public ExpressionAssignment(ExpressionVariable var, String assignOp, Expression val){
        this.var = var;
        this.assignOp = assignOp;
        this.val = val;
    }

    @Override
    public void execute() {
      //System.out.println(this.var.execute());
    }

    @Override
    public void print() {
      System.out.println(this.var + this.assignOp + this.val);
    }

    @Override
    public double evaluate(Environment scope){
        return 0;
        // switch(assignOp){
        //     case "^=":
        //         scope.putSymbol(this.var.toString(), Math.pow(scope.getSymbol(this.var.toString()), this.val.evaluate()));
        //         break;
        //     case "*=":
        //         scope.putSymbol(this.var.toString(), scope.getSymbol(this.var.toString()) * this.val.evaluate());
        //         break;
        //     case "/=":
        //         scope.putSymbol(this.var.toString(), scope.getSymbol(this.var.toString()) / this.val.evaluate());
        //         break;
        //     case "+=":
        //         scope.putSymbol(this.var.toString(), scope.getSymbol(this.var.toString()) + this.val.evaulate());
        //         break;
        //     case "-=":
        //         scope.putSymbol(this.var.toString(), scope.getSymbol(this.var.toString()) - this.val.evaluate());
        //         break;
        //     case "=":
        //         scope.putSymbol(this.var.toString(), this.val.evaluate());
        //         break;
        //     default:
        //         break;

        // return scope.getSymbol(this.var);
        // }
    }
  }