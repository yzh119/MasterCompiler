package Master.AST.Dec;

import Master.Utility;

/**
 * Created by expye(Zihao Ye) on 2016/4/6.
 */
public class ArrayDec extends ClassDec{
    public ClassDec baseType;
    public int dim;
    public ArrayDec(ClassDec baseType, int dim) {
        super(null);
        this.baseType = baseType;
        this.dim = dim;
    }

    @Override
    public void addDecl(String name, Dec decl) {
        super.addDecl(name, decl);
    }
}
