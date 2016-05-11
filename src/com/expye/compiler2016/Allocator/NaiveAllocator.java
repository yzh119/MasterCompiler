package com.expye.compiler2016.Allocator;

import com.expye.compiler2016.IR.CFG.CFG;

/**
 * Created by expye(Zihao Ye) on 2016/5/1.
 */
public class NaiveAllocator extends Allocator {

    public NaiveAllocator(CFG cfg) {
        super(cfg);
        realRegs = new MachineRegister[regs.size()];
        for (int i = 0; i < regs.size(); i++)
            realRegs[i] = null;
    }
}
