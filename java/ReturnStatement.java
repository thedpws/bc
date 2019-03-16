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
        //System.out.println("\t\tSetting Rval to " + rval.evaluate(scope));
        //System.out.println("\t\tExpression was");
        rval.print();
        scope.exitFunction();
    }

    @Override
    public void print(){
        System.out.print("Return.");
        rval.print();
    }
	public Expression getExpression() {
		return this.rval;
	}
}
