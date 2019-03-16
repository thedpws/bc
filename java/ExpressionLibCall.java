import java.util.*;
import java.lang.*;
public class ExpressionLibCall implements Expression {
    static Scanner scnr = new Scanner(System.in);
    List<Expression> parameters;
    String name;
    public ExpressionLibCall(String libfname, List<Expression> parameters){
        this.name = libfname;
        this.parameters = parameters;
    }

    @Override
    public void execute(Memory scope) {
        System.out.println(this.evaluate(scope));
    }

    @Override
    public void print() {
        System.out.print("lib call to " + name);
    }

    @Override
    public double evaluate(Memory scope) {
        switch (name){
            case "s": return Math.sin(parameters.get(0).evaluate(scope));
            case "c": return Math.cos(parameters.get(0).evaluate(scope));
            case "l": return Math.log(parameters.get(0).evaluate(scope));
            case "e": return Math.exp(parameters.get(0).evaluate(scope));
            case "sqrt": return Math.sqrt(parameters.get(0).evaluate(scope));
            case "read": return scnr.nextDouble();
            default:
            {
                break;
            }
        }
        return 0;
    }
    
}