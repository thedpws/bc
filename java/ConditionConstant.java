public class ConditionConstant implements Condition{
  // true; false;
    boolean b;
    public ConditionConstant(boolean b){
        this.b = b;
    }

    @Override
    public void execute(){
        System.out.println(this.b);
    }

    @Override
    public void print(){
        System.out.println(this.b);
    }

    @Override
    public boolean evaluate(){
        return this.b;
    }
}