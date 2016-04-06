// Generated from C:/Users/Ò¶×ÓºÀ/IdeaProjects/MasterCompiler/src/Master/Parser\Master.g4 by ANTLR 4.5.1
package Master.Parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MasterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, BREAK=3, RETURN=4, CONTINUE=5, WHILE=6, FOR=7, NEW=8, INTEGER=9, 
		STRING=10, BOOLEAN=11, VOID=12, CLASS=13, PREDICATE=14, ADD=15, SUB=16, 
		MUL=17, DIV=18, MOD=19, INC=20, DEC=21, GREATER=22, GREATER_EQ=23, LESS=24, 
		LESS_EQ=25, EQ=26, NEQ=27, LOG_AND=28, LOG_OR=29, LOG_NOT=30, LSHIFT=31, 
		RSHIFT=32, BIT_NOT=33, BIT_AND=34, BIT_OR=35, BIT_XOR=36, ASSIGN=37, NULL=38, 
		COMMA=39, SEMICOLON=40, LBRACKET=41, RBRACKET=42, LBRACE=43, RBRACE=44, 
		LPAREN=45, RPAREN=46, DOT=47, INT_LITERAL=48, STRING_LITERAL=49, ID=50, 
		NEWLINE=51, LINE_COMMENT=52, WS=53;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "ELSE", "BREAK", "RETURN", "CONTINUE", "WHILE", "FOR", "NEW", "INTEGER", 
		"STRING", "BOOLEAN", "VOID", "CLASS", "PREDICATE", "ADD", "SUB", "MUL", 
		"DIV", "MOD", "INC", "DEC", "GREATER", "GREATER_EQ", "LESS", "LESS_EQ", 
		"EQ", "NEQ", "LOG_AND", "LOG_OR", "LOG_NOT", "LSHIFT", "RSHIFT", "BIT_NOT", 
		"BIT_AND", "BIT_OR", "BIT_XOR", "ASSIGN", "NULL", "COMMA", "SEMICOLON", 
		"LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "DOT", 
		"INT_LITERAL", "STRING_LITERAL", "SCHARSEQ", "SCHAR", "ESCSEQ", "ID", 
		"NEWLINE", "LINE_COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'break'", "'return'", "'continue'", "'while'", 
		"'for'", "'new'", "'int'", "'string'", "'bool'", "'void'", "'class'", 
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'>'", "'>='", 
		"'<'", "'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'<<'", "'>>'", 
		"'~'", "'&'", "'|'", "'^'", "'='", "'null'", "','", "';'", "'['", "']'", 
		"'{'", "'}'", "'('", "')'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "ELSE", "BREAK", "RETURN", "CONTINUE", "WHILE", "FOR", "NEW", 
		"INTEGER", "STRING", "BOOLEAN", "VOID", "CLASS", "PREDICATE", "ADD", "SUB", 
		"MUL", "DIV", "MOD", "INC", "DEC", "GREATER", "GREATER_EQ", "LESS", "LESS_EQ", 
		"EQ", "NEQ", "LOG_AND", "LOG_OR", "LOG_NOT", "LSHIFT", "RSHIFT", "BIT_NOT", 
		"BIT_AND", "BIT_OR", "BIT_XOR", "ASSIGN", "NULL", "COMMA", "SEMICOLON", 
		"LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "DOT", 
		"INT_LITERAL", "STRING_LITERAL", "ID", "NEWLINE", "LINE_COMMENT", "WS"
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


	public MasterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Master.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\67\u014d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c4\n\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\6\61\u0116\n\61\r\61\16\61\u0117"+
		"\3\62\3\62\5\62\u011c\n\62\3\62\3\62\3\63\6\63\u0121\n\63\r\63\16\63\u0122"+
		"\3\64\3\64\5\64\u0127\n\64\3\65\3\65\3\65\3\66\3\66\7\66\u012e\n\66\f"+
		"\66\16\66\u0131\13\66\3\67\5\67\u0134\n\67\3\67\3\67\3\67\3\67\38\38\3"+
		"8\38\78\u013e\n8\f8\168\u0141\138\38\58\u0144\n8\38\38\38\38\39\39\39"+
		"\39\3\u013f\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\2g\2"+
		"i\2k\64m\65o\66q\67\3\2\b\3\2\62;\6\2\f\f\17\17))^^\f\2$$))AA^^cdhhpp"+
		"ttvvxx\4\2C\\c|\6\2\62;C\\aac|\4\2\13\13\"\"\u0152\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5v\3\2\2\2\7{\3\2\2"+
		"\2\t\u0081\3\2\2\2\13\u0088\3\2\2\2\r\u0091\3\2\2\2\17\u0097\3\2\2\2\21"+
		"\u009b\3\2\2\2\23\u009f\3\2\2\2\25\u00a3\3\2\2\2\27\u00aa\3\2\2\2\31\u00af"+
		"\3\2\2\2\33\u00b4\3\2\2\2\35\u00c3\3\2\2\2\37\u00c5\3\2\2\2!\u00c7\3\2"+
		"\2\2#\u00c9\3\2\2\2%\u00cb\3\2\2\2\'\u00cd\3\2\2\2)\u00cf\3\2\2\2+\u00d2"+
		"\3\2\2\2-\u00d5\3\2\2\2/\u00d7\3\2\2\2\61\u00da\3\2\2\2\63\u00dc\3\2\2"+
		"\2\65\u00df\3\2\2\2\67\u00e2\3\2\2\29\u00e5\3\2\2\2;\u00e8\3\2\2\2=\u00eb"+
		"\3\2\2\2?\u00ed\3\2\2\2A\u00f0\3\2\2\2C\u00f3\3\2\2\2E\u00f5\3\2\2\2G"+
		"\u00f7\3\2\2\2I\u00f9\3\2\2\2K\u00fb\3\2\2\2M\u00fd\3\2\2\2O\u0102\3\2"+
		"\2\2Q\u0104\3\2\2\2S\u0106\3\2\2\2U\u0108\3\2\2\2W\u010a\3\2\2\2Y\u010c"+
		"\3\2\2\2[\u010e\3\2\2\2]\u0110\3\2\2\2_\u0112\3\2\2\2a\u0115\3\2\2\2c"+
		"\u0119\3\2\2\2e\u0120\3\2\2\2g\u0126\3\2\2\2i\u0128\3\2\2\2k\u012b\3\2"+
		"\2\2m\u0133\3\2\2\2o\u0139\3\2\2\2q\u0149\3\2\2\2st\7k\2\2tu\7h\2\2u\4"+
		"\3\2\2\2vw\7g\2\2wx\7n\2\2xy\7u\2\2yz\7g\2\2z\6\3\2\2\2{|\7d\2\2|}\7t"+
		"\2\2}~\7g\2\2~\177\7c\2\2\177\u0080\7m\2\2\u0080\b\3\2\2\2\u0081\u0082"+
		"\7t\2\2\u0082\u0083\7g\2\2\u0083\u0084\7v\2\2\u0084\u0085\7w\2\2\u0085"+
		"\u0086\7t\2\2\u0086\u0087\7p\2\2\u0087\n\3\2\2\2\u0088\u0089\7e\2\2\u0089"+
		"\u008a\7q\2\2\u008a\u008b\7p\2\2\u008b\u008c\7v\2\2\u008c\u008d\7k\2\2"+
		"\u008d\u008e\7p\2\2\u008e\u008f\7w\2\2\u008f\u0090\7g\2\2\u0090\f\3\2"+
		"\2\2\u0091\u0092\7y\2\2\u0092\u0093\7j\2\2\u0093\u0094\7k\2\2\u0094\u0095"+
		"\7n\2\2\u0095\u0096\7g\2\2\u0096\16\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099"+
		"\7q\2\2\u0099\u009a\7t\2\2\u009a\20\3\2\2\2\u009b\u009c\7p\2\2\u009c\u009d"+
		"\7g\2\2\u009d\u009e\7y\2\2\u009e\22\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1"+
		"\7p\2\2\u00a1\u00a2\7v\2\2\u00a2\24\3\2\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5"+
		"\7v\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8"+
		"\u00a9\7i\2\2\u00a9\26\3\2\2\2\u00aa\u00ab\7d\2\2\u00ab\u00ac\7q\2\2\u00ac"+
		"\u00ad\7q\2\2\u00ad\u00ae\7n\2\2\u00ae\30\3\2\2\2\u00af\u00b0\7x\2\2\u00b0"+
		"\u00b1\7q\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7f\2\2\u00b3\32\3\2\2\2\u00b4"+
		"\u00b5\7e\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7u\2\2"+
		"\u00b8\u00b9\7u\2\2\u00b9\34\3\2\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7"+
		"t\2\2\u00bc\u00bd\7w\2\2\u00bd\u00c4\7g\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0"+
		"\7c\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c4\7g\2\2\u00c3"+
		"\u00ba\3\2\2\2\u00c3\u00be\3\2\2\2\u00c4\36\3\2\2\2\u00c5\u00c6\7-\2\2"+
		"\u00c6 \3\2\2\2\u00c7\u00c8\7/\2\2\u00c8\"\3\2\2\2\u00c9\u00ca\7,\2\2"+
		"\u00ca$\3\2\2\2\u00cb\u00cc\7\61\2\2\u00cc&\3\2\2\2\u00cd\u00ce\7\'\2"+
		"\2\u00ce(\3\2\2\2\u00cf\u00d0\7-\2\2\u00d0\u00d1\7-\2\2\u00d1*\3\2\2\2"+
		"\u00d2\u00d3\7/\2\2\u00d3\u00d4\7/\2\2\u00d4,\3\2\2\2\u00d5\u00d6\7@\2"+
		"\2\u00d6.\3\2\2\2\u00d7\u00d8\7@\2\2\u00d8\u00d9\7?\2\2\u00d9\60\3\2\2"+
		"\2\u00da\u00db\7>\2\2\u00db\62\3\2\2\2\u00dc\u00dd\7>\2\2\u00dd\u00de"+
		"\7?\2\2\u00de\64\3\2\2\2\u00df\u00e0\7?\2\2\u00e0\u00e1\7?\2\2\u00e1\66"+
		"\3\2\2\2\u00e2\u00e3\7#\2\2\u00e3\u00e4\7?\2\2\u00e48\3\2\2\2\u00e5\u00e6"+
		"\7(\2\2\u00e6\u00e7\7(\2\2\u00e7:\3\2\2\2\u00e8\u00e9\7~\2\2\u00e9\u00ea"+
		"\7~\2\2\u00ea<\3\2\2\2\u00eb\u00ec\7#\2\2\u00ec>\3\2\2\2\u00ed\u00ee\7"+
		">\2\2\u00ee\u00ef\7>\2\2\u00ef@\3\2\2\2\u00f0\u00f1\7@\2\2\u00f1\u00f2"+
		"\7@\2\2\u00f2B\3\2\2\2\u00f3\u00f4\7\u0080\2\2\u00f4D\3\2\2\2\u00f5\u00f6"+
		"\7(\2\2\u00f6F\3\2\2\2\u00f7\u00f8\7~\2\2\u00f8H\3\2\2\2\u00f9\u00fa\7"+
		"`\2\2\u00faJ\3\2\2\2\u00fb\u00fc\7?\2\2\u00fcL\3\2\2\2\u00fd\u00fe\7p"+
		"\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7n\2\2\u0101N\3"+
		"\2\2\2\u0102\u0103\7.\2\2\u0103P\3\2\2\2\u0104\u0105\7=\2\2\u0105R\3\2"+
		"\2\2\u0106\u0107\7]\2\2\u0107T\3\2\2\2\u0108\u0109\7_\2\2\u0109V\3\2\2"+
		"\2\u010a\u010b\7}\2\2\u010bX\3\2\2\2\u010c\u010d\7\177\2\2\u010dZ\3\2"+
		"\2\2\u010e\u010f\7*\2\2\u010f\\\3\2\2\2\u0110\u0111\7+\2\2\u0111^\3\2"+
		"\2\2\u0112\u0113\7\60\2\2\u0113`\3\2\2\2\u0114\u0116\t\2\2\2\u0115\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"b\3\2\2\2\u0119\u011b\7$\2\2\u011a\u011c\5e\63\2\u011b\u011a\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7$\2\2\u011ed\3\2\2\2\u011f"+
		"\u0121\5g\64\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123f\3\2\2\2\u0124\u0127\n\3\2\2\u0125\u0127"+
		"\5i\65\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127h\3\2\2\2\u0128"+
		"\u0129\7^\2\2\u0129\u012a\t\4\2\2\u012aj\3\2\2\2\u012b\u012f\t\5\2\2\u012c"+
		"\u012e\t\6\2\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130l\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134"+
		"\7\17\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2"+
		"\u0135\u0136\7\f\2\2\u0136\u0137\3\2\2\2\u0137\u0138\b\67\2\2\u0138n\3"+
		"\2\2\2\u0139\u013a\7\61\2\2\u013a\u013b\7\61\2\2\u013b\u013f\3\2\2\2\u013c"+
		"\u013e\13\2\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u0140\3"+
		"\2\2\2\u013f\u013d\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0144\7\17\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3"+
		"\2\2\2\u0145\u0146\7\f\2\2\u0146\u0147\3\2\2\2\u0147\u0148\b8\2\2\u0148"+
		"p\3\2\2\2\u0149\u014a\t\7\2\2\u014a\u014b\3\2\2\2\u014b\u014c\b9\2\2\u014c"+
		"r\3\2\2\2\f\2\u00c3\u0117\u011b\u0122\u0126\u012f\u0133\u013f\u0143\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}