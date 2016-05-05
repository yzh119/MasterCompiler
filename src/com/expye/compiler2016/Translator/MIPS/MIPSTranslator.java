package com.expye.compiler2016.Translator.MIPS;

import com.expye.compiler2016.Allocator.Allocator;
import com.expye.compiler2016.Allocator.MarvelousAllocator;
import com.expye.compiler2016.IR.CFG.BasicBlock;
import com.expye.compiler2016.IR.CFG.CFG;
import com.expye.compiler2016.IR.CFG.Program;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.Move;
import com.expye.compiler2016.Translator.Translator;
import com.expye.compiler2016.Utility.StringLiteralIntern;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/26.
 */
public class MIPSTranslator extends Translator{
    List <Instruction> globlInfo;
    List <CFG> superBlock;
    public MIPSTranslator(List<Instruction> globalInfo, List<CFG> superBlock) {
        this.globlInfo = globalInfo;
        this.superBlock = superBlock;
    }

    void translateDotData(PrintStream out) {
        out.println("\t.data");
        for (Instruction ins: Program.globalMem) {
            out.println(ins.toString());
        }
    }

    void translateDotText(PrintStream out) {
        out.println("\t.text");
        for (CFG cfg: superBlock) {
            out.println(cfg.flable + ":");
            Allocator alloc = new MarvelousAllocator(cfg);

            if (cfg == Program.preMain) {
                StringLiteralIntern.table.forEach(
                        (stringLiteral, stringLabel) -> {
                            out.println("la  $v0, " + stringLabel.label);
                            out.println("li  $v1, " + stringLiteral.length());
                            out.println("sw  $v1, -4($v0)");
                        }
                );
            }

            out.println(alloc.frameStart);
            for (BasicBlock bb: cfg.blockList) {
                out.println(bb.label.toMIPS(alloc) + ":");
                for (Instruction ins: bb.internal) {
                    if (ins instanceof Move)
                    if (alloc.realRegs[alloc.table.get(((Move) ins).rd)] != null &&
                            alloc.realRegs[alloc.table.get(((Move) ins).rd)] ==
                            alloc.realRegs[alloc.table.get(((Move) ins).rs)])
                                continue;
                    out.println(ins.toMIPS(alloc));
                }
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
