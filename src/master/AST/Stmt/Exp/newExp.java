package Master.AST.Stmt.Exp;

import Master.AST.Dec.ClassDec;
import Master.Exception.CompilationError;
import Master.Utility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/5.
 */
public class newExp extends Exp {
    List<Exp> sizeInEachDim = null;
    public newExp(List<Exp> sizeInEachDim, ClassDec type) {
        this.sizeInEachDim = sizeInEachDim;
        this.type = type;
    }
}
