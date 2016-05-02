package com.expye.compiler2016.AST.VarDec;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Dec.Dec;
import com.expye.compiler2016.AST.Stmt.Exp.*;
import com.expye.compiler2016.AST.Stmt.Stmt;
import com.expye.compiler2016.IR.CFG.Program;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.Memory.LoadImmediate;
import com.expye.compiler2016.IR.YIR.Memory.Store;
import com.expye.compiler2016.IR.YIR.Move;
import com.expye.compiler2016.IR.YIR.StaticWord;
import com.expye.compiler2016.Register.Immediate;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.VirtualRegister;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class VarDec implements Dec, Stmt{
    //public VirtualRegister reg;
    public IRRegister reg;
    public boolean isGlobal;
    public ClassDec cd;
    String name;
    public Exp init = null;
    public VarDec(ClassDec cd, String name, IRRegister reg) {
        this.cd = cd;
        this.name = name;
        this.reg = reg;
        this.isGlobal = (reg.addr != null && reg.addr.staticVar != null);
    }

    public VarDec(ClassDec cd, String name, Exp init, IRRegister reg) {
        this.cd = cd;
        this.name = name;
        this.init = init;
        this.reg = reg;
        this.isGlobal = (reg.addr != null && reg.addr.staticVar != null);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void emit(List<Instruction> lst) {
        if (this.isGlobal) {
            Program.globalMem.add(
                    new StaticWord(reg.addr.staticVar)
            );
            if (init != null && this.reg != init.reg) {
                init.emit(Program.preMain.blockList.get(0).internal);
                IRRegister reg = new IRRegister();
                if (init.reg instanceof Immediate) {
                    Program.preMain.blockList.get(0).internal.add(
                            new LoadImmediate(reg, (Immediate) init.reg)
                    );
                    Program.preMain.blockList.get(0).internal.add(
                            new Store(reg, this.reg.addr)
                    );
                } else {
                    Program.preMain.blockList.get(0).internal.add(
                            new Move(reg, (IRRegister) init.reg)
                    );
                    Program.preMain.blockList.get(0).internal.add(
                            new Store(reg, this.reg.addr)
                    );
                }
            }
            return ;
        }
        if (init != null && this.reg != init.reg) {
            init.emit(lst);
            if (init.reg instanceof Immediate) {
                lst.add(
                        new LoadImmediate(this.reg, (Immediate) init.reg)
                );
            } else {
                lst.add(
                        new Move(this.reg, (IRRegister) init.reg)
                );
            }
        }
    }

}
