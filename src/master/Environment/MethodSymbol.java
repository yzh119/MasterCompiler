package Master.Environment;

import Master.Type.Name;
import Master.Type.Type;

import java.util.ArrayList;

/**
 * Created by expye(Zihao Ye) on 2016/4/3.
 */
public class MethodSymbol extends Symbol {
    private class Pair {
        Name name;
        Type type;
        Pair (Name name, Type type) {
            this.name = name;
            this.type = type;
        }
    }
    ArrayList<Pair> paraList = new ArrayList<Pair>();

    public void addPara(Name name, Type type) {
        paraList.add(new Pair(name, type));
    }

    public Type getParaType(int idx) {
        return paraList.get(idx).type;
    }
    public MethodSymbol(Name name) {
        super(name);
    }
}
