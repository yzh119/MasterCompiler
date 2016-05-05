package com.expye.compiler2016.Allocator;

import com.expye.compiler2016.IR.CFG.BasicBlock;
import com.expye.compiler2016.IR.CFG.CFG;
import com.expye.compiler2016.IR.YIR.Arithmetic.BinaryIns.BinaryIns;
import com.expye.compiler2016.IR.YIR.Arithmetic.UnaryIns.UnaryIns;
import com.expye.compiler2016.IR.YIR.Call;
import com.expye.compiler2016.IR.YIR.Comp.Comp;
import com.expye.compiler2016.IR.YIR.ControlFlow.Cbr;
import com.expye.compiler2016.IR.YIR.ControlFlow.JumpIns;
import com.expye.compiler2016.IR.YIR.ControlFlow.RetIns;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.IR.YIR.Memory.*;
import com.expye.compiler2016.IR.YIR.Move;
import com.expye.compiler2016.Register.ArgsRegister;
import com.expye.compiler2016.Register.IRRegister;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by expye(Zihao Ye) on 2016/5/1.
 */
public class MarvelousAllocator extends Allocator {
    ArrayList<ArrayList<Integer>> edge = new
            ArrayList<>();
    ArrayList<HashSet<Integer>> exists = new
            ArrayList<>();
    HashMap<Instruction, HashSet<Integer>> use =
            new HashMap<>();
    HashMap<Instruction, HashSet<Integer>> def =
            new HashMap<>();
    HashMap<Instruction, HashSet<Integer>> in =
            new HashMap<>();
    HashMap<Instruction, HashSet<Integer>> out =
            new HashMap<>();

    private boolean union(HashSet<Integer> x, HashSet<Integer> y, HashSet<Integer> z) {
        final boolean[] ret = {false};
        y.forEach(
                elem -> {
                    if (!z.contains(elem)) {
                        if (!x.contains(elem)) {
                            ret[0] = true;
                            x.add(elem);
                        }
                    }
                }
        );
        return ret[0];
    }

    private boolean union(HashSet<Integer> x, HashSet<Integer> y) {
        final boolean[] ret = {false};
        y.forEach(
                elem -> {
                    if (!x.contains(elem)) {
                        ret[0] = true;
                        x.add(elem);
                    }
                }
        );
        return ret[0];
    }

    private void livenessAnalysis() {
        final boolean[] haveChanged = {true};
        while (haveChanged[0]) {
            haveChanged[0] = false;
            cfg.blockList.forEach(
                    basicBlock -> {
                        if (!basicBlock.internal.isEmpty()) {
                            if (basicBlock.internal.get(basicBlock.internal.size() - 1) instanceof Cbr) {
                                haveChanged[0] |=
                                        union(
                                                out.get(basicBlock.internal.get(basicBlock.internal.size() - 1)),
                                                in.get(
                                                        cfg.blockList.get(
                                                                cfg.getPosition(
                                                                        ((Cbr) basicBlock.internal.get(basicBlock.internal.size() - 1)).ifTrue
                                                                )
                                                        ).internal.get(0)
                                                )
                                        );
                                haveChanged[0] |=
                                        union(
                                                out.get(basicBlock.internal.get(basicBlock.internal.size() - 1)),
                                                in.get(
                                                        cfg.blockList.get(
                                                                cfg.getPosition(
                                                                        ((Cbr) basicBlock.internal.get(basicBlock.internal.size() - 1)).ifFalse
                                                                )
                                                        ).internal.get(0)
                                                )
                                        );
                            }

                            if (basicBlock.internal.get(basicBlock.internal.size() - 1) instanceof JumpIns) {
                                haveChanged[0] |=
                                        union(
                                                out.get(basicBlock.internal.get(basicBlock.internal.size() - 1)),
                                                in.get(
                                                        cfg.blockList.get(
                                                                cfg.getPosition(
                                                                        ((JumpIns) basicBlock.internal.get(basicBlock.internal.size() - 1)).label
                                                                )
                                                        ).internal.get(0)
                                                )
                                        );
                            }
                            haveChanged[0] |= union(in.get(basicBlock.internal.get(basicBlock.internal.size() - 1)),
                                    use.get(basicBlock.internal.get(basicBlock.internal.size() - 1)));
                            haveChanged[0] |= union(in.get(basicBlock.internal.get(basicBlock.internal.size() - 1)),
                                    out.get(basicBlock.internal.get(basicBlock.internal.size() - 1)),
                                    def.get(basicBlock.internal.get(basicBlock.internal.size() - 1)));

                            for (int i = basicBlock.internal.size() - 2; i >= 0; i--) {
                                haveChanged[0] |= union(out.get(basicBlock.internal.get(i)),
                                        in.get(basicBlock.internal.get(i + 1)));
                                haveChanged[0] |= union(in.get(basicBlock.internal.get(i)),
                                        use.get(basicBlock.internal.get(i)));
                                haveChanged[0] |= union(in.get(basicBlock.internal.get(i)),
                                        out.get(basicBlock.internal.get(i)),
                                        def.get(basicBlock.internal.get(i)));
                            }
                        }
                    }
            );
        }
    }

