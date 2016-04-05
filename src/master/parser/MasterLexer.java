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
		IF=1, ELSE=2, BREAK=3, RETURN=4, CONTINUE=5, WHILE=6, FOR=7, NEW=8, EXTENDS=9, 
		THIS=10, INTEGER=11, STRING=12, BOOLEAN=13, VOID=14, CLASS=15, PREDICATE=16, 
		ADD=17, SUB=18, MUL=19, DIV=20, MOD=21, INC=22, DEC=23, GREATER=24, GREATER_EQ=25, 
		LESS=26, LESS_EQ=27, EQ=28, NEQ=29, LOG_AND=30, LOG_OR=31, LOG_NOT=32, 
		LSHIFT=33, RSHIFT=34, BIT_NOT=35, BIT_AND=36, BIT_OR=37, BIT_XOR=38, ASSIGN=39, 
		NULL=40, COMMA=41, SEMICOLON=42, LBRACKET=43, RBRACKET=44, LBRACE=45, 
		RBRACE=46, LPAREN=47, RPAREN=48, DOT=49, INT_LITERAL=50, STRING_LITERAL=51, 
		ID=52, NEWLINE=53, LINE_COMMENT=54, WS=55;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "ELSE", "BREAK", "RETURN", "CONTINUE", "WHILE", "FOR", "NEW", "EXTENDS", 
		"THIS", "INTEGER", "STRING", "BOOLEAN", "VOID", "CLASS", "PREDICATE", 
		"ADD", "SUB", "MUL", "DIV", "MOD", "INC", "DEC", "GREATER", "GREATER_EQ", 
		"LESS", "LESS_EQ", "EQ", "NEQ", "LOG_AND", "LOG_OR", "LOG_NOT", "LSHIFT", 
		"RSHIFT", "BIT_NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "ASSIGN", "NULL", 
		"COMMA", "SEMICOLON", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "LPAREN", 
		"RPAREN", "DOT", "INT_LITERAL", "STRING_LITERAL", "SCHARSEQ", "SCHAR", 
		"ESCSEQ", "ID", "NEWLINE", "LINE_COMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\29\u015e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d5\n\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\63\6\63\u0127\n\63\r\63\16\63\u0128\3"+
		"\64\3\64\5\64\u012d\n\64\3\64\3\64\3\65\6\65\u0132\n\65\r\65\16\65\u0133"+
		"\3\66\3\66\5\66\u0138\n\66\3\67\3\67\3\67\38\38\78\u013f\n8\f8\168\u0142"+
		"\138\39\59\u0145\n9\39\39\39\39\3:\3:\3:\3:\7:\u014f\n:\f:\16:\u0152\13"+
		":\3:\5:\u0155\n:\3:\3:\3:\3:\3;\3;\3;\3;\3\u0150\2<\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\2k\2m\2o\66q\67s8u9\3\2\b\3"+
		"\2\62;\6\2\f\f\17\17))^^\f\2$$))AA^^cdhhppttvvxx\4\2C\\c|\6\2\62;C\\a"+
		"ac|\4\2\13\13\"\"\u0163\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5z\3\2\2\2\7\177\3\2\2"+
		"\2\t\u0085\3\2\2\2\13\u008c\3\2\2\2\r\u0095\3\2\2\2\17\u009b\3\2\2\2\21"+
		"\u009f\3\2\2\2\23\u00a3\3\2\2\2\25\u00ab\3\2\2\2\27\u00b0\3\2\2\2\31\u00b4"+
		"\3\2\2\2\33\u00bb\3\2\2\2\35\u00c0\3\2\2\2\37\u00c5\3\2\2\2!\u00d4\3\2"+
		"\2\2#\u00d6\3\2\2\2%\u00d8\3\2\2\2\'\u00da\3\2\2\2)\u00dc\3\2\2\2+\u00de"+
		"\3\2\2\2-\u00e0\3\2\2\2/\u00e3\3\2\2\2\61\u00e6\3\2\2\2\63\u00e8\3\2\2"+
		"\2\65\u00eb\3\2\2\2\67\u00ed\3\2\2\29\u00f0\3\2\2\2;\u00f3\3\2\2\2=\u00f6"+
		"\3\2\2\2?\u00f9\3\2\2\2A\u00fc\3\2\2\2C\u00fe\3\2\2\2E\u0101\3\2\2\2G"+
		"\u0104\3\2\2\2I\u0106\3\2\2\2K\u0108\3\2\2\2M\u010a\3\2\2\2O\u010c\3\2"+
		"\2\2Q\u010e\3\2\2\2S\u0113\3\2\2\2U\u0115\3\2\2\2W\u0117\3\2\2\2Y\u0119"+
		"\3\2\2\2[\u011b\3\2\2\2]\u011d\3\2\2\2_\u011f\3\2\2\2a\u0121\3\2\2\2c"+
		"\u0123\3\2\2\2e\u0126\3\2\2\2g\u012a\3\2\2\2i\u0131\3\2\2\2k\u0137\3\2"+
		"\2\2m\u0139\3\2\2\2o\u013c\3\2\2\2q\u0144\3\2\2\2s\u014a\3\2\2\2u\u015a"+
		"\3\2\2\2wx\7k\2\2xy\7h\2\2y\4\3\2\2\2z{\7g\2\2{|\7n\2\2|}\7u\2\2}~\7g"+
		"\2\2~\6\3\2\2\2\177\u0080\7d\2\2\u0080\u0081\7t\2\2\u0081\u0082\7g\2\2"+
		"\u0082\u0083\7c\2\2\u0083\u0084\7m\2\2\u0084\b\3\2\2\2\u0085\u0086\7t"+
		"\2\2\u0086\u0087\7g\2\2\u0087\u0088\7v\2\2\u0088\u0089\7w\2\2\u0089\u008a"+
		"\7t\2\2\u008a\u008b\7p\2\2\u008b\n\3\2\2\2\u008c\u008d\7e\2\2\u008d\u008e"+
		"\7q\2\2\u008e\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7p\2\2\u0092\u0093\7w\2\2\u0093\u0094\7g\2\2\u0094\f\3\2\2\2\u0095"+
		"\u0096\7y\2\2\u0096\u0097\7j\2\2\u0097\u0098\7k\2\2\u0098\u0099\7n\2\2"+
		"\u0099\u009a\7g\2\2\u009a\16\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d\7"+
		"q\2\2\u009d\u009e\7t\2\2\u009e\20\3\2\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1"+
		"\7g\2\2\u00a1\u00a2\7y\2\2\u00a2\22\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5"+
		"\7z\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7p\2\2\u00a8"+
		"\u00a9\7f\2\2\u00a9\u00aa\7u\2\2\u00aa\24\3\2\2\2\u00ab\u00ac\7v\2\2\u00ac"+
		"\u00ad\7j\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7u\2\2\u00af\26\3\2\2\2\u00b0"+
		"\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3\30\3\2\2\2\u00b4"+
		"\u00b5\7u\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7k\2\2"+
		"\u00b8\u00b9\7p\2\2\u00b9\u00ba\7i\2\2\u00ba\32\3\2\2\2\u00bb\u00bc\7"+
		"d\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7n\2\2\u00bf\34"+
		"\3\2\2\2\u00c0\u00c1\7x\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7k\2\2\u00c3"+
		"\u00c4\7f\2\2\u00c4\36\3\2\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7\7n\2\2\u00c7"+
		"\u00c8\7c\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7u\2\2\u00ca \3\2\2\2\u00cb"+
		"\u00cc\7v\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7w\2\2\u00ce\u00d5\7g\2\2"+
		"\u00cf\u00d0\7h\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3"+
		"\7u\2\2\u00d3\u00d5\7g\2\2\u00d4\u00cb\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d5"+
		"\"\3\2\2\2\u00d6\u00d7\7-\2\2\u00d7$\3\2\2\2\u00d8\u00d9\7/\2\2\u00d9"+
		"&\3\2\2\2\u00da\u00db\7,\2\2\u00db(\3\2\2\2\u00dc\u00dd\7\61\2\2\u00dd"+
		"*\3\2\2\2\u00de\u00df\7\'\2\2\u00df,\3\2\2\2\u00e0\u00e1\7-\2\2\u00e1"+
		"\u00e2\7-\2\2\u00e2.\3\2\2\2\u00e3\u00e4\7/\2\2\u00e4\u00e5\7/\2\2\u00e5"+
		"\60\3\2\2\2\u00e6\u00e7\7@\2\2\u00e7\62\3\2\2\2\u00e8\u00e9\7@\2\2\u00e9"+
		"\u00ea\7?\2\2\u00ea\64\3\2\2\2\u00eb\u00ec\7>\2\2\u00ec\66\3\2\2\2\u00ed"+
		"\u00ee\7>\2\2\u00ee\u00ef\7?\2\2\u00ef8\3\2\2\2\u00f0\u00f1\7?\2\2\u00f1"+
		"\u00f2\7?\2\2\u00f2:\3\2\2\2\u00f3\u00f4\7#\2\2\u00f4\u00f5\7?\2\2\u00f5"+
		"<\3\2\2\2\u00f6\u00f7\7(\2\2\u00f7\u00f8\7(\2\2\u00f8>\3\2\2\2\u00f9\u00fa"+
		"\7~\2\2\u00fa\u00fb\7~\2\2\u00fb@\3\2\2\2\u00fc\u00fd\7#\2\2\u00fdB\3"+
		"\2\2\2\u00fe\u00ff\7>\2\2\u00ff\u0100\7>\2\2\u0100D\3\2\2\2\u0101\u0102"+
		"\7@\2\2\u0102\u0103\7@\2\2\u0103F\3\2\2\2\u0104\u0105\7\u0080\2\2\u0105"+
		"H\3\2\2\2\u0106\u0107\7(\2\2\u0107J\3\2\2\2\u0108\u0109\7~\2\2\u0109L"+
		"\3\2\2\2\u010a\u010b\7`\2\2\u010bN\3\2\2\2\u010c\u010d\7?\2\2\u010dP\3"+
		"\2\2\2\u010e\u010f\7p\2\2\u010f\u0110\7w\2\2\u0110\u0111\7n\2\2\u0111"+
		"\u0112\7n\2\2\u0112R\3\2\2\2\u0113\u0114\7.\2\2\u0114T\3\2\2\2\u0115\u0116"+
		"\7=\2\2\u0116V\3\2\2\2\u0117\u0118\7]\2\2\u0118X\3\2\2\2\u0119\u011a\7"+
		"_\2\2\u011aZ\3\2\2\2\u011b\u011c\7}\2\2\u011c\\\3\2\2\2\u011d\u011e\7"+
		"\177\2\2\u011e^\3\2\2\2\u011f\u0120\7*\2\2\u0120`\3\2\2\2\u0121\u0122"+
		"\7+\2\2\u0122b\3\2\2\2\u0123\u0124\7\60\2\2\u0124d\3\2\2\2\u0125\u0127"+
		"\t\2\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129f\3\2\2\2\u012a\u012c\7$\2\2\u012b\u012d\5i\65\2\u012c"+
		"\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7$"+
		"\2\2\u012fh\3\2\2\2\u0130\u0132\5k\66\2\u0131\u0130\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134j\3\2\2\2\u0135"+
		"\u0138\n\3\2\2\u0136\u0138\5m\67\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2"+
		"\2\2\u0138l\3\2\2\2\u0139\u013a\7^\2\2\u013a\u013b\t\4\2\2\u013bn\3\2"+
		"\2\2\u013c\u0140\t\5\2\2\u013d\u013f\t\6\2\2\u013e\u013d\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141p\3\2\2\2"+
		"\u0142\u0140\3\2\2\2\u0143\u0145\7\17\2\2\u0144\u0143\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7\f\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\b9\2\2\u0149r\3\2\2\2\u014a\u014b\7\61\2\2\u014b\u014c\7\61\2\2"+
		"\u014c\u0150\3\2\2\2\u014d\u014f\13\2\2\2\u014e\u014d\3\2\2\2\u014f\u0152"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0155\7\17\2\2\u0154\u0153\3\2\2\2\u0154\u0155\3"+
		"\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7\f\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\b:\2\2\u0159t\3\2\2\2\u015a\u015b\t\7\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015d\b;\2\2\u015dv\3\2\2\2\f\2\u00d4\u0128\u012c\u0133\u0137\u0140\u0144"+
		"\u0150\u0154\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}