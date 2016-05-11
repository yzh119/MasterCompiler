package com.expye.compiler2016.Parser;

import com.expye.compiler2016.AST.ASTnode;
import com.expye.compiler2016.AST.ConstructAST;
import com.expye.compiler2016.AST.Dec.ArrayDec;
import com.expye.compiler2016.AST.Dec.ClassDec;
import com.expye.compiler2016.AST.Dec.Dec;
import com.expye.compiler2016.AST.Dec.FuncDec;
import com.expye.compiler2016.AST.Prog.Prog;
import com.expye.compiler2016.AST.Stmt.*;
import com.expye.compiler2016.AST.Stmt.Exp.BinExp.*;
import com.expye.compiler2016.AST.Stmt.Exp.*;
import com.expye.compiler2016.AST.Stmt.Exp.UnaryExp.*;
import com.expye.compiler2016.AST.VarDec.VarDec;
import com.expye.compiler2016.Environment.Scope;
import com.expye.compiler2016.Exception.CompilationError;
import com.expye.compiler2016.Exception.InternalError;
import com.expye.compiler2016.Label.GlobalVarLabel;
import com.expye.compiler2016.Register.Address;
import com.expye.compiler2016.Register.IRRegister;
import com.expye.compiler2016.Utility.MatchType;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by expye(Zihao Ye) on 2016/4/4.
 */
public class ThirdListener extends BaseListener {
    Stack<Scope> scopes = new Stack<>();
    Stack<Dec> recentFuncDec = new Stack<>();
    Stack<IterationStmt> recentIteration = new Stack<>();
    Stack<ClassDec> currentClass = new Stack<>();
    @Override
    public void enterProgram(MasterParser.ProgramContext ctx) {
        Prog now = (Prog)CST2AST.dict.get(ctx);
        scopes.add(now.currentScope);
    }

    @Override
    public void exitProgram(MasterParser.ProgramContext ctx) {
        Prog now = (Prog)CST2AST.dict.get(ctx);
        for (ParseTree child: ctx.children) {
            ASTnode ask = CST2AST.dict.get(child);
            if (ask == null) throw new InternalError("Something happened unfortunately!");
            now.list.add((Dec) ask);
        }
        Dec MAIN = scopes.peek().lookUp("main".intern());
        if (MAIN == null)
            throw new CompilationError("Where is the main function!");
        if (!(MAIN instanceof FuncDec))
            throw new CompilationError("Tan Haoqiang?");
        if (((FuncDec)MAIN).retType != ClassDec.intClass)
            throw new CompilationError("Tan Haoqiang?");
        scopes.pop();
    }

    @Override
    public void enterClass_def(MasterParser.Class_defContext ctx) {
        ClassDec now = (ClassDec)CST2AST.dict.get(ctx);
        scopes.add(now.currentScope);
        currentClass.add(now);
    }

    @Override
    public void exitClass_def(MasterParser.Class_defContext ctx) {
        ClassDec now = (ClassDec)CST2AST.dict.get(ctx);
        if (ctx.class_body().getChildCount() > 0)
        for (ParseTree child: ctx.class_body().children) {
            ASTnode ask = CST2AST.dict.get(child);
            if (ask == null) throw new InternalError("Something happened unfortunately!");
            if (ask instanceof ClassDec)
                throw new CompilationError(currentPlace + "Nested class is not supported, I'm angry!");
    /*        if (ask instanceof VarDec)
                now.addDecl((VarDec)ask);*/
        }
        scopes.pop();
        currentClass.pop();
    }

    @Override
    public void enterFunction_def(MasterParser.Function_defContext ctx) {
        IRRegister.reSetCounterToNewFunc();
        FuncDec now = (FuncDec)CST2AST.dict.get(ctx);
        scopes.add(now.currentScope);
        recentFuncDec.add(now);
    }

    @Override
    public void exitFunction_def(MasterParser.Function_defContext ctx) {
        FuncDec now = (FuncDec)CST2AST.dict.get(ctx);
        now.body = new ArrayList<>();
        if (ctx.stmt_list().getChildCount() != 0)
        for (ParseTree child: ctx.stmt_list().children) {
            ASTnode ask = CST2AST.dict.get(child);
            if (ask != null)
                now.body.add((Stmt) ask);
        }
        scopes.pop();
        recentFuncDec.pop();
        IRRegister.reSetCounterToGlobal();
    }

    @Override
    public void exitStmt(MasterParser.StmtContext ctx) {
        ASTnode now = CST2AST.dict.get(ctx.getChild(0));
        CST2AST.dict.put(ctx, now);
    }

