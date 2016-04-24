package com.expye.compiler2016.IR.ILOC;

/**
 * Created by expye(Zihao Ye) on 2016/4/21.
 */
public class Label extends Instruction {
    String label;
    public static int procCnt = 0, endCnt = 0, ifTrueCnt = 0, ifFalseCnt = 0, iterationCnt = 0;
    private Label(String label) {
        this.label = label;
    }

    public static Label procLabel() {
        return new Label("proc" + String.valueOf(procCnt++));
    }

    public static Label endLabel() {
        return new Label("end" + String.valueOf(endCnt++));
    }

    public static Label ifTrueLabel() {
        return new Label("ifTrue" + String.valueOf(ifTrueCnt++));
    }

    public static Label ifFalseLabel() {
        return new Label("ifFalse" + String.valueOf(ifFalseCnt++));
    }

    public static Label iterationLabel() {
        return new Label("iteration" + String.valueOf(iterationCnt++));
    }

    public static Label globalLabel() {
        return new Label("global");
    }

    @Override
    public String toString() {
        return label + ":";
    }
}
