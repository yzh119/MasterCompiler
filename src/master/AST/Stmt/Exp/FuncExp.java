package Master.AST.Stmt.Exp;

import Master.Environment.FuncSymbol;
import Master.Exception.CompilationError;

import java.util.ArrayList;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class FuncExp extends Exp {
    ArrayList<Exp> paraList;
    FuncExp(FuncSymbol fs, ArrayList<Exp> paraList) throws CompilationError {
        this.paraList = paraList;
        for (int i = 0; i < paraList.size(); i++) {
            if (!(paraList.get(i).type.isSuitable(fs.getParaType(i))))
                throw new CompilationError("Parameters' types don't match!");
        }
    }
}
