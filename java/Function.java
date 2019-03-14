import java.util.List;

public class Function implements Statement {
    // define e(x) { return x; }
    String fname;
    List<String> params;
    Block statements;
    Function(String fname, List<String> params, Block statements){
        this.fname = fname;
        this.params = params;
        this.statements = statements;
    }

    @Override
    public void execute() {
        
    }

    @Override
    public void print() {

    }

}