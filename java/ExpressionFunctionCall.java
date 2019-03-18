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
        for (Expression e : parameters){
            System.out.printf("%s: %f\n", e, e.evaluate(scope));
        }
        // retrieve the corresponding function
        Function f = scope.getFunction(this.fname);

        double param = 1.111;
        // Prepare the parameters
        List<Double> toPass = new ArrayList<>();
        for (Expression var : this.parameters) {
            toPass.add(var.evaluate(scope));
            param = var.evaluate(scope);
        }
        f.run(toPass);
        //System.out.println("Rval is..." + scope.getRval());
        System.out.printf("fib(%f) = %f\n", param, scope.getRval());
        return scope.getRval();
    }
}
