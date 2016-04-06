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
    public static void main(String[] args) throws Exception {
        try {
            InputStream is = new FileInputStream("bin/test.mx");
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
        } catch (Error e) {
            e.printStackTrace();
            System.exit(1);
        }
//        System.out.println("Successful!");
        System.exit(0);
    }
}
