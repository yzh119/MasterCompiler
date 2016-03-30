package Master.Environment;

import Master.Type.Name;
import Master.Type.Type;

import java.util.ArrayList;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */

public class FuncSymbol extends Symbol {

    private class FuncPara {
        Name name;
        Type type;
        FuncPara (Name _name, Type _type) {
            name = _name;
            type = _type;
        }
    }

    Type retType;
    ArrayList<FuncPara> paraName = new ArrayList<FuncPara>();
    FuncSymbol(Type _retType) {
        retType = _retType;
    }

    void addPara(Name _name, Type _type) {
        paraName.add(new FuncPara(_name, _type));
    }
}
