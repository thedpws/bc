public class ConditionConstant implements Condition{
  // true; false;
    boolean b;
    public ConditionConstant(boolean b){
        this.b = b;
    }

    @Override
    public void execute(Memory scope){
        System.out.println(this.b);
    }

    @Override
    public void print(){
        System.out.print(this.b);
    }

    @Override
    public boolean evaluate(Memory scope){
        return this.b;
    }
}
