package Master.Environment;

import Master.AST.ASTnode;
import Master.AST.Dec.Dec;
import Master.Type.Name;
import Master.Type.Type;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */

public class Symbol {
    public Name name = null;
    Dec ref = null;
    public Symbol(Name name) {
        this.name = name;
    }
    public void addRef(Dec ref) {
        this.ref = ref;
    }
}
