package com.expye.compiler2016.Label;

import com.expye.compiler2016.IR.YIR.Instruction;

/**
 * Created by expye(Zihao Ye) on 2016/4/21.
 */
public class Label extends Instruction {
    public String label;
    public static int endCnt = 0, ifTrueCnt = 0, ifFalseCnt = 0, beginCnt = 0, mergeCnt = 0;
    protected Label(String label) {
        this.label = label;
    }

    public static void init() {
        endCnt = 0;
        ifTrueCnt = 0;
        ifFalseCnt = 0;
        beginCnt = 0;
        mergeCnt = 0;
    }

    public static Label funcStartLabel(String funcName) {
        return new Label("%" + funcName + "_start");
    }

    public static Label endLabel() {
        return new Label("%end" + String.valueOf(endCnt++));
    }

    public static Label ifTrueLabel() {
        return new Label("%ifTrue" + String.valueOf(ifTrueCnt++));
    }

    public static Label ifFalseLabel() {
        return new Label("%ifFalse" + String.valueOf(ifFalseCnt++));
    }

    public static Label beginLabel() {
        return new Label("%begin" + String.valueOf(beginCnt++));
    }

    public static Label ifMergeLabel() {
        return new Label("%ifMerge" + String.valueOf(mergeCnt++));
    }

    @Override
    public String toString() {
        return label;
    }
}
