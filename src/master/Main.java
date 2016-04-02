package Master;

import Master.Parser.MasterLexer;
import Master.Parser.MasterParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by expye(Zihao Ye) on 2016/4/1.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("in/test.mx");
        ANTLRInputStream input = new ANTLRInputStream(is);
        MasterLexer lexer = new MasterLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MasterParser parser = new MasterParser(tokens);
        ParseTree tree = parser.program();

        System.out.println(tree.toStringTree(parser));
    }
}
