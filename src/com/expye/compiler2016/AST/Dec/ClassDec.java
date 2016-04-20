package com.expye.compiler2016.AST.Dec;

import com.expye.compiler2016.AST.VarDec.VarDec;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class ClassDec extends DecBase {
    public static ClassDec intClass =
            new ClassDec("int".intern());
    public static ClassDec boolClass =
            new ClassDec("bool".intern());
    public static ClassDec stringClass =
            new ClassDec("string".intern());
    public static ClassDec nullClass =
            new ClassDec("null".intern());

    public ArrayList<String> declNames = new
            ArrayList<>();
    public ArrayList<VarDec> declElems = new
            ArrayList<>();

    public ClassDec(String name) {
        this.name = name;
    }

    public void addDecl(String name, VarDec decl) {
        declNames.add(name.intern());
        declElems.add(decl);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return this.name;
    }
}
