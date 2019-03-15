public class ConditionComparison implements Condition {
  // i > 0;
    Expression leftExpression;
    String comparisonOp;
    Expression rightExpression;
    public ConditionComparison(Expression leftExpression, String comparisonOp, Expression rightExpression){
        this.leftExpression = leftExpression;
        this.comparisonOp = comparisonOp;
        this.rightExpression = rightExpression;
    }

    @Override
    public void execute(Environment scope){
        System.out.println(this.evaluate(scope));
    }

    @Override
    public void print(){
        this.leftExpression.print();
        System.out.print(comparisonOp);
        this.rightExpression.print();
    }

    @Override
    public boolean evaluate(Environment scope){
        switch(comparisonOp){
            case ">":
                if(this.leftExpression.evaluate(scope) > this.rightExpression.evaluate(scope)){
                    return true;
                }
                return false;
            case "<":
                if(this.leftExpression.evaluate(scope) < this.rightExpression.evaluate(scope)){
                    return true; 
                }
                return false;
            case ">=":
                if(this.leftExpression.evaluate(scope) >= this.rightExpression.evaluate(scope)){
                    return true;    
                }
                return false;
            case "<=":
                if(this.leftExpression.evaluate(scope) <= this.rightExpression.evaluate(scope)){
                    return true;
                }
                return false;
            default:
                return false;                   //Shouldn't be reached
        }
    }
}