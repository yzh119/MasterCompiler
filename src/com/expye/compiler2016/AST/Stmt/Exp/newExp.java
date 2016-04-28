package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ArrayDec;
import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.Exception.CompilationError;
import com.expye.compiler2016.IR.YIR.Arithmetic.AddIns;
import com.expye.compiler2016.IR.YIR.Arithmetic.MultIns;
import com.expye.compiler2016.IR.YIR.ControlFlow.Ret;
import com.expye.compiler2016.IR.YIR.Memory.Allocate;
import com.expye.compiler2016.IR.YIR.Memory.Li;
import com.expye.compiler2016.IR.YIR.Memory.Store;
import com.expye.compiler2016.IR.YIR.Move;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Register.ReturnRegister;
import com.expye.compiler2016.Utility;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/5.
 */
public class newExp extends Exp {
    private List<Exp> sizeInEachDim = null;

    public newExp(List<Exp> sizeInEachDim, ClassDec type) {
        this.sizeInEachDim = sizeInEachDim;
        this.type = type;
        this.reg = ReturnRegister.returnInstance;
      //  this.reg = new IRRegister();
    }

    @Override
    public void emit() {
        if (type instanceof ArrayDec) {
            if (sizeInEachDim.size() != 1)
                throw new CompilationError("Only jagged array is permitted!");
            Exp size = sizeInEachDim.get(0);
            size.emit();
            if (size.reg instanceof Immediate) {
                Immediate allocSize = new Immediate(((Immediate)size.reg).val * Utility.i32 + Utility.i32);
                YIR.YIRInstance.addIns(
                        new Allocate((IRRegister) this.reg,
                                allocSize)
                );
                IRRegister allocSizeReg = new IRRegister();
                YIR.YIRInstance.addIns(
                        new Li(allocSizeReg, allocSize)
                );
                YIR.YIRInstance.addIns(
                        new Store(allocSizeReg, new Address((IRRegister) this.reg, new Immediate(0), Utility.i32))
                );
                YIR.YIRInstance.addIns(
                        new AddIns((IRRegister) this.reg, (IRRegister) this.reg, new Immediate(4))
                );
            } else {
                IRRegister allocSizeRegWithoutSize = new IRRegister();
                YIR.YIRInstance.addIns(
                        new MultIns(allocSizeRegWithoutSize, (IRRegister) size.reg, new Immediate(4))
                );
                IRRegister allocSizeRegWithSize = new IRRegister();
                YIR.YIRInstance.addIns(
                        new AddIns(allocSizeRegWithSize, allocSizeRegWithoutSize, new Immediate(4))
                );
                YIR.YIRInstance.addIns(
                        new Allocate((IRRegister) this.reg, allocSizeRegWithSize)
                );
                YIR.YIRInstance.addIns(
                        new Store(allocSizeRegWithSize, new Address((IRRegister) this.reg, new Immediate(0), Utility.i32))
                );
                YIR.YIRInstance.addIns(
                        new AddIns((IRRegister) this.reg, (IRRegister) this.reg, new Immediate(4))
                );
            }
        } else {
            YIR.YIRInstance.addIns(
                    new Allocate((IRRegister) this.reg, new Immediate(this.type.size))
            );
        }
    }
}
