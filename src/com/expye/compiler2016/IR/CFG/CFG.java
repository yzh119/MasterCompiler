package com.expye.compiler2016.IR.CFG;

import com.expye.compiler2016.IR.YIR.FuncLabel;
import com.expye.compiler2016.IR.YIR.Label;

import java.util.HashMap;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/24.
 */
public class CFG {
    int cnt = 0;
    public FuncLabel flable;
    public List<BasicBlock> blockList;
    public HashMap<Label, Integer> map;

    public CFG(FuncLabel flabel, List<BasicBlock> blockList) {
        this.flable = flabel;
        this.blockList = blockList;
    }

    public Integer getPosition(Label lb) {
        cnt++;
        if (cnt == 1) {
            int pos = 0;
            for (BasicBlock bb: blockList) {
                map.put(bb.label, pos);
                pos++;
            }
        }
        return map.get(lb);
    }
}
