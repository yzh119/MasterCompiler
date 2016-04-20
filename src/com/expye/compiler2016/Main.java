package com.expye.compiler2016;

import com.expye.compiler2016.AST.constructAST;
import com.expye.compiler2016.IR.constructILOC;
import com.expye.compiler2016.IR.convertILOCtoCFG;

/**
 * Created by expye(Zihao Ye) on 2016/4/1.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        constructAST.main(null);
        constructILOC.main(null);
        convertILOCtoCFG.main(null);
    }
}
