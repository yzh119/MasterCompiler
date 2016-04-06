package Master;

import Master.Exception.CompilationError;
import Master.Parser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by expye(Zihao Ye) on 2016/4/1.
 */
public class Main {
    public static void main(String[] args) throws IOException, CompilationError {
        try {
            InputStream is = new FileInputStream("in/test.mx");
            ANTLRInputStream input = new ANTLRInputStream(is);
            MasterLexer lexer = new MasterLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MasterParser parser = new MasterParser(tokens);
            ParseTree tree = parser.program();

            ParseTreeWalker walker = new ParseTreeWalker();
            FirstListener fl = new FirstListener();
            SecondListener sl = new SecondListener();
            ThirdListener tl = new ThirdListener();
            walker.walk(fl, tree);
            walker.walk(sl, tree);
            walker.walk(tl, tree);
        } catch (IOException e) {
            e.printStackTrace();
            throw new CompilationError("Cannot find test.mx!");
        }
        System.out.println("Successful!");
    }
}
