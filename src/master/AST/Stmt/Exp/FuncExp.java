package Master.AST.Stmt.Exp;

import Master.AST.Dec.FuncDec;
import Master.Exception.CompilationError;
import Master.Utility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class FuncExp extends Exp {
    List<Exp> paraList;
    FuncDec fd;
    FuncExp(FuncDec fd, List<Exp> paraList) {
        this.fd = fd;
        this.paraList = paraList;
    }
}
