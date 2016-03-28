// Generated from C:/Users/Ò¶×ÓºÀ/IdeaProjects/MasterCompiler/src/master/parser\Master.g4 by ANTLR 4.5.1
package master.parser;
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
		STRING=10, BOOLEAN=11, VOID=12, CLASS=13, PREDICATE=14, PLUS=15, MINUS=16, 
		MULTIPLY=17, DIVIDE=18, MODULO=19, INC=20, DEC=21, GREATER=22, GREATER_EQ=23, 
		LESS=24, LESS_EQ=25, EQ=26, NEQ=27, AND=28, OR=29, NOT=30, LSHIFT=31, 
		RSHIFT=32, ANTI=33, BAND=34, BOR=35, XOR=36, ASSIGN=37, NULL=38, COMMA=39, 
		SEMICOLON=40, LBRACKET=41, RBRACKET=42, LRBRACKET=43, LBRACE=44, RBRACE=45, 
		LPAREN=46, RPAREN=47, LRPAREN=48, DOT=49, SIZE=50, ID=51, INT_LITERAL=52, 
		STRING_LITERAL=53, NEWLINE=54, LINE_COMMENT=55, WS=56;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "ELSE", "BREAK", "RETURN", "CONTINUE", "WHILE", "FOR", "NEW", "INTEGER", 
		"STRING", "BOOLEAN", "VOID", "CLASS", "PREDICATE", "PLUS", "MINUS", "MULTIPLY", 
		"DIVIDE", "MODULO", "INC", "DEC", "GREATER", "GREATER_EQ", "LESS", "LESS_EQ", 
		"EQ", "NEQ", "AND", "OR", "NOT", "LSHIFT", "RSHIFT", "ANTI", "BAND", "BOR", 
		"XOR", "ASSIGN", "NULL", "COMMA", "SEMICOLON", "LBRACKET", "RBRACKET", 
		"LRBRACKET", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LRPAREN", "DOT", 
		"SIZE", "ID", "INT_LITERAL", "STRING_LITERAL", "SCHARSEQ", "SCHAR", "ESCSEQ", 
		"NEWLINE", "LINE_COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'break'", "'return'", "'continue'", "'while'", 
		"'for'", "'new'", "'int'", "'string'", "'bool'", "'void'", "'class'", 
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'>'", "'>='", 
		"'<'", "'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'<<'", "'>>'", 
		"'~'", "'&'", "'|'", "'^'", "'='", "'null'", "','", "';'", "'['", "']'", 
		"'[]'", "'{'", "'}'", "'('", "')'", "'()'", "'.'", "'size'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "ELSE", "BREAK", "RETURN", "CONTINUE", "WHILE", "FOR", "NEW", 
		"INTEGER", "STRING", "BOOLEAN", "VOID", "CLASS", "PREDICATE", "PLUS", 
		"MINUS", "MULTIPLY", "DIVIDE", "MODULO", "INC", "DEC", "GREATER", "GREATER_EQ", 
		"LESS", "LESS_EQ", "EQ", "NEQ", "AND", "OR", "NOT", "LSHIFT", "RSHIFT", 
		"ANTI", "BAND", "BOR", "XOR", "ASSIGN", "NULL", "COMMA", "SEMICOLON", 
		"LBRACKET", "RBRACKET", "LRBRACKET", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
		"LRPAREN", "DOT", "SIZE", "ID", "INT_LITERAL", "STRING_LITERAL", "NEWLINE", 
		"LINE_COMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2:\u015e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ca\n\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\7\64\u0128\n\64\f\64\16\64"+
		"\u012b\13\64\3\65\6\65\u012e\n\65\r\65\16\65\u012f\3\66\3\66\5\66\u0134"+
		"\n\66\3\66\3\66\3\67\6\67\u0139\n\67\r\67\16\67\u013a\38\38\58\u013f\n"+
		"8\39\39\39\3:\5:\u0145\n:\3:\3:\3:\3:\3;\3;\3;\3;\7;\u014f\n;\f;\16;\u0152"+
		"\13;\3;\5;\u0155\n;\3;\3;\3;\3;\3<\3<\3<\3<\3\u0150\2=\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m\2o\2q\2s8u9w:\3\2"+
		"\b\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\6\2\f\f\17\17))^^\f\2$$))AA^^cdhhp"+
		"pttvvxx\4\2\13\13\"\"\u0163\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5|\3\2"+
		"\2\2\7\u0081\3\2\2\2\t\u0087\3\2\2\2\13\u008e\3\2\2\2\r\u0097\3\2\2\2"+
		"\17\u009d\3\2\2\2\21\u00a1\3\2\2\2\23\u00a5\3\2\2\2\25\u00a9\3\2\2\2\27"+
		"\u00b0\3\2\2\2\31\u00b5\3\2\2\2\33\u00ba\3\2\2\2\35\u00c9\3\2\2\2\37\u00cb"+
		"\3\2\2\2!\u00cd\3\2\2\2#\u00cf\3\2\2\2%\u00d1\3\2\2\2\'\u00d3\3\2\2\2"+
		")\u00d5\3\2\2\2+\u00d8\3\2\2\2-\u00db\3\2\2\2/\u00dd\3\2\2\2\61\u00e0"+
		"\3\2\2\2\63\u00e2\3\2\2\2\65\u00e5\3\2\2\2\67\u00e8\3\2\2\29\u00eb\3\2"+
		"\2\2;\u00ee\3\2\2\2=\u00f1\3\2\2\2?\u00f3\3\2\2\2A\u00f6\3\2\2\2C\u00f9"+
		"\3\2\2\2E\u00fb\3\2\2\2G\u00fd\3\2\2\2I\u00ff\3\2\2\2K\u0101\3\2\2\2M"+
		"\u0103\3\2\2\2O\u0108\3\2\2\2Q\u010a\3\2\2\2S\u010c\3\2\2\2U\u010e\3\2"+
		"\2\2W\u0110\3\2\2\2Y\u0113\3\2\2\2[\u0115\3\2\2\2]\u0117\3\2\2\2_\u0119"+
		"\3\2\2\2a\u011b\3\2\2\2c\u011e\3\2\2\2e\u0120\3\2\2\2g\u0125\3\2\2\2i"+
		"\u012d\3\2\2\2k\u0131\3\2\2\2m\u0138\3\2\2\2o\u013e\3\2\2\2q\u0140\3\2"+
		"\2\2s\u0144\3\2\2\2u\u014a\3\2\2\2w\u015a\3\2\2\2yz\7k\2\2z{\7h\2\2{\4"+
		"\3\2\2\2|}\7g\2\2}~\7n\2\2~\177\7u\2\2\177\u0080\7g\2\2\u0080\6\3\2\2"+
		"\2\u0081\u0082\7d\2\2\u0082\u0083\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085"+
		"\7c\2\2\u0085\u0086\7m\2\2\u0086\b\3\2\2\2\u0087\u0088\7t\2\2\u0088\u0089"+
		"\7g\2\2\u0089\u008a\7v\2\2\u008a\u008b\7w\2\2\u008b\u008c\7t\2\2\u008c"+
		"\u008d\7p\2\2\u008d\n\3\2\2\2\u008e\u008f\7e\2\2\u008f\u0090\7q\2\2\u0090"+
		"\u0091\7p\2\2\u0091\u0092\7v\2\2\u0092\u0093\7k\2\2\u0093\u0094\7p\2\2"+
		"\u0094\u0095\7w\2\2\u0095\u0096\7g\2\2\u0096\f\3\2\2\2\u0097\u0098\7y"+
		"\2\2\u0098\u0099\7j\2\2\u0099\u009a\7k\2\2\u009a\u009b\7n\2\2\u009b\u009c"+
		"\7g\2\2\u009c\16\3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f\7q\2\2\u009f\u00a0"+
		"\7t\2\2\u00a0\20\3\2\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4"+
		"\7y\2\2\u00a4\22\3\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8"+
		"\7v\2\2\u00a8\24\3\2\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac"+
		"\7t\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7i\2\2\u00af"+
		"\26\3\2\2\2\u00b0\u00b1\7d\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7q\2\2\u00b3"+
		"\u00b4\7n\2\2\u00b4\30\3\2\2\2\u00b5\u00b6\7x\2\2\u00b6\u00b7\7q\2\2\u00b7"+
		"\u00b8\7k\2\2\u00b8\u00b9\7f\2\2\u00b9\32\3\2\2\2\u00ba\u00bb\7e\2\2\u00bb"+
		"\u00bc\7n\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7u\2\2"+
		"\u00bf\34\3\2\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7"+
		"w\2\2\u00c3\u00ca\7g\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7"+
		"\7n\2\2\u00c7\u00c8\7u\2\2\u00c8\u00ca\7g\2\2\u00c9\u00c0\3\2\2\2\u00c9"+
		"\u00c4\3\2\2\2\u00ca\36\3\2\2\2\u00cb\u00cc\7-\2\2\u00cc \3\2\2\2\u00cd"+
		"\u00ce\7/\2\2\u00ce\"\3\2\2\2\u00cf\u00d0\7,\2\2\u00d0$\3\2\2\2\u00d1"+
		"\u00d2\7\61\2\2\u00d2&\3\2\2\2\u00d3\u00d4\7\'\2\2\u00d4(\3\2\2\2\u00d5"+
		"\u00d6\7-\2\2\u00d6\u00d7\7-\2\2\u00d7*\3\2\2\2\u00d8\u00d9\7/\2\2\u00d9"+
		"\u00da\7/\2\2\u00da,\3\2\2\2\u00db\u00dc\7@\2\2\u00dc.\3\2\2\2\u00dd\u00de"+
		"\7@\2\2\u00de\u00df\7?\2\2\u00df\60\3\2\2\2\u00e0\u00e1\7>\2\2\u00e1\62"+
		"\3\2\2\2\u00e2\u00e3\7>\2\2\u00e3\u00e4\7?\2\2\u00e4\64\3\2\2\2\u00e5"+
		"\u00e6\7?\2\2\u00e6\u00e7\7?\2\2\u00e7\66\3\2\2\2\u00e8\u00e9\7#\2\2\u00e9"+
		"\u00ea\7?\2\2\u00ea8\3\2\2\2\u00eb\u00ec\7(\2\2\u00ec\u00ed\7(\2\2\u00ed"+
		":\3\2\2\2\u00ee\u00ef\7~\2\2\u00ef\u00f0\7~\2\2\u00f0<\3\2\2\2\u00f1\u00f2"+
		"\7#\2\2\u00f2>\3\2\2\2\u00f3\u00f4\7>\2\2\u00f4\u00f5\7>\2\2\u00f5@\3"+
		"\2\2\2\u00f6\u00f7\7@\2\2\u00f7\u00f8\7@\2\2\u00f8B\3\2\2\2\u00f9\u00fa"+
		"\7\u0080\2\2\u00faD\3\2\2\2\u00fb\u00fc\7(\2\2\u00fcF\3\2\2\2\u00fd\u00fe"+
		"\7~\2\2\u00feH\3\2\2\2\u00ff\u0100\7`\2\2\u0100J\3\2\2\2\u0101\u0102\7"+
		"?\2\2\u0102L\3\2\2\2\u0103\u0104\7p\2\2\u0104\u0105\7w\2\2\u0105\u0106"+
		"\7n\2\2\u0106\u0107\7n\2\2\u0107N\3\2\2\2\u0108\u0109\7.\2\2\u0109P\3"+
		"\2\2\2\u010a\u010b\7=\2\2\u010bR\3\2\2\2\u010c\u010d\7]\2\2\u010dT\3\2"+
		"\2\2\u010e\u010f\7_\2\2\u010fV\3\2\2\2\u0110\u0111\7]\2\2\u0111\u0112"+
		"\7_\2\2\u0112X\3\2\2\2\u0113\u0114\7}\2\2\u0114Z\3\2\2\2\u0115\u0116\7"+
		"\177\2\2\u0116\\\3\2\2\2\u0117\u0118\7*\2\2\u0118^\3\2\2\2\u0119\u011a"+
		"\7+\2\2\u011a`\3\2\2\2\u011b\u011c\7*\2\2\u011c\u011d\7+\2\2\u011db\3"+
		"\2\2\2\u011e\u011f\7\60\2\2\u011fd\3\2\2\2\u0120\u0121\7u\2\2\u0121\u0122"+
		"\7k\2\2\u0122\u0123\7|\2\2\u0123\u0124\7g\2\2\u0124f\3\2\2\2\u0125\u0129"+
		"\t\2\2\2\u0126\u0128\t\3\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012ah\3\2\2\2\u012b\u0129\3\2\2\2"+
		"\u012c\u012e\t\4\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130j\3\2\2\2\u0131\u0133\7$\2\2\u0132\u0134"+
		"\5m\67\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\7$\2\2\u0136l\3\2\2\2\u0137\u0139\5o8\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013bn\3\2\2\2"+
		"\u013c\u013f\n\5\2\2\u013d\u013f\5q9\2\u013e\u013c\3\2\2\2\u013e\u013d"+
		"\3\2\2\2\u013fp\3\2\2\2\u0140\u0141\7^\2\2\u0141\u0142\t\6\2\2\u0142r"+
		"\3\2\2\2\u0143\u0145\7\17\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2"+
		"\u0145\u0146\3\2\2\2\u0146\u0147\7\f\2\2\u0147\u0148\3\2\2\2\u0148\u0149"+
		"\b:\2\2\u0149t\3\2\2\2\u014a\u014b\7\61\2\2\u014b\u014c\7\61\2\2\u014c"+
		"\u0150\3\2\2\2\u014d\u014f\13\2\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3"+
		"\2\2\2\u0150\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0155\7\17\2\2\u0154\u0153\3\2\2\2\u0154\u0155\3"+
		"\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7\f\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\b;\2\2\u0159v\3\2\2\2\u015a\u015b\t\7\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015d\b<\2\2\u015dx\3\2\2\2\f\2\u00c9\u0129\u012f\u0133\u013a\u013e\u0144"+
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