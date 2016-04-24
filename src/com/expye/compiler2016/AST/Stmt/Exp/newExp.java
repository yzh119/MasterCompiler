package com.expye.compiler2016.AST.Stmt.Exp;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.Environment.Scope;
import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Utility;

import java.util.List;

/**
 * Created by expye(Zihao Ye) on 2016/4/5.
 */
public class newExp extends Exp {
    List<Exp> sizeInEachDim = null;
    public newExp(List<Exp> sizeInEachDim, ClassDec type) {
        this.sizeInEachDim = sizeInEachDim;
        this.type = type;

       // this.reg = new Address( );

        /*
            wait to be done!
         */
    }

    @Override
    public void toILOC() {}
}
