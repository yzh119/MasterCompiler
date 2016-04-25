package com.expye.compiler2016.IR.YIR;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/22.
 */
public class YIR {
    public static YIR YIRInstance = new YIR();
    public List<Instruction> Linear = new ArrayList<>();
    public void addIns(Instruction ins) {
        Linear.add(ins);
    }
}
