package com.expye.compiler2016.AST.Dec;

import com.expye.compiler2016.AST.Stmt.Stmt;
import com.expye.compiler2016.AST.VarDec.VarDec;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Label.Label;
import com.expye.compiler2016.Label.FuncLabel;
import com.expye.compiler2016.Register.VirtualRegister;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class FuncDec extends DecBase{
    public FuncLabel label;
    public Label startLabel;
    public List<VarDec> para = null;
    public List<Stmt> body = null;
    public ClassDec retType = null;
    public FuncDec(ClassDec retType, List<VarDec> vd , List<Stmt> body, String name) {
//        Let's fuck it!
//        VirtualRegister.init();

        this.para = vd;
        this.body = body;
        this.name = name;
        this.retType = retType;
        this.name = "func_" + name;
        this.label = new FuncLabel(this, this.name);
        this.startLabel = Label.funcStartLabel(this.name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void emit(List<Instruction> lst) {
        YIR.YIRInstance.addIns(label);
        YIR.YIRInstance.addIns(startLabel);
        for (Stmt stmt: body) {
            stmt.emit(lst);
        }
    }
}
