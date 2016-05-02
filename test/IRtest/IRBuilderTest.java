package IRtest;

import com.expye.compiler2016.IR.constructYIR;
import com.expye.compiler2016.IR.convertYIRtoCFG;
import com.expye.compiler2016.Parser.*;
import com.expye.compiler2016.TestKits.TeeOutputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.expye.compiler2016.TestKits.LLIRInterpreter;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.fail;

/**
 * Created by abcdabcd987 on 2016-04-13.
 * Modified by expye(Zihao Ye) on 2016/4/26.
 */
@RunWith(Parameterized.class)
public class IRBuilderTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();
        for (File f : new File("testcase/ir/").listFiles()) {
            if (f.isFile() && f.getName().endsWith(".mx")) {
                params.add(new Object[] { "testcase/ir/" + f.getName() });
            }
        }
        return params;
    }

    private String filename;
    public IRBuilderTest(String filename) {
        this.filename = filename;
    }
    @Test
    public void testPass() throws IOException, InterruptedException {
        System.out.println(filename);

        ByteArrayOutputStream irTextOut = new ByteArrayOutputStream();
        OutputStream tee = new TeeOutputStream(System.out, irTextOut); // if you need this, check out: https://gist.github.com/abcdabcd987/dbc9c82ccba90707da3e6f7d47a6468f
        PrintStream out = new PrintStream(tee);

        // ... Run your compiler

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
        constructYIR.main(null);
        convertYIRtoCFG.main(null);
        convertYIRtoCFG.printIR(out);

        in.close();
        out.flush();

        // Run the virtual machine
        byte[] irText = irTextOut.toByteArray();
        ByteInputStream vmIn = new ByteInputStream(irText, irText.length);
        LLIRInterpreter vm = new LLIRInterpreter(vmIn, false);
        vm.run();

        // Assert result
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        do {
            line = br.readLine();
        } while (!line.startsWith("/*! assert:"));
        String assertion = line.replace("/*! assert:", "").trim();
        if (assertion.equals("exitcode")) {
            int expected = Integer.valueOf(br.readLine().trim());
            if (vm.getExitcode() != expected)
                throw new RuntimeException("exitcode = " + vm.getExitcode() + ", expected: " + expected);
        } else if (assertion.equals("exception")) {
            if (!vm.exitException())
                throw new RuntimeException("exit successfully, expected an exception.");
        } else {
            throw new RuntimeException("unknown assertion.");
        }
        br.close();
    }
}