package com.expye.compiler2016.AST.VarDec;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Dec.Dec;
import com.expye.compiler2016.AST.Stmt.Exp.*;
import com.expye.compiler2016.AST.Stmt.Stmt;
import com.expye.compiler2016.Environment.Scope;
import com.expye.compiler2016.IR.ILOC.ILOC;
import com.expye.compiler2016.IR.ILOC.Memory.LoadI;
import com.expye.compiler2016.IR.ILOC.RegisterToRegisterCopy.I2I;
import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Register.ValRegister;
import com.expye.compiler2016.Register.VirtualRegister;

import static com.expye.compiler2016.Utility.i32;
import static com.expye.compiler2016.Utility.i8;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class VarDec implements Dec, Stmt{
    public VirtualRegister reg;
    public Scope currentScope = null;
    public ClassDec cd;
    String name;
    public Exp init = null;
    public VarDec(ClassDec cd, String name) {
        this.cd = cd;
        this.name = name;

        if (cd == ClassDec.intClass || cd == ClassDec.boolClass) {
            reg = new ValRegister();
        } else {
            reg = new Address((cd == ClassDec.boolClass)? i8: i32);
        }
    }

    public VarDec(ClassDec cd, String name, Exp init) {
        this.cd = cd;
        this.name = name;
        this.init = init;
        if (cd == ClassDec.intClass || cd == ClassDec.boolClass) {
            reg = new ValRegister();
        } else {
            reg = new Address((cd == ClassDec.boolClass)? i8: i32);
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void toILOC() {
        if (init != null) {
            init.toILOC();
            if (init.reg instanceof Immediate) {
                ILOC.ILOCinstance.addIns(
                        new LoadI((Immediate) init.reg, (ValRegister) this.reg)
                );
            } else {
                ILOC.ILOCinstance.addIns(
                        new I2I(init.reg, this.reg)
                );
            }
        }
    }

}
