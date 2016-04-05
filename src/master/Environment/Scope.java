package Master.Environment;

import Master.Type.Name;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by expye(Zihao Ye) on 2016/4/3.
 */
public class Scope {
    Scope previous = null;
    Map<Name, Symbol> dict =
            new HashMap<>();

    public Scope(Scope previous) {
        this.previous = previous;
    }

    public Symbol lookUp(Name name) {
        Symbol ret = dict.get(name);
        if (previous == null)
            return ret;
        if (ret == null)
            return previous.lookUp(name);
        return null;
    }

    public Symbol lookUpInThisScope(Name name) {
        return dict.get(name);
    }

    public void addEntry(Name name, Symbol symbol) {
        dict.put(name, symbol);
    }
}
