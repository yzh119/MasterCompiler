package com.expye.compiler2016.AST.Prog;

import com.expye.compiler2016.AST.ASTnode;
import com.expye.compiler2016.AST.Dec.Dec;
import com.expye.compiler2016.AST.Dec.FuncDec;
import com.expye.compiler2016.Environment.Scope;
import com.expye.compiler2016.IR.YIR.GlobalLabel;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.IR.YIR.Label;

import java.util.ArrayList;
import java.util.List;

/**
* Created by expye(Zihao Ye) on 2016/3/30.
        */
public class Prog implements ASTnode {
    Label label = GlobalLabel.globalInstance;
    public static Prog ProgInstance;
    public List<Dec> list = new ArrayList<>();
    public Scope currentScope = new Scope(null);

    @Override
    public void emit() {
        YIR.YIRInstance.addIns(label);
        for (Dec dec: list) {
            if (dec instanceof FuncDec) continue;
            dec.emit();
        }

        for (Dec dec: list) {
            if (dec instanceof FuncDec) {
                dec.emit();
            }
        }
    }
}