    @Override
    public void exitParenExpr(MasterParser.ParenExprContext ctx) {
        CST2AST.dict.put(ctx, CST2AST.dict.get(ctx.expr()));
    }

    @Override
    public void exitAddSubExpr(MasterParser.AddSubExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new InternalError("Something happened unfortunately!");
        if (lhs.type == ClassDec.intClass && rhs.type == ClassDec.intClass) {
            if (lhs instanceof IntExp && rhs instanceof IntExp)
                CST2AST.dict.put(ctx,
                        (ctx.op.getType() == MasterParser.ADD) ?
                                new IntExp(((IntExp) lhs).val + ((IntExp) rhs).val):
                                new IntExp(((IntExp) lhs).val - ((IntExp) rhs).val)
                );
            else {
                if (ctx.op.getType() == MasterParser.ADD)
                if (lhs instanceof IntExp) {
                    Exp tmp = lhs;
                    lhs = rhs;
                    rhs = tmp;
                }
                CST2AST.dict.put(ctx,
                        (ctx.op.getType() == MasterParser.ADD) ?
                                new AddExp(lhs, rhs, ClassDec.intClass) : new SubExp(lhs, rhs, ClassDec.intClass));
            }
            return;
        }
        if (lhs.type == ClassDec.stringClass && rhs.type == ClassDec.stringClass) {
            if (ctx.op.getType() == MasterParser.SUB)
                throw new CompilationError(currentPlace + "Strings can't be substracted!");
            if (lhs instanceof StringExp && rhs instanceof StringExp)
                CST2AST.dict.put(ctx,
                                new StringExp(((StringExp) lhs).val + ((StringExp) rhs).val)
                );
            else
                CST2AST.dict.put(ctx,
                        new AddExp(lhs, rhs, ClassDec.stringClass));
            return;
        }
        throw new CompilationError(currentPlace + "Operands must be integers or strings");
    }

    @Override
    public void exitMulDivModExpr(MasterParser.MulDivModExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new InternalError("Something happened unfortunately!");
        if (lhs.type == ClassDec.intClass && rhs.type == ClassDec.intClass) {

            if (lhs instanceof IntExp && rhs instanceof IntExp) {
                switch (ctx.op.getType()) {
                    case MasterParser.MUL:
                        CST2AST.dict.put(ctx, new IntExp(((IntExp) lhs).val * ((IntExp) rhs).val));
                        break;
                    case MasterParser.DIV:
                        CST2AST.dict.put(ctx, new IntExp(((IntExp) lhs).val / ((IntExp) rhs).val));
                        break;
                    case MasterParser.MOD:
                        CST2AST.dict.put(ctx, new IntExp(((IntExp) lhs).val % ((IntExp) rhs).val));
                        break;
                    default:
                        throw new InternalError("Something happened unfortunately!");
                }
            } else
                switch (ctx.op.getType()) {
                    case MasterParser.MUL:
                        if (lhs instanceof IntExp) {
                            Exp tmp = lhs;
                            lhs = rhs;
                            rhs = tmp;
                        }
                        CST2AST.dict.put(ctx, new MulExp(lhs, rhs, ClassDec.intClass));
                        break;
                    case MasterParser.DIV:
                        CST2AST.dict.put(ctx, new DivExp(lhs, rhs, ClassDec.intClass));
                        break;
                    case MasterParser.MOD:
                        CST2AST.dict.put(ctx, new ModExp(lhs, rhs, ClassDec.intClass));
                        break;
                    default:
                        throw new InternalError("Something happened unfortunately!");
                }
            return ;
        }
        throw new CompilationError(currentPlace + "Operands must be integers!");
    }

    @Override
    public void exitShiftExpr(MasterParser.ShiftExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new InternalError("Something happened unfortunately!");
        if (lhs.type == ClassDec.intClass && rhs.type == ClassDec.intClass) {
            if (lhs instanceof IntExp && rhs instanceof IntExp) {
                CST2AST.dict.put(ctx,
                        (ctx.op.getType() == MasterParser.LSHIFT) ?
                            new IntExp(((IntExp) lhs).val << ((IntExp) rhs).val) :
                            new IntExp(((IntExp) lhs).val >> ((IntExp) rhs).val));
            } else
                CST2AST.dict.put(ctx,
                        (ctx.op.getType() == MasterParser.LSHIFT) ?
                                new LshiftExp(lhs, rhs, ClassDec.intClass) : new RshiftExp(lhs, rhs, ClassDec.intClass));
            return;
        }
        throw new CompilationError(currentPlace + "Operands must be integers!");
    }

