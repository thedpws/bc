public interface Expression extends Statement{
    double evaluate(Environment scope);
}