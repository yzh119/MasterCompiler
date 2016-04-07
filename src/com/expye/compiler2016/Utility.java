package com.expye.compiler2016;

import com.expye.compiler2016.AST.Dec.ArrayDec;
import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Dec.FuncDec;
import com.expye.compiler2016.AST.Dec.MethodDec;
import com.expye.compiler2016.AST.VarDec.VarDec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/5.
 */
public class Utility {
// retType varDec body
// varDec body
    public static VarDec strDec = new VarDec(ClassDec.stringClass, "str".intern());
    public static VarDec intDec = new VarDec(ClassDec.intClass, "int".intern());
    public static List<VarDec> noPara = new ArrayList<>();
    public static List<VarDec> oneStr = Arrays.asList(strDec);
    public static List<VarDec> oneInt = Arrays.asList(intDec);
    public static List<VarDec> twoInt = Arrays.asList(intDec, intDec);
    public static MethodDec printDec = new MethodDec(oneStr, null, "print");
    public static MethodDec printlnDec = new MethodDec(oneStr, null, "println");
    public static FuncDec getStringDec = new FuncDec(ClassDec.stringClass, noPara, null, "getString");
    public static FuncDec getIntDec = new FuncDec(ClassDec.intClass, noPara, null, "getInt");
    public static FuncDec toStringDec = new FuncDec(ClassDec.stringClass, oneInt, null, "toString");

    public static FuncDec sizeDec = new FuncDec(ClassDec.intClass, noPara, null, "size");

    public static FuncDec stringLength = new FuncDec(ClassDec.intClass, noPara, null, "length");
    public static FuncDec stringSubstring = new FuncDec(ClassDec.stringClass, twoInt, null, "substring");
    public static FuncDec stringParseInt = new FuncDec(ClassDec.intClass, noPara, null, "parseInt");
    public static FuncDec stringOrd = new FuncDec(ClassDec.intClass, oneInt, null, "ord");


    public static boolean match(ClassDec x, ClassDec y) {
        if (x != ClassDec.boolClass && x != ClassDec.intClass && x != ClassDec.stringClass) {
            if (y == ClassDec.nullClass) return true;
        }
        if (x == y) return true;
        if (x instanceof ArrayDec && y instanceof ArrayDec) {
            return (((ArrayDec)x).baseType == ((ArrayDec)y).baseType)
                    && (((ArrayDec)x).dim == ((ArrayDec)y).dim);
        }
        return false;
    }
}
