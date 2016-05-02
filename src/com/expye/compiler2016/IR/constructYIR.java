package com.expye.compiler2016.IR;

import com.expye.compiler2016.AST.Prog.Prog;
import com.expye.compiler2016.IR.YIR.YIR;

/**
 * Created by expye(Zihao Ye) on 2016/4/23.
 */
public class constructYIR {
    public static void main(String[] args) {
        Prog.ProgInstance.emit(YIR.YIRInstance.Linear);
    }
}
