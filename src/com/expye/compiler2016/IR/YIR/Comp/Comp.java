package com.expye.compiler2016.IR.YIR.Comp;

import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class Comp extends Instruction {
    public IRRegister r1, rd;
    public VirtualRegister r2;
    public Comp(IRRegister rd, IRRegister r1, VirtualRegister r2) {
        this.r1 = r1;
        this.r2 = r2;
        this.rd = rd;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
