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
      System.out.println(this.var + this.assignOp + this.val);
    }

    @Override
    public void print() {
      System.out.println(this.var + this.assignOp + this.val);
    }

    @Override
    public double evaluate(Environemnt scope) {
        switch(assignOp){
            case "^=":
                scope.putSymbol(this.var, Math.pow(scope.getSymbol(this.var) - this.val));
                return scope.getSymbol(this.var);
            case "*=":
                scope.putSymbol(this.var, scope.getSymbol(this.var) * this.val);
                return scope.getSymbol(this.var);
            case "/=":
                scope.putSymbol(this.var, scope.getSymbol(this.var) / this.val);
                return scope.getSymbol(this.var);
            case "+=":
                scope.putSymbol(this.var, scope.getSymbol(this.var) + this.val);
                return scope.getSymbol(this.var);
            case "-=":
                scope.putSymbol(this.var, scope.getSymbol(this.var) - this.val);
                return scope.getSymbol(this.var);
            case "=":
                scope.putSymbol(this.var, this.val);
                return scope.getSymbol(this.var);
        }
    }
  }