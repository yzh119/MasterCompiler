// Generated from C:/Users/Ò¶×ÓºÀ/IdeaProjects/MasterCompiler/src/Master/Parser\Master.g4 by ANTLR 4.5.1
package Master.Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MasterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, BREAK=3, RETURN=4, CONTINUE=5, WHILE=6, FOR=7, NEW=8, EXTENDS=9, 
		THIS=10, INTEGER=11, STRING=12, BOOLEAN=13, VOID=14, CLASS=15, PREDICATE=16, 
		ADD=17, SUB=18, MUL=19, DIV=20, MOD=21, INC=22, DEC=23, GREATER=24, GREATER_EQ=25, 
		LESS=26, LESS_EQ=27, EQ=28, NEQ=29, LOG_AND=30, LOG_OR=31, LOG_NOT=32, 
		LSHIFT=33, RSHIFT=34, BIT_NOT=35, BIT_AND=36, BIT_OR=37, BIT_XOR=38, ASSIGN=39, 
		NULL=40, COMMA=41, SEMICOLON=42, LBRACKET=43, RBRACKET=44, LBRACE=45, 
		RBRACE=46, LPAREN=47, RPAREN=48, DOT=49, INT_LITERAL=50, STRING_LITERAL=51, 
		ID=52, NEWLINE=53, LINE_COMMENT=54, WS=55;
	public static final int
		RULE_program = 0, RULE_class_body = 1, RULE_function_def = 2, RULE_method_def = 3, 
		RULE_class_def = 4, RULE_function_head = 5, RULE_method_head = 6, RULE_parameter_list = 7, 
		RULE_parameter_decl = 8, RULE_expr = 9, RULE_dim_expr = 10, RULE_variable_decl = 11, 
		RULE_type_specifier = 12, RULE_stmt_list = 13, RULE_stmt = 14, RULE_block = 15, 
		RULE_expr_stmt = 16, RULE_selection_stmt = 17, RULE_iteration_stmt = 18, 
		RULE_jump_stmt = 19, RULE_constant = 20, RULE_param_list = 21;
	public static final String[] ruleNames = {
		"program", "class_body", "function_def", "method_def", "class_def", "function_head", 
		"method_head", "parameter_list", "parameter_decl", "expr", "dim_expr", 
		"variable_decl", "type_specifier", "stmt_list", "stmt", "block", "expr_stmt", 
		"selection_stmt", "iteration_stmt", "jump_stmt", "constant", "param_list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'break'", "'return'", "'continue'", "'while'", 
		"'for'", "'new'", "'extends'", "'this'", "'int'", "'string'", "'bool'", 
		"'void'", "'class'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", 
		"'--'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'&&'", "'||'", 
		"'!'", "'<<'", "'>>'", "'~'", "'&'", "'|'", "'^'", "'='", "'null'", "','", 
		"';'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "ELSE", "BREAK", "RETURN", "CONTINUE", "WHILE", "FOR", "NEW", 
		"EXTENDS", "THIS", "INTEGER", "STRING", "BOOLEAN", "VOID", "CLASS", "PREDICATE", 
		"ADD", "SUB", "MUL", "DIV", "MOD", "INC", "DEC", "GREATER", "GREATER_EQ", 
		"LESS", "LESS_EQ", "EQ", "NEQ", "LOG_AND", "LOG_OR", "LOG_NOT", "LSHIFT", 
		"RSHIFT", "BIT_NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "ASSIGN", "NULL", 
		"COMMA", "SEMICOLON", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "LPAREN", 
		"RPAREN", "DOT", "INT_LITERAL", "STRING_LITERAL", "ID", "NEWLINE", "LINE_COMMENT", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Master.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MasterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Class_defContext decl;
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public List<Method_defContext> method_def() {
			return getRuleContexts(Method_defContext.class);
		}
		public Method_defContext method_def(int i) {
			return getRuleContext(Method_defContext.class,i);
		}
		public List<Variable_declContext> variable_decl() {
			return getRuleContexts(Variable_declContext.class);
		}
		public Variable_declContext variable_decl(int i) {
			return getRuleContext(Variable_declContext.class,i);
		}
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << BOOLEAN) | (1L << VOID) | (1L << CLASS) | (1L << ID))) != 0)) {
				{
				setState(48);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(44);
					((ProgramContext)_localctx).decl = class_def();
					}
					break;
				case 2:
					{
					setState(45);
					function_def();
					}
					break;
				case 3:
					{
					setState(46);
					method_def();
					}
					break;
				case 4:
					{
					setState(47);
					variable_decl();
					}
					break;
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public Class_defContext decl;
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public List<Method_defContext> method_def() {
			return getRuleContexts(Method_defContext.class);
		}
		public Method_defContext method_def(int i) {
			return getRuleContext(Method_defContext.class,i);
		}
		public List<Variable_declContext> variable_decl() {
			return getRuleContexts(Variable_declContext.class);
		}
		public Variable_declContext variable_decl(int i) {
			return getRuleContext(Variable_declContext.class,i);
		}
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitClass_body(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << BOOLEAN) | (1L << VOID) | (1L << CLASS) | (1L << ID))) != 0)) {
				{
				setState(57);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(53);
					((Class_bodyContext)_localctx).decl = class_def();
					}
					break;
				case 2:
					{
					setState(54);
					function_def();
					}
					break;
				case 3:
					{
					setState(55);
					method_def();
					}
					break;
				case 4:
					{
					setState(56);
					variable_decl();
					}
					break;
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_defContext extends ParserRuleContext {
		public Function_headContext function_head() {
			return getRuleContext(Function_headContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(MasterParser.LBRACE, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MasterParser.RBRACE, 0); }
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitFunction_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			function_head();
			setState(63);
			match(LBRACE);
			setState(64);
			stmt_list();
			setState(65);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_defContext extends ParserRuleContext {
		public Method_headContext method_head() {
			return getRuleContext(Method_headContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(MasterParser.LBRACE, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MasterParser.RBRACE, 0); }
		public Method_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterMethod_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitMethod_def(this);
		}
	}

	public final Method_defContext method_def() throws RecognitionException {
		Method_defContext _localctx = new Method_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			method_head();
			setState(68);
			match(LBRACE);
			setState(69);
			stmt_list();
			setState(70);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MasterParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(MasterParser.LBRACE, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MasterParser.RBRACE, 0); }
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitClass_def(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_class_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(CLASS);
			setState(73);
			match(ID);
			setState(74);
			match(LBRACE);
			setState(75);
			class_body();
			setState(76);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_headContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Function_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterFunction_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitFunction_head(this);
		}
	}

	public final Function_headContext function_head() throws RecognitionException {
		Function_headContext _localctx = new Function_headContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			type_specifier(0);
			setState(79);
			match(ID);
			setState(80);
			match(LPAREN);
			setState(82);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				setState(81);
				parameter_list();
				}
			}

			setState(84);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_headContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(MasterParser.VOID, 0); }
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Method_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterMethod_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitMethod_head(this);
		}
	}

	public final Method_headContext method_head() throws RecognitionException {
		Method_headContext _localctx = new Method_headContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_method_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(VOID);
			setState(87);
			match(ID);
			setState(88);
			match(LPAREN);
			setState(90);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				setState(89);
				parameter_list();
				}
			}

			setState(92);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public Parameter_declContext paramdecl_comma;
		public List<Parameter_declContext> parameter_decl() {
			return getRuleContexts(Parameter_declContext.class);
		}
		public Parameter_declContext parameter_decl(int i) {
			return getRuleContext(Parameter_declContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MasterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MasterParser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					((Parameter_listContext)_localctx).paramdecl_comma = parameter_decl();
					setState(95);
					match(COMMA);
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(102);
			parameter_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_declContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public Parameter_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterParameter_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitParameter_decl(this);
		}
	}

	public final Parameter_declContext parameter_decl() throws RecognitionException {
		Parameter_declContext _localctx = new Parameter_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			type_specifier(0);
			setState(105);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewExprContext extends ExprContext {
		public TerminalNode NEW() { return getToken(MasterParser.NEW, 0); }
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Dim_exprContext dim_expr() {
			return getRuleContext(Dim_exprContext.class,0);
		}
		public NewExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitNewExpr(this);
		}
	}
	public static class AddSubExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(MasterParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MasterParser.SUB, 0); }
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitAddSubExpr(this);
		}
	}
	public static class LogAndExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOG_AND() { return getToken(MasterParser.LOG_AND, 0); }
		public LogAndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterLogAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitLogAndExpr(this);
		}
	}
	public static class LogOrExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOG_OR() { return getToken(MasterParser.LOG_OR, 0); }
		public LogOrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterLogOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitLogOrExpr(this);
		}
	}
	public static class MulDivModExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MasterParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MasterParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MasterParser.MOD, 0); }
		public MulDivModExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterMulDivModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitMulDivModExpr(this);
		}
	}
	public static class FieldExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOT() { return getToken(MasterParser.DOT, 0); }
		public FieldExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterFieldExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitFieldExpr(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitParenExpr(this);
		}
	}
	public static class BitXorExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BIT_XOR() { return getToken(MasterParser.BIT_XOR, 0); }
		public BitXorExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterBitXorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitBitXorExpr(this);
		}
	}
	public static class ShiftExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LSHIFT() { return getToken(MasterParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(MasterParser.RSHIFT, 0); }
		public ShiftExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterShiftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitShiftExpr(this);
		}
	}
	public static class BitOrExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BIT_OR() { return getToken(MasterParser.BIT_OR, 0); }
		public BitOrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterBitOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitBitOrExpr(this);
		}
	}
	public static class PreUnaryExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INC() { return getToken(MasterParser.INC, 0); }
		public TerminalNode DEC() { return getToken(MasterParser.DEC, 0); }
		public TerminalNode ADD() { return getToken(MasterParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MasterParser.SUB, 0); }
		public TerminalNode BIT_NOT() { return getToken(MasterParser.BIT_NOT, 0); }
		public TerminalNode LOG_NOT() { return getToken(MasterParser.LOG_NOT, 0); }
		public PreUnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterPreUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitPreUnaryExpr(this);
		}
	}
	public static class ThisIdentifierExprContext extends ExprContext {
		public TerminalNode THIS() { return getToken(MasterParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(MasterParser.DOT, 0); }
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public ThisIdentifierExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterThisIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitThisIdentifierExpr(this);
		}
	}
	public static class CompExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(MasterParser.LESS, 0); }
		public TerminalNode LESS_EQ() { return getToken(MasterParser.LESS_EQ, 0); }
		public TerminalNode GREATER() { return getToken(MasterParser.GREATER, 0); }
		public TerminalNode GREATER_EQ() { return getToken(MasterParser.GREATER_EQ, 0); }
		public CompExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitCompExpr(this);
		}
	}
	public static class SubsExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(MasterParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(MasterParser.LBRACKET, i);
		}
		public SubsExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterSubsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitSubsExpr(this);
		}
	}
	public static class PosUnaryExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INC() { return getToken(MasterParser.INC, 0); }
		public TerminalNode DEC() { return getToken(MasterParser.DEC, 0); }
		public PosUnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterPosUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitPosUnaryExpr(this);
		}
	}
	public static class ParaFuncExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public ParaFuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterParaFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitParaFuncExpr(this);
		}
	}
	public static class BitAndExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BIT_AND() { return getToken(MasterParser.BIT_AND, 0); }
		public BitAndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterBitAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitBitAndExpr(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(MasterParser.ASSIGN, 0); }
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitAssignExpr(this);
		}
	}
	public static class EqNeqExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(MasterParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MasterParser.NEQ, 0); }
		public EqNeqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterEqNeqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitEqNeqExpr(this);
		}
	}
	public static class ConstExprContext extends ExprContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterConstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitConstExpr(this);
		}
	}
	public static class IdentifierExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public IdentifierExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitIdentifierExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case INC:
			case DEC:
			case LOG_NOT:
			case BIT_NOT:
				{
				_localctx = new PreUnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(108);
				((PreUnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT))) != 0)) ) {
					((PreUnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(109);
				expr(17);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(LPAREN);
				setState(111);
				expr(0);
				setState(112);
				match(RPAREN);
				}
				break;
			case NEW:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(NEW);
				setState(115);
				type_specifier(0);
				setState(117);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(116);
					dim_expr();
					}
					break;
				}
				}
				break;
			case PREDICATE:
			case NULL:
			case INT_LITERAL:
			case STRING_LITERAL:
				{
				_localctx = new ConstExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				constant();
				}
				break;
			case ID:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(ID);
				}
				break;
			case THIS:
				{
				_localctx = new ThisIdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(THIS);
				setState(122);
				match(DOT);
				setState(123);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(175);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new FieldExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(127);
						match(DOT);
						setState(128);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(130);
						((MulDivModExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulDivModExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(131);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(133);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(134);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ShiftExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(136);
						((ShiftExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LSHIFT || _la==RSHIFT) ) {
							((ShiftExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(137);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new CompExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(139);
						((CompExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << GREATER_EQ) | (1L << LESS) | (1L << LESS_EQ))) != 0)) ) {
							((CompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(140);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new EqNeqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(142);
						((EqNeqExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqNeqExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(143);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new BitAndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(145);
						((BitAndExprContext)_localctx).op = match(BIT_AND);
						setState(146);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new BitXorExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(148);
						((BitXorExprContext)_localctx).op = match(BIT_XOR);
						setState(149);
						expr(10);
						}
						break;
					case 9:
						{
						_localctx = new BitOrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(151);
						((BitOrExprContext)_localctx).op = match(BIT_OR);
						setState(152);
						expr(9);
						}
						break;
					case 10:
						{
						_localctx = new LogAndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(154);
						((LogAndExprContext)_localctx).op = match(LOG_AND);
						setState(155);
						expr(8);
						}
						break;
					case 11:
						{
						_localctx = new LogOrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(157);
						((LogOrExprContext)_localctx).op = match(LOG_OR);
						setState(158);
						expr(7);
						}
						break;
					case 12:
						{
						_localctx = new AssignExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(160);
						((AssignExprContext)_localctx).op = match(ASSIGN);
						setState(161);
						expr(5);
						}
						break;
					case 13:
						{
						_localctx = new SubsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(163);
						match(LBRACKET);
						setState(164);
						expr(0);
						setState(165);
						match(LBRACKET);
						}
						break;
					case 14:
						{
						_localctx = new ParaFuncExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(168);
						match(LPAREN);
						setState(170);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << PREDICATE) | (1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT) | (1L << NULL) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
							{
							setState(169);
							param_list();
							}
						}

						setState(172);
						match(RPAREN);
						}
						break;
					case 15:
						{
						_localctx = new PosUnaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(174);
						((PosUnaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((PosUnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Dim_exprContext extends ParserRuleContext {
		public Token dim_expr_entry;
		public Token dim_no_expr_entry;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(MasterParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(MasterParser.RBRACKET, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(MasterParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(MasterParser.LBRACKET, i);
		}
		public Dim_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterDim_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitDim_expr(this);
		}
	}

	public final Dim_exprContext dim_expr() throws RecognitionException {
		Dim_exprContext _localctx = new Dim_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dim_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(180);
					((Dim_exprContext)_localctx).dim_expr_entry = match(LBRACKET);
					setState(181);
					expr(0);
					setState(182);
					match(RBRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(186); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188);
					((Dim_exprContext)_localctx).dim_no_expr_entry = match(LBRACKET);
					setState(189);
					match(RBRACKET);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declContext extends ParserRuleContext {
		public Variable_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_decl; }
	 
		public Variable_declContext() { }
		public void copyFrom(Variable_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclWithNoInitContext extends Variable_declContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(MasterParser.SEMICOLON, 0); }
		public VarDeclWithNoInitContext(Variable_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterVarDeclWithNoInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitVarDeclWithNoInit(this);
		}
	}
	public static class VarDeclWithInitContext extends Variable_declContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MasterParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MasterParser.SEMICOLON, 0); }
		public VarDeclWithInitContext(Variable_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterVarDeclWithInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitVarDeclWithInit(this);
		}
	}

	public final Variable_declContext variable_decl() throws RecognitionException {
		Variable_declContext _localctx = new Variable_declContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable_decl);
		try {
			setState(205);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new VarDeclWithNoInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				type_specifier(0);
				setState(196);
				match(ID);
				setState(197);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new VarDeclWithInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				type_specifier(0);
				setState(200);
				match(ID);
				setState(201);
				match(ASSIGN);
				setState(202);
				expr(0);
				setState(203);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specifierContext extends ParserRuleContext {
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
	 
		public Type_specifierContext() { }
		public void copyFrom(Type_specifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeContext extends Type_specifierContext {
		public Token lrbracket;
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(MasterParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(MasterParser.RBRACKET, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(MasterParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(MasterParser.LBRACKET, i);
		}
		public ArrayTypeContext(Type_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitArrayType(this);
		}
	}
	public static class IntegerTypeContext extends Type_specifierContext {
		public TerminalNode INTEGER() { return getToken(MasterParser.INTEGER, 0); }
		public IntegerTypeContext(Type_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitIntegerType(this);
		}
	}
	public static class StringTypeContext extends Type_specifierContext {
		public TerminalNode STRING() { return getToken(MasterParser.STRING, 0); }
		public StringTypeContext(Type_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitStringType(this);
		}
	}
	public static class BoolTypeContext extends Type_specifierContext {
		public TerminalNode BOOLEAN() { return getToken(MasterParser.BOOLEAN, 0); }
		public BoolTypeContext(Type_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitBoolType(this);
		}
	}
	public static class ClassTypeContext extends Type_specifierContext {
		public TerminalNode ID() { return getToken(MasterParser.ID, 0); }
		public ClassTypeContext(Type_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitClassType(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		return type_specifier(0);
	}

	private Type_specifierContext type_specifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, _parentState);
		Type_specifierContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_type_specifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				_localctx = new IntegerTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(208);
				match(INTEGER);
				}
				break;
			case STRING:
				{
				_localctx = new StringTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(STRING);
				}
				break;
			case BOOLEAN:
				{
				_localctx = new BoolTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(BOOLEAN);
				}
				break;
			case ID:
				{
				_localctx = new ClassTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(new Type_specifierContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type_specifier);
					setState(214);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(217); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(215);
							((ArrayTypeContext)_localctx).lrbracket = match(LBRACKET);
							setState(216);
							match(RBRACKET);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(219); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Stmt_listContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitStmt_list(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << BREAK) | (1L << RETURN) | (1L << CONTINUE) | (1L << WHILE) | (1L << FOR) | (1L << NEW) | (1L << THIS) | (1L << INTEGER) | (1L << STRING) | (1L << BOOLEAN) | (1L << PREDICATE) | (1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT) | (1L << NULL) | (1L << SEMICOLON) | (1L << LBRACE) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				{
				setState(226);
				stmt();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Selection_stmtContext selection_stmt() {
			return getRuleContext(Selection_stmtContext.class,0);
		}
		public Iteration_stmtContext iteration_stmt() {
			return getRuleContext(Iteration_stmtContext.class,0);
		}
		public Jump_stmtContext jump_stmt() {
			return getRuleContext(Jump_stmtContext.class,0);
		}
		public Variable_declContext variable_decl() {
			return getRuleContext(Variable_declContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MasterParser.SEMICOLON, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmt);
		try {
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				expr_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				selection_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				iteration_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				jump_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				variable_decl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MasterParser.LBRACE, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MasterParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(LBRACE);
			setState(242);
			stmt_list();
			setState(243);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MasterParser.SEMICOLON, 0); }
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitExpr_stmt(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			expr(0);
			setState(246);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selection_stmtContext extends ParserRuleContext {
		public Token else_stmt;
		public TerminalNode IF() { return getToken(MasterParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MasterParser.ELSE, 0); }
		public Selection_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterSelection_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitSelection_stmt(this);
		}
	}

	public final Selection_stmtContext selection_stmt() throws RecognitionException {
		Selection_stmtContext _localctx = new Selection_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_selection_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(IF);
			setState(249);
			match(LPAREN);
			setState(250);
			expr(0);
			setState(251);
			match(RPAREN);
			setState(252);
			stmt();
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(253);
				((Selection_stmtContext)_localctx).else_stmt = match(ELSE);
				setState(254);
				stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Iteration_stmtContext extends ParserRuleContext {
		public Iteration_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_stmt; }
	 
		public Iteration_stmtContext() { }
		public void copyFrom(Iteration_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileIterationContext extends Iteration_stmtContext {
		public TerminalNode WHILE() { return getToken(MasterParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileIterationContext(Iteration_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterWhileIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitWhileIteration(this);
		}
	}
	public static class ForIterationContext extends Iteration_stmtContext {
		public TerminalNode FOR() { return getToken(MasterParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(MasterParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(MasterParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MasterParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(MasterParser.RPAREN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForIterationContext(Iteration_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterForIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitForIteration(this);
		}
	}

	public final Iteration_stmtContext iteration_stmt() throws RecognitionException {
		Iteration_stmtContext _localctx = new Iteration_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_iteration_stmt);
		int _la;
		try {
			setState(278);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new WhileIterationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(WHILE);
				setState(258);
				match(LPAREN);
				setState(259);
				expr(0);
				setState(260);
				match(RPAREN);
				setState(261);
				stmt();
				}
				break;
			case FOR:
				_localctx = new ForIterationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(FOR);
				setState(264);
				match(LPAREN);
				setState(266);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << PREDICATE) | (1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT) | (1L << NULL) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(265);
					expr(0);
					}
				}

				setState(268);
				match(SEMICOLON);
				setState(270);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << PREDICATE) | (1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT) | (1L << NULL) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(269);
					expr(0);
					}
				}

				setState(272);
				match(SEMICOLON);
				setState(274);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << PREDICATE) | (1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT) | (1L << NULL) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(273);
					expr(0);
					}
				}

				setState(276);
				match(RPAREN);
				setState(277);
				stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jump_stmtContext extends ParserRuleContext {
		public Jump_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_stmt; }
	 
		public Jump_stmtContext() { }
		public void copyFrom(Jump_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnJumpContext extends Jump_stmtContext {
		public TerminalNode RETURN() { return getToken(MasterParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MasterParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnJumpContext(Jump_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterReturnJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitReturnJump(this);
		}
	}
	public static class BreakJumpContext extends Jump_stmtContext {
		public TerminalNode BREAK() { return getToken(MasterParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(MasterParser.SEMICOLON, 0); }
		public BreakJumpContext(Jump_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterBreakJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitBreakJump(this);
		}
	}
	public static class ContinueJumpContext extends Jump_stmtContext {
		public TerminalNode CONTINUE() { return getToken(MasterParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(MasterParser.SEMICOLON, 0); }
		public ContinueJumpContext(Jump_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterContinueJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitContinueJump(this);
		}
	}

	public final Jump_stmtContext jump_stmt() throws RecognitionException {
		Jump_stmtContext _localctx = new Jump_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jump_stmt);
		int _la;
		try {
			setState(289);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new ReturnJumpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(RETURN);
				setState(282);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << PREDICATE) | (1L << ADD) | (1L << SUB) | (1L << INC) | (1L << DEC) | (1L << LOG_NOT) | (1L << BIT_NOT) | (1L << NULL) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(281);
					expr(0);
					}
				}

				setState(284);
				match(SEMICOLON);
				}
				break;
			case BREAK:
				_localctx = new BreakJumpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(BREAK);
				setState(286);
				match(SEMICOLON);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueJumpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(CONTINUE);
				setState(288);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolConstContext extends ConstantContext {
		public TerminalNode PREDICATE() { return getToken(MasterParser.PREDICATE, 0); }
		public BoolConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterBoolConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitBoolConst(this);
		}
	}
	public static class IntConstContext extends ConstantContext {
		public TerminalNode INT_LITERAL() { return getToken(MasterParser.INT_LITERAL, 0); }
		public IntConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterIntConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitIntConst(this);
		}
	}
	public static class NullConstContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(MasterParser.NULL, 0); }
		public NullConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterNullConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitNullConst(this);
		}
	}
	public static class StringConstContext extends ConstantContext {
		public TerminalNode STRING_LITERAL() { return getToken(MasterParser.STRING_LITERAL, 0); }
		public StringConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterStringConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitStringConst(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constant);
		try {
			setState(295);
			switch (_input.LA(1)) {
			case NULL:
				_localctx = new NullConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(NULL);
				}
				break;
			case INT_LITERAL:
				_localctx = new IntConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(INT_LITERAL);
				}
				break;
			case PREDICATE:
				_localctx = new BoolConstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(PREDICATE);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringConstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_listContext extends ParserRuleContext {
		public ExprContext expr_comma;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MasterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MasterParser.COMMA, i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MasterListener ) ((MasterListener)listener).exitParam_list(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_param_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					((Param_listContext)_localctx).expr_comma = expr(0);
					setState(298);
					match(COMMA);
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(305);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 12:
			return type_specifier_sempred((Type_specifierContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 20);
		case 13:
			return precpred(_ctx, 19);
		case 14:
			return precpred(_ctx, 16);
		}
		return true;
	}
	private boolean type_specifier_sempred(Type_specifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u0136\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\7\2"+
		"\63\n\2\f\2\16\2\66\13\2\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\5\7U\n\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b]\n\b\3\b\3\b\3\t\3\t\3\t\7\t"+
		"d\n\t\f\t\16\tg\13\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13x\n\13\3\13\3\13\3\13\3\13\3\13\5\13\177\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00ad\n\13\3\13\3\13\3\13\7\13\u00b2\n\13\f\13\16\13\u00b5"+
		"\13\13\3\f\3\f\3\f\3\f\6\f\u00bb\n\f\r\f\16\f\u00bc\3\f\3\f\7\f\u00c1"+
		"\n\f\f\f\16\f\u00c4\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d0"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00d7\n\16\3\16\3\16\3\16\6\16\u00dc"+
		"\n\16\r\16\16\16\u00dd\7\16\u00e0\n\16\f\16\16\16\u00e3\13\16\3\17\7\17"+
		"\u00e6\n\17\f\17\16\17\u00e9\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00f2\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0102\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u010d\n\24\3\24\3\24\5\24\u0111\n\24\3\24\3\24\5\24\u0115\n"+
		"\24\3\24\3\24\5\24\u0119\n\24\3\25\3\25\5\25\u011d\n\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0124\n\25\3\26\3\26\3\26\3\26\5\26\u012a\n\26\3\27\3"+
		"\27\3\27\7\27\u012f\n\27\f\27\16\27\u0132\13\27\3\27\3\27\3\27\2\4\24"+
		"\32\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\t\6\2\23\24\30"+
		"\31\"\"%%\3\2\25\27\3\2\23\24\3\2#$\3\2\32\35\3\2\36\37\3\2\30\31\u015b"+
		"\2\64\3\2\2\2\4=\3\2\2\2\6@\3\2\2\2\bE\3\2\2\2\nJ\3\2\2\2\fP\3\2\2\2\16"+
		"X\3\2\2\2\20e\3\2\2\2\22j\3\2\2\2\24~\3\2\2\2\26\u00ba\3\2\2\2\30\u00cf"+
		"\3\2\2\2\32\u00d6\3\2\2\2\34\u00e7\3\2\2\2\36\u00f1\3\2\2\2 \u00f3\3\2"+
		"\2\2\"\u00f7\3\2\2\2$\u00fa\3\2\2\2&\u0118\3\2\2\2(\u0123\3\2\2\2*\u0129"+
		"\3\2\2\2,\u0130\3\2\2\2.\63\5\n\6\2/\63\5\6\4\2\60\63\5\b\5\2\61\63\5"+
		"\30\r\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\66\3\2"+
		"\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\3\3\2\2\2\66\64\3\2\2\2\67<\5\n\6"+
		"\28<\5\6\4\29<\5\b\5\2:<\5\30\r\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:\3"+
		"\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\5\3\2\2\2?=\3\2\2\2@A\5\f\7\2AB"+
		"\7/\2\2BC\5\34\17\2CD\7\60\2\2D\7\3\2\2\2EF\5\16\b\2FG\7/\2\2GH\5\34\17"+
		"\2HI\7\60\2\2I\t\3\2\2\2JK\7\21\2\2KL\7\66\2\2LM\7/\2\2MN\5\4\3\2NO\7"+
		"\60\2\2O\13\3\2\2\2PQ\5\32\16\2QR\7\66\2\2RT\7\61\2\2SU\5\20\t\2TS\3\2"+
		"\2\2TU\3\2\2\2UV\3\2\2\2VW\7\62\2\2W\r\3\2\2\2XY\7\20\2\2YZ\7\66\2\2Z"+
		"\\\7\61\2\2[]\5\20\t\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\62\2\2_\17"+
		"\3\2\2\2`a\5\22\n\2ab\7+\2\2bd\3\2\2\2c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2e"+
		"f\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\5\22\n\2i\21\3\2\2\2jk\5\32\16\2kl\7\66"+
		"\2\2l\23\3\2\2\2mn\b\13\1\2no\t\2\2\2o\177\5\24\13\23pq\7\61\2\2qr\5\24"+
		"\13\2rs\7\62\2\2s\177\3\2\2\2tu\7\n\2\2uw\5\32\16\2vx\5\26\f\2wv\3\2\2"+
		"\2wx\3\2\2\2x\177\3\2\2\2y\177\5*\26\2z\177\7\66\2\2{|\7\f\2\2|}\7\63"+
		"\2\2}\177\7\66\2\2~m\3\2\2\2~p\3\2\2\2~t\3\2\2\2~y\3\2\2\2~z\3\2\2\2~"+
		"{\3\2\2\2\177\u00b3\3\2\2\2\u0080\u0081\f\24\2\2\u0081\u0082\7\63\2\2"+
		"\u0082\u00b2\5\24\13\25\u0083\u0084\f\21\2\2\u0084\u0085\t\3\2\2\u0085"+
		"\u00b2\5\24\13\22\u0086\u0087\f\20\2\2\u0087\u0088\t\4\2\2\u0088\u00b2"+
		"\5\24\13\21\u0089\u008a\f\17\2\2\u008a\u008b\t\5\2\2\u008b\u00b2\5\24"+
		"\13\20\u008c\u008d\f\16\2\2\u008d\u008e\t\6\2\2\u008e\u00b2\5\24\13\17"+
		"\u008f\u0090\f\r\2\2\u0090\u0091\t\7\2\2\u0091\u00b2\5\24\13\16\u0092"+
		"\u0093\f\f\2\2\u0093\u0094\7&\2\2\u0094\u00b2\5\24\13\r\u0095\u0096\f"+
		"\13\2\2\u0096\u0097\7(\2\2\u0097\u00b2\5\24\13\f\u0098\u0099\f\n\2\2\u0099"+
		"\u009a\7\'\2\2\u009a\u00b2\5\24\13\13\u009b\u009c\f\t\2\2\u009c\u009d"+
		"\7 \2\2\u009d\u00b2\5\24\13\n\u009e\u009f\f\b\2\2\u009f\u00a0\7!\2\2\u00a0"+
		"\u00b2\5\24\13\t\u00a1\u00a2\f\7\2\2\u00a2\u00a3\7)\2\2\u00a3\u00b2\5"+
		"\24\13\7\u00a4\u00a5\f\26\2\2\u00a5\u00a6\7-\2\2\u00a6\u00a7\5\24\13\2"+
		"\u00a7\u00a8\7-\2\2\u00a8\u00b2\3\2\2\2\u00a9\u00aa\f\25\2\2\u00aa\u00ac"+
		"\7\61\2\2\u00ab\u00ad\5,\27\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2"+
		"\u00ad\u00ae\3\2\2\2\u00ae\u00b2\7\62\2\2\u00af\u00b0\f\22\2\2\u00b0\u00b2"+
		"\t\b\2\2\u00b1\u0080\3\2\2\2\u00b1\u0083\3\2\2\2\u00b1\u0086\3\2\2\2\u00b1"+
		"\u0089\3\2\2\2\u00b1\u008c\3\2\2\2\u00b1\u008f\3\2\2\2\u00b1\u0092\3\2"+
		"\2\2\u00b1\u0095\3\2\2\2\u00b1\u0098\3\2\2\2\u00b1\u009b\3\2\2\2\u00b1"+
		"\u009e\3\2\2\2\u00b1\u00a1\3\2\2\2\u00b1\u00a4\3\2\2\2\u00b1\u00a9\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\25\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7-\2\2"+
		"\u00b7\u00b8\5\24\13\2\u00b8\u00b9\7.\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b6"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00c2\3\2\2\2\u00be\u00bf\7-\2\2\u00bf\u00c1\7.\2\2\u00c0\u00be\3\2\2"+
		"\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\27"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\5\32\16\2\u00c6\u00c7\7\66\2"+
		"\2\u00c7\u00c8\7,\2\2\u00c8\u00d0\3\2\2\2\u00c9\u00ca\5\32\16\2\u00ca"+
		"\u00cb\7\66\2\2\u00cb\u00cc\7)\2\2\u00cc\u00cd\5\24\13\2\u00cd\u00ce\7"+
		",\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00c5\3\2\2\2\u00cf\u00c9\3\2\2\2\u00d0"+
		"\31\3\2\2\2\u00d1\u00d2\b\16\1\2\u00d2\u00d7\7\r\2\2\u00d3\u00d7\7\16"+
		"\2\2\u00d4\u00d7\7\17\2\2\u00d5\u00d7\7\66\2\2\u00d6\u00d1\3\2\2\2\u00d6"+
		"\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00e1\3\2"+
		"\2\2\u00d8\u00db\f\3\2\2\u00d9\u00da\7-\2\2\u00da\u00dc\7.\2\2\u00db\u00d9"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00d8\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\33\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6"+
		"\5\36\20\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e8\35\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00f2"+
		"\5 \21\2\u00eb\u00f2\5\"\22\2\u00ec\u00f2\5$\23\2\u00ed\u00f2\5&\24\2"+
		"\u00ee\u00f2\5(\25\2\u00ef\u00f2\5\30\r\2\u00f0\u00f2\7,\2\2\u00f1\u00ea"+
		"\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1"+
		"\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\37\3\2\2"+
		"\2\u00f3\u00f4\7/\2\2\u00f4\u00f5\5\34\17\2\u00f5\u00f6\7\60\2\2\u00f6"+
		"!\3\2\2\2\u00f7\u00f8\5\24\13\2\u00f8\u00f9\7,\2\2\u00f9#\3\2\2\2\u00fa"+
		"\u00fb\7\3\2\2\u00fb\u00fc\7\61\2\2\u00fc\u00fd\5\24\13\2\u00fd\u00fe"+
		"\7\62\2\2\u00fe\u0101\5\36\20\2\u00ff\u0100\7\4\2\2\u0100\u0102\5\36\20"+
		"\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102%\3\2\2\2\u0103\u0104"+
		"\7\b\2\2\u0104\u0105\7\61\2\2\u0105\u0106\5\24\13\2\u0106\u0107\7\62\2"+
		"\2\u0107\u0108\5\36\20\2\u0108\u0119\3\2\2\2\u0109\u010a\7\t\2\2\u010a"+
		"\u010c\7\61\2\2\u010b\u010d\5\24\13\2\u010c\u010b\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\7,\2\2\u010f\u0111\5\24\13\2"+
		"\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114"+
		"\7,\2\2\u0113\u0115\5\24\13\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2"+
		"\u0115\u0116\3\2\2\2\u0116\u0117\7\62\2\2\u0117\u0119\5\36\20\2\u0118"+
		"\u0103\3\2\2\2\u0118\u0109\3\2\2\2\u0119\'\3\2\2\2\u011a\u011c\7\6\2\2"+
		"\u011b\u011d\5\24\13\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u0124\7,\2\2\u011f\u0120\7\5\2\2\u0120\u0124\7,\2\2\u0121"+
		"\u0122\7\7\2\2\u0122\u0124\7,\2\2\u0123\u011a\3\2\2\2\u0123\u011f\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0124)\3\2\2\2\u0125\u012a\7*\2\2\u0126\u012a"+
		"\7\64\2\2\u0127\u012a\7\22\2\2\u0128\u012a\7\65\2\2\u0129\u0125\3\2\2"+
		"\2\u0129\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a+"+
		"\3\2\2\2\u012b\u012c\5\24\13\2\u012c\u012d\7+\2\2\u012d\u012f\3\2\2\2"+
		"\u012e\u012b\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\5\24\13\2"+
		"\u0134-\3\2\2\2\37\62\64;=T\\ew~\u00ac\u00b1\u00b3\u00bc\u00c2\u00cf\u00d6"+
		"\u00dd\u00e1\u00e7\u00f1\u0101\u010c\u0110\u0114\u0118\u011c\u0123\u0129"+
		"\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}