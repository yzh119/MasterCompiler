package test;

import com.expye.compiler2016.Exception.CompilationError;
import com.expye.compiler2016.Parser.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import static junit.framework.TestCase.fail;

/**
 * Created by expye(Zihao Ye) on 2016/4/7.
 */
@RunWith(Parameterized.class)
public class SemanticChecker {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();
        for (File f : new File("testcase/semantic/passed/").listFiles()) {
            if (f.isFile() && f.getName().endsWith(".mx")) {
                params.add(new Object[] { "testcase/semantic/passed/" + f.getName(), true });
            }
        }
        for (File f : new File("testcase/semantic/compile_error/").listFiles()) {
            if (f.isFile() && f.getName().endsWith(".mx")) {
                params.add(new Object[] { "testcase/semantic/compile_error/" + f.getName(), false });
            }
        }
        return params;
    }

    private String filename;
    private boolean shouldPass;

    public SemanticChecker(String filename, boolean shouldPass) {
        this.filename = filename;
        this.shouldPass = shouldPass;
    }


    @Test
    public void testPass() throws IOException {
        System.out.println(filename);

        try {
            FileInputStream in = new FileInputStream(filename);
            ANTLRInputStream input = new ANTLRInputStream(in);
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
            System.out.println("Successful!");
            if (!shouldPass) fail("Should not pass.");
        } catch (CompilationError | Exception e) {
            if (shouldPass) throw e;
            else e.printStackTrace();
        }
    }
}
