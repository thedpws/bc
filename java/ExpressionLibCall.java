import java.util.*;
import java.lang.*;
public class ExpressionLibCall implements Expression {

    Expression parameter;
    String name;
    public ExpressionLibCall(String libfname, Expression parameter){
        this.name = libfname;
        this.parameter = parameter;
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
            case "s": return Math.sin(parameter.evaluate(scope));
            case "c": return Math.sin(parameter.evaluate(scope));
            case "l": return Math.log(parameter.evaluate(scope));
            case "e": return Math.exp(parameter.evaluate(scope));
            case "sqrt": return Math.sqrt(parameter.evaluate(scope));
            default:
            {
                break;
            }
        }
        return 0;
    }
    
}