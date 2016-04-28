package com.expye.compiler2016.AST;

import com.expye.compiler2016.AST.Prog.Prog;
import com.expye.compiler2016.Environment.Scope;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Parser.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Created by expye(Zihao Ye) on 2016/4/20.
 */
public class constructAST {
    public static Scope globalScope;
    public static void main(String[] args) throws Exception{
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
            e.printStackTrace();
        }
        System.out.println("Semantic check successful!");
    }
}
