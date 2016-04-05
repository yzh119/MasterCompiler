package Master.AST.Stmt;

import Master.AST.Stmt.Exp.Exp;
import Master.Environment.FuncSymbol;
import Master.Environment.MethodSymbol;
import Master.Exception.CompilationError;

import java.util.ArrayList;

/**
 * Created by expye(Zihao Ye) on 2016/4/3.
 */
public class MethodStmt extends StmtBase {
    ArrayList<Exp> paraList;

    MethodStmt(MethodSymbol ms, ArrayList<Exp> paraList) throws CompilationError {
        this.paraList = paraList;
        for (int i = 0; i < paraList.size(); i++) {
            if (!(paraList.get(i).type.isSuitable(ms.getParaType(i))))
                throw new CompilationError("Parameters' types don't match!");
        }
    }
}
