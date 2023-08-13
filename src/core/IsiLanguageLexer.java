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
		T__9=10, T__10=11, T__11=12, T__12=13, OP_REL=14, TEXTO=15, NUM=16, ID=17, 
		PF=18, VIR=19, ATTR=20, AP=21, FP=22, AC=23, FC=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "OP_REL", "TEXTO", "NUM", "ID", "PF", 
			"VIR", "ATTR", "AP", "FP", "AC", "FC", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog'", "'numero'", "'texto'", "'leia'", "'escreva'", 
			"'se'", "'entao'", "'senao'", "'+'", "'-'", "'*'", "'/'", null, null, 
			null, null, "'.'", "','", "':='", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "OP_REL", "TEXTO", "NUM", "ID", "PF", "VIR", "ATTR", "AP", 
			"FP", "AC", "FC", "WS"
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

	    public void verificaID(String id) {
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
		"\u0004\u0000\u0019\u00b2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u007f\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0085\b\u000e\n"+
		"\u000e\f\u000e\u0088\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004"+
		"\u000f\u008d\b\u000f\u000b\u000f\f\u000f\u008e\u0001\u000f\u0001\u000f"+
		"\u0004\u000f\u0093\b\u000f\u000b\u000f\f\u000f\u0094\u0003\u000f\u0097"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u009b\b\u0010\n\u0010\f\u0010"+
		"\u009e\t\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0086\u0000\u0019\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u0019\u0001\u0000"+
		"\u0005\u0002\u0000<<>>\u0001\u000009\u0002\u0000AZaz\u0003\u000009AZa"+
		"z\u0003\u0000\t\n\r\r  \u00bb\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u0003<\u0001\u0000\u0000\u0000"+
		"\u0005D\u0001\u0000\u0000\u0000\u0007K\u0001\u0000\u0000\u0000\tQ\u0001"+
		"\u0000\u0000\u0000\u000bV\u0001\u0000\u0000\u0000\r^\u0001\u0000\u0000"+
		"\u0000\u000fa\u0001\u0000\u0000\u0000\u0011g\u0001\u0000\u0000\u0000\u0013"+
		"m\u0001\u0000\u0000\u0000\u0015o\u0001\u0000\u0000\u0000\u0017q\u0001"+
		"\u0000\u0000\u0000\u0019s\u0001\u0000\u0000\u0000\u001b~\u0001\u0000\u0000"+
		"\u0000\u001d\u0080\u0001\u0000\u0000\u0000\u001f\u008c\u0001\u0000\u0000"+
		"\u0000!\u0098\u0001\u0000\u0000\u0000#\u009f\u0001\u0000\u0000\u0000%"+
		"\u00a1\u0001\u0000\u0000\u0000\'\u00a3\u0001\u0000\u0000\u0000)\u00a6"+
		"\u0001\u0000\u0000\u0000+\u00a8\u0001\u0000\u0000\u0000-\u00aa\u0001\u0000"+
		"\u0000\u0000/\u00ac\u0001\u0000\u0000\u00001\u00ae\u0001\u0000\u0000\u0000"+
		"34\u0005p\u0000\u000045\u0005r\u0000\u000056\u0005o\u0000\u000067\u0005"+
		"g\u0000\u000078\u0005r\u0000\u000089\u0005a\u0000\u00009:\u0005m\u0000"+
		"\u0000:;\u0005a\u0000\u0000;\u0002\u0001\u0000\u0000\u0000<=\u0005f\u0000"+
		"\u0000=>\u0005i\u0000\u0000>?\u0005m\u0000\u0000?@\u0005p\u0000\u0000"+
		"@A\u0005r\u0000\u0000AB\u0005o\u0000\u0000BC\u0005g\u0000\u0000C\u0004"+
		"\u0001\u0000\u0000\u0000DE\u0005n\u0000\u0000EF\u0005u\u0000\u0000FG\u0005"+
		"m\u0000\u0000GH\u0005e\u0000\u0000HI\u0005r\u0000\u0000IJ\u0005o\u0000"+
		"\u0000J\u0006\u0001\u0000\u0000\u0000KL\u0005t\u0000\u0000LM\u0005e\u0000"+
		"\u0000MN\u0005x\u0000\u0000NO\u0005t\u0000\u0000OP\u0005o\u0000\u0000"+
		"P\b\u0001\u0000\u0000\u0000QR\u0005l\u0000\u0000RS\u0005e\u0000\u0000"+
		"ST\u0005i\u0000\u0000TU\u0005a\u0000\u0000U\n\u0001\u0000\u0000\u0000"+
		"VW\u0005e\u0000\u0000WX\u0005s\u0000\u0000XY\u0005c\u0000\u0000YZ\u0005"+
		"r\u0000\u0000Z[\u0005e\u0000\u0000[\\\u0005v\u0000\u0000\\]\u0005a\u0000"+
		"\u0000]\f\u0001\u0000\u0000\u0000^_\u0005s\u0000\u0000_`\u0005e\u0000"+
		"\u0000`\u000e\u0001\u0000\u0000\u0000ab\u0005e\u0000\u0000bc\u0005n\u0000"+
		"\u0000cd\u0005t\u0000\u0000de\u0005a\u0000\u0000ef\u0005o\u0000\u0000"+
		"f\u0010\u0001\u0000\u0000\u0000gh\u0005s\u0000\u0000hi\u0005e\u0000\u0000"+
		"ij\u0005n\u0000\u0000jk\u0005a\u0000\u0000kl\u0005o\u0000\u0000l\u0012"+
		"\u0001\u0000\u0000\u0000mn\u0005+\u0000\u0000n\u0014\u0001\u0000\u0000"+
		"\u0000op\u0005-\u0000\u0000p\u0016\u0001\u0000\u0000\u0000qr\u0005*\u0000"+
		"\u0000r\u0018\u0001\u0000\u0000\u0000st\u0005/\u0000\u0000t\u001a\u0001"+
		"\u0000\u0000\u0000u\u007f\u0007\u0000\u0000\u0000vw\u0005<\u0000\u0000"+
		"w\u007f\u0005=\u0000\u0000xy\u0005>\u0000\u0000y\u007f\u0005=\u0000\u0000"+
		"z{\u0005!\u0000\u0000{\u007f\u0005=\u0000\u0000|}\u0005=\u0000\u0000}"+
		"\u007f\u0005=\u0000\u0000~u\u0001\u0000\u0000\u0000~v\u0001\u0000\u0000"+
		"\u0000~x\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000\u007f\u001c\u0001\u0000\u0000\u0000\u0080\u0086\u0005\"\u0000"+
		"\u0000\u0081\u0082\u0005\\\u0000\u0000\u0082\u0085\u0005\"\u0000\u0000"+
		"\u0083\u0085\t\u0000\u0000\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087"+
		"\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005\"\u0000\u0000\u008a\u001e\u0001\u0000\u0000\u0000\u008b\u008d"+
		"\u0007\u0001\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0096\u0001\u0000\u0000\u0000\u0090\u0092"+
		"\u0005.\u0000\u0000\u0091\u0093\u0007\u0001\u0000\u0000\u0092\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001"+
		"\u0000\u0000\u0000\u0096\u0090\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097 \u0001\u0000\u0000\u0000\u0098\u009c\u0007\u0002"+
		"\u0000\u0000\u0099\u009b\u0007\u0003\u0000\u0000\u009a\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\"\u0001\u0000\u0000"+
		"\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005.\u0000\u0000"+
		"\u00a0$\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005,\u0000\u0000\u00a2&"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005:\u0000\u0000\u00a4\u00a5\u0005"+
		"=\u0000\u0000\u00a5(\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005(\u0000"+
		"\u0000\u00a7*\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005)\u0000\u0000\u00a9"+
		",\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005{\u0000\u0000\u00ab.\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005}\u0000\u0000\u00ad0\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0007\u0004\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0006\u0018\u0000\u0000\u00b12\u0001\u0000\u0000\u0000"+
		"\t\u0000~\u0084\u0086\u008e\u0094\u0096\u009a\u009c\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}