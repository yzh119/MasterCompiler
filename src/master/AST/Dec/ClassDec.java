package Master.AST.Dec;

import Master.Environment.ClassSymbol;
import Master.Environment.Scope;
import Master.Type.BasicType.BasicType;

import java.util.ArrayList;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class ClassDec extends DecBase {
    public static ClassDec IntegerDec
            = new ClassDec(ClassSymbol.IntClassSymbol);
    public static ClassDec StringDec
            = new ClassDec(ClassSymbol.StringClassSymbol);
    public static ClassDec BoolDec
            = new ClassDec(ClassSymbol.BoolClassSymbol);
    ArrayList<Dec> declarations =
            new ArrayList<>();
    public ClassSymbol cs = null;

    public ClassDec(ClassSymbol cs) {
        this.cs = cs;
        cs.addRef(this);
    }

    public void addComponent(Dec decl) {
        declarations.add(decl);
    }
}
