package com.expye.compiler2016.IR.YIR.ControlFlow;

import com.expye.compiler2016.IR.YIR.Label;

/**
 * Created by expye(Zihao Ye) on 2016/4/21.
 */
public class Jump extends ControlFlow {
    public Label label;
    public Jump(Label label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "jump " + label.toString();
    }
}
