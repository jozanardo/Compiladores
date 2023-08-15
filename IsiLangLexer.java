// Generated from IsiLang.g4 by ANTLR 4.7.1

	import br.com.professorisidro.isilanguage.datastructures.IsiSymbol;
	import br.com.professorisidro.isilanguage.datastructures.IsiVariable;
	import br.com.professorisidro.isilanguage.datastructures.IsiSymbolTable;
	import br.com.professorisidro.isilanguage.exceptions.IsiSemanticException;
	import br.com.professorisidro.isilanguage.ast.IsiProgram;
	import br.com.professorisidro.isilanguage.ast.AbstractCommand;
	import br.com.professorisidro.isilanguage.ast.CommandLeitura;
	import br.com.professorisidro.isilanguage.ast.CommandEscrita;
	import br.com.professorisidro.isilanguage.ast.CommandAtribuicao;
	import br.com.professorisidro.isilanguage.ast.CommandDecisao;
	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "OP_REL", 
		"TEXTO", "NUM", "ID", "PF", "VIR", "PV", "ATTR", "AP", "FP", "AC", "FC", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'fimprog'", "'numero'", "'texto'", "'leia'", "'escreva'", 
		"'se'", "'entao'", "'senao'", "'enquanto'", "'faca'", "'para'", "'+'", 
		"'-'", "'*'", "'/'", null, null, null, null, "'.'", "','", "';'", "':='", 
		"'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "OP_REL", "TEXTO", "NUM", "ID", "PF", "VIR", 
		"PV", "ATTR", "AP", "FP", "AC", "FC", "WS"
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


		private int _tipo;
		private String _varName;
		private String _varValue;
		private IsiSymbolTable symbolTable = new IsiSymbolTable();
		private IsiSymbol symbol;
		private IsiProgram program = new IsiProgram();
		private ArrayList<AbstractCommand> curThread;
		private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
		private String _readID;
		private String _writeID;
		private String _exprID;
		private String _exprContent;
		private String _exprDecision;
		private ArrayList<AbstractCommand> listaTrue;
		private ArrayList<AbstractCommand> listaFalse;
		
		public void addID(String id, IsiSymbol symbol) {
	    	
	        if (!symbolTable.exists(id)) {
	            symbolTable.add(symbol);
	            System.out.println("Simbolo adicionado " + symbol);
	        } else {
	            throw new IsiSemanticException("Symbol "+ id + " already declared");
	        }
	    }

	    public void verifyID(String id) {
	        if (!symbolTable.exists(id)) {
	            throw new IsiSemanticException("Symbol "+ id + " already declared");
	        }
	    }
		
		public void showComands(){
			for (AbstractCommand c: program.getComandos()){
				System.out.println(c);
			}
		}
		
		public void generateCode(){
			program.generateTarget();
		}


	public IsiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00d1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u009c\n\22\3\23\3\23\3\23"+
		"\3\23\7\23\u00a2\n\23\f\23\16\23\u00a5\13\23\3\23\3\23\3\24\6\24\u00aa"+
		"\n\24\r\24\16\24\u00ab\3\24\3\24\6\24\u00b0\n\24\r\24\16\24\u00b1\5\24"+
		"\u00b4\n\24\3\25\3\25\7\25\u00b8\n\25\f\25\16\25\u00bb\13\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\u00a3\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37\3\2\7\4\2>>@@\3\2\62;\4\2C\\c|\5"+
		"\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u00da\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5F\3\2\2\2\7N\3"+
		"\2\2\2\tU\3\2\2\2\13[\3\2\2\2\r`\3\2\2\2\17h\3\2\2\2\21k\3\2\2\2\23q\3"+
		"\2\2\2\25w\3\2\2\2\27\u0080\3\2\2\2\31\u0085\3\2\2\2\33\u008a\3\2\2\2"+
		"\35\u008c\3\2\2\2\37\u008e\3\2\2\2!\u0090\3\2\2\2#\u009b\3\2\2\2%\u009d"+
		"\3\2\2\2\'\u00a9\3\2\2\2)\u00b5\3\2\2\2+\u00bc\3\2\2\2-\u00be\3\2\2\2"+
		"/\u00c0\3\2\2\2\61\u00c2\3\2\2\2\63\u00c5\3\2\2\2\65\u00c7\3\2\2\2\67"+
		"\u00c9\3\2\2\29\u00cb\3\2\2\2;\u00cd\3\2\2\2=>\7r\2\2>?\7t\2\2?@\7q\2"+
		"\2@A\7i\2\2AB\7t\2\2BC\7c\2\2CD\7o\2\2DE\7c\2\2E\4\3\2\2\2FG\7h\2\2GH"+
		"\7k\2\2HI\7o\2\2IJ\7r\2\2JK\7t\2\2KL\7q\2\2LM\7i\2\2M\6\3\2\2\2NO\7p\2"+
		"\2OP\7w\2\2PQ\7o\2\2QR\7g\2\2RS\7t\2\2ST\7q\2\2T\b\3\2\2\2UV\7v\2\2VW"+
		"\7g\2\2WX\7z\2\2XY\7v\2\2YZ\7q\2\2Z\n\3\2\2\2[\\\7n\2\2\\]\7g\2\2]^\7"+
		"k\2\2^_\7c\2\2_\f\3\2\2\2`a\7g\2\2ab\7u\2\2bc\7e\2\2cd\7t\2\2de\7g\2\2"+
		"ef\7x\2\2fg\7c\2\2g\16\3\2\2\2hi\7u\2\2ij\7g\2\2j\20\3\2\2\2kl\7g\2\2"+
		"lm\7p\2\2mn\7v\2\2no\7c\2\2op\7q\2\2p\22\3\2\2\2qr\7u\2\2rs\7g\2\2st\7"+
		"p\2\2tu\7c\2\2uv\7q\2\2v\24\3\2\2\2wx\7g\2\2xy\7p\2\2yz\7s\2\2z{\7w\2"+
		"\2{|\7c\2\2|}\7p\2\2}~\7v\2\2~\177\7q\2\2\177\26\3\2\2\2\u0080\u0081\7"+
		"h\2\2\u0081\u0082\7c\2\2\u0082\u0083\7e\2\2\u0083\u0084\7c\2\2\u0084\30"+
		"\3\2\2\2\u0085\u0086\7r\2\2\u0086\u0087\7c\2\2\u0087\u0088\7t\2\2\u0088"+
		"\u0089\7c\2\2\u0089\32\3\2\2\2\u008a\u008b\7-\2\2\u008b\34\3\2\2\2\u008c"+
		"\u008d\7/\2\2\u008d\36\3\2\2\2\u008e\u008f\7,\2\2\u008f \3\2\2\2\u0090"+
		"\u0091\7\61\2\2\u0091\"\3\2\2\2\u0092\u009c\t\2\2\2\u0093\u0094\7>\2\2"+
		"\u0094\u009c\7?\2\2\u0095\u0096\7@\2\2\u0096\u009c\7?\2\2\u0097\u0098"+
		"\7#\2\2\u0098\u009c\7?\2\2\u0099\u009a\7?\2\2\u009a\u009c\7?\2\2\u009b"+
		"\u0092\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0097\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c$\3\2\2\2\u009d\u00a3\7$\2\2\u009e\u009f"+
		"\7^\2\2\u009f\u00a2\7$\2\2\u00a0\u00a2\13\2\2\2\u00a1\u009e\3\2\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7$\2\2\u00a7"+
		"&\3\2\2\2\u00a8\u00aa\t\3\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b3\3\2\2\2\u00ad\u00af"+
		"\7\60\2\2\u00ae\u00b0\t\3\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2"+
		"\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00ad"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4(\3\2\2\2\u00b5\u00b9\t\4\2\2\u00b6"+
		"\u00b8\t\5\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba*\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd"+
		"\7\60\2\2\u00bd,\3\2\2\2\u00be\u00bf\7.\2\2\u00bf.\3\2\2\2\u00c0\u00c1"+
		"\7=\2\2\u00c1\60\3\2\2\2\u00c2\u00c3\7<\2\2\u00c3\u00c4\7?\2\2\u00c4\62"+
		"\3\2\2\2\u00c5\u00c6\7*\2\2\u00c6\64\3\2\2\2\u00c7\u00c8\7+\2\2\u00c8"+
		"\66\3\2\2\2\u00c9\u00ca\7}\2\2\u00ca8\3\2\2\2\u00cb\u00cc\7\177\2\2\u00cc"+
		":\3\2\2\2\u00cd\u00ce\t\6\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b\36\2\2"+
		"\u00d0<\3\2\2\2\13\2\u009b\u00a1\u00a3\u00ab\u00b1\u00b3\u00b7\u00b9\3"+
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