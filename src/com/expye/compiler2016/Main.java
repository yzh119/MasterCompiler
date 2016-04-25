package com.expye.compiler2016;

import com.expye.compiler2016.AST.constructAST;
import com.expye.compiler2016.IR.CFG.CFG;
import com.expye.compiler2016.IR.constructYIR;
import com.expye.compiler2016.IR.convertYIRtoCFG;

/**
 * Created by expye(Zihao Ye) on 2016/4/1.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        constructAST.main(null);
        constructYIR.main(null);
        convertYIRtoCFG.main(null);
        convertYIRtoCFG.printIR(System.out);
    }
}
