import java.util.*;

public class Function{
    private String fname;
    private Block block;
    private List<ExpressionVariable> locals;
    //private ReturnStatement returnStatement;

    public Function(String fname, List<ExpressionVariable> params, Block instructions){
        this.fname = fname;
        this.locals = params;
        this.block = instructions;
        //this.returnValue = block.getReturnExpression();
    }

    // Run the routine. Store any return values in the register.
    public void run(List<Double> parameters) {
        //System.out.printf("Running %s(%s)!\n", fname, parameters);
        if (parameters.size() != this.locals.size()) {
            // Wrong number of parameters passed in ...
            System.err.printf("%s was given %d parameters, but expected %d.%n", fname, parameters.size(), locals.size());
        }

        FunctionMemory localScope = new FunctionMemory(AST.globalScope);
        localScope.enterFunction();
        //AST.globalScope.enterFunction();

        // Store parameters as local variables
        for (int i=0; i<locals.size(); i++){
            String varId = locals.get(i).varId;
            localScope.putParam(varId, parameters.get(i));
        }

        //System.out.println("X is " + localScope.getDouble("x"));

        // execute
        // New Stack Frame


        // block is guaranteed to call exitFunction() on return
        block.execute(localScope);
        // on return, block stores rval in register
    }
}
