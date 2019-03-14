public interface Condition extends Statement{
  public boolean evaluate(Environment scope);
}