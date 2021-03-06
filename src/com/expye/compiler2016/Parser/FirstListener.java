package com.expye.compiler2016.Parser;

import com.expye.compiler2016.AST.ConstructAST;
import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Prog.Prog;
import com.expye.compiler2016.Environment.Scope;
import com.expye.compiler2016.Exception.CompilationError;
import com.expye.compiler2016.IR.CFG.BasicBlock;
import com.expye.compiler2016.IR.CFG.CFG;
import com.expye.compiler2016.IR.CFG.Program;
import com.expye.compiler2016.IR.YIR.YIR;
import com.expye.compiler2016.Label.FuncLabel;
import com.expye.compiler2016.Label.Label;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Utility.Utility;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
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
        IRRegister.init();
        ConstructAST.globalScope = new Scope(null);
        CST2AST.dict = new ParseTreeProperty<>();
        YIR.YIRInstance = new YIR();
        Label.init();
        FuncLabel.originLabel = null;
        Program.functions = new ArrayList<>();
        Program.globalMem = new ArrayList<>();
        Program.preMain = new CFG(new FuncLabel(null, "main"),
                new ArrayList<>());
        Program.preMain.blockList.add(new BasicBlock(Label.funcStartLabel("main"), new ArrayList<>()));
        now.currentScope = ConstructAST.globalScope;
        CST2AST.dict.put(ctx, now);

        now.currentScope.addEntry("int".intern(), ClassDec.intClass);
        now.currentScope.addEntry("string".intern(), ClassDec.boolClass);
        now.currentScope.addEntry("bool".intern(), ClassDec.stringClass);

        now.currentScope.addEntry("print".intern(), Utility.printDec);
        now.currentScope.addEntry("println".intern(), Utility.printlnDec);
        now.currentScope.addEntry("getString".intern(), Utility.getStringDec);
        now.currentScope.addEntry("getInt".intern(), Utility.getIntDec);
        now.currentScope.addEntry("toString".intern(), Utility.toStringDec);

        now.currentScope.addEntry("string_concatenate".intern(), Utility.stringConcatenate);
        now.currentScope.addEntry("string_equal_to".intern(), Utility.stringEq);
        now.currentScope.addEntry("string_less_than".intern(), Utility.stringLt);

        ClassDec.stringClass.currentScope = new Scope(ConstructAST.globalScope);
        ClassDec.stringClass.currentScope.addEntry("length".intern(), Utility.stringLength);
        ClassDec.stringClass.currentScope.addEntry("substring".intern(), Utility.stringSubstring);
        ClassDec.stringClass.currentScope.addEntry("parseInt".intern(), Utility.stringParseInt);
        ClassDec.stringClass.currentScope.addEntry("ord".intern(), Utility.stringOrd);

        scopes.add(ConstructAST.globalScope);
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