    @Override
    public void exitBitAndExpr(MasterParser.BitAndExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new InternalError("Something happened unfortunately!");
        if (lhs.type == ClassDec.intClass && rhs.type == ClassDec.intClass) {
            if (lhs instanceof IntExp && rhs instanceof IntExp) {
                CST2AST.dict.put(ctx,
                        new IntExp(((IntExp) lhs).val &
                                ((IntExp) rhs).val));
            } else {
                if (lhs instanceof IntExp) {
                    Exp tmp = lhs;
                    lhs = rhs;
                    rhs = tmp;
                }
                CST2AST.dict.put(ctx, new BitAndExp(lhs, rhs, ClassDec.intClass));
            }
            return;
        }
        throw new CompilationError(currentPlace + "Operands must be integers!");
    }

    @Override
    public void exitBitXorExpr(MasterParser.BitXorExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new InternalError("Something happened unfortunately!");
        if (lhs.type == ClassDec.intClass && rhs.type == ClassDec.intClass) {
            if (lhs instanceof IntExp && rhs instanceof IntExp) {
                CST2AST.dict.put(ctx,
                        new IntExp(((IntExp) lhs).val ^ ((IntExp) rhs).val));
            } else {
                if (lhs instanceof IntExp) {
                    Exp tmp = lhs;
                    lhs = rhs;
                    rhs = tmp;
                }
                CST2AST.dict.put(ctx, new BitXorExp(lhs, rhs, ClassDec.intClass));
            }
            return;
        }
        throw new CompilationError(currentPlace + "Operands must be integers!");
    }

    @Override
    public void exitBitOrExpr(MasterParser.BitOrExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new InternalError("Something happened unfortunately!");
        if (lhs.type == ClassDec.intClass && rhs.type == ClassDec.intClass) {
            if (lhs instanceof IntExp && rhs instanceof IntExp) {
                CST2AST.dict.put(ctx,
                        new IntExp(((IntExp) lhs).val | ((IntExp) rhs).val));
            } else {
                if (lhs instanceof IntExp) {
                    Exp tmp = lhs;
                    lhs = rhs;
                    rhs = tmp;
                }
                CST2AST.dict.put(ctx, new BitOrExp(lhs, rhs, ClassDec.intClass));
            }
            return;
        }
        throw new CompilationError(currentPlace + "Operands must be integers!");
    }

    @Override
    public void exitLogAndExpr(MasterParser.LogAndExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new InternalError("Something happened unfortunately!");
        if (lhs.type == ClassDec.boolClass && rhs.type == ClassDec.boolClass) {
            if (lhs instanceof BoolExp && rhs instanceof BoolExp) {
                CST2AST.dict.put(ctx,
                        new BoolExp(((BoolExp) lhs).val && ((BoolExp) rhs).val));
            } else {
                if (lhs instanceof IntExp) {
                    Exp tmp = lhs;
                    lhs = rhs;
                    rhs = tmp;
                }
                CST2AST.dict.put(ctx, new LogAndExp(lhs, rhs, ClassDec.boolClass));
            }
            return;
        }
        throw new CompilationError(currentPlace + "Operands must be booleans!");
    }

    @Override
    public void exitLogOrExpr(MasterParser.LogOrExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new InternalError("Something happened unfortunately!");
        if (lhs.type == ClassDec.boolClass && rhs.type == ClassDec.boolClass) {
            if (lhs instanceof BoolExp && rhs instanceof BoolExp) {
                CST2AST.dict.put(ctx,
                        new BoolExp(((BoolExp) lhs).val || ((BoolExp) rhs).val));
            } else {
                if (lhs instanceof IntExp) {
                    Exp tmp = lhs;
                    lhs = rhs;
                    rhs = tmp;
                }
                CST2AST.dict.put(ctx, new LogOrExp(lhs, rhs, ClassDec.boolClass));
            }
            return;
        }
        throw new CompilationError(currentPlace + "Operands must be booleans!");
    }

