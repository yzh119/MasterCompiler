package com.expye.compiler2016.IR.CFG;

import com.expye.compiler2016.IR.Instruction.IRInstruction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/16.
 */
public class CFGVertex {
    public List<IRInstruction> internal = new ArrayList<>();
    CFGVertex branch;
}
