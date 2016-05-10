package com.expye.compiler2016.Parser;

import com.expye.compiler2016.AST.ASTnode;
import com.expye.compiler2016.AST.Dec.ArrayDec;
import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Dec.FuncDec;
import com.expye.compiler2016.AST.Prog.Prog;
import com.expye.compiler2016.AST.VarDec.VarDec;
import com.expye.compiler2016.Exception.CompilationError;
import com.expye.compiler2016.Exception.InternalError;
import com.expye.compiler2016.Environment.Scope;
import com.expye.compiler2016.Register.ArgsRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by expye(Zihao Ye) on 2016/4/4.
 */
public class SecondListener extends BaseListener {
    private Stack<Scope> scopes = new Stack<>();
    private Stack<ClassDec> currentClass = new Stack<>();
    @Override
    public void enterProgram(MasterParser.ProgramContext ctx) {
        scopes.add(((Prog)CST2AST.dict.get(ctx)).currentScope);
    }

    @Override
    public void exitProgram(MasterParser.ProgramContext ctx) {
        scopes.pop();
    }

    @Override
    public void enterClass_def(MasterParser.Class_defContext ctx) {
        scopes.add(((ClassDec)CST2AST.dict.get(ctx)).currentScope);
        currentClass.add((ClassDec)CST2AST.dict.get(ctx));
    }

    @Override
    public void exitClass_def(MasterParser.Class_defContext ctx) {
        scopes.pop();
        currentClass.pop();
    }

    @Override
    public void enterIntegerType(MasterParser.IntegerTypeContext ctx) {
        CST2AST.dict.put(ctx, ClassDec.intClass);
    }

    @Override
    public void enterStringType(MasterParser.StringTypeContext ctx) {
        CST2AST.dict.put(ctx, ClassDec.stringClass);
    }

    @Override
    public void enterBoolType(MasterParser.BoolTypeContext ctx) {
        CST2AST.dict.put(ctx, ClassDec.boolClass);
    }

    @Override
    public void enterNullType(MasterParser.NullTypeContext ctx) { CST2AST.dict.put(ctx, ClassDec.nullClass); }

    @Override
    public void enterClassType(MasterParser.ClassTypeContext ctx) {
        Scope currentScope = scopes.peek();
        String className =
                ctx.ID().getText().intern();
        ASTnode thisClass = currentScope.lookUp(className);
        if (thisClass == null)
            throw new CompilationError(currentPlace + "Type not defined!");
        if (!(thisClass instanceof ClassDec))
            throw new CompilationError(currentPlace + "It's not a class type!");
        CST2AST.dict.put(ctx, thisClass);
    }

    @Override
    public void exitArrayType(MasterParser.ArrayTypeContext ctx) {
        ASTnode type = CST2AST.dict.get(ctx.type_specifier());
        if (type == null)
            throw new InternalError("Something happened unfortunately!");
        ClassDec baseType = (ClassDec)type;
        int dim = ctx.LBRACKET().size();
        ArrayDec now = new ArrayDec(baseType, dim);
        CST2AST.dict.put(ctx, now);
    }

    @Override
    public void exitFunction_def(MasterParser.Function_defContext ctx) {
        ArgsRegister.init();
        Scope currentScope = scopes.peek();
        String funcName =
                ctx.ID().getText().intern();
        ASTnode thisFunc = currentScope.lookUpInThisScope(funcName);
        if (thisFunc != null)
            throw new CompilationError(currentPlace + "This function name has been used!");

        ASTnode type = CST2AST.dict.get(ctx.type_specifier());
        if (type == null)
            throw new InternalError("Something happened unfortunately!");

        ClassDec retType = (ClassDec)type;
        List<VarDec> paraList = new ArrayList<>();
        if (!currentClass.empty())
            paraList.add(
                    new VarDec(currentClass.peek(), "this".intern(), new ArgsRegister(0))
            );
        if (ctx.parameter_list() != null)
            for (MasterParser.Parameter_declContext paraDecl: ctx.parameter_list().parameter_decl()) {
                type = CST2AST.dict.get(paraDecl.type_specifier());
                if (type == null)
                    throw new InternalError("Something happened unfortunately!");
                paraList.add(new VarDec((ClassDec)type, paraDecl.ID().getText().intern(), new ArgsRegister(0)));
            }
        FuncDec now = new FuncDec(retType, paraList, null,
                (currentClass.empty() ? funcName: currentClass.peek().getName() + "_" + funcName));
        CST2AST.dict.put(ctx, now);
        now.currentScope = new Scope(currentScope);
        for (VarDec para: paraList) {
            if (now.currentScope.lookUpInThisScope(para.getName().intern()) == null)
                now.currentScope.addEntry(para.getName().intern(), para);
            else throw new CompilationError("Parameters with the same id!");
        }
        currentScope.addEntry(funcName, now);
        if (!currentClass.empty())
            Prog.ProgInstance.list.add(now);
    }
}
