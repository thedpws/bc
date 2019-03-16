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
    public void execute(Memory scope) {
        System.out.print(this.evaluate(scope));
    }

    @Override
    public void print() {
        var.print();
        System.out.print(assignOp);
        val.print();
    }

    @Override
    public double evaluate(Memory scope){
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
