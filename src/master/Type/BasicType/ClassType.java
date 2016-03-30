package Master.Type.BasicType;

import Master.Type.Name;
import Master.Type.Type;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class ClassType extends BasicType{
    private ClassType par;
    private int lv;
    private Dictionary<Name, Type> member=
        new Hashtable<Name, Type>();

    ClassType (ClassType _par) {
        par = _par;
        if (par == null)
            lv = 0;
        else
            lv = par.lv + 1;
    }

    public void addMember(Name _name, Type _type) {
        member.put(_name, _type);
    }

    public Type getMemberType(Name _name) {
        return member.get(_name);
    }

    public boolean isSuitable(Type rhs) {
        if (rhs instanceof ClassType) {
            ClassType _rhs = (ClassType) rhs;
            if (lv > _rhs.lv)
                return false;
            while (lv < _rhs.lv)
                _rhs = _rhs.par;
            if (this == _rhs) return true;
        }
        return false;
    }
}
