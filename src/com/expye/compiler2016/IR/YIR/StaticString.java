package com.expye.compiler2016.IR.YIR;

import com.expye.compiler2016.Label.GlobalVarLabel;

/**
 * Created by expye(Zihao Ye) on 2016/4/30.
 */
public class StaticString extends Instruction {
    GlobalVarLabel staticString;
    String stringLiteral;
    public StaticString(GlobalVarLabel staticString, String stringLiteral) {
        this.staticString = staticString;
        this.stringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
        return staticString + ": asciiz \"" + stringLiteral + "\"";
    }
}
