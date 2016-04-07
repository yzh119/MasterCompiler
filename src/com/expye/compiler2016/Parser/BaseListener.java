package com.expye.compiler2016.Parser;

import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Created by expye(Zihao Ye) on 2016/4/5.
 */
public class BaseListener extends MasterBaseListener {
    public String currentPlace = null;

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        currentPlace = "(" + ctx.getStart().getLine() + ", " + ctx.getStart().getCharPositionInLine() + "): ";
    }
}
