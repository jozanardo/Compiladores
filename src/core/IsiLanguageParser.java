// Generated from .\IsiLanguage.g4 by ANTLR 4.13.0
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, OP_REL=15, TEXTO=16, 
		NUM=17, ID=18, PF=19, AP=20, FP=21, AC=22, FC=23, WS=24;
	public static final int
		RULE_programa = 0, RULE_declara = 1, RULE_bloco = 2, RULE_cmd = 3, RULE_cmdLeitura = 4, 
		RULE_cmdEscrita = 5, RULE_cmdIf = 6, RULE_cmdExpr = 7, RULE_expr = 8, 
		RULE_exprl = 9, RULE_termo = 10, RULE_termol = 11, RULE_fator = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declara", "bloco", "cmd", "cmdLeitura", "cmdEscrita", "cmdIf", 
			"cmdExpr", "expr", "exprl", "termo", "termol", "fator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog'", "'declare'", "','", "'leia'", "'escreva'", 
			"'se'", "'entao'", "'senao'", "':='", "'+'", "'-'", "'*'", "'/'", null, 
			null, null, null, "'.'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "OP_REL", "TEXTO", "NUM", "ID", "PF", "AP", "FP", "AC", 
			"FC", "WS"
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
			setState(26);
			match(T__0);
			setState(27);
			declara();
			setState(28);
			bloco();
			setState(29);
			match(T__1);
			setState(30);
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
		public List<TerminalNode> ID() { return getTokens(IsiLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLanguageParser.ID, i);
		}
		public TerminalNode PF() { return getToken(IsiLanguageParser.PF, 0); }
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
			setState(32);
			match(T__2);
			setState(33);
			match(ID);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(34);
				match(T__3);
				setState(35);
				match(ID);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
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
		enterRule(_localctx, 4, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				cmd();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 262368L) != 0) );
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
		enterRule(_localctx, 6, RULE_cmd);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				cmdLeitura();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				cmdEscrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				cmdExpr();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				cmdIf();
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
		enterRule(_localctx, 8, RULE_cmdLeitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__4);
			setState(55);
			match(AP);
			setState(56);
			match(ID);
			setState(57);
			match(FP);
			setState(58);
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
		enterRule(_localctx, 10, RULE_cmdEscrita);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__5);
			setState(61);
			match(AP);
			setState(62);
			_la = _input.LA(1);
			if ( !(_la==TEXTO || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(63);
			match(FP);
			setState(64);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP_REL() { return getToken(IsiLanguageParser.OP_REL, 0); }
		public TerminalNode FP() { return getToken(IsiLanguageParser.FP, 0); }
		public List<TerminalNode> AC() { return getTokens(IsiLanguageParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(IsiLanguageParser.AC, i);
		}
		public List<TerminalNode> FC() { return getTokens(IsiLanguageParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(IsiLanguageParser.FC, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
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
		enterRule(_localctx, 12, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__6);
			setState(67);
			match(AP);
			setState(68);
			expr();
			setState(69);
			match(OP_REL);
			setState(70);
			expr();
			setState(71);
			match(FP);
			setState(72);
			match(T__7);
			setState(73);
			match(AC);
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				cmd();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 262368L) != 0) );
			setState(79);
			match(FC);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(80);
				match(T__8);
				setState(81);
				match(AC);
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(82);
					cmd();
					}
					}
					setState(85); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 262368L) != 0) );
				setState(87);
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
	public static class CmdExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
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
		enterRule(_localctx, 14, RULE_cmdExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(ID);
			setState(92);
			match(T__9);
			setState(93);
			expr();
			setState(94);
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
		enterRule(_localctx, 16, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			termo();
			setState(97);
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
		enterRule(_localctx, 18, RULE_exprl);
		try {
			int _alt;
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(99);
						match(T__10);
						setState(100);
						termo();
						setState(101);
						exprl();
						}
						} 
					}
					setState(107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(108);
						match(T__11);
						setState(109);
						termo();
						setState(110);
						exprl();
						}
						} 
					}
					setState(116);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 20, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			fator();
			setState(120);
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
		enterRule(_localctx, 22, RULE_termol);
		try {
			int _alt;
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(122);
						match(T__12);
						setState(123);
						fator();
						setState(124);
						termol();
						}
						} 
					}
					setState(130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(131);
						match(T__13);
						setState(132);
						fator();
						setState(133);
						termol();
						}
						} 
					}
					setState(139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 24, RULE_fator);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(ID);
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(AP);
				setState(145);
				expr();
				setState(146);
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
		"\u0004\u0001\u0018\u0097\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001%\b\u0001\n\u0001\f\u0001(\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0004\u0002-\b\u0002\u000b\u0002\f\u0002.\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u00035\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0004\u0006L\b\u0006\u000b\u0006\f\u0006M\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0004\u0006T\b\u0006\u000b\u0006\f\u0006"+
		"U\u0001\u0006\u0001\u0006\u0003\u0006Z\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\th\b\t\n\t\f\tk\t\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\tq\b\t\n\t\f\tt\t\t\u0003\tv\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u007f\b\u000b\n"+
		"\u000b\f\u000b\u0082\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0088\b\u000b\n\u000b\f\u000b\u008b\t\u000b\u0003\u000b"+
		"\u008d\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u0095\b\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u0000\u0001\u0002\u0000\u0010\u0010\u0012\u0012"+
		"\u0099\u0000\u001a\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000"+
		"\u0004,\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000\b6\u0001"+
		"\u0000\u0000\u0000\n<\u0001\u0000\u0000\u0000\fB\u0001\u0000\u0000\u0000"+
		"\u000e[\u0001\u0000\u0000\u0000\u0010`\u0001\u0000\u0000\u0000\u0012u"+
		"\u0001\u0000\u0000\u0000\u0014w\u0001\u0000\u0000\u0000\u0016\u008c\u0001"+
		"\u0000\u0000\u0000\u0018\u0094\u0001\u0000\u0000\u0000\u001a\u001b\u0005"+
		"\u0001\u0000\u0000\u001b\u001c\u0003\u0002\u0001\u0000\u001c\u001d\u0003"+
		"\u0004\u0002\u0000\u001d\u001e\u0005\u0002\u0000\u0000\u001e\u001f\u0005"+
		"\u0013\u0000\u0000\u001f\u0001\u0001\u0000\u0000\u0000 !\u0005\u0003\u0000"+
		"\u0000!&\u0005\u0012\u0000\u0000\"#\u0005\u0004\u0000\u0000#%\u0005\u0012"+
		"\u0000\u0000$\"\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001"+
		"\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000"+
		"(&\u0001\u0000\u0000\u0000)*\u0005\u0013\u0000\u0000*\u0003\u0001\u0000"+
		"\u0000\u0000+-\u0003\u0006\u0003\u0000,+\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		"/\u0005\u0001\u0000\u0000\u000005\u0003\b\u0004\u000015\u0003\n\u0005"+
		"\u000025\u0003\u000e\u0007\u000035\u0003\f\u0006\u000040\u0001\u0000\u0000"+
		"\u000041\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000043\u0001\u0000"+
		"\u0000\u00005\u0007\u0001\u0000\u0000\u000067\u0005\u0005\u0000\u0000"+
		"78\u0005\u0014\u0000\u000089\u0005\u0012\u0000\u00009:\u0005\u0015\u0000"+
		"\u0000:;\u0005\u0013\u0000\u0000;\t\u0001\u0000\u0000\u0000<=\u0005\u0006"+
		"\u0000\u0000=>\u0005\u0014\u0000\u0000>?\u0007\u0000\u0000\u0000?@\u0005"+
		"\u0015\u0000\u0000@A\u0005\u0013\u0000\u0000A\u000b\u0001\u0000\u0000"+
		"\u0000BC\u0005\u0007\u0000\u0000CD\u0005\u0014\u0000\u0000DE\u0003\u0010"+
		"\b\u0000EF\u0005\u000f\u0000\u0000FG\u0003\u0010\b\u0000GH\u0005\u0015"+
		"\u0000\u0000HI\u0005\b\u0000\u0000IK\u0005\u0016\u0000\u0000JL\u0003\u0006"+
		"\u0003\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OY\u0005\u0017\u0000\u0000PQ\u0005\t\u0000\u0000QS\u0005\u0016\u0000\u0000"+
		"RT\u0003\u0006\u0003\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WX\u0005\u0017\u0000\u0000XZ\u0001\u0000\u0000\u0000YP\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\r\u0001\u0000\u0000\u0000"+
		"[\\\u0005\u0012\u0000\u0000\\]\u0005\n\u0000\u0000]^\u0003\u0010\b\u0000"+
		"^_\u0005\u0013\u0000\u0000_\u000f\u0001\u0000\u0000\u0000`a\u0003\u0014"+
		"\n\u0000ab\u0003\u0012\t\u0000b\u0011\u0001\u0000\u0000\u0000cd\u0005"+
		"\u000b\u0000\u0000de\u0003\u0014\n\u0000ef\u0003\u0012\t\u0000fh\u0001"+
		"\u0000\u0000\u0000gc\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jv\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000lm\u0005\f\u0000\u0000mn\u0003\u0014\n"+
		"\u0000no\u0003\u0012\t\u0000oq\u0001\u0000\u0000\u0000pl\u0001\u0000\u0000"+
		"\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000ui\u0001"+
		"\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000v\u0013\u0001\u0000\u0000"+
		"\u0000wx\u0003\u0018\f\u0000xy\u0003\u0016\u000b\u0000y\u0015\u0001\u0000"+
		"\u0000\u0000z{\u0005\r\u0000\u0000{|\u0003\u0018\f\u0000|}\u0003\u0016"+
		"\u000b\u0000}\u007f\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000\u0000"+
		"\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081\u008d\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u000e\u0000\u0000\u0084"+
		"\u0085\u0003\u0018\f\u0000\u0085\u0086\u0003\u0016\u000b\u0000\u0086\u0088"+
		"\u0001\u0000\u0000\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0088\u008b"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u0080\u0001\u0000\u0000\u0000\u008c\u0089"+
		"\u0001\u0000\u0000\u0000\u008d\u0017\u0001\u0000\u0000\u0000\u008e\u0095"+
		"\u0005\u0011\u0000\u0000\u008f\u0095\u0005\u0012\u0000\u0000\u0090\u0091"+
		"\u0005\u0014\u0000\u0000\u0091\u0092\u0003\u0010\b\u0000\u0092\u0093\u0005"+
		"\u0015\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u008e\u0001"+
		"\u0000\u0000\u0000\u0094\u008f\u0001\u0000\u0000\u0000\u0094\u0090\u0001"+
		"\u0000\u0000\u0000\u0095\u0019\u0001\u0000\u0000\u0000\r&.4MUYiru\u0080"+
		"\u0089\u008c\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}