    @Override
    public void exitCompExpr(MasterParser.CompExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new InternalError("Something happened unfortunately!");
        if ((lhs.type == ClassDec.intClass && rhs.type == ClassDec.intClass)
            || (lhs.type == ClassDec.stringClass && rhs.type == ClassDec.stringClass)) {
            if ((lhs instanceof IntExp && rhs instanceof IntExp)
                    || (lhs instanceof StringExp && rhs instanceof StringExp)) {
                if (lhs instanceof IntExp) {
                    switch (ctx.op.getType()) {
                        case MasterParser.GREATER:
                            CST2AST.dict.put(ctx,
                                    new BoolExp(((IntExp) lhs).val > ((IntExp) rhs).val));
                            break;
                        case MasterParser.GREATER_EQ:
                            CST2AST.dict.put(ctx,
                                    new BoolExp(((IntExp) lhs).val >= ((IntExp) rhs).val));
                            break;
                        case MasterParser.LESS:
                            CST2AST.dict.put(ctx,
                                    new BoolExp(((IntExp) lhs).val < ((IntExp) rhs).val));
                            break;
                        case MasterParser.LESS_EQ:
                            CST2AST.dict.put(ctx,
                                    new BoolExp(((IntExp) lhs).val <= ((IntExp) rhs).val));
                            break;
                        default:
                            throw new CompilationError(currentPlace + "Incorrect use of compare symbols!");
                    }
                } else {
                    switch (ctx.op.getType()) {
                        case MasterParser.GREATER:
                            CST2AST.dict.put(ctx,
                                    new BoolExp(((StringExp) lhs).val.compareTo(((StringExp) rhs).val) > 0));
                            break;
                        case MasterParser.GREATER_EQ:
                            CST2AST.dict.put(ctx,
                                    new BoolExp(((StringExp) lhs).val.compareTo(((StringExp) rhs).val) >= 0));
                            break;
                        case MasterParser.LESS:
                            CST2AST.dict.put(ctx,
                                    new BoolExp(((StringExp) lhs).val.compareTo(((StringExp) rhs).val) < 0));
                            break;
                        case MasterParser.LESS_EQ:
                            CST2AST.dict.put(ctx,
                                    new BoolExp(((StringExp) lhs).val.compareTo(((StringExp) rhs).val) <= 0));
                            break;
                        default:
                            throw new CompilationError(currentPlace + "Incorrect use of compare symbols!");
                    }
                }
            } else
            switch (ctx.op.getType()) {
                case MasterParser.GREATER:
                    CST2AST.dict.put(ctx, new GreaterExp(lhs, rhs, ClassDec.boolClass));
                    break;
                case MasterParser.GREATER_EQ:
                    CST2AST.dict.put(ctx, new GreaterOrEqualExp(lhs, rhs, ClassDec.boolClass));
                    break;
                case MasterParser.LESS:
                    CST2AST.dict.put(ctx, new LessExp(lhs, rhs, ClassDec.boolClass));
                    break;
                case MasterParser.LESS_EQ:
                    CST2AST.dict.put(ctx, new LessOrEqualThanExp(lhs, rhs, ClassDec.boolClass));
                    break;
                default:
                    throw new CompilationError(currentPlace + "Incorrect use of compare symbols!");
            }
            return;
        }
        throw new CompilationError(currentPlace + "Operands must be integers or strings");
    }

    @Override
    public void exitEqNeqExpr(MasterParser.EqNeqExprContext ctx) {
        if (!(CST2AST.dict.get(ctx.expr(0)) instanceof Exp)
                || !(CST2AST.dict.get(ctx.expr(1)) instanceof Exp))
            throw new CompilationError(currentPlace + "Only expressions can be compared!");
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (lhs == null || rhs == null)
            throw new InternalError("Something happened unfortunately!");
        if (MatchType.match(lhs.type, rhs.type) || MatchType.match(rhs.type, lhs.type)) {
            if ((lhs instanceof IntExp && rhs instanceof IntExp)
                    || (lhs instanceof BoolExp && rhs instanceof BoolExp)
                    || (lhs instanceof StringExp && rhs instanceof StringExp)) {
                if (lhs instanceof IntExp) {
                    CST2AST.dict.put(ctx,
                            (ctx.op.getType() == MasterParser.EQ) ?
                                    new BoolExp(((IntExp) lhs).val == ((IntExp) rhs).val):
                                    new BoolExp(((IntExp) lhs).val != ((IntExp) rhs).val)
                    );
                }

                if (lhs instanceof BoolExp) {
                    CST2AST.dict.put(ctx,
                            (ctx.op.getType() == MasterParser.EQ) ?
                                    new BoolExp(((BoolExp) lhs).val == ((BoolExp) rhs).val):
                                    new BoolExp(((BoolExp) lhs).val != ((BoolExp) rhs).val)
                    );
                }

                if (lhs instanceof StringExp) {
                    CST2AST.dict.put(ctx,
                            (ctx.op.getType() == MasterParser.EQ) ?
                                    new BoolExp(((StringExp) lhs).val == ((StringExp) rhs).val):
                                    new BoolExp(((StringExp) lhs).val != ((StringExp) rhs).val)
                    );
                }

            } else
            switch (ctx.op.getType()) {
                case MasterParser.EQ:
                    CST2AST.dict.put(ctx, new EqExp(lhs, rhs, ClassDec.boolClass));
                    break;
                case MasterParser.NEQ:
                    CST2AST.dict.put(ctx, new NeqExp(lhs, rhs, ClassDec.boolClass));
                    break;
                default:
                    throw new CompilationError(currentPlace + "Incorrect use of eq/neq symbols!");
            }
            return ;
        }
        throw new CompilationError(currentPlace + "Not the same type!");
    }

