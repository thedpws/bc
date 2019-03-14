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
    public void execute(){
//        System.out.println(this.var.evaluate(globalScope));                        //FIX LATER
    }
  
    @Override
    public void print(){
        if(postUnaryOp != null && !postUnaryOp.isEmpty()){
          this.var.print();
          System.out.println(this.postUnaryOp);
        }
        else if(preUnaryOp != null && !postUnaryOp.isEmpty()){
          System.out.print(this.postUnaryOp);
          this.var.print();
        }
    }
  
    @Override
    public double evaluate(Environment scope){
      //++i
      if(preUnaryOp != null && !postUnaryOp.isEmpty()){
          if(postUnaryOp == "++"){
            scope.putSymbol(this.var.toString(), (double)scope.getSymbol(var.toString()) + 1);
            return (double)scope.getSymbol(var.toString());
          }
          else if(postUnaryOp == "--"){
            scope.putSymbol(this.var.toString(), (double)scope.getSymbol(var.toString()) - 1);
            return (double)scope.getSymbol(var.toString());
          }
      }
      //i++
      else if(postUnaryOp != null && !postUnaryOp.isEmpty()){
        if(postUnaryOp == "++"){
          scope.putSymbol(this.var.toString(), (double)scope.getSymbol(var.toString()) + 1);
          return (double)scope.getSymbol(var.toString()) - 1;
        }
        else if(postUnaryOp == "--"){
          scope.putSymbol(this.var.toString(), (double)scope.getSymbol(var.toString()) - 1);
          return (double)scope.getSymbol(var.toString()) + 1;
        }
      }
      return 0;
    }
  }