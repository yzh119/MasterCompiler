package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.Memory.Load;
import com.expye.compiler2016.IR.YIR.Memory.LoadAdress;
import com.expye.compiler2016.Label.GlobalVarLabel;
import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Utility.StringLiteralIntern;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class StringExp extends Exp {
    public String val;
    public Address addr;
    public StringExp(String val) {
        this.val = val;
        this.type = ClassDec.stringClass;
        GlobalVarLabel label = StringLiteralIntern.find(val.intern());
        this.addr = new Address(label);
        this.reg = new IRRegister(addr);
    }

    @Override
    public void emit(List<Instruction> lst) {
        lst.add(
                new LoadAdress((IRRegister) this.reg, this.addr)
        );
    }
}
