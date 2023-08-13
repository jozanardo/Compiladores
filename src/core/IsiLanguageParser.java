// Generated from .\IsiLanguage.g4 by ANTLR 4.13.0

    import datastructures.IsiSymbol;
    import datastructures.IsiVariable;
    import datastructures.IsiSymbolTable;
    import exceptions.IsiSemanticException;
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IsiLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, OP_REL=17, 
		TEXTO=18, NUM=19, ID=20, PF=21, VIR=22, PV=23, ATTR=24, AP=25, FP=26, 
		AC=27, FC=28, WS=29;
	public static final int
		RULE_programa = 0, RULE_declara = 1, RULE_declaravar = 2, RULE_tipo = 3, 
		RULE_bloco = 4, RULE_cmd = 5, RULE_cmdLeitura = 6, RULE_cmdEscrita = 7, 
		RULE_cmdIf = 8, RULE_cmdWhile = 9, RULE_cmdDoWhile = 10, RULE_cmdFor = 11, 
		RULE_forExpr = 12, RULE_condicao = 13, RULE_cmdExpr = 14, RULE_expr = 15, 
		RULE_exprl = 16, RULE_termo = 17, RULE_termol = 18, RULE_fator = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declara", "declaravar", "tipo", "bloco", "cmd", "cmdLeitura", 
			"cmdEscrita", "cmdIf", "cmdWhile", "cmdDoWhile", "cmdFor", "forExpr", 
			"condicao", "cmdExpr", "expr", "exprl", "termo", "termol", "fator"
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

	@Override
	public String getGrammarFileName() { return "IsiLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public IsiLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaraContext declara() {
			return getRuleContext(DeclaraContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode PF() { return getToken(IsiLanguageParser.PF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
			declara();
			setState(42);
			bloco();
			setState(43);
			match(T__1);
			setState(44);
			match(PF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaraContext extends ParserRuleContext {
		public List<DeclaravarContext> declaravar() {
			return getRuleContexts(DeclaravarContext.class);
		}
		public DeclaravarContext declaravar(int i) {
			return getRuleContext(DeclaravarContext.class,i);
		}
		public DeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterDeclara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitDeclara(this);
		}
	}

	public final DeclaraContext declara() throws RecognitionException {
		DeclaraContext _localctx = new DeclaraContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				declaravar();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==T__3 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaravarContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(IsiLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLanguageParser.ID, i);
		}
		public TerminalNode PF() { return getToken(IsiLanguageParser.PF, 0); }
		public List<TerminalNode> VIR() { return getTokens(IsiLanguageParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(IsiLanguageParser.VIR, i);
		}
		public DeclaravarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaravar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterDeclaravar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitDeclaravar(this);
		}
	}

	public final DeclaravarContext declaravar() throws RecognitionException {
		DeclaravarContext _localctx = new DeclaravarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaravar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			tipo();
			setState(52);
			match(ID);

			                _varName = _input.LT(-1).getText();
			                _varValue = null;
			                symbol = new IsiVariable(_varName, _tipo, _varValue);
			                addID(_varValue, symbol);
			            
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(54);
				match(VIR);
				setState(55);
				match(ID);

				                _varName = _input.LT(-1).getText();
				                _varValue = null;
				                symbol = new IsiVariable(_varName, _tipo, _varValue);
				                addID(_varValue, symbol);
				            
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(PF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(T__2);
				 _tipo = IsiVariable.NUMBER; 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(T__3);
				 _tipo = IsiVariable.TEXT; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				cmd();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1055968L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdLeituraContext cmdLeitura() {
			return getRuleContext(CmdLeituraContext.class,0);
		}
		public CmdEscritaContext cmdEscrita() {
			return getRuleContext(CmdEscritaContext.class,0);
		}
		public CmdExprContext cmdExpr() {
			return getRuleContext(CmdExprContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdDoWhileContext cmdDoWhile() {
			return getRuleContext(CmdDoWhileContext.class,0);
		}
		public CmdForContext cmdFor() {
			return getRuleContext(CmdForContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				cmdLeitura();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				cmdEscrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				cmdExpr();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				cmdIf();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				cmdWhile();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				cmdDoWhile();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				cmdFor();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdLeituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLanguageParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
		public TerminalNode FP() { return getToken(IsiLanguageParser.FP, 0); }
		public TerminalNode PF() { return getToken(IsiLanguageParser.PF, 0); }
		public CmdLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterCmdLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitCmdLeitura(this);
		}
	}

	public final CmdLeituraContext cmdLeitura() throws RecognitionException {
		CmdLeituraContext _localctx = new CmdLeituraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdLeitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__4);
			setState(85);
			match(AP);
			setState(86);
			match(ID);
			 verifyID(_input.LT(-1).getText()); 
			setState(88);
			match(FP);
			setState(89);
			match(PF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdEscritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(IsiLanguageParser.FP, 0); }
		public TerminalNode PF() { return getToken(IsiLanguageParser.PF, 0); }
		public TerminalNode TEXTO() { return getToken(IsiLanguageParser.TEXTO, 0); }
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
		public CmdEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterCmdEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitCmdEscrita(this);
		}
	}

	public final CmdEscritaContext cmdEscrita() throws RecognitionException {
		CmdEscritaContext _localctx = new CmdEscritaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdEscrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__5);
			setState(92);
			match(AP);
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				{
				setState(93);
				match(TEXTO);
				}
				break;
			case ID:
				{
				setState(94);
				match(ID);
				 verifyID(_input.LT(-1).getText()); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(98);
			match(FP);
			setState(99);
			match(PF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLanguageParser.AP, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLanguageParser.FP, 0); }
		public List<TerminalNode> AC() { return getTokens(IsiLanguageParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(IsiLanguageParser.AC, i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<TerminalNode> FC() { return getTokens(IsiLanguageParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(IsiLanguageParser.FC, i);
		}
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitCmdIf(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__6);
			setState(102);
			match(AP);
			setState(103);
			condicao();
			setState(104);
			match(FP);
			setState(105);
			match(T__7);
			setState(106);
			match(AC);
			setState(107);
			bloco();
			setState(108);
			match(FC);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(109);
				match(T__8);
				setState(110);
				match(AC);
				setState(111);
				bloco();
				setState(112);
				match(FC);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLanguageParser.AP, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLanguageParser.FP, 0); }
		public TerminalNode AC() { return getToken(IsiLanguageParser.AC, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FC() { return getToken(IsiLanguageParser.FC, 0); }
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__9);
			setState(117);
			match(AP);
			setState(118);
			condicao();
			setState(119);
			match(FP);
			setState(120);
			match(AC);
			setState(121);
			bloco();
			setState(122);
			match(FC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdDoWhileContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(IsiLanguageParser.AC, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FC() { return getToken(IsiLanguageParser.FC, 0); }
		public TerminalNode AP() { return getToken(IsiLanguageParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP_REL() { return getToken(IsiLanguageParser.OP_REL, 0); }
		public TerminalNode FP() { return getToken(IsiLanguageParser.FP, 0); }
		public CmdDoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDoWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterCmdDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitCmdDoWhile(this);
		}
	}

	public final CmdDoWhileContext cmdDoWhile() throws RecognitionException {
		CmdDoWhileContext _localctx = new CmdDoWhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdDoWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__10);
			setState(125);
			match(AC);
			setState(126);
			bloco();
			setState(127);
			match(FC);
			setState(128);
			match(T__9);
			setState(129);
			match(AP);
			setState(130);
			expr();
			setState(131);
			match(OP_REL);
			setState(132);
			expr();
			setState(133);
			match(FP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdForContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(IsiLanguageParser.FP, 0); }
		public TerminalNode AC() { return getToken(IsiLanguageParser.AC, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FC() { return getToken(IsiLanguageParser.FC, 0); }
		public List<ForExprContext> forExpr() {
			return getRuleContexts(ForExprContext.class);
		}
		public ForExprContext forExpr(int i) {
			return getRuleContext(ForExprContext.class,i);
		}
		public List<TerminalNode> PV() { return getTokens(IsiLanguageParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(IsiLanguageParser.PV, i);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public CmdForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterCmdFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitCmdFor(this);
		}
	}

	public final CmdForContext cmdFor() throws RecognitionException {
		CmdForContext _localctx = new CmdForContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__11);
			setState(136);
			match(AP);
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(137);
				forExpr();
				}
				break;
			}
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(140);
				match(PV);
				}
				break;
			}
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(143);
				condicao();
				}
				break;
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(146);
				match(PV);
				}
			}

			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(149);
				forExpr();
				}
			}

			setState(152);
			match(FP);
			setState(153);
			match(AC);
			setState(154);
			bloco();
			setState(155);
			match(FC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(IsiLanguageParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterForExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitForExpr(this);
		}
	}

	public final ForExprContext forExpr() throws RecognitionException {
		ForExprContext _localctx = new ForExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ID);
			 verifyID(_input.LT(-1).getText()); 
			setState(159);
			match(ATTR);
			setState(160);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP_REL() { return getToken(IsiLanguageParser.OP_REL, 0); }
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			expr();
			setState(163);
			match(OP_REL);
			setState(164);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(IsiLanguageParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PF() { return getToken(IsiLanguageParser.PF, 0); }
		public CmdExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterCmdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitCmdExpr(this);
		}
	}

	public final CmdExprContext cmdExpr() throws RecognitionException {
		CmdExprContext _localctx = new CmdExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmdExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ID);
			 verifyID(_input.LT(-1).getText()); 
			setState(168);
			match(ATTR);
			setState(169);
			expr();
			setState(170);
			match(PF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public ExprlContext exprl() {
			return getRuleContext(ExprlContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			termo();
			setState(173);
			exprl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprlContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<ExprlContext> exprl() {
			return getRuleContexts(ExprlContext.class);
		}
		public ExprlContext exprl(int i) {
			return getRuleContext(ExprlContext.class,i);
		}
		public ExprlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterExprl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitExprl(this);
		}
	}

	public final ExprlContext exprl() throws RecognitionException {
		ExprlContext _localctx = new ExprlContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprl);
		try {
			int _alt;
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(175);
						match(T__12);
						setState(176);
						termo();
						setState(177);
						exprl();
						}
						} 
					}
					setState(183);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(184);
						match(T__13);
						setState(185);
						termo();
						setState(186);
						exprl();
						}
						} 
					}
					setState(192);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TermolContext termol() {
			return getRuleContext(TermolContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			fator();
			setState(196);
			termol();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermolContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TermolContext> termol() {
			return getRuleContexts(TermolContext.class);
		}
		public TermolContext termol(int i) {
			return getRuleContext(TermolContext.class,i);
		}
		public TermolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterTermol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitTermol(this);
		}
	}

	public final TermolContext termol() throws RecognitionException {
		TermolContext _localctx = new TermolContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_termol);
		try {
			int _alt;
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(198);
						match(T__14);
						setState(199);
						fator();
						setState(200);
						termol();
						}
						} 
					}
					setState(206);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(207);
						match(T__15);
						setState(208);
						fator();
						setState(209);
						termol();
						}
						} 
					}
					setState(215);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(IsiLanguageParser.NUM, 0); }
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
		public TerminalNode AP() { return getToken(IsiLanguageParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLanguageParser.FP, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fator);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(ID);
				 verifyID(_input.LT(-1).getText()); 
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(AP);
				setState(222);
				expr();
				setState(223);
				match(FP);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u00e4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u00010\b\u0001\u000b"+
		"\u0001\f\u00011\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002:\b\u0002\n\u0002\f\u0002=\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003E\b\u0003\u0001\u0004\u0004\u0004H\b\u0004\u000b\u0004\f\u0004I"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005S\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007a\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bs\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008b\b\u000b"+
		"\u0001\u000b\u0003\u000b\u008e\b\u000b\u0001\u000b\u0003\u000b\u0091\b"+
		"\u000b\u0001\u000b\u0003\u000b\u0094\b\u000b\u0001\u000b\u0003\u000b\u0097"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00b4\b\u0010\n\u0010\f\u0010\u00b7\t\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00bd\b\u0010\n\u0010"+
		"\f\u0010\u00c0\t\u0010\u0003\u0010\u00c2\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00cb\b\u0012\n\u0012\f\u0012\u00ce\t\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u00d4\b\u0012\n\u0012\f\u0012\u00d7\t\u0012"+
		"\u0003\u0012\u00d9\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00e2\b\u0013\u0001\u0013"+
		"\u0000\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0000\u00e8\u0000(\u0001\u0000"+
		"\u0000\u0000\u0002/\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000\u0000"+
		"\u0006D\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000\u0000\nR\u0001\u0000"+
		"\u0000\u0000\fT\u0001\u0000\u0000\u0000\u000e[\u0001\u0000\u0000\u0000"+
		"\u0010e\u0001\u0000\u0000\u0000\u0012t\u0001\u0000\u0000\u0000\u0014|"+
		"\u0001\u0000\u0000\u0000\u0016\u0087\u0001\u0000\u0000\u0000\u0018\u009d"+
		"\u0001\u0000\u0000\u0000\u001a\u00a2\u0001\u0000\u0000\u0000\u001c\u00a6"+
		"\u0001\u0000\u0000\u0000\u001e\u00ac\u0001\u0000\u0000\u0000 \u00c1\u0001"+
		"\u0000\u0000\u0000\"\u00c3\u0001\u0000\u0000\u0000$\u00d8\u0001\u0000"+
		"\u0000\u0000&\u00e1\u0001\u0000\u0000\u0000()\u0005\u0001\u0000\u0000"+
		")*\u0003\u0002\u0001\u0000*+\u0003\b\u0004\u0000+,\u0005\u0002\u0000\u0000"+
		",-\u0005\u0015\u0000\u0000-\u0001\u0001\u0000\u0000\u0000.0\u0003\u0004"+
		"\u0002\u0000/.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000"+
		"\u000034\u0003\u0006\u0003\u000045\u0005\u0014\u0000\u00005;\u0006\u0002"+
		"\uffff\uffff\u000067\u0005\u0016\u0000\u000078\u0005\u0014\u0000\u0000"+
		"8:\u0006\u0002\uffff\uffff\u000096\u0001\u0000\u0000\u0000:=\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>?\u0005\u0015\u0000\u0000"+
		"?\u0005\u0001\u0000\u0000\u0000@A\u0005\u0003\u0000\u0000AE\u0006\u0003"+
		"\uffff\uffff\u0000BC\u0005\u0004\u0000\u0000CE\u0006\u0003\uffff\uffff"+
		"\u0000D@\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000E\u0007\u0001"+
		"\u0000\u0000\u0000FH\u0003\n\u0005\u0000GF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"J\t\u0001\u0000\u0000\u0000KS\u0003\f\u0006\u0000LS\u0003\u000e\u0007"+
		"\u0000MS\u0003\u001c\u000e\u0000NS\u0003\u0010\b\u0000OS\u0003\u0012\t"+
		"\u0000PS\u0003\u0014\n\u0000QS\u0003\u0016\u000b\u0000RK\u0001\u0000\u0000"+
		"\u0000RL\u0001\u0000\u0000\u0000RM\u0001\u0000\u0000\u0000RN\u0001\u0000"+
		"\u0000\u0000RO\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001"+
		"\u0000\u0000\u0000S\u000b\u0001\u0000\u0000\u0000TU\u0005\u0005\u0000"+
		"\u0000UV\u0005\u0019\u0000\u0000VW\u0005\u0014\u0000\u0000WX\u0006\u0006"+
		"\uffff\uffff\u0000XY\u0005\u001a\u0000\u0000YZ\u0005\u0015\u0000\u0000"+
		"Z\r\u0001\u0000\u0000\u0000[\\\u0005\u0006\u0000\u0000\\`\u0005\u0019"+
		"\u0000\u0000]a\u0005\u0012\u0000\u0000^_\u0005\u0014\u0000\u0000_a\u0006"+
		"\u0007\uffff\uffff\u0000`]\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bc\u0005\u001a\u0000\u0000cd\u0005\u0015"+
		"\u0000\u0000d\u000f\u0001\u0000\u0000\u0000ef\u0005\u0007\u0000\u0000"+
		"fg\u0005\u0019\u0000\u0000gh\u0003\u001a\r\u0000hi\u0005\u001a\u0000\u0000"+
		"ij\u0005\b\u0000\u0000jk\u0005\u001b\u0000\u0000kl\u0003\b\u0004\u0000"+
		"lr\u0005\u001c\u0000\u0000mn\u0005\t\u0000\u0000no\u0005\u001b\u0000\u0000"+
		"op\u0003\b\u0004\u0000pq\u0005\u001c\u0000\u0000qs\u0001\u0000\u0000\u0000"+
		"rm\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u0011\u0001\u0000"+
		"\u0000\u0000tu\u0005\n\u0000\u0000uv\u0005\u0019\u0000\u0000vw\u0003\u001a"+
		"\r\u0000wx\u0005\u001a\u0000\u0000xy\u0005\u001b\u0000\u0000yz\u0003\b"+
		"\u0004\u0000z{\u0005\u001c\u0000\u0000{\u0013\u0001\u0000\u0000\u0000"+
		"|}\u0005\u000b\u0000\u0000}~\u0005\u001b\u0000\u0000~\u007f\u0003\b\u0004"+
		"\u0000\u007f\u0080\u0005\u001c\u0000\u0000\u0080\u0081\u0005\n\u0000\u0000"+
		"\u0081\u0082\u0005\u0019\u0000\u0000\u0082\u0083\u0003\u001e\u000f\u0000"+
		"\u0083\u0084\u0005\u0011\u0000\u0000\u0084\u0085\u0003\u001e\u000f\u0000"+
		"\u0085\u0086\u0005\u001a\u0000\u0000\u0086\u0015\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005\f\u0000\u0000\u0088\u008a\u0005\u0019\u0000\u0000\u0089"+
		"\u008b\u0003\u0018\f\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008e"+
		"\u0005\u0017\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u0091"+
		"\u0003\u001a\r\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u0094\u0005"+
		"\u0017\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0097\u0003"+
		"\u0018\f\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u001a"+
		"\u0000\u0000\u0099\u009a\u0005\u001b\u0000\u0000\u009a\u009b\u0003\b\u0004"+
		"\u0000\u009b\u009c\u0005\u001c\u0000\u0000\u009c\u0017\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\u0014\u0000\u0000\u009e\u009f\u0006\f\uffff\uffff"+
		"\u0000\u009f\u00a0\u0005\u0018\u0000\u0000\u00a0\u00a1\u0003\u001e\u000f"+
		"\u0000\u00a1\u0019\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003\u001e\u000f"+
		"\u0000\u00a3\u00a4\u0005\u0011\u0000\u0000\u00a4\u00a5\u0003\u001e\u000f"+
		"\u0000\u00a5\u001b\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0014\u0000"+
		"\u0000\u00a7\u00a8\u0006\u000e\uffff\uffff\u0000\u00a8\u00a9\u0005\u0018"+
		"\u0000\u0000\u00a9\u00aa\u0003\u001e\u000f\u0000\u00aa\u00ab\u0005\u0015"+
		"\u0000\u0000\u00ab\u001d\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003\"\u0011"+
		"\u0000\u00ad\u00ae\u0003 \u0010\u0000\u00ae\u001f\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005\r\u0000\u0000\u00b0\u00b1\u0003\"\u0011\u0000\u00b1"+
		"\u00b2\u0003 \u0010\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00af"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00c2"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0005\u000e\u0000\u0000\u00b9\u00ba\u0003\"\u0011\u0000\u00ba\u00bb\u0003"+
		" \u0010\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00b8\u0001\u0000"+
		"\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00b5\u0001\u0000"+
		"\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c2!\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0003&\u0013\u0000\u00c4\u00c5\u0003$\u0012\u0000\u00c5"+
		"#\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u000f\u0000\u0000\u00c7\u00c8"+
		"\u0003&\u0013\u0000\u00c8\u00c9\u0003$\u0012\u0000\u00c9\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c6\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000"+
		"\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cd\u00d9\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0005\u0010\u0000\u0000\u00d0\u00d1\u0003&\u0013"+
		"\u0000\u00d1\u00d2\u0003$\u0012\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d3\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d8\u00cc\u0001\u0000\u0000\u0000\u00d8\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d9%\u0001\u0000\u0000\u0000\u00da\u00e2\u0005\u0013\u0000\u0000\u00db"+
		"\u00dc\u0005\u0014\u0000\u0000\u00dc\u00e2\u0006\u0013\uffff\uffff\u0000"+
		"\u00dd\u00de\u0005\u0019\u0000\u0000\u00de\u00df\u0003\u001e\u000f\u0000"+
		"\u00df\u00e0\u0005\u001a\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e1\u00da\u0001\u0000\u0000\u0000\u00e1\u00db\u0001\u0000\u0000\u0000"+
		"\u00e1\u00dd\u0001\u0000\u0000\u0000\u00e2\'\u0001\u0000\u0000\u0000\u0013"+
		"1;DIR`r\u008a\u008d\u0090\u0093\u0096\u00b5\u00be\u00c1\u00cc\u00d5\u00d8"+
		"\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}