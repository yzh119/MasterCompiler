package Master.Environment;

import Master.Exception.CompilationError;
import Master.Type.BasicType.BasicType;
import Master.Type.BasicType.ClassType;
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
    public ArrayList<Pair> paraList = new ArrayList<Pair>();

    public void addPara(Name name, Type type) throws CompilationError {
        paraList.add(new Pair(name, type));
    }

    public Name getName(int idx) throws CompilationError {
        if (idx >= paraList.size())
            throw new CompilationError("Two many parameters!");
        return paraList.get(idx).name;
    }
    public Type getParaType(int idx) throws CompilationError {
        if (idx >= paraList.size())
            throw new CompilationError("Too many parameters!");
        return paraList.get(idx).type;
    }

    public MethodSymbol(Name name) {
        super(name);
    }
}