    private void initialize() {
        cfg.blockList.forEach(
                basicBlock ->
                        basicBlock.internal.forEach(
                                ins -> {
                                    use.put(ins, new HashSet<>());
                                    def.put(ins, new HashSet<>());
                                    in.put(ins, new HashSet<>());
                                    out.put(ins, new HashSet<>());
                                    if (ins instanceof BinaryIns) {
                                        def.get(ins).add(table.get(((BinaryIns) ins).rd));
                                        use.get(ins).add(table.get(((BinaryIns) ins).r1));
                                        if (((BinaryIns) ins).r2 instanceof IRRegister) {
                                            use.get(ins).add(table.get(((BinaryIns) ins).r2));
                                        }
                                    }
                                    if (ins instanceof UnaryIns) {
                                        def.get(ins).add(table.get(((UnaryIns) ins).rd));
                                        use.get(ins).add(table.get(((UnaryIns) ins).rs));
                                    }
                                    if (ins instanceof Comp) {
                                        def.get(ins).add(table.get(((Comp) ins).rd));
                                        use.get(ins).add(table.get(((Comp) ins).r1));
                                        if (((Comp) ins).r2 instanceof IRRegister) {
                                            use.get(ins).add(table.get(((Comp) ins).r2));
                                        }
                                    }
                                    if (ins instanceof Call) {
                                        if (((Call) ins).rd != null)
                                            def.get(ins).add(table.get(((Call) ins).rd));
                                        ((Call) ins).arguments.forEach(
                                                vreg -> {
                                                    if (vreg instanceof IRRegister) {
                                                        use.get(ins).add(table.get(vreg));
                                                    }
                                                }
                                        );
                                    }
                                    if (ins instanceof Cbr) {
                                        use.get(ins).add(table.get(((Cbr) ins).r));
                                    }
                                    if (ins instanceof RetIns) {
                                        if (((RetIns) ins).reg != null)
                                        if (((RetIns) ins).reg instanceof IRRegister) {
                                            use.get(ins).add(table.get(((RetIns) ins).reg));
                                        }
                                    }
                                    if (ins instanceof Allocate) {
                                        def.get(ins).add(table.get(((Allocate) ins).rd));
                                    }
                                    if (ins instanceof Load) {
                                        def.get(ins).add(table.get(((Load) ins).rd));
                                        if (((Load) ins).addr != null) {
                                            if (((Load) ins).addr.staticVar == null) {
                                                use.get(ins).add(table.get(((Load) ins).addr.reg));
                                            }
                                        }
                                    }
                                    if (ins instanceof LoadAdress) {
                                        def.get(ins).add(table.get(((LoadAdress) ins).rd));
                                    }
                                    if (ins instanceof LoadImmediate) {
                                        def.get(ins).add(table.get(((LoadImmediate) ins).rd));
                                    }
                                    if (ins instanceof Store) {
                                        use.get(ins).add(table.get(((Store) ins).rs));
                                        if (((Store) ins).addr != null) {
                                            if (((Store) ins).addr.staticVar == null) {
                                                use.get(ins).add(table.get(((Store) ins).addr.reg));
                                            }
                                        }
                                    }
                                    if (ins instanceof Move) {
                                        def.get(ins).add(table.get(((Move) ins).rd));
                                        use.get(ins).add(table.get(((Move) ins).rs));
                                    }
                                }
                        )
        );
    }

