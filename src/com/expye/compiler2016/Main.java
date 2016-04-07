package com.expye.compiler2016;

import com.expye.compiler2016.Parser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * Created by expye(Zihao Ye) on 2016/4/1.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        try {
            ANTLRInputStream input = new ANTLRInputStream(System.in);
            MasterLexer lexer = new MasterLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MasterParser parser = new MasterParser(tokens);
            parser.setErrorHandler(new BailErrorStrategy());
            ParseTree tree = parser.program();

            ParseTreeWalker walker = new ParseTreeWalker();
            FirstListener fl = new FirstListener();
            SecondListener sl = new SecondListener();
            ThirdListener tl = new ThirdListener();
            walker.walk(fl, tree);
            walker.walk(sl, tree);
            walker.walk(tl, tree);
        } catch (Error | Exception e) {
            System.exit(1);
        }
        System.exit(0);
    }
}
