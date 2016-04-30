package com.expye.compiler2016.IR.YIR.ControlFlow;

import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class RetIns extends ControlFlow {
    VirtualRegister reg;
    public RetIns(VirtualRegister reg) {
        this.reg = reg;
    }

    @Override
    public String toString() {
        return "ret " + reg.toString();
    }
}
