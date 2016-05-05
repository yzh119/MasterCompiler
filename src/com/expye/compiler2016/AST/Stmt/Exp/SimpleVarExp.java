package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.VarDec.VarDec;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.Memory.Load;
import com.expye.compiler2016.IR.YIR.Memory.Store;
import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Utility.Utility;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class SimpleVarExp extends Exp {
    VarDec pt;
    public SimpleVarExp(VarDec pt) {
        this.pt = pt;
        this.type = pt.cd;
        this.isLvalue = true;
        if (pt.reg.addr == null)
            this.reg = pt.reg;
        else
            this.reg = new IRRegister(pt.reg.addr);
    }

    @Override
    public void emit(List<Instruction> lst) {
        if (((IRRegister)reg).addr != null) {
            if (Utility.ldsdL0R1 == 0) {
                lst.add(
                        new Store((IRRegister) this.reg, ((IRRegister) this.reg).addr));
            } else {
                lst.add(
                        new Load((IRRegister) this.reg, ((IRRegister) this.reg).addr));
            }
        }
    }
}
