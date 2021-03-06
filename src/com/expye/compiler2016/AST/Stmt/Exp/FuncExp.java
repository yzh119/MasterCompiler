package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Dec.FuncDec;
import com.expye.compiler2016.IR.YIR.Call;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Register.IRRegister;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class FuncExp extends Exp {
    List<Exp> paraList;
    FuncDec fd;
    public FuncExp(FuncDec fd, List<Exp> paraList) {
        this.fd = fd;
        this.paraList = paraList;
        this.type = fd.retType;
        if (fd.retType != ClassDec.nullClass)
            this.reg = new IRRegister();
    }

    @Override
    public void emit(List<Instruction> lst) {
        for (Exp exp: paraList) {
            exp.emit(lst);
        }

        YIR.YIRInstance.addIns(
                new Call((this.reg != null ? (IRRegister) this.reg: null), fd.label ,
                        paraList.stream().map((x)->(x.reg)).collect(Collectors.toList())));
    }
}
