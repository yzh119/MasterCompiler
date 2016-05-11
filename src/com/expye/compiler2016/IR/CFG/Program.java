package com.expye.compiler2016.IR.CFG;

import com.expye.compiler2016.IR.YIR.Instruction;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/25.
 */
public class Program {
    public static List<CFG> functions;
    public static List<Instruction> globalMem;
    public static CFG preMain;
}