    private void constructInterferenceGraph() {
        for (int i = 0; i < regs.size(); i++) {
            edge.add(new ArrayList<>());
            exists.add(new HashSet<>());
            realRegs[i] = null;
        }

        cfg.blockList.forEach(
                basicBlock -> basicBlock.internal.forEach(
                        ins -> def.get(ins).forEach(
                                defvar -> {
                                    if (defvar != null) {
                                        out.get(ins).forEach(
                                                outvar -> {
                                                    if (outvar != null)
                                                    if (defvar.intValue() != outvar && !exists.get(defvar).contains(outvar)) {
                                                        if (!(ins instanceof Move) || !use.get(ins).contains(outvar)) {
                                                            edge.get(defvar).add(outvar);
                                                            edge.get(outvar).add(defvar);
                                                            exists.get(defvar).add(outvar);
                                                            exists.get(outvar).add(defvar);
                                                        }
                                                    }
                                                }
                                        );
                                    }
                                }
                        )
                )
        );


        if (cfg.blockList.get(0).internal == null) return ;
        HashSet<Integer> initialSet = in.get(cfg.blockList.get(0).internal.get(0));
        for (int i = args.size() - 1; i >= 0; i--) {
            int v1 = table.get(args.get(i));
            initialSet.stream().filter(v2 -> v2 != null && v1 != v2 && !exists.get(v1).contains(v2)).forEach(v2 -> {
                edge.get(v1).add(v2);
                edge.get(v2).add(v1);
                exists.get(v1).add(v2);
                exists.get(v2).add(v1);
            });
            initialSet.remove(v1);
        }
    }

    private void greedyColoringAlgorithm() {
        Boolean[] used = new Boolean[regs.size()];
        for (int i = 0; i < regs.size(); i++)
            used[i] = false;

        for (int t = 0; t < regs.size(); t++) {
            int minDeg = Integer.MAX_VALUE, j = -1;
            for (int i = 0; i < regs.size(); i++) {
                if (used[i]) continue;
                if (edge.get(i).size() < minDeg) {
                    minDeg = edge.get(i).size();
                    j = i;
                }
            }
            used[j] = true;
            for (int candidates = 0; candidates < MachineRegister.virginRegister.length; candidates++) {
                boolean ok = true;
                for (int adjoin: edge.get(j)) {
                    if (realRegs[adjoin] == MachineRegister.virginRegister[candidates]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    realRegs[j] = MachineRegister.virginRegister[candidates];
                    break;
                }
            }
        }
    }

    private void assignEachRegisterOnePhysicalPosition() {
        int offset = 0;
        for (MachineRegister realReg : realRegs) {
            if (realReg == null)
                offsetOfEachRegister.add((offset += 4));
            else {
                if (machineRegToOffset.get(realReg) == null) {
                    offset += 4;
                    machineRegToOffset.put(realReg, offset);
                    offsetOfEachRegister.add(offset);
                } else {
                    offsetOfEachRegister.add(
                            machineRegToOffset.get(realReg)
                    );
                }
            }
        }
        allocSize = offset + 4;
    }

    private String getFrameStart() {
        StringBuilder ret = new StringBuilder();
        ret.append("add $sp, $sp, ").append(-allocSize).append("\n");
        ret.append("sw  $ra, 0($sp)\n");
        for (int i = 0; i < MachineRegister.virginRegister.length; i++) {
            Integer offset = machineRegToOffset.get(MachineRegister.virginRegister[i]);
            if (offset != null)
                ret.append("sw  ").append(MachineRegister.virginRegister[i]).append(", ").append(offset).append("($sp)\n");
        }

        for (int i = 0; i < args.size(); i++) {
            ArgsRegister arg = args.get(i);
            if (realRegs[table.get(arg)] != null) {
                ret.append("lw  ").
                        append(realRegs[table.get(arg)]).append(", ").
                        append(allocSize + i * 4).append("($sp)\n");
            } else {
                ret.append("lw  $v0, ").
                        append(allocSize + i * 4).append("($sp)\n");
                ret.append("sw  $v0, ").
                        append(offsetOfEachRegister.get(table.get(arg))).append("($sp)\n");
            }
        }

        return ret.toString();
    }

    private String getFrameEnd() {
        StringBuilder ret = new StringBuilder();
        ret.append("lw  $ra, 0($sp)\n");
        for (int i = 0; i < MachineRegister.virginRegister.length; i++) {
            Integer offset = machineRegToOffset.get(MachineRegister.virginRegister[i]);
            if (offset != null)
                ret.append("lw  ").append(MachineRegister.virginRegister[i]).append(", ").append(offset).append("($sp)\n");
        }
        ret.append("add $sp, $sp, ").append(allocSize).append("\n");
        return ret.toString();
    }

    public MarvelousAllocator(CFG cfg) {
        super(cfg);
        realRegs = new MachineRegister[regs.size()];
        initialize();
        livenessAnalysis();
        constructInterferenceGraph();
        greedyColoringAlgorithm();
        assignEachRegisterOnePhysicalPosition();
        frameStart = getFrameStart();
        frameEnd   = getFrameEnd();
    }
}
