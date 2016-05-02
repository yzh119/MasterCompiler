package com.expye.compiler2016.AST.Dec;

import com.expye.compiler2016.AST.VarDec.VarDec;
import com.expye.compiler2016.IR.YIR.Instruction;
import com.expye.compiler2016.Utility.Utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class ClassDec extends DecBase {
    int cnt = 0;
    public int size = 0;
    public static ClassDec intClass =
            new ClassDec("int".intern());
    public static ClassDec boolClass =
            new ClassDec("bool".intern());
    public static ClassDec stringClass =
            new ClassDec("string".intern());
    public static ClassDec nullClass =
            new ClassDec("null".intern());

    public ArrayList<VarDec> declElems = new
            ArrayList<>();
    public HashMap<String, Integer> offsetTable =
            new HashMap<>();
    public ClassDec(String name) {
        this.name = name;
    }

    public void addDecl(VarDec decl) {
        declElems.add(decl);
        size += Utility.i32;
    }

    public Integer getOffset(String s) {
        ++cnt;
        if (cnt == 1) {
            int calOffset = 0;
            for (VarDec decl: this.declElems) {
                offsetTable.put(decl.getName(), calOffset);
                calOffset += Utility.i32;
            }
        }
        return offsetTable.get(s);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public void emit(List<Instruction> lst) {}
}
