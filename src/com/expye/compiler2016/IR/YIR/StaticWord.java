package com.expye.compiler2016.IR.YIR;

import com.expye.compiler2016.Allocator.Allocator;
import com.expye.compiler2016.Label.GlobalVarLabel;

/**
 * Created by expye(Zihao Ye) on 2016/4/29.
 */
public class StaticWord extends Instruction {
    GlobalVarLabel staticVar;
    public StaticWord(GlobalVarLabel staticVar) {
        this.staticVar = staticVar;
    }
    @Override
    public String toString() {
        return staticVar + ": .word 0";
    }

    @Override
    public String toMIPS(Allocator alloc) {
        return "";
    }
}
