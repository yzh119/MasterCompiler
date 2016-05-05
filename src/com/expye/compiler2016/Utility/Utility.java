package com.expye.compiler2016.Utility;

import com.expye.compiler2016.AST.Dec.ArrayDec;
import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Dec.FuncDec;
import com.expye.compiler2016.AST.VarDec.VarDec;
import com.expye.compiler2016.Register.ArgsRegister;
import com.expye.compiler2016.Register.IRRegister;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/5.
 */
public class Utility {
    public static int ldsdL0R1 = 1;
    public final static int i32 = 4;
// retType varDec body
// varDec body
    public final static VarDec strDec1 = new VarDec(ClassDec.stringClass, "argss1", new ArgsRegister(0));
    public final static VarDec strDec2 = new VarDec(ClassDec.stringClass, "argss2", new ArgsRegister(0));
    public final static VarDec intDec1 = new VarDec(ClassDec.intClass, "argsi1", new ArgsRegister(0));
    public final static VarDec intDec2 = new VarDec(ClassDec.intClass, "argsi2", new ArgsRegister(0));
    public final static VarDec arrayDec = null;

    public final static FuncDec printDec = new FuncDec(ClassDec.nullClass, Arrays.asList(strDec1), null, "print");
    public final static FuncDec printlnDec = new FuncDec(ClassDec.nullClass, Arrays.asList(strDec1) , null, "println");
    public final static FuncDec getStringDec = new FuncDec(ClassDec.stringClass, Arrays.asList(), null, "getString");
    public final static FuncDec getIntDec = new FuncDec(ClassDec.intClass, Arrays.asList(), null, "getInt");
    public final static FuncDec toStringDec = new FuncDec(ClassDec.stringClass, Arrays.asList(intDec1), null, "toString");

    public final static FuncDec sizeDec = new FuncDec(ClassDec.intClass, Arrays.asList(arrayDec), null, "size");

    public final static FuncDec stringLength = new FuncDec(ClassDec.intClass, Arrays.asList(strDec1), null, "length");
    public final static FuncDec stringSubstring = new FuncDec(ClassDec.stringClass, Arrays.asList(strDec1, intDec1, intDec2), null, "substring");
    public final static FuncDec stringParseInt = new FuncDec(ClassDec.intClass, Arrays.asList(strDec1), null, "parseInt");
    public final static FuncDec stringOrd = new FuncDec(ClassDec.intClass, Arrays.asList(strDec1, intDec1), null, "ord");

    public final static FuncDec stringEq = new FuncDec(ClassDec.boolClass, Arrays.asList(strDec1, strDec2), null,
            "stringIsEqual");
    public final static FuncDec stringLt = new FuncDec(ClassDec.boolClass, Arrays.asList(strDec1, strDec2), null,
            "stringLess");
    public final static FuncDec stringConcatenate = new FuncDec(ClassDec.stringClass, Arrays.asList(strDec1, strDec2),
            null, "stringConcatenate");
    static {
        ArgsRegister.init();
    }

}
