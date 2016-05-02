package com.expye.compiler2016.Utility;

import com.expye.compiler2016.AST.Dec.ArrayDec;
import com.expye.compiler2016.AST.Dec.ClassDec;

/**
 * Created by expye(Zihao Ye) on 2016/4/30.
 */
public class MatchType {
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
