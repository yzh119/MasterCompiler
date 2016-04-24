package com.expye.compiler2016.IR.ILOC.ControlFlow;

import com.expye.compiler2016.IR.ILOC.Label;

/**
 * Created by expye(Zihao Ye) on 2016/4/21.
 */
public class Jump extends ControlFlow {
    Label l;
    public Jump(Label l) {
        this.l = l;
    }

    @Override
    public String toString() {
        return "jump " + l.toString();
    }
}
