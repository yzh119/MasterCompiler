package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ArrayDec;
import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.Exception.CompilationError;
import com.expye.compiler2016.IR.YIR.Arithmetic.BinaryIns.AddIns;
import com.expye.compiler2016.IR.YIR.Arithmetic.BinaryIns.MultIns;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.Memory.Allocate;
import com.expye.compiler2016.IR.YIR.Memory.LoadImmediate;
import com.expye.compiler2016.IR.YIR.Memory.Store;
import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Utility.Utility;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/5.
 */
public class newExp extends Exp {
    private List<Exp> sizeInEachDim = null;

    public newExp(List<Exp> sizeInEachDim, ClassDec type) {
        this.sizeInEachDim = sizeInEachDim;
        this.type = type;
        this.reg = new IRRegister();
    }

    @Override
    public void emit(List<Instruction> lst) {
        if (type instanceof ArrayDec) {
            if (sizeInEachDim.size() != 1)
                throw new CompilationError("Only jagged array is permitted!");
            Exp size = sizeInEachDim.get(0);
            size.emit(lst);
            if (size.reg instanceof Immediate) {
                Immediate allocSize = new Immediate(((Immediate)size.reg).val * Utility.i32 + Utility.i32);
                lst.add(
                        new Allocate((IRRegister) this.reg,
                                allocSize)
                );
                IRRegister allocSizeReg = new IRRegister();
                lst.add(
                        new LoadImmediate(allocSizeReg, allocSize)
                );
                lst.add(
                        new Store(allocSizeReg, new Address((IRRegister) this.reg, new Immediate(0)))
                );
                lst.add(
                        new AddIns((IRRegister) this.reg, (IRRegister) this.reg, new Immediate(4))
                );
            } else {
                IRRegister allocSizeRegWithoutSize = new IRRegister();
                lst.add(
                        new MultIns(allocSizeRegWithoutSize, (IRRegister) size.reg, new Immediate(4))
                );
                IRRegister allocSizeRegWithSize = new IRRegister();
                lst.add(
                        new AddIns(allocSizeRegWithSize, allocSizeRegWithoutSize, new Immediate(4))
                );
                lst.add(
                        new Allocate((IRRegister) this.reg, allocSizeRegWithSize)
                );
                lst.add(
                        new Store(allocSizeRegWithSize, new Address((IRRegister) this.reg, new Immediate(0)))
                );
                lst.add(
                        new AddIns((IRRegister) this.reg, (IRRegister) this.reg, new Immediate(4))
                );
            }
        } else {
            lst.add(
                    new Allocate((IRRegister) this.reg, new Immediate(this.type.size))
            );
        }
    }
}
