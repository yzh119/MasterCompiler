package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.FuncDec;
import com.expye.compiler2016.IR.ILOC.Call;
import com.expye.compiler2016.IR.ILOC.ILOC;

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
    }

    @Override
    public void toILOC() {
        for (Exp exp: paraList) {
            exp.toILOC();
        }
        ILOC.ILOCinstance.addIns(
                new Call(fd.label ,
                        paraList.stream().map((x)->(x.reg)).collect(Collectors.toList())));
    }
}
