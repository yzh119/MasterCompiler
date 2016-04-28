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

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/3.
 */
public class ClassFieldExp extends Exp {
    Exp le = null;
    int offset;
    public ClassFieldExp(Exp le, String field, ClassDec type) {
        this.le = le;
        this.type = type;
        this.offset = this.le.type.getOffset(field);
        this.isLvalue = true;
        this.reg = new IRRegister(new Address((IRRegister) le.reg, new Immediate(offset), Utility.i32));
    }

    @Override
    public void emit() {
        int tmp = Utility.ldsdL0R1;
        Utility.ldsdL0R1 = 1;
        le.emit();
        Utility.ldsdL0R1 = tmp;
        if (Utility.ldsdL0R1 == 0) {
            YIR.YIRInstance.addIns(
                    new Store((IRRegister) this.reg, ((IRRegister) this.reg).addr));
        } else {
            YIR.YIRInstance.addIns(
                    new Load((IRRegister) this.reg, ((IRRegister) this.reg).addr));
        }
    }
}
