// Generated from C:/Users/Ò¶×ÓºÀ/IdeaProjects/MasterCompiler/src/Master/Parser\Master.g4 by ANTLR 4.5.1
package Master.Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MasterParser}.
 */
public interface MasterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MasterParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MasterParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MasterParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(MasterParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(MasterParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(MasterParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(MasterParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#method_def}.
	 * @param ctx the parse tree
	 */
	void enterMethod_def(MasterParser.Method_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#method_def}.
	 * @param ctx the parse tree
	 */
	void exitMethod_def(MasterParser.Method_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(MasterParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(MasterParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(MasterParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(MasterParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#parameter_decl}.
	 * @param ctx the parse tree
	 */
	void enterParameter_decl(MasterParser.Parameter_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#parameter_decl}.
	 * @param ctx the parse tree
	 */
	void exitParameter_decl(MasterParser.Parameter_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(MasterParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(MasterParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(MasterParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(MasterParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(MasterParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(MasterParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logAndExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogAndExpr(MasterParser.LogAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logAndExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogAndExpr(MasterParser.LogAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logOrExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogOrExpr(MasterParser.LogOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logOrExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogOrExpr(MasterParser.LogOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivModExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivModExpr(MasterParser.MulDivModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivModExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivModExpr(MasterParser.MulDivModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFieldExpr(MasterParser.FieldExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFieldExpr(MasterParser.FieldExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(MasterParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(MasterParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitXorExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBitXorExpr(MasterParser.BitXorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitXorExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBitXorExpr(MasterParser.BitXorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpr(MasterParser.ShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpr(MasterParser.ShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitOrExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBitOrExpr(MasterParser.BitOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitOrExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBitOrExpr(MasterParser.BitOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preUnaryExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPreUnaryExpr(MasterParser.PreUnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preUnaryExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPreUnaryExpr(MasterParser.PreUnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(MasterParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(MasterParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subsExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubsExpr(MasterParser.SubsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subsExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubsExpr(MasterParser.SubsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code posUnaryExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPosUnaryExpr(MasterParser.PosUnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code posUnaryExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPosUnaryExpr(MasterParser.PosUnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitAndExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBitAndExpr(MasterParser.BitAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitAndExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBitAndExpr(MasterParser.BitAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(MasterParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(MasterParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqNeqExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqNeqExpr(MasterParser.EqNeqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqNeqExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqNeqExpr(MasterParser.EqNeqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstExpr(MasterParser.ConstExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstExpr(MasterParser.ConstExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(MasterParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(MasterParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#dim_expr}.
	 * @param ctx the parse tree
	 */
	void enterDim_expr(MasterParser.Dim_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#dim_expr}.
	 * @param ctx the parse tree
	 */
	void exitDim_expr(MasterParser.Dim_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#variable_decl}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl(MasterParser.Variable_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#variable_decl}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl(MasterParser.Variable_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link MasterParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(MasterParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link MasterParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(MasterParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerType}
	 * labeled alternative in {@link MasterParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(MasterParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerType}
	 * labeled alternative in {@link MasterParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(MasterParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link MasterParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStringType(MasterParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link MasterParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStringType(MasterParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link MasterParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(MasterParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link MasterParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(MasterParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classType}
	 * labeled alternative in {@link MasterParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterClassType(MasterParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classType}
	 * labeled alternative in {@link MasterParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitClassType(MasterParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(MasterParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(MasterParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MasterParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MasterParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#method_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMethod_stmt(MasterParser.Method_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#method_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMethod_stmt(MasterParser.Method_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#field_method_stmt}.
	 * @param ctx the parse tree
	 */
	void enterField_method_stmt(MasterParser.Field_method_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#field_method_stmt}.
	 * @param ctx the parse tree
	 */
	void exitField_method_stmt(MasterParser.Field_method_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MasterParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MasterParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(MasterParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(MasterParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#selection_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelection_stmt(MasterParser.Selection_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#selection_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelection_stmt(MasterParser.Selection_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileIteration}
	 * labeled alternative in {@link MasterParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileIteration(MasterParser.WhileIterationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileIteration}
	 * labeled alternative in {@link MasterParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileIteration(MasterParser.WhileIterationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forIteration}
	 * labeled alternative in {@link MasterParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void enterForIteration(MasterParser.ForIterationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forIteration}
	 * labeled alternative in {@link MasterParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void exitForIteration(MasterParser.ForIterationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnJump}
	 * labeled alternative in {@link MasterParser#jump_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnJump(MasterParser.ReturnJumpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnJump}
	 * labeled alternative in {@link MasterParser#jump_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnJump(MasterParser.ReturnJumpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakJump}
	 * labeled alternative in {@link MasterParser#jump_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakJump(MasterParser.BreakJumpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakJump}
	 * labeled alternative in {@link MasterParser#jump_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakJump(MasterParser.BreakJumpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueJump}
	 * labeled alternative in {@link MasterParser#jump_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueJump(MasterParser.ContinueJumpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueJump}
	 * labeled alternative in {@link MasterParser#jump_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueJump(MasterParser.ContinueJumpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullConst}
	 * labeled alternative in {@link MasterParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullConst(MasterParser.NullConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullConst}
	 * labeled alternative in {@link MasterParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullConst(MasterParser.NullConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intConst}
	 * labeled alternative in {@link MasterParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntConst(MasterParser.IntConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intConst}
	 * labeled alternative in {@link MasterParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntConst(MasterParser.IntConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolConst}
	 * labeled alternative in {@link MasterParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBoolConst(MasterParser.BoolConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolConst}
	 * labeled alternative in {@link MasterParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBoolConst(MasterParser.BoolConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringConst}
	 * labeled alternative in {@link MasterParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringConst(MasterParser.StringConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConst}
	 * labeled alternative in {@link MasterParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringConst(MasterParser.StringConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(MasterParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(MasterParser.Param_listContext ctx);
}