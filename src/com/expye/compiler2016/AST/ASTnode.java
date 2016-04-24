package com.expye.compiler2016.AST;

import com.expye.compiler2016.IR.ILOC.Label;

/**
 * Created by expye(Zihao Ye) on 2016/3/30.
 */

public interface ASTnode {
    String toString();
    void toILOC();
}
