package com.expye.compiler2016.IR.YIR.ControlFlow;

import com.expye.compiler2016.Allocator.Allocator;
import com.expye.compiler2016.Label.Label;

/**
 * Created by expye(Zihao Ye) on 2016/4/21.
 */
public class JumpIns extends ControlFlow {
    public Label label;
    public JumpIns(Label label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "jump " + label.toString();
    }

    @Override
    public String toMIPS(Allocator alloc) {
        return "j " + label.toMIPS(alloc);
    }
}
