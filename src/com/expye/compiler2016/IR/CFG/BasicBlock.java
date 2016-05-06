package com.expye.compiler2016.IR.CFG;

import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.Label.Label;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/16.
 */
public class BasicBlock {
    public Label label;
    public List<Instruction> internal = new ArrayList<>();
    public BasicBlock(Label label, List<Instruction> internal) {
        this.label = label;
        this.internal = internal;
    }
}
