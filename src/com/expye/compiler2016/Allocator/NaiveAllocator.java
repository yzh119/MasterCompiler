package com.expye.compiler2016.Allocator;

import com.expye.compiler2016.IR.CFG.BasicBlock;
import com.expye.compiler2016.IR.CFG.CFG;
import com.expye.compiler2016.Register.IRRegister;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;

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
