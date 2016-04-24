package com.expye.compiler2016.AST.Dec;

import com.expye.compiler2016.AST.Stmt.Stmt;
import com.expye.compiler2016.AST.VarDec.VarDec;
import com.expye.compiler2016.IR.ILOC.ILOC;
import com.expye.compiler2016.IR.ILOC.Label;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class FuncDec extends DecBase{
    public Label label;

    public List<VarDec> para = null;
    public List<Stmt> body = null;
    public ClassDec retType = null;
    public FuncDec(ClassDec retType, List<VarDec> vd , List<Stmt> body, String name) {
        this.para = vd;
        this.body = body;
        this.name = name;
        this.retType = retType;
        this.name = name;
        this.label = Label.procLabel();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void toILOC() {
        ILOC.ILOCinstance.addIns(label);
        for (VarDec arg: para) {
            arg.toILOC();
        }
        for (Stmt stmt: body) {
            stmt.toILOC();
        }
    }
}
