package com.expye.compiler2016.IR.ILOC.ControlFlow;

import com.expye.compiler2016.Register.Address;

/**
 * Created by expye(Zihao Ye) on 2016/4/21.
 */
public class JumpI extends ControlFlow {
    Address addr;
    public JumpI(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "jumpI " + addr.toString();
    }
}
