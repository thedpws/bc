public class ExpressionVariableUnary implements Expression {
    ExpressionVariable var;
    String preUnaryOp, postUnaryOp;
    public ExpressionVariableUnary(ExpressionVariable var, String unaryOp){
        this.var = var;
        this.postUnaryOp = unaryOp;
    }
    public ExpressionVariableUnary(String unaryOp, ExpressionVariable var){
        this.var = var;
        this.preUnaryOp = unaryOp;
    }

    @Override
    public void execute(Memory scope){
        System.out.println(this.evaluate(scope));
    }
  
    @Override
    public void print(){
        if(postUnaryOp != null && !postUnaryOp.isEmpty()){
          this.var.print();
          System.out.print(this.postUnaryOp);
        }
        else if(preUnaryOp != null && !preUnaryOp.isEmpty()){
          System.out.print(this.preUnaryOp);
          this.var.print();
        }
    }
  
    @Override
    public double evaluate(Memory scope){
      if(preUnaryOp != null && !preUnaryOp.isEmpty()){
          // ++i
          if(preUnaryOp.equals("++")){
            scope.putSymbol(this.var.getId(), (scope.getDouble(this.var.getId()) + 1));
            return scope.getDouble(this.var.getId());
          }
          // --i
          else if(preUnaryOp.equals("--")){
            scope.putSymbol(this.var.getId(), (scope.getDouble(this.var.getId()) - 1));
            return scope.getDouble(this.var.getId());
          }
      }
      else if(postUnaryOp != null && !postUnaryOp.isEmpty()){
        // i++
        if(postUnaryOp.equals("++")){
          scope.putSymbol(this.var.getId(), (scope.getDouble(this.var.getId()) + 1));
          return scope.getDouble(var.getId()) - 1;
        }
        // i--
        else if(postUnaryOp.equals("--")){
          scope.putSymbol(this.var.getId(), (scope.getDouble(this.var.getId()) - 1));
          return scope.getDouble(this.var.getId()) + 1;
        }
      }
      return 0;
    }
  }
