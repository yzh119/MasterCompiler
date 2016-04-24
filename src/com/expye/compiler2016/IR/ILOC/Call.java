package com.expye.compiler2016.IR.ILOC;

import com.expye.compiler2016.Register.VirtualRegister;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/23.
 */
public class Call extends Instruction {
    Label l;
    List<VirtualRegister> arguments =
            new ArrayList<>();

    public Call(Label l, List<VirtualRegister> arguments) {
        this.arguments = arguments;
        this.l = l;
    }

    @Override
    public String toString() {
        return "call " + l.toString() + "\n\t"
                + arguments.toString();
    }
}
