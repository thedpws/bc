import java.util.*;

public class Function{
    private String fname;
    private Block block;
    private List<ExpressionVariable> locals;
    private Expression returnValue;

    public Function(String fname, List<ExpressionVariable> params, Block instructions){
        this.fname = fname;
        this.locals = params;
        this.block = instructions;
        this.returnValue = block.getReturnExpression();
    }

    public double run(List<Double> parameters) {
        //System.out.printf("Running %s(%s)!\n", fname, parameters);
        if (parameters.size() != this.locals.size()) {
            // Wrong number of parameters passed in ...
            System.err.printf("%s was given %d parameters, but expected %d.%n", fname, parameters.size(), locals.size());
        }

        FunctionEnvironment localScope = new FunctionEnvironment(AST.globalScope);

        // Store parameters as local variables
        for (int i=0; i<locals.size(); i++){
            String varId = locals.get(i).varId;
            //System.out.println("Putting variable " + varId);
            localScope.putSymbol(varId, parameters.get(i));
        }

        // execute
        block.execute(localScope);
        return this.returnValue.evaluate(localScope);
    }
}
