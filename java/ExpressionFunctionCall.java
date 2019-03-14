import java.util.*;

public class ExpressionFunctionCall implements Expression {
    String fname;
    List<Expression> parameters;
    public ExpressionFunctionCall(String fname, List<Expression> parameters){
        this.fname = fname;
        this.parameters = parameters;
    }

    @Override
    public void execute(Environment scope){
        System.out.println(this.evaluate(scope));
    }

    @Override
    public void print(){
        System.out.printf("%s(%s);%n", fname, parameters);
    }

    @Override
    public double evaluate(Environment scope) {
        // retrieve the corresponding function
        Function f = AST.globalScope.getFunction(this.fname);

        // Prepare the parameters
        List<Double> toPass = new ArrayList<>();
        for (Expression var : this.parameters) {
            toPass.add(var.evaluate(scope));
        }
        return f.run(toPass);
    }
}
