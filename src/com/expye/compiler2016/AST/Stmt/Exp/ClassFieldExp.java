package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.Memory.Load;
import com.expye.compiler2016.IR.YIR.Memory.Store;
import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Utility.Utility;

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
        this.reg = new IRRegister(new Address((IRRegister) le.reg, new Immediate(offset)));
    }

    @Override
    public void emit(List<Instruction> lst) {
        int tmp = Utility.ldsdL0R1;
        Utility.ldsdL0R1 = 1;
        le.emit(lst);
        Utility.ldsdL0R1 = tmp;
        if (Utility.ldsdL0R1 == 0) {
            lst.add(
                    new Store((IRRegister) this.reg, ((IRRegister) this.reg).addr));
        } else {
            lst.add(
                    new Load((IRRegister) this.reg, ((IRRegister) this.reg).addr));
        }
    }
}
