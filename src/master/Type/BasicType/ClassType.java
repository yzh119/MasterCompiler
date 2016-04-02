package Master.Type.BasicType;

import Master.Type.Name;
import Master.Type.Type;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */
public class ClassType extends BasicType{
    private ClassType par;
    private Dictionary<Name, Type> member=
        new Hashtable<Name, Type>();

    public void addMember(Name name, Type type) {
        member.put(name, type);
    }

    public Type getMemberType(Name name) {
        return member.get(name);
    }

    public boolean isSuitable(Type rhs) {
        if (rhs == null) {
            return true;
        }
        if (rhs instanceof ClassType) {
            while (rhs != null) {
                if (rhs == this) return true;
                rhs = ((ClassType) rhs).par;
            }
        }
        return false;
    }

    public ClassType(ClassType par) {
        this.par = par;
    }
}
