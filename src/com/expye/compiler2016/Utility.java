package com.expye.compiler2016;

import com.expye.compiler2016.AST.Dec.ArrayDec;
import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Dec.FuncDec;
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
    public static VarDec strDec = new VarDec(ClassDec.stringClass, null);
    public static VarDec intDec = new VarDec(ClassDec.intClass, null);
    public static VarDec arrayDec = null;

    public static FuncDec printDec = new FuncDec(ClassDec.nullClass, Arrays.asList(strDec), null, "print");
    public static FuncDec printlnDec = new FuncDec(ClassDec.nullClass, Arrays.asList(strDec) , null, "println");
    public static FuncDec getStringDec = new FuncDec(ClassDec.stringClass, Arrays.asList(), null, "getString");
    public static FuncDec getIntDec = new FuncDec(ClassDec.intClass, Arrays.asList(), null, "getInt");
    public static FuncDec toStringDec = new FuncDec(ClassDec.stringClass, Arrays.asList(intDec), null, "toString");

    public static FuncDec sizeDec = new FuncDec(ClassDec.intClass, Arrays.asList(arrayDec), null, "size");

    public static FuncDec stringLength = new FuncDec(ClassDec.intClass, Arrays.asList(strDec), null, "length");
    public static FuncDec stringSubstring = new FuncDec(ClassDec.stringClass, Arrays.asList(strDec, intDec, intDec), null, "substring");
    public static FuncDec stringParseInt = new FuncDec(ClassDec.intClass, Arrays.asList(strDec), null, "parseInt");
    public static FuncDec stringOrd = new FuncDec(ClassDec.intClass, Arrays.asList(strDec, intDec), null, "ord");

    public static boolean match(ClassDec x, ClassDec y) {
        if (x != ClassDec.boolClass && x != ClassDec.intClass && x != ClassDec.stringClass) {
            if (y == ClassDec.nullClass) return true;
        }
        if (x == y) return true;
        if (x instanceof ArrayDec && y instanceof ArrayDec) {
            // This statement is used for array.size()
            // if (x == ArrayDec.arrayClass) return true;
            return (((ArrayDec)x).baseType == ((ArrayDec)y).baseType)
                    && (((ArrayDec)x).dim == ((ArrayDec)y).dim);
        }
        return false;
    }
}
