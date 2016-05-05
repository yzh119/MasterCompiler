package com.expye.compiler2016;

import com.expye.compiler2016.AST.ConstructAST;
import com.expye.compiler2016.IR.CFG.Program;
import com.expye.compiler2016.IR.constructYIR;
import com.expye.compiler2016.IR.convertYIRtoCFG;
import com.expye.compiler2016.Translator.MIPS.MIPSTranslator;
import com.expye.compiler2016.Translator.Translator;

import java.io.*;

/**
 * Created by expye(Zihao Ye) on 2016/4/1.
 */
public class Main {
    public static void loadBuiltinLib(PrintStream out) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("lib/builtin.s"));
        while (bf.ready()) {
            String newLine = bf.readLine();
            if (!newLine.startsWith("#"))
                out.println(newLine);
        }
        bf.close();
    }

    public static void main(String[] args) throws Exception {
        PrintStream out = new PrintStream(new FileOutputStream("out.s"));
        loadBuiltinLib(out);
        ConstructAST.main(null);
        constructYIR.main(null);
        convertYIRtoCFG.main(null);
       // convertYIRtoCFG.printIR(System.out);
        Translator trans =
            new MIPSTranslator(Program.globalMem, Program.functions);
        trans.printObjectCode(out);
        out.close();
    }
}