    @Override
    public void exitConstExpr(MasterParser.ConstExprContext ctx) {
        CST2AST.dict.put(ctx, CST2AST.dict.get(ctx.constant()));
    }

    @Override
    public void exitPreUnaryExpr(MasterParser.PreUnaryExprContext ctx) {
        Exp obj = (Exp) CST2AST.dict.get(ctx.expr());
        if (obj == null)
            throw new InternalError("Something happened unfortunately!");
        if (obj.type == ClassDec.intClass) {
            switch (ctx.op.getType()) {
                case MasterParser.INC:
                    if (!(obj.isLvalue))
                        throw new CompilationError("It has to be an lvalue!");
                    CST2AST.dict.put(ctx, new PreIncExp(obj));
                    break;
                case MasterParser.DEC:
                    if (!(obj.isLvalue))
                        throw new CompilationError("It has to be an lvalue!");
                    CST2AST.dict.put(ctx, new PreDecExp(obj));
                    break;
                case MasterParser.ADD:
                    CST2AST.dict.put(ctx, obj);
                    break;
                case MasterParser.SUB:
                    if (obj instanceof IntExp) {
                        CST2AST.dict.put(ctx, new IntExp(-((IntExp) obj).val));
                    } else
                        CST2AST.dict.put(ctx, new MinusExp(obj));
                    break;
                case MasterParser.BIT_NOT:
                    if (obj instanceof IntExp) {
                        CST2AST.dict.put(ctx, new IntExp(~((IntExp) obj).val));
                    } else
                        CST2AST.dict.put(ctx, new BitNotExp(obj));
                    break;
                default:
                    throw new CompilationError(currentPlace + "Incorrect use of prefix operators!");
            }
            return ;
        }
        if (obj.type == ClassDec.boolClass) {
            if (ctx.op.getType() == MasterParser.LOG_NOT) {
                if (obj instanceof BoolExp) {
                    CST2AST.dict.put(ctx, new BoolExp(!((BoolExp) obj).val));
                } else CST2AST.dict.put(ctx, new LogNotExp(obj));
            } else
                throw new CompilationError(currentPlace + "Incorrect use of prefix operators!");
            return ;
        }
        throw new CompilationError(currentPlace + "Operands must be integers or booleans");
    }

    @Override
    public void exitPosUnaryExpr(MasterParser.PosUnaryExprContext ctx) {
        Exp obj = (Exp) CST2AST.dict.get(ctx.expr());
        if (obj == null)
            throw new InternalError("Something happened unfortunately!");
        if (!(obj.isLvalue))
            throw new CompilationError("It has to be an lvalue!");
        if (obj.type == ClassDec.intClass) {
            switch (ctx.op.getType()) {
                case MasterParser.INC:
                    CST2AST.dict.put(ctx, new PosIncExp(obj));
                    break;
                case MasterParser.DEC:
                    CST2AST.dict.put(ctx, new PosDecExp(obj));
                    break;
                default:
                    throw new InternalError("Something happened unfortunately!");
            }
            return ;
        }
        throw new CompilationError(currentPlace + "Operands must be integers");
    }

    @Override
    public void enterIdentifierExpr(MasterParser.IdentifierExprContext ctx) {
        Scope currentScope = scopes.peek();
        String idName = ctx.ID().getText().intern();
        Dec ask = (Dec) currentScope.lookUp(idName);
        if (ask == null)
            throw new CompilationError(currentPlace +"Variable not found!");
        if (ask instanceof VarDec) {
            CST2AST.dict.put(ctx, new SimpleVarExp((VarDec) ask));
            return ;
        }
        if (ask instanceof FuncDec) {
            CST2AST.dict.put(ctx, ((FuncDec) ask));
            return ;
        }
        throw new CompilationError(currentPlace + "Variable was wrong!");
    }

