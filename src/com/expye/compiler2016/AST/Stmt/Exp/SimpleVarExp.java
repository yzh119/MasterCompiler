package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.VarDec.VarDec;
import com.expye.compiler2016.IR.YIR.Memory.Load;
import com.expye.compiler2016.IR.YIR.Memory.Store;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Utility;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class SimpleVarExp extends Exp {
    VarDec pt;
    public SimpleVarExp(VarDec pt) {
        this.pt = pt;
        this.type = pt.cd;
        this.isLvalue = true;
        this.reg = pt.reg;
    }

    @Override
    public void emit() {
        if (((IRRegister)reg).addr != null) {
            if (Utility.ldsdL0R1 == 0) {
                YIR.YIRInstance.addIns(
                        new Store((IRRegister) this.reg, ((IRRegister) this.reg).addr));
            } else {
                YIR.YIRInstance.addIns(
                        new Load((IRRegister) this.reg, ((IRRegister) this.reg).addr));
            }
        }
    }
}
