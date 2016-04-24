package com.expye.compiler2016.IR;

import com.expye.compiler2016.AST.Prog.Prog;
import com.expye.compiler2016.IR.ILOC.ILOC;

/**
 * Created by expye(Zihao Ye) on 2016/4/23.
 */
public class constructILOC {
    public static void main(String[] args) {
        Prog.ProgInstance.toILOC();
        System.out.print(ILOC.ILOCinstance.toString());
    }
}