    @Override
    public void exitFuncExpr(MasterParser.FuncExprContext ctx) {
        Scope currentScope = scopes.peek();
        ASTnode func = currentScope.lookUp(ctx.ID().getText().intern());
        if (!(func instanceof FuncDec))
            throw new CompilationError(currentPlace + "Invalid function call!");
        List<Exp> para = new ArrayList<>();
        if (ctx.param_list() == null) {
            if (((FuncDec)func).para.size() > 0)
                throw new CompilationError(currentPlace + "Arguments' number doesn't match!");
        } else {
            if (ctx.param_list().expr().size() != ((FuncDec) func).para.size())
                throw new CompilationError(currentPlace + "Arguments' number doesn't match!");
            for (int i = 0; i < ctx.param_list().expr().size(); i++) {
                Exp thisPara = (Exp) CST2AST.dict.get(ctx.param_list().expr(i));
                if (MatchType.match(((FuncDec) func).para.get(i).cd, thisPara.type))
                    para.add(thisPara);
                else
                    throw new CompilationError(currentPlace + "Arguments' type doesn't match!");
            }
        }
        FuncExp now = new FuncExp((FuncDec)func, para);
        CST2AST.dict.put(ctx, now);
    }

    @Override
    public void exitSubsExpr(MasterParser.SubsExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        if (!(lhs.isLvalue))
            throw new CompilationError(currentPlace + "It has to be a lvalue!");
        if (!(lhs.type instanceof ArrayDec))
            throw new CompilationError(currentPlace + "It has to be an array!");
        if (ctx.expr().size() > ((ArrayDec)lhs.type).dim + 1)
            throw new CompilationError(currentPlace + "Too many subscripts!");
        List<Exp> subs = new ArrayList<>();
        for (int i = 1; i < ctx.expr().size(); i++) {
            Exp offset = (Exp) CST2AST.dict.get(ctx.expr(i));
            if (!(offset.type == ClassDec.intClass))
                throw new CompilationError(currentPlace + "Offset must be integers!");
            subs.add(offset);
        }
        int thisDim = 1 + ((ArrayDec)lhs.type).dim - ctx.expr().size();
        ClassDec type;
        if (thisDim == 0) {
            type = ((ArrayDec) lhs.type).baseType;
        } else {
            type = new ArrayDec(((ArrayDec) lhs.type).baseType, thisDim);
        }

        SubscriptVarExp now = new SubscriptVarExp(lhs, subs, type);
        CST2AST.dict.put(ctx, now);
    }

    @Override
    public void exitFieldExpr(MasterParser.FieldExprContext ctx) {
        if (!(CST2AST.dict.get(ctx.expr()) instanceof Exp))
            throw new CompilationError(currentPlace + "It's has to be an expression!");
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr());

        if (lhs.type.currentScope == null) {
            throw new CompilationError(currentPlace);
        }

        Dec next = lhs.type.currentScope.lookUpInThisScope(ctx.ID().getText().intern());
        if (next == null)
            throw new CompilationError(currentPlace + "Can't find that field!");
        if (next instanceof ClassDec)
            throw new CompilationError(currentPlace + "Classname can't be returned!");
        if (next instanceof FuncDec) {
            List<Exp> para = new ArrayList<>();
            para.add(lhs);
            int l = 0;
            if (ctx.param_list() != null)
                l = ctx.param_list().expr().size();

            if (l + 1 != ((FuncDec)next).para.size())
                throw new CompilationError(currentPlace + ((FuncDec) next).name + "Arguments' num doesn't match!");

            for (int i = 0; i < l; i++) {
                Exp thisPara = (Exp) CST2AST.dict.get(ctx.param_list().expr(i));
                if (MatchType.match(((FuncDec)next).para.get(i + 1).cd, thisPara.type))
                    para.add(thisPara);
                else
                    throw new CompilationError(currentPlace + "Arguments' type doesn't match!");
            }

            FuncExp now = new FuncExp((FuncDec)next, para);
            CST2AST.dict.put(ctx, now);
            return ;
        }

