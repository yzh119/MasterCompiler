package com.expye.compiler2016.Parser;

import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Prog.Prog;
import com.expye.compiler2016.Environment.Scope;
import com.expye.compiler2016.Exception.CompilationError;
import com.expye.compiler2016.Utility;

import java.util.Stack;


/**
 * Created by expye(Zihao Ye) on 2016/4/4.
 */
public class FirstListener extends BaseListener {
    private Stack<Scope> scopes = new Stack<>();

    @Override
    public void enterProgram(MasterParser.ProgramContext ctx) {
        Prog now = new Prog();
        Prog.ProgInstance = now;
        Scope globalScope = new Scope(null);

        now.currentScope = globalScope;
        CST2AST.dict.put(ctx, now);

        now.currentScope.addEntry("int".intern(), ClassDec.intClass);
        now.currentScope.addEntry("string".intern(), ClassDec.boolClass);
        now.currentScope.addEntry("bool".intern(), ClassDec.stringClass);

        now.currentScope.addEntry("print".intern(), Utility.printDec);
        now.currentScope.addEntry("println".intern(), Utility.printlnDec);
        now.currentScope.addEntry("getString".intern(), Utility.getStringDec);
        now.currentScope.addEntry("getInt".intern(), Utility.getIntDec);
        now.currentScope.addEntry("toString".intern(), Utility.toStringDec);


        ClassDec.stringClass.currentScope = new Scope(globalScope);
        ClassDec.stringClass.currentScope.addEntry("length".intern(), Utility.stringLength);
        ClassDec.stringClass.currentScope.addEntry("substring".intern(), Utility.stringSubstring);
        ClassDec.stringClass.currentScope.addEntry("parseInt".intern(), Utility.stringParseInt);
        ClassDec.stringClass.currentScope.addEntry("ord".intern(), Utility.stringOrd);

        scopes.add(globalScope);
    }

    @Override
    public void exitProgram(MasterParser.ProgramContext ctx) {
        scopes.pop();
    }

    @Override
    public void enterClass_def(MasterParser.Class_defContext ctx) {
        Scope currentScope = scopes.peek();
        String className = ctx.ID().getText().intern();

        if (currentScope.lookUpInThisScope(className) != null)
            throw new CompilationError(currentPlace + "Class already defined!");

        ClassDec now = new ClassDec(className);
        currentScope.addEntry(className, now);
        scopes.add(now.currentScope = new Scope(currentScope));
        CST2AST.dict.put(ctx, now);
    }

    @Override
    public void exitClass_def(MasterParser.Class_defContext ctx) {
        scopes.pop();
    }

}
