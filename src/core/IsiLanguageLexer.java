// Generated from .\IsiLanguage.g4 by ANTLR 4.13.0

    import datastructures.IsiSymbol;
    import datastructures.IsiVariable;
    import datastructures.IsiSymbolTable;
    import exceptions.IsiSemanticException;
    import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IsiLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, OP_REL=17, 
		TEXTO=18, NUM=19, ID=20, PF=21, VIR=22, PV=23, ATTR=24, AP=25, FP=26, 
		AC=27, FC=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "OP_REL", 
			"TEXTO", "NUM", "ID", "PF", "VIR", "PV", "ATTR", "AP", "FP", "AC", "FC", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog'", "'numero'", "'texto'", "'leia'", "'escreva'", 
			"'se'", "'entao'", "'senao'", "'enquanto'", "'faca'", "'para'", "'+'", 
			"'-'", "'*'", "'/'", null, null, null, null, "'.'", "','", "';'", "':='", 
			"'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "OP_REL", "TEXTO", "NUM", "ID", "PF", "VIR", 
			"PV", "ATTR", "AP", "FP", "AC", "FC", "WS"
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


	    private int _tipo;
	    private String _varName;
	    private String _varValue;
	    private IsiSymbolTable symbolTable = new IsiSymbolTable();
	    private IsiSymbol symbol;

	    public void addID(String id, IsiSymbol symbol) {
	        if (!symbolTable.exists(id)) {
	            symbolTable.add(symbol);
	            System.out.println("Simbolo adicionado " + symbol);
	        } else {
	            throw new IsiSemanticException("Symbo already " + id + " declared");
	        }
	    }

	    public void verifyID(String id) {
	        if (!symbolTable.exists(id)) {
	            throw new IsiSemanticException("Symbol not "+id+" declared");
	        }
	    }


	public IsiLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IsiLanguage.g4"; }

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
		"\u0004\u0000\u001d\u00cf\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u009a\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u00a0\b\u0011\n\u0011\f\u0011\u00a3\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0004\u0012\u00a8\b\u0012\u000b\u0012\f\u0012\u00a9"+
		"\u0001\u0012\u0001\u0012\u0004\u0012\u00ae\b\u0012\u000b\u0012\f\u0012"+
		"\u00af\u0003\u0012\u00b2\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u00b6"+
		"\b\u0013\n\u0013\f\u0013\u00b9\t\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u00a1\u0000\u001d\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		"\u0001\u0000\u0005\u0002\u0000<<>>\u0001\u000009\u0002\u0000AZaz\u0003"+
		"\u000009AZaz\u0003\u0000\t\n\r\r  \u00d8\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0001;\u0001\u0000\u0000\u0000\u0003D\u0001\u0000\u0000\u0000\u0005L"+
		"\u0001\u0000\u0000\u0000\u0007S\u0001\u0000\u0000\u0000\tY\u0001\u0000"+
		"\u0000\u0000\u000b^\u0001\u0000\u0000\u0000\rf\u0001\u0000\u0000\u0000"+
		"\u000fi\u0001\u0000\u0000\u0000\u0011o\u0001\u0000\u0000\u0000\u0013u"+
		"\u0001\u0000\u0000\u0000\u0015~\u0001\u0000\u0000\u0000\u0017\u0083\u0001"+
		"\u0000\u0000\u0000\u0019\u0088\u0001\u0000\u0000\u0000\u001b\u008a\u0001"+
		"\u0000\u0000\u0000\u001d\u008c\u0001\u0000\u0000\u0000\u001f\u008e\u0001"+
		"\u0000\u0000\u0000!\u0099\u0001\u0000\u0000\u0000#\u009b\u0001\u0000\u0000"+
		"\u0000%\u00a7\u0001\u0000\u0000\u0000\'\u00b3\u0001\u0000\u0000\u0000"+
		")\u00ba\u0001\u0000\u0000\u0000+\u00bc\u0001\u0000\u0000\u0000-\u00be"+
		"\u0001\u0000\u0000\u0000/\u00c0\u0001\u0000\u0000\u00001\u00c3\u0001\u0000"+
		"\u0000\u00003\u00c5\u0001\u0000\u0000\u00005\u00c7\u0001\u0000\u0000\u0000"+
		"7\u00c9\u0001\u0000\u0000\u00009\u00cb\u0001\u0000\u0000\u0000;<\u0005"+
		"p\u0000\u0000<=\u0005r\u0000\u0000=>\u0005o\u0000\u0000>?\u0005g\u0000"+
		"\u0000?@\u0005r\u0000\u0000@A\u0005a\u0000\u0000AB\u0005m\u0000\u0000"+
		"BC\u0005a\u0000\u0000C\u0002\u0001\u0000\u0000\u0000DE\u0005f\u0000\u0000"+
		"EF\u0005i\u0000\u0000FG\u0005m\u0000\u0000GH\u0005p\u0000\u0000HI\u0005"+
		"r\u0000\u0000IJ\u0005o\u0000\u0000JK\u0005g\u0000\u0000K\u0004\u0001\u0000"+
		"\u0000\u0000LM\u0005n\u0000\u0000MN\u0005u\u0000\u0000NO\u0005m\u0000"+
		"\u0000OP\u0005e\u0000\u0000PQ\u0005r\u0000\u0000QR\u0005o\u0000\u0000"+
		"R\u0006\u0001\u0000\u0000\u0000ST\u0005t\u0000\u0000TU\u0005e\u0000\u0000"+
		"UV\u0005x\u0000\u0000VW\u0005t\u0000\u0000WX\u0005o\u0000\u0000X\b\u0001"+
		"\u0000\u0000\u0000YZ\u0005l\u0000\u0000Z[\u0005e\u0000\u0000[\\\u0005"+
		"i\u0000\u0000\\]\u0005a\u0000\u0000]\n\u0001\u0000\u0000\u0000^_\u0005"+
		"e\u0000\u0000_`\u0005s\u0000\u0000`a\u0005c\u0000\u0000ab\u0005r\u0000"+
		"\u0000bc\u0005e\u0000\u0000cd\u0005v\u0000\u0000de\u0005a\u0000\u0000"+
		"e\f\u0001\u0000\u0000\u0000fg\u0005s\u0000\u0000gh\u0005e\u0000\u0000"+
		"h\u000e\u0001\u0000\u0000\u0000ij\u0005e\u0000\u0000jk\u0005n\u0000\u0000"+
		"kl\u0005t\u0000\u0000lm\u0005a\u0000\u0000mn\u0005o\u0000\u0000n\u0010"+
		"\u0001\u0000\u0000\u0000op\u0005s\u0000\u0000pq\u0005e\u0000\u0000qr\u0005"+
		"n\u0000\u0000rs\u0005a\u0000\u0000st\u0005o\u0000\u0000t\u0012\u0001\u0000"+
		"\u0000\u0000uv\u0005e\u0000\u0000vw\u0005n\u0000\u0000wx\u0005q\u0000"+
		"\u0000xy\u0005u\u0000\u0000yz\u0005a\u0000\u0000z{\u0005n\u0000\u0000"+
		"{|\u0005t\u0000\u0000|}\u0005o\u0000\u0000}\u0014\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005f\u0000\u0000\u007f\u0080\u0005a\u0000\u0000\u0080\u0081"+
		"\u0005c\u0000\u0000\u0081\u0082\u0005a\u0000\u0000\u0082\u0016\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005p\u0000\u0000\u0084\u0085\u0005a\u0000\u0000"+
		"\u0085\u0086\u0005r\u0000\u0000\u0086\u0087\u0005a\u0000\u0000\u0087\u0018"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005+\u0000\u0000\u0089\u001a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005-\u0000\u0000\u008b\u001c\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005*\u0000\u0000\u008d\u001e\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005/\u0000\u0000\u008f \u0001\u0000\u0000\u0000\u0090"+
		"\u009a\u0007\u0000\u0000\u0000\u0091\u0092\u0005<\u0000\u0000\u0092\u009a"+
		"\u0005=\u0000\u0000\u0093\u0094\u0005>\u0000\u0000\u0094\u009a\u0005="+
		"\u0000\u0000\u0095\u0096\u0005!\u0000\u0000\u0096\u009a\u0005=\u0000\u0000"+
		"\u0097\u0098\u0005=\u0000\u0000\u0098\u009a\u0005=\u0000\u0000\u0099\u0090"+
		"\u0001\u0000\u0000\u0000\u0099\u0091\u0001\u0000\u0000\u0000\u0099\u0093"+
		"\u0001\u0000\u0000\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u009a\"\u0001\u0000\u0000\u0000\u009b\u00a1\u0005"+
		"\"\u0000\u0000\u009c\u009d\u0005\\\u0000\u0000\u009d\u00a0\u0005\"\u0000"+
		"\u0000\u009e\u00a0\t\u0000\u0000\u0000\u009f\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0005\"\u0000\u0000\u00a5$\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a8\u0007\u0001\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00b1\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ad\u0005.\u0000\u0000\u00ac\u00ae\u0007\u0001\u0000\u0000\u00ad\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b1\u00ab\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b2&\u0001\u0000\u0000\u0000\u00b3\u00b7\u0007"+
		"\u0002\u0000\u0000\u00b4\u00b6\u0007\u0003\u0000\u0000\u00b5\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8(\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005.\u0000"+
		"\u0000\u00bb*\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005,\u0000\u0000\u00bd"+
		",\u0001\u0000\u0000\u0000\u00be\u00bf\u0005;\u0000\u0000\u00bf.\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0005:\u0000\u0000\u00c1\u00c2\u0005=\u0000"+
		"\u0000\u00c20\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005(\u0000\u0000\u00c4"+
		"2\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005)\u0000\u0000\u00c64\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0005{\u0000\u0000\u00c86\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0005}\u0000\u0000\u00ca8\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0007\u0004\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0006\u001c\u0000\u0000\u00ce:\u0001\u0000\u0000\u0000\t\u0000"+
		"\u0099\u009f\u00a1\u00a9\u00af\u00b1\u00b5\u00b7\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}