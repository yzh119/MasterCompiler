// Generated from C:/Users/Ò¶×ÓºÀ/IdeaProjects/MasterCompiler/src/master/Parser\Master.g4 by ANTLR 4.5.1
package master.Parser;
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
	 * Enter a parse tree produced by {@link MasterParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(MasterParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(MasterParser.ComponentContext ctx);
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
	 * Enter a parse tree produced by {@link MasterParser#variable_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl_list(MasterParser.Variable_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#variable_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl_list(MasterParser.Variable_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#function_head}.
	 * @param ctx the parse tree
	 */
	void enterFunction_head(MasterParser.Function_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#function_head}.
	 * @param ctx the parse tree
	 */
	void exitFunction_head(MasterParser.Function_headContext ctx);
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
	 * Enter a parse tree produced by {@link MasterParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(MasterParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(MasterParser.Type_specifierContext ctx);
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
	 * Enter a parse tree produced by {@link MasterParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIteration_stmt(MasterParser.Iteration_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIteration_stmt(MasterParser.Iteration_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#jump_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJump_stmt(MasterParser.Jump_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#jump_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJump_stmt(MasterParser.Jump_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MasterParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MasterParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(MasterParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(MasterParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MasterParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(MasterParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MasterParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(MasterParser.ConstantContext ctx);
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