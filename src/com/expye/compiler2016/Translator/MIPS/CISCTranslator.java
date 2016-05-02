package com.expye.compiler2016.Translator.MIPS;

import com.expye.compiler2016.IR.CFG.BasicBlock;
import com.expye.compiler2016.IR.CFG.CFG;
import com.expye.compiler2016.IR.YIR.Arithmetic.*;
import com.expye.compiler2016.IR.YIR.Call;
import com.expye.compiler2016.IR.YIR.Comp.*;
import com.expye.compiler2016.IR.YIR.ControlFlow.Cbr;
import com.expye.compiler2016.IR.YIR.ControlFlow.ControlFlow;
import com.expye.compiler2016.IR.YIR.ControlFlow.JumpIns;
import com.expye.compiler2016.IR.YIR.ControlFlow.RetIns;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.Memory.*;
import com.expye.compiler2016.IR.YIR.Move;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Translator.Translator;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/26.
 */
public class CISCTranslator extends Translator{
    List <Instruction> globlInfo;
    List <CFG> superBlock;
    public CISCTranslator(List<Instruction> globalInfo, List<CFG> superBlock) {
        this.globlInfo = globalInfo;
        this.superBlock = superBlock;
    }

    void translateDotData(PrintStream out) {
        out.println("\t.data");

    }

    void translateDotText(PrintStream out) {
        out.println("\t.text");
        for (CFG cfg: superBlock) {
            out.println("func_" + cfg.flable);
            for (BasicBlock bb: cfg.blockList) {
                out.println(bb.label + ":");
                for (Instruction ins: bb.internal)
                    out.println("\t" + ins.CISCResolve());
                out.println();
            }
            out.println();
        }
    }

    @Override
    public void printObjectCode(PrintStream out) {
        translateDotData(out);
        out.println("\t.globl main");
        translateDotText(out);
    }
}
