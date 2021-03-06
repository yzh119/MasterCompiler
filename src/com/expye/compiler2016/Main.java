package com.expye.compiler2016;

import com.expye.compiler2016.AST.ConstructAST;
import com.expye.compiler2016.IR.CFG.Program;
import com.expye.compiler2016.IR.constructYIR;
import com.expye.compiler2016.IR.convertYIRtoCFG;
import com.expye.compiler2016.Translator.MIPS.MIPSTranslator;
import com.expye.compiler2016.Translator.Translator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

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
        PrintStream out = System.out;
        loadBuiltinLib(out);
        ConstructAST.main(null);
        constructYIR.main(null);
        convertYIRtoCFG.main(null);
        Translator trans =
            new MIPSTranslator(Program.globalMem, Program.functions);
        trans.printObjectCode(out);
        System.out.close();
    }
}
