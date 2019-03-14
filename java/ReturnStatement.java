public class ReturnStatement implements Statement {
    Expression rval;
    public ReturnStatement(){
        this.rval = new ExpressionConstant(0);
    }
    public ReturnStatement(Expression rval){
        this.rval = rval;
    }

    @Override
    public void execute(Environment scope){
        
    }

    @Override
    public void print(){
        
    }

	public Expression getExpression() {
		return this.rval;
	}
}