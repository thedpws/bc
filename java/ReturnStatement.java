public class ReturnStatement implements Statement {
    Expression rval;
    public ReturnStatement(){
        this.rval = new ExpressionConstant(0);
    }
    public ReturnStatement(Expression rval){
        this.rval = rval;
    }

    @Override
    public void execute(Memory scope){
        scope.setRval(rval.evaluate(scope));
        // exit the block
        scope.terminateRoutine();
    }

    @Override
    public void print(){
        System.out.println("Return.");
        rval.print();
    }
	public Expression getExpression() {
		return this.rval;
	}
}
