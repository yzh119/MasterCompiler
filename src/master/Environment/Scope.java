package Master.Environment;

import Master.AST.ASTnode;
import Master.AST.Dec.Dec;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Created by expye(Zihao Ye) on 2016/4/3.
 */
public class Scope {
    Scope previous = null;
    public Map<String, Dec> dict =
            new IdentityHashMap<>();

    public Scope(Scope previous) {
        this.previous = previous;
    }

    public Dec lookUp(String name) {
        Dec ret = dict.get(name);
        if (previous == null)
            return ret;
        if (ret == null)
            return previous.lookUp(name);
        else return ret;
    }

    public Dec lookUpInThisScope(String name) {
        return dict.get(name);
    }

    public void addEntry(String name, Dec symbol) {
        dict.put(name, symbol);
    }
}
