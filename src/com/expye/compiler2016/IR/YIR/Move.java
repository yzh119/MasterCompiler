package com.expye.compiler2016.IR.YIR;

import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.VirtualRegister;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class Move extends Instruction{
    IRRegister rd, rs;
    public Move(IRRegister rd, IRRegister rs) {
        this.rd = rd;
        this.rs = rs;
    }

    @Override
    public String toString() {
        return rd.toString() + " = move " + rs.toString();
    }
}
