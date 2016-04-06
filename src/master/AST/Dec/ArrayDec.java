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
        this.addDecl("size", Utility.sizeDec);
    }

    @Override
    public void addDecl(String name, Dec decl) {
        super.addDecl(name, decl);
    }

    @Override
    public String toString() {
        return baseType.toString() + String.valueOf(dim);
    }
}
