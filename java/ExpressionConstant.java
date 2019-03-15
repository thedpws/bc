public class ExpressionConstant implements Expression {
    double val;

    public ExpressionConstant(double val){
      this.val = val;
    }

    @Override
    public void execute(Environment scope) {
      System.out.println(this.val);
    }

    @Override
    public void print() {
      System.out.print(this.val);
    }

    @Override
    public double evaluate(Environment scope){
      return this.val;
    }

    @Override
    public String toString(){
        return String.format("%f", val);
    }
}