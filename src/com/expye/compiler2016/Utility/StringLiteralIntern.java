package com.expye.compiler2016.Utility;

import com.expye.compiler2016.IR.CFG.Program;
import com.expye.compiler2016.IR.YIR.StaticString;
import com.expye.compiler2016.Label.GlobalVarLabel;

import java.io.PrintStream;
import java.util.IdentityHashMap;

/**
 * Created by expye(Zihao Ye) on 2016/4/30.
 */
public class StringLiteralIntern {

    public static IdentityHashMap<String, GlobalVarLabel> table =
            new IdentityHashMap<>();

    public static GlobalVarLabel find(String strLiteral) {
        GlobalVarLabel ret = table.get(strLiteral);
        if (ret == null) {
            ret = new GlobalVarLabel(strLiteral.hashCode());
            Program.globalMem.add(
                    new StaticString(ret, strLiteral)
            );
            table.put(strLiteral, ret);
        }
        return ret;
    }
}
