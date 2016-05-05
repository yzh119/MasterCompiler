package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.IR.YIR.Arithmetic.BinaryIns.AddIns;
import com.expye.compiler2016.IR.YIR.Arithmetic.BinaryIns.MultIns;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.Memory.Load;
import com.expye.compiler2016.IR.YIR.Memory.Store;
import com.expye.compiler2016.IR.YIR.Move;
import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Utility.Utility;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class SubscriptVarExp extends Exp {
    Exp le;
    List<Exp> offset;
    public SubscriptVarExp(Exp le, List<Exp> offset, ClassDec type) {
        this.le = le;
        this.offset = offset;
        this.type = type;
        this.isLvalue = true;
        this.reg = new IRRegister();
    }

    @Override
    public void emit(List<Instruction> lst) {
        int tmp = Utility.ldsdL0R1;
        Utility.ldsdL0R1 = 1;
        le.emit(lst);
        Utility.ldsdL0R1 = tmp;
        IRRegister currentReg = new IRRegister();
        IRRegister addrReg = null;
        IRRegister fourTimesOffset = null;
        Address currentAddr = null;
        lst.add(
                new Move(currentReg, (IRRegister) le.reg)
        );
        for (int i = 0; i < offset.size(); i++) {
            tmp = Utility.ldsdL0R1;
            Utility.ldsdL0R1 = 1;
            offset.get(i).emit(lst);
            Utility.ldsdL0R1 = tmp;
            if (offset.get(i).reg instanceof Immediate) {
                currentAddr = new Address(currentReg, new Immediate(((Immediate) offset.get(i).reg).val * Utility.i32));
                if (i != offset.size() - 1)
                    lst.add(
                            new Load(currentReg, currentAddr)
                    );
            } else {
                if (addrReg == null)
                    addrReg = new IRRegister();
                if (fourTimesOffset == null)
                    fourTimesOffset = new IRRegister();
                lst.add(
                        new MultIns(fourTimesOffset, (IRRegister) offset.get(i).reg, new Immediate(4))
                );
                lst.add(
                        new AddIns(addrReg, currentReg, fourTimesOffset)
                );
                currentAddr = new Address(addrReg, new Immediate(0));
                if (i != offset.size() - 1)
                    lst.add(
                            new Load(currentReg, currentAddr)
                    );
            }
        }
        ((IRRegister) this.reg).addr = currentAddr;

        if (Utility.ldsdL0R1 == 0) {
            lst.add(
                    new Store((IRRegister)this.reg, currentAddr)
            );
        } else {
            lst.add(
                    new Load((IRRegister)this.reg, currentAddr)
            );
        }
    }
}
