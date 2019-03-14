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
    public void execute(){

    }

    @Override
    public void print(){

    }

    @Override
    public boolean evaluate(){
        
    }
}