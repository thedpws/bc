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
    public void execute(Environment scope){
        System.out.println(this.var.evaluate(scope));                   //May need to fix later
    }
  
    @Override
    public void print(){
        if(postUnaryOp != null && !postUnaryOp.isEmpty()){
          this.var.print();
          System.out.print(this.postUnaryOp);
        }
        else if(preUnaryOp != null && !postUnaryOp.isEmpty()){
          System.out.print(this.preUnaryOp);
          this.var.print();
        }
    }
  
    @Override
    public double evaluate(Environment scope){
      if(preUnaryOp != null && !preUnaryOp.isEmpty()){
          // ++i
          if(preUnaryOp == "++"){
            scope.putSymbol(this.var.toString(), scope.getDouble(var.toString()) + 1);
            return scope.getDouble(var.toString());
          }
          // --i
          else if(preUnaryOp == "--"){
            scope.putSymbol(this.var.toString(), scope.getDouble(var.toString()) - 1);
            return scope.getDouble(var.toString());
          }
      }

      else if(postUnaryOp != null && !postUnaryOp.isEmpty()){
        // i++
        if(postUnaryOp == "++"){
          scope.putSymbol(this.var.toString(), scope.getDouble(var.toString()) + 1);
          return scope.getDouble(var.toString()) - 1;
        }
        // i--
        else if(postUnaryOp == "--"){
          scope.putSymbol(this.var.toString(), scope.getDouble(var.toString()) - 1);
          return scope.getDouble(var.toString()) + 1;
        }
      }
      return 0;
    }
  }