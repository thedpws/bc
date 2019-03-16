import java.util.*;

public class ExpressionFunctionCall implements Expression {
    String fname;
    List<Expression> parameters;
    public ExpressionFunctionCall(String fname, List<Expression> parameters){
        this.fname = fname;
        this.parameters = parameters;
    }

    @Override
    public void execute(Memory scope){
        System.out.println(this.evaluate(scope));
    }

    @Override
    public void print(){
        System.out.print(fname);
        for (Expression e : parameters) e.print();
    }

    @Override
    public double evaluate(Memory scope) {
        // retrieve the corresponding function
        Function f = scope.getFunction(this.fname);

        // Prepare the parameters
        List<Double> toPass = new ArrayList<>();
        for (Expression var : this.parameters) {
            //System.out.println("Parameter " + var.evaluate(scope));
            toPass.add(var.evaluate(scope));
        }
        f.run(toPass);
        //System.out.println("Rval is..." + scope.getRval());
        return scope.getRval();
    }
}
