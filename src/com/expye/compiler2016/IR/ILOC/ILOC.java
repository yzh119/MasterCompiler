package com.expye.compiler2016.IR.ILOC;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/22.
 */
public class ILOC {
    public static ILOC ILOCinstance = new ILOC();
    List<Instruction> Linear = new ArrayList<>();
    public void addIns(Instruction ins) {
        Linear.add(ins);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Instruction ins: Linear) {
            if (ins instanceof Label)
                sb.append('\n');
            else
                sb.append('\t');
            sb.append(ins.toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
