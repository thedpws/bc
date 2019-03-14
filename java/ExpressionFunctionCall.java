import java.util.*;

public class ExpressionFunctionCall implements Expression {
    String fname;
    List<Expression> parameters;
    public ExpressionFunctionCall(String fname, List<Expression> parameters){
        this.fname = fname;
        this.parameters = parameters;
    }

    @Override
    public void execute(){
        System.out.println();
    }

    @Override
    public void print(){
        System.out.println();
    }

    @Override
    public double evaluate(Environment scope) {
        return 0;
    }
}