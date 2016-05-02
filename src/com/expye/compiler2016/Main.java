package com.expye.compiler2016;

import com.expye.compiler2016.AST.ConstructAST;
import com.expye.compiler2016.IR.CFG.Program;
import com.expye.compiler2016.IR.constructYIR;
import com.expye.compiler2016.IR.convertYIRtoCFG;
import com.expye.compiler2016.Translator.MIPS.CISCTranslator;
import com.expye.compiler2016.Translator.Translator;

/**
 * Created by expye(Zihao Ye) on 2016/4/1.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ConstructAST.main(null);
        constructYIR.main(null);
        convertYIRtoCFG.main(null);
        convertYIRtoCFG.printIR(System.out);
    //    Translator trans =
    //        new CISCTranslator(Program.globalMem, Program.functions);
    //    trans.printObjectCode(System.out);
    }
}
