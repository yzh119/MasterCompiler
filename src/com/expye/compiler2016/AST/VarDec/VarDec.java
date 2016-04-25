package com.expye.compiler2016.AST.VarDec;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Dec.Dec;
import com.expye.compiler2016.AST.Stmt.Exp.*;
import com.expye.compiler2016.AST.Stmt.Stmt;
import com.expye.compiler2016.Environment.Scope;
import com.expye.compiler2016.IR.YIR.Memory.Li;
import com.expye.compiler2016.IR.YIR.Move;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.VirtualRegister;

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
            reg = new IRRegister();
        } else {
            reg = new IRRegister();
        }
    }

    public VarDec(ClassDec cd, String name, Exp init) {
        this.cd = cd;
        this.name = name;
        this.init = init;
        if (cd == ClassDec.intClass || cd == ClassDec.boolClass) {
            reg = new IRRegister();
        } else {
            reg = new IRRegister();
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void emit() {
        if (init != null) {
            init.emit();
            if (init.reg instanceof Immediate) {
                YIR.YIRInstance.addIns(
                        new Li((IRRegister) this.reg, (Immediate) init.reg)
                );
            } else {
                YIR.YIRInstance.addIns(
                        new Move((IRRegister) this.reg, (IRRegister) init.reg)
                );
            }
        }
    }

}
