import java.util.*;
import java.lang.*;
import org.antlr.v4.runtime.*;
public class Driver {
    public static void main(String[] args) {
        try {
            CharStream input = (CharStream) new ANTLRFileStream(args[0]);
            CalculatorLexer lexer = new CalculatorLexer(input);
            CalculatorParser parser = new CalculatorParser( new CommonTokenStream(lexer) );
            parser.addParseListener( new CalculatorCustomListener() );
            parser.program();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
