package com.expye.compiler2016.AST.Dec;

import com.expye.compiler2016.Environment.Scope;
import com.expye.compiler2016.IR.YIR.Instruction;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/1.
 */
public class DecBase implements Dec{
    public Scope currentScope;
    public String name;
    public String getName() {
        return name;
    }

    @Override
    public void emit(List<Instruction> lst) {}
}
