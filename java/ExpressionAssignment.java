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
    public void execute(Environment scope) {
      
    }

    @Override
    public void print() {
        this.var.print();
        System.out.print(this.assignOp);
        this.val.print();
    }

    @Override
    public double evaluate(Environment scope){
        switch(assignOp){
            case "^=":
                scope.putSymbol(this.var.toString(), Math.pow(scope.getDouble(this.var.toString()), this.val.evaluate(scope)));
                break;
            case "*=":
                scope.putSymbol(this.var.toString(), scope.getDouble(this.var.toString()) * this.val.evaluate(scope));
                break;
            case "/=":
                scope.putSymbol(this.var.toString(), scope.getDouble(this.var.toString()) / this.val.evaluate(scope));
                break;
            case "+=":
                scope.putSymbol(this.var.toString(), scope.getDouble(this.var.toString()) + this.val.evaluate(scope));
                break;
            case "-=":
                scope.putSymbol(this.var.toString(), scope.getDouble(this.var.toString()) - this.val.evaluate(scope));
                break;
            case "=":
                scope.putSymbol(this.var.toString(), this.val.evaluate(scope));
                break;
            default:
                break;

        }
        return scope.getDouble(this.var.toString());
    }
  }