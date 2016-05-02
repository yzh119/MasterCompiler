package com.expye.compiler2016.IR.YIR;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.Label.FuncLabel;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Register.VirtualRegister;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/23.
 */
public class Call extends Instruction {
    FuncLabel l;
    public IRRegister rd;
    public List<VirtualRegister> arguments =
            new ArrayList<>();

    public Call(IRRegister rd, FuncLabel l, List<VirtualRegister> arguments) {
        this.rd = rd;
        this.arguments = arguments;
        this.l = l;
    }

    @Override
    public String toString() {
        return (this.rd == null ? "": rd.toString() + " = " ) +  "call " + l.toString() +
                arguments.stream().map(VirtualRegister::toString).reduce("", (x, y)-> x + " " + y);
    }
}
