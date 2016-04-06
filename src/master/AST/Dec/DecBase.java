package Master.AST.Dec;

import Master.Environment.Scope;
import Master.Exception.CompilationError;

/**
 * Created by expye(Zihao Ye) on 2016/4/1.
 */
public class DecBase implements Dec{
    public Scope currentScope;
    public String name;
    public String getName() {
        return name;
    }
}
