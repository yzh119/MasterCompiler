package Master.Environment;

import Master.AST.ASTnode;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Created by expye(Zihao Ye) on 2016/4/3.
 */
public class Scope {
    Scope previous = null;
    Map<String, ASTnode> dict =
            new IdentityHashMap<>();

    public Scope(Scope previous) {
        this.previous = previous;
    }

    public ASTnode lookUp(String name) {
        ASTnode ret = dict.get(name);
        if (previous == null)
            return ret;
        if (ret == null)
            return previous.lookUp(name);
        return null;
    }

    public ASTnode lookUpInThisScope(String name) {
        return dict.get(name);
    }

    public void addEntry(String name, ASTnode symbol) {
        dict.put(name, symbol);
    }
}
