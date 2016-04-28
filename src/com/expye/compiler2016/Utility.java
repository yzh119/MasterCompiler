package com.expye.compiler2016;

import com.expye.compiler2016.AST.Dec.ArrayDec;
import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Dec.FuncDec;
import com.expye.compiler2016.AST.VarDec.VarDec;
import com.expye.compiler2016.Environment.Scope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/5.
 */
public class Utility {
    public static int ldsdL0R1 = 1;
    public final static int i8 = 1, i32 = 4;
// retType varDec body
// varDec body
    public final static VarDec strDec = new VarDec(ClassDec.stringClass, null);
    public final static VarDec intDec = new VarDec(ClassDec.intClass, null);
    public final static VarDec arrayDec = null;

    public final static FuncDec printDec = new FuncDec(ClassDec.nullClass, Arrays.asList(strDec), null, "print");
    public final static FuncDec printlnDec = new FuncDec(ClassDec.nullClass, Arrays.asList(strDec) , null, "println");
    public final static FuncDec getStringDec = new FuncDec(ClassDec.stringClass, Arrays.asList(), null, "getString");
    public final static FuncDec getIntDec = new FuncDec(ClassDec.intClass, Arrays.asList(), null, "getInt");
    public final static FuncDec toStringDec = new FuncDec(ClassDec.stringClass, Arrays.asList(intDec), null, "toString");

    public final static FuncDec sizeDec = new FuncDec(ClassDec.intClass, Arrays.asList(arrayDec), null, "size");

    public final static FuncDec stringLength = new FuncDec(ClassDec.intClass, Arrays.asList(strDec), null, "length");
    public final static FuncDec stringSubstring = new FuncDec(ClassDec.stringClass, Arrays.asList(strDec, intDec, intDec), null, "substring");
    public final static FuncDec stringParseInt = new FuncDec(ClassDec.intClass, Arrays.asList(strDec), null, "parseInt");
    public final static FuncDec stringOrd = new FuncDec(ClassDec.intClass, Arrays.asList(strDec, intDec), null, "ord");

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
