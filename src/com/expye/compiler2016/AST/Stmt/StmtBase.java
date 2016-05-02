package com.expye.compiler2016.AST.Stmt;

import com.expye.compiler2016.Environment.Scope;
import com.expye.compiler2016.IR.YIR.Instruction;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/1.
 */
public class StmtBase implements Stmt {
    public Scope currentScope = null;

    @Override
    public void emit(List<Instruction> lst) {}
}
