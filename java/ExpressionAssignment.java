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
        if(this.assignOp.equals("^=")){
            scope.putSymbol(this.var.getId(), Math.pow(scope.getDouble(this.var.getId()), this.val.evaluate(scope)));
        }
        else if(this.assignOp.equals("*=")){
            scope.putSymbol(this.var.getId(), scope.getDouble(this.var.getId()) * this.val.evaluate(scope));
        }
        else if(this.assignOp.equals("/=")){
            scope.putSymbol(this.var.getId(), scope.getDouble(this.var.getId()) / this.val.evaluate(scope));
        }
        else if(this.assignOp.equals("%=")){
            scope.putSymbol(this.var.getId(), scope.getDouble(this.var.getId()) % this.val.evaluate(scope));
        }
        else if(this.assignOp.equals("+=")){
            scope.putSymbol(this.var.getId(), scope.getDouble(this.var.getId()) + this.val.evaluate(scope));
        }
        else if(this.assignOp.equals("-=")){
            scope.putSymbol(this.var.getId(), scope.getDouble(this.var.getId()) - this.val.evaluate(scope));
        }
        else if(this.assignOp.equals("=")){
            scope.putSymbol(this.var.getId(), this.val.evaluate(scope));
        }

        return scope.getDouble(this.var.getId());
    }
  }
