package com.expye.compiler2016.IR.YIR.Memory;

import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Register.IRRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class Li extends Memory {
    IRRegister rd;
    Immediate imm;
    public Li(IRRegister rd, Immediate imm) {
        this.rd = rd;
        this.imm = imm;
    }

    @Override
    public String toString() {
        return rd.toString() + " = move " + imm.toString();
    }
}
