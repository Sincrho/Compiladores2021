// Generated from /home/Tecnicas de compilacion/Compiladores2021/src/main/java/Compiladores2021/id.g4 by ANTLR 4.8

package Compiladores2021;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class idLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUNTOCOMA=1, COMA=2, SUMA=3, RESTA=4, DIVISION=5, MULTIPLICACION=6, MODULO=7, 
		INCREMENTAR=8, DECREMENTAR=9, IGUAL=10, IGUALDAD=11, DIFERENCIA=12, MAYOR=13, 
		MENOR=14, MAYORIGUAL=15, MENORIGUAL=16, AND=17, OR=18, NOT=19, PARENIZQ=20, 
		PARENDER=21, LLAVEIZQ=22, LLAVEDER=23, INT=24, FLOAT=25, DOUBLE=26, VOID=27, 
		IRETURN=28, IIF=29, IFOR=30, IWHILE=31, NOMBRE=32, ENTERO=33, WS=34, OTRO=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "PUNTOCOMA", "COMA", "SUMA", "RESTA", "DIVISION", 
			"MULTIPLICACION", "MODULO", "INCREMENTAR", "DECREMENTAR", "IGUAL", "IGUALDAD", 
			"DIFERENCIA", "MAYOR", "MENOR", "MAYORIGUAL", "MENORIGUAL", "AND", "OR", 
			"NOT", "PARENIZQ", "PARENDER", "LLAVEIZQ", "LLAVEDER", "INT", "FLOAT", 
			"DOUBLE", "VOID", "IRETURN", "IIF", "IFOR", "IWHILE", "NOMBRE", "ENTERO", 
			"WS", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'+'", "'-'", "'/'", "'*'", "'%'", "'++'", "'--'", 
			"'='", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", 
			"'!'", "'('", "')'", "'{'", "'}'", "'int'", "'float'", "'double'", "'void'", 
			"'return'", "'if'", "'for'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUNTOCOMA", "COMA", "SUMA", "RESTA", "DIVISION", "MULTIPLICACION", 
			"MODULO", "INCREMENTAR", "DECREMENTAR", "IGUAL", "IGUALDAD", "DIFERENCIA", 
			"MAYOR", "MENOR", "MAYORIGUAL", "MENORIGUAL", "AND", "OR", "NOT", "PARENIZQ", 
			"PARENDER", "LLAVEIZQ", "LLAVEDER", "INT", "FLOAT", "DOUBLE", "VOID", 
			"IRETURN", "IIF", "IFOR", "IWHILE", "NOMBRE", "ENTERO", "WS", "OTRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public idLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "id.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00c4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\6#\u00b3\n#\r#\16#\u00b4\3$\6$\u00b8\n$\r$\16$\u00b9\3%\6%\u00bd"+
		"\n%\r%\16%\u00be\3%\3%\3&\3&\2\2\'\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b"+
		"\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27"+
		"\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%\3\2\6\4\2C\\c|\3"+
		"\2\62;\3\2c|\5\2\13\f\17\17\"\"\2\u00c4\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2"+
		"\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17Y\3\2\2\2\21[\3\2\2\2\23]\3\2\2"+
		"\2\25_\3\2\2\2\27b\3\2\2\2\31e\3\2\2\2\33g\3\2\2\2\35j\3\2\2\2\37m\3\2"+
		"\2\2!o\3\2\2\2#q\3\2\2\2%t\3\2\2\2\'w\3\2\2\2)z\3\2\2\2+}\3\2\2\2-\177"+
		"\3\2\2\2/\u0081\3\2\2\2\61\u0083\3\2\2\2\63\u0085\3\2\2\2\65\u0087\3\2"+
		"\2\2\67\u008b\3\2\2\29\u0091\3\2\2\2;\u0098\3\2\2\2=\u009d\3\2\2\2?\u00a4"+
		"\3\2\2\2A\u00a7\3\2\2\2C\u00ab\3\2\2\2E\u00b2\3\2\2\2G\u00b7\3\2\2\2I"+
		"\u00bc\3\2\2\2K\u00c2\3\2\2\2MN\t\2\2\2N\4\3\2\2\2OP\t\3\2\2P\6\3\2\2"+
		"\2QR\7=\2\2R\b\3\2\2\2ST\7.\2\2T\n\3\2\2\2UV\7-\2\2V\f\3\2\2\2WX\7/\2"+
		"\2X\16\3\2\2\2YZ\7\61\2\2Z\20\3\2\2\2[\\\7,\2\2\\\22\3\2\2\2]^\7\'\2\2"+
		"^\24\3\2\2\2_`\7-\2\2`a\7-\2\2a\26\3\2\2\2bc\7/\2\2cd\7/\2\2d\30\3\2\2"+
		"\2ef\7?\2\2f\32\3\2\2\2gh\7?\2\2hi\7?\2\2i\34\3\2\2\2jk\7#\2\2kl\7?\2"+
		"\2l\36\3\2\2\2mn\7@\2\2n \3\2\2\2op\7>\2\2p\"\3\2\2\2qr\7@\2\2rs\7?\2"+
		"\2s$\3\2\2\2tu\7>\2\2uv\7?\2\2v&\3\2\2\2wx\7(\2\2xy\7(\2\2y(\3\2\2\2z"+
		"{\7~\2\2{|\7~\2\2|*\3\2\2\2}~\7#\2\2~,\3\2\2\2\177\u0080\7*\2\2\u0080"+
		".\3\2\2\2\u0081\u0082\7+\2\2\u0082\60\3\2\2\2\u0083\u0084\7}\2\2\u0084"+
		"\62\3\2\2\2\u0085\u0086\7\177\2\2\u0086\64\3\2\2\2\u0087\u0088\7k\2\2"+
		"\u0088\u0089\7p\2\2\u0089\u008a\7v\2\2\u008a\66\3\2\2\2\u008b\u008c\7"+
		"h\2\2\u008c\u008d\7n\2\2\u008d\u008e\7q\2\2\u008e\u008f\7c\2\2\u008f\u0090"+
		"\7v\2\2\u00908\3\2\2\2\u0091\u0092\7f\2\2\u0092\u0093\7q\2\2\u0093\u0094"+
		"\7w\2\2\u0094\u0095\7d\2\2\u0095\u0096\7n\2\2\u0096\u0097\7g\2\2\u0097"+
		":\3\2\2\2\u0098\u0099\7x\2\2\u0099\u009a\7q\2\2\u009a\u009b\7k\2\2\u009b"+
		"\u009c\7f\2\2\u009c<\3\2\2\2\u009d\u009e\7t\2\2\u009e\u009f\7g\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7p\2\2"+
		"\u00a3>\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7h\2\2\u00a6@\3\2\2\2\u00a7"+
		"\u00a8\7h\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7t\2\2\u00aaB\3\2\2\2\u00ab"+
		"\u00ac\7y\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7n\2\2"+
		"\u00af\u00b0\7g\2\2\u00b0D\3\2\2\2\u00b1\u00b3\t\4\2\2\u00b2\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"F\3\2\2\2\u00b6\u00b8\5\5\3\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00baH\3\2\2\2\u00bb\u00bd\t"+
		"\5\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b%\2\2\u00c1J\3\2\2\2\u00c2"+
		"\u00c3\13\2\2\2\u00c3L\3\2\2\2\6\2\u00b4\u00b9\u00be\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}