        if (next instanceof VarDec) {
            if (ctx.LPAREN() != null)
                throw new CompilationError(currentPlace + "Too many arguments!");
            ClassFieldExp now = new ClassFieldExp(lhs, ctx.ID().getText().intern(), ((VarDec)next).cd);
            CST2AST.dict.put(ctx, now);
        }
    }

    @Override
    public void exitAssignExpr(MasterParser.AssignExprContext ctx) {
        Exp lhs = (Exp) CST2AST.dict.get(ctx.expr(0));
        Exp rhs = (Exp) CST2AST.dict.get(ctx.expr(1));
        if (!(lhs.isLvalue))
            throw new CompilationError(currentPlace + "Only lvalue can be assigned!");
        if (!MatchType.match(lhs.type, rhs.type)) {
            throw new CompilationError(currentPlace + "Assignment must be implemented on the same type!");
        }
        CST2AST.dict.put(ctx, new AssignExp(lhs, rhs, lhs.type));
    }

    @Override
    public void exitNewExpr(MasterParser.NewExprContext ctx) {
        ClassDec type = (ClassDec) CST2AST.dict.get(ctx.type_specifier());
        int dim = 0;
        List <Exp> sizeInEachDim = new ArrayList<>();
        if (ctx.dim_expr() != null) {
            dim = ctx.dim_expr().LBRACKET().size();
            for (ParseTree child : ctx.dim_expr().expr()) {
                Exp thisDimSize = (Exp) CST2AST.dict.get(child);
                if (!(thisDimSize.type == ClassDec.intClass))
                    throw new CompilationError(currentPlace + "Dim must be integers!");
                sizeInEachDim.add(thisDimSize);
            }
        }
        if (dim != 0)
            CST2AST.dict.put(ctx, new newExp(sizeInEachDim, new ArrayDec(type, dim)));
        else
            CST2AST.dict.put(ctx, new newExp(sizeInEachDim, type));
    }

    @Override
    public void enterBlock(MasterParser.BlockContext ctx) {
        scopes.add(new Scope(scopes.peek()));
    }

    @Override
    public void exitBlock(MasterParser.BlockContext ctx) {
        ArrayList<Stmt> stmts = new ArrayList<>();
        if (ctx.stmt_list().getChildCount() > 0)
        for (ParseTree children: ctx.stmt_list().children) {
            Stmt now = (Stmt) CST2AST.dict.get(children);
            if (now != null)
                stmts.add(now);
        }
        CompoundStmt now = new CompoundStmt(stmts);
        now.currentScope = scopes.peek();
        CST2AST.dict.put(ctx, now);
        scopes.pop();
    }

    @Override
    public void exitExpr_stmt(MasterParser.Expr_stmtContext ctx) {
        Exp expr = (Exp) CST2AST.dict.get(ctx.expr());
        if (expr == null)
            throw new InternalError("Something happened unfortunately!");
        CST2AST.dict.put(ctx, new ExprStmt(expr));
    }

    @Override
    public void enterSelection_stmt(MasterParser.Selection_stmtContext ctx) {
        IfStmt now = new IfStmt(null, null, null);
        CST2AST.dict.put(ctx, now);
        scopes.add(now.currentScope = new Scope(scopes.peek()));
    }

    @Override
    public void exitSelection_stmt(MasterParser.Selection_stmtContext ctx) {
        Exp expr = (Exp) CST2AST.dict.get(ctx.expr());
        if (expr == null)
            throw new InternalError("Something happened unfortunately!");
        if (expr.type != ClassDec.boolClass)
            throw new CompilationError(currentPlace + "Conditions must be booleans!");
        Stmt stmt1 = (Stmt) CST2AST.dict.get(ctx.stmt(0));
        IfStmt now = (IfStmt) CST2AST.dict.get(ctx);
        if (ctx.stmt().size() > 1) {
            Stmt stmt2 = (Stmt) CST2AST.dict.get(ctx.stmt(1));
            now.condition = expr;
            now.stmt1 = stmt1;
            now.stmt2 = stmt2;
        } else {
            now.condition = expr;
            now.stmt1 = stmt1;
        }
        scopes.pop();
    }

    @Override
    public void enterForIteration(MasterParser.ForIterationContext ctx) {
        ForStmt now = new ForStmt(null, null, null, null);
        CST2AST.dict.put(ctx, now);
        scopes.add(now.currentScope = new Scope(scopes.peek()));
        recentIteration.add(now);
    }

    @Override
    public void exitForIteration(MasterParser.ForIterationContext ctx) {
        Exp exp1 = (Exp) CST2AST.dict.get(ctx.expr1);
        Exp exp2 = (Exp) CST2AST.dict.get(ctx.expr2);
        Exp exp3 = (Exp) CST2AST.dict.get(ctx.expr3);
        Stmt stmt = (Stmt) CST2AST.dict.get(ctx.stmt());
        if (exp2 != null)
            if (exp2.type != ClassDec.boolClass)
                throw new CompilationError(currentPlace + "Conditions must be booleans!");
        ForStmt now = (ForStmt) CST2AST.dict.get(ctx);
        now.exp1 = exp1;
        now.exp2 = exp2;
        now.exp3 = exp3;
        now.stmt = stmt;
        scopes.pop();
        recentIteration.pop();
    }

    @Override
    public void enterWhileIteration(MasterParser.WhileIterationContext ctx) {
        WhileStmt now = new WhileStmt(null, null);
        CST2AST.dict.put(ctx, now);
        scopes.add(now.currentScope = new Scope(scopes.peek()));
        recentIteration.add(now);
    }

    @Override
    public void exitWhileIteration(MasterParser.WhileIterationContext ctx) {
        Exp exp = (Exp) CST2AST.dict.get(ctx.expr());
        Stmt stmt = (Stmt) CST2AST.dict.get(ctx.stmt());
        if (exp == null)
            throw new CompilationError(currentPlace + "Conditions must be booleans!");
        if (exp.type != ClassDec.boolClass)
            throw new CompilationError(currentPlace + "Conditions must be booleans!");
        WhileStmt now = (WhileStmt) CST2AST.dict.get(ctx);
        now.cond = exp;
        now.stmt = stmt;
        scopes.pop();
        recentIteration.pop();
    }

    @Override
    public void exitReturnJump(MasterParser.ReturnJumpContext ctx) {
        Exp ret = null;
        if (ctx.expr() != null)
            ret = (Exp) CST2AST.dict.get(ctx.expr());
        if (recentFuncDec.empty())
            throw new CompilationError(currentPlace + "You shouldn't return here!");
        Dec recentDec = recentFuncDec.peek();
        if (recentDec instanceof FuncDec) {
            if (ret != null) {
                if (MatchType.match(((FuncDec) recentDec).retType, ret.type)) {
                    CST2AST.dict.put(ctx, new ReturnStmt(ret));
                    return;
                }
            }   else    {
                if (MatchType.match(((FuncDec) recentDec).retType, ClassDec.nullClass)) {
                    CST2AST.dict.put(ctx, new ReturnStmt());
                    return;
                }
            }
        }
        throw new CompilationError(currentPlace + "You return wrong type!");
    }

    @Override
    public void exitBreakJump(MasterParser.BreakJumpContext ctx) {
        if (recentIteration.empty())
            throw new CompilationError(currentPlace + "Abnormal Jump!");
        CST2AST.dict.put(ctx, new BreakStmt(recentIteration.peek()));
    }

    @Override
    public void exitContinueJump(MasterParser.ContinueJumpContext ctx) {
        if (recentIteration.empty())
            throw new CompilationError(currentPlace + "Abnormal Jump!");
        CST2AST.dict.put(ctx, new ContinueStmt(recentIteration.peek()));
    }

    @Override
    public void exitBoolConst(MasterParser.BoolConstContext ctx) {
        CST2AST.dict.put(ctx, new BoolExp(ctx.PREDICATE().getText().equals("true")));
    }

    @Override
    public void exitIntConst(MasterParser.IntConstContext ctx) {
        CST2AST.dict.put(ctx, new IntExp(Integer.valueOf(ctx.INT_LITERAL().getText())));
    }

    @Override
    public void exitNullConst(MasterParser.NullConstContext ctx) {
        CST2AST.dict.put(ctx, new NullExp());
    }

    @Override
    public void exitStringConst(MasterParser.StringConstContext ctx) {
        CST2AST.dict.put(ctx, new StringExp(ctx.String_Literal().getText().substring(1,
                ctx.String_Literal().getText().length() - 1)));
    }

    @Override
    public void exitVariable_decl(MasterParser.Variable_declContext ctx) {
        Scope currentScope = scopes.peek();
        String varName = ctx.ID().getText().intern();
        ClassDec type = (ClassDec) CST2AST.dict.get(ctx.type_specifier());
        if (type == ClassDec.nullClass)
            throw new CompilationError("Define a null is not welcomed!");
        Dec ask = currentScope.lookUpInThisScope(varName);
        IRRegister reg = new IRRegister();
        if (currentScope == ConstructAST.globalScope)
            reg.addr = new Address(new GlobalVarLabel(varName));
        if (ask == null) {
            VarDec now;
            if (ctx.expr() == null)
                now = new VarDec(type, varName, reg);
            else {
                if (MatchType.match(type, ((Exp) CST2AST.dict.get(ctx.expr())).type))
                    now = new VarDec(type, varName, (Exp) CST2AST.dict.get(ctx.expr()), reg);
                else
                    throw new CompilationError("Initial type must match!");
            }
            currentScope.addEntry(varName, now);
            CST2AST.dict.put(ctx, now);
            if (!currentClass.empty())
                currentClass.peek().addDecl(now);
            return ;
        }
        throw new CompilationError(currentPlace + "Variable name already used!");
    }
}