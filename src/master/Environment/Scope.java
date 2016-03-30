package Master.Environment;

import Master.Type.Name;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 * Path compression waiting to be constructed.
 */
public class Scope {
    private Scope encl;
    private Dictionary<Name, Symbol> member
            = new Hashtable<Name, Symbol>();

    public void define (Name name, Symbol symbol) {
        member.put(name, symbol);
    }

    public Symbol resolve(Name name) {
        Symbol s = member.get(name);
        if (s != null) return s;
        if (encl == null) {
            return null;
        } else {
            return encl.resolve(name);
        }
    }

    public Scope getEnclosingScope() {
        return encl;
    }

    public Scope (Scope _encl) {
        encl = _encl;
    }
}
