// Generated from /home/Tecnicas de compilacion/Compiladores2021/src/main/java/Compiladores2021/id.g4 by ANTLR 4.8

package Compiladores2021;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class idParser extends Parser {
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
	public static final int
		RULE_id = 0, RULE_entero = 1, RULE_tipo = 2, RULE_instrucciones = 3, RULE_instruccion = 4, 
		RULE_declaracion = 5, RULE_declarado = 6, RULE_operando = 7, RULE_asignado = 8, 
		RULE_asignacion = 9, RULE_relacionales = 10, RULE_aritmeticos = 11, RULE_unariosder = 12, 
		RULE_unariosizq = 13, RULE_logicos = 14, RULE_iwhile = 15, RULE_ifor = 16, 
		RULE_iif = 17, RULE_definicionfuncion = 18, RULE_llamadafuncion = 19, 
		RULE_declaracionfuncion = 20, RULE_retorno = 21, RULE_parametros1 = 22, 
		RULE_parametros2 = 23, RULE_bloque = 24, RULE_operacionaritlogi = 25, 
		RULE_operadorbinario = 26, RULE_s = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"id", "entero", "tipo", "instrucciones", "instruccion", "declaracion", 
			"declarado", "operando", "asignado", "asignacion", "relacionales", "aritmeticos", 
			"unariosder", "unariosizq", "logicos", "iwhile", "ifor", "iif", "definicionfuncion", 
			"llamadafuncion", "declaracionfuncion", "retorno", "parametros1", "parametros2", 
			"bloque", "operacionaritlogi", "operadorbinario", "s"
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

	@Override
	public String getGrammarFileName() { return "id.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public idParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode NOMBRE() { return getToken(idParser.NOMBRE, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(NOMBRE);
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

	public static class EnteroContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(idParser.ENTERO, 0); }
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitEntero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitEntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ENTERO);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(idParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(idParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(idParser.DOUBLE, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public DeclaracionfuncionContext declaracionfuncion() {
			return getRuleContext(DeclaracionfuncionContext.class,0);
		}
		public DefinicionfuncionContext definicionfuncion() {
			return getRuleContext(DefinicionfuncionContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instrucciones);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				instruccion();
				setState(63);
				instrucciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				declaracionfuncion();
				setState(66);
				instrucciones();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				definicionfuncion();
				setState(69);
				instrucciones();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public IwhileContext iwhile() {
			return getRuleContext(IwhileContext.class,0);
		}
		public IforContext ifor() {
			return getRuleContext(IforContext.class,0);
		}
		public IifContext iif() {
			return getRuleContext(IifContext.class,0);
		}
		public OperacionaritlogiContext operacionaritlogi() {
			return getRuleContext(OperacionaritlogiContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(idParser.PUNTOCOMA, 0); }
		public LlamadafuncionContext llamadafuncion() {
			return getRuleContext(LlamadafuncionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruccion);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				iwhile();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				ifor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				iif();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				operacionaritlogi();
				setState(80);
				match(PUNTOCOMA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				llamadafuncion();
				setState(83);
				match(PUNTOCOMA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				bloque();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaradoContext declarado() {
			return getRuleContext(DeclaradoContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			tipo();
			setState(89);
			declarado();
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

	public static class DeclaradoContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(idParser.PUNTOCOMA, 0); }
		public AsignadoContext asignado() {
			return getRuleContext(AsignadoContext.class,0);
		}
		public TerminalNode COMA() { return getToken(idParser.COMA, 0); }
		public DeclaradoContext declarado() {
			return getRuleContext(DeclaradoContext.class,0);
		}
		public DeclaradoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclarado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclarado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclarado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaradoContext declarado() throws RecognitionException {
		DeclaradoContext _localctx = new DeclaradoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarado);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				id();
				setState(92);
				match(PUNTOCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				asignado();
				setState(95);
				match(PUNTOCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				id();
				setState(98);
				match(COMA);
				setState(99);
				declarado();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				id();
				setState(102);
				match(COMA);
				setState(103);
				asignado();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				asignado();
				setState(106);
				match(COMA);
				setState(107);
				declarado();
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

	public static class OperandoContext extends ParserRuleContext {
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LlamadafuncionContext llamadafuncion() {
			return getRuleContext(LlamadafuncionContext.class,0);
		}
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterOperando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitOperando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitOperando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operando);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				entero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				llamadafuncion();
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

	public static class AsignadoContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(idParser.IGUAL, 0); }
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public OperacionaritlogiContext operacionaritlogi() {
			return getRuleContext(OperacionaritlogiContext.class,0);
		}
		public AsignadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterAsignado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitAsignado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitAsignado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignadoContext asignado() throws RecognitionException {
		AsignadoContext _localctx = new AsignadoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignado);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				id();
				setState(117);
				match(IGUAL);
				setState(118);
				operando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				id();
				setState(121);
				match(IGUAL);
				setState(122);
				operacionaritlogi();
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

	public static class AsignacionContext extends ParserRuleContext {
		public AsignadoContext asignado() {
			return getRuleContext(AsignadoContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(idParser.PUNTOCOMA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			asignado();
			setState(127);
			match(PUNTOCOMA);
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

	public static class RelacionalesContext extends ParserRuleContext {
		public TerminalNode IGUALDAD() { return getToken(idParser.IGUALDAD, 0); }
		public TerminalNode DIFERENCIA() { return getToken(idParser.DIFERENCIA, 0); }
		public TerminalNode MAYOR() { return getToken(idParser.MAYOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(idParser.MAYORIGUAL, 0); }
		public TerminalNode MENOR() { return getToken(idParser.MENOR, 0); }
		public RelacionalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacionales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterRelacionales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitRelacionales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitRelacionales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacionalesContext relacionales() throws RecognitionException {
		RelacionalesContext _localctx = new RelacionalesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relacionales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUALDAD) | (1L << DIFERENCIA) | (1L << MAYOR) | (1L << MENOR) | (1L << MAYORIGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AritmeticosContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(idParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(idParser.RESTA, 0); }
		public TerminalNode MULTIPLICACION() { return getToken(idParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(idParser.DIVISION, 0); }
		public AritmeticosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmeticos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterAritmeticos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitAritmeticos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitAritmeticos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AritmeticosContext aritmeticos() throws RecognitionException {
		AritmeticosContext _localctx = new AritmeticosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_aritmeticos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << DIVISION) | (1L << MULTIPLICACION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class UnariosderContext extends ParserRuleContext {
		public TerminalNode INCREMENTAR() { return getToken(idParser.INCREMENTAR, 0); }
		public TerminalNode DECREMENTAR() { return getToken(idParser.DECREMENTAR, 0); }
		public UnariosderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unariosder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterUnariosder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitUnariosder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitUnariosder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnariosderContext unariosder() throws RecognitionException {
		UnariosderContext _localctx = new UnariosderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unariosder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !(_la==INCREMENTAR || _la==DECREMENTAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class UnariosizqContext extends ParserRuleContext {
		public TerminalNode INCREMENTAR() { return getToken(idParser.INCREMENTAR, 0); }
		public TerminalNode DECREMENTAR() { return getToken(idParser.DECREMENTAR, 0); }
		public TerminalNode NOT() { return getToken(idParser.NOT, 0); }
		public TerminalNode RESTA() { return getToken(idParser.RESTA, 0); }
		public UnariosizqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unariosizq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterUnariosizq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitUnariosizq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitUnariosizq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnariosizqContext unariosizq() throws RecognitionException {
		UnariosizqContext _localctx = new UnariosizqContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unariosizq);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENTAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(INCREMENTAR);
				}
				break;
			case DECREMENTAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(DECREMENTAR);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(NOT);
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(RESTA);
				}
				break;
			case NOMBRE:
			case ENTERO:
				enterOuterAlt(_localctx, 5);
				{
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

	public static class LogicosContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(idParser.AND, 0); }
		public TerminalNode OR() { return getToken(idParser.OR, 0); }
		public LogicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterLogicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitLogicos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitLogicos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicosContext logicos() throws RecognitionException {
		LogicosContext _localctx = new LogicosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode IWHILE() { return getToken(idParser.IWHILE, 0); }
		public TerminalNode PARENIZQ() { return getToken(idParser.PARENIZQ, 0); }
		public OperacionaritlogiContext operacionaritlogi() {
			return getRuleContext(OperacionaritlogiContext.class,0);
		}
		public TerminalNode PARENDER() { return getToken(idParser.PARENDER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterIwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitIwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitIwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IwhileContext iwhile() throws RecognitionException {
		IwhileContext _localctx = new IwhileContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(IWHILE);
			setState(145);
			match(PARENIZQ);
			setState(146);
			operacionaritlogi();
			setState(147);
			match(PARENDER);
			setState(148);
			bloque();
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

	public static class IforContext extends ParserRuleContext {
		public TerminalNode IFOR() { return getToken(idParser.IFOR, 0); }
		public TerminalNode PARENIZQ() { return getToken(idParser.PARENIZQ, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public List<OperacionaritlogiContext> operacionaritlogi() {
			return getRuleContexts(OperacionaritlogiContext.class);
		}
		public OperacionaritlogiContext operacionaritlogi(int i) {
			return getRuleContext(OperacionaritlogiContext.class,i);
		}
		public TerminalNode PUNTOCOMA() { return getToken(idParser.PUNTOCOMA, 0); }
		public TerminalNode PARENDER() { return getToken(idParser.PARENDER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterIfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitIfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitIfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IforContext ifor() throws RecognitionException {
		IforContext _localctx = new IforContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(IFOR);
			setState(151);
			match(PARENIZQ);
			setState(152);
			declaracion();
			setState(153);
			operacionaritlogi();
			setState(154);
			match(PUNTOCOMA);
			setState(155);
			operacionaritlogi();
			setState(156);
			match(PARENDER);
			setState(157);
			bloque();
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

	public static class IifContext extends ParserRuleContext {
		public TerminalNode IFOR() { return getToken(idParser.IFOR, 0); }
		public TerminalNode PARENIZQ() { return getToken(idParser.PARENIZQ, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public List<TerminalNode> PUNTOCOMA() { return getTokens(idParser.PUNTOCOMA); }
		public TerminalNode PUNTOCOMA(int i) {
			return getToken(idParser.PUNTOCOMA, i);
		}
		public List<OperacionaritlogiContext> operacionaritlogi() {
			return getRuleContexts(OperacionaritlogiContext.class);
		}
		public OperacionaritlogiContext operacionaritlogi(int i) {
			return getRuleContext(OperacionaritlogiContext.class,i);
		}
		public TerminalNode PARENDER() { return getToken(idParser.PARENDER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public IifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterIif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitIif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitIif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IifContext iif() throws RecognitionException {
		IifContext _localctx = new IifContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_iif);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(IFOR);
				setState(160);
				match(PARENIZQ);
				setState(161);
				asignacion();
				setState(162);
				match(PUNTOCOMA);
				setState(163);
				operacionaritlogi();
				setState(164);
				match(PUNTOCOMA);
				setState(165);
				operacionaritlogi();
				setState(166);
				match(PARENDER);
				setState(167);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(IFOR);
				setState(170);
				match(PARENIZQ);
				setState(171);
				asignacion();
				setState(172);
				match(PUNTOCOMA);
				setState(173);
				operacionaritlogi();
				setState(174);
				match(PUNTOCOMA);
				setState(175);
				operacionaritlogi();
				setState(176);
				match(PARENDER);
				setState(177);
				instruccion();
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

	public static class DefinicionfuncionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PARENIZQ() { return getToken(idParser.PARENIZQ, 0); }
		public Parametros1Context parametros1() {
			return getRuleContext(Parametros1Context.class,0);
		}
		public TerminalNode PARENDER() { return getToken(idParser.PARENDER, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(idParser.LLAVEIZQ, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(idParser.LLAVEDER, 0); }
		public TerminalNode VOID() { return getToken(idParser.VOID, 0); }
		public DefinicionfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicionfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDefinicionfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDefinicionfuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDefinicionfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionfuncionContext definicionfuncion() throws RecognitionException {
		DefinicionfuncionContext _localctx = new DefinicionfuncionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_definicionfuncion);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				tipo();
				setState(182);
				id();
				setState(183);
				match(PARENIZQ);
				setState(184);
				parametros1();
				setState(185);
				match(PARENDER);
				setState(186);
				match(LLAVEIZQ);
				setState(187);
				instrucciones();
				setState(188);
				retorno();
				setState(189);
				match(LLAVEDER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(VOID);
				setState(192);
				id();
				setState(193);
				match(PARENIZQ);
				setState(194);
				parametros1();
				setState(195);
				match(PARENDER);
				setState(196);
				match(LLAVEIZQ);
				setState(197);
				instrucciones();
				setState(198);
				match(LLAVEDER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				tipo();
				setState(201);
				id();
				setState(202);
				match(PARENIZQ);
				setState(203);
				match(PARENDER);
				setState(204);
				match(LLAVEIZQ);
				setState(205);
				instrucciones();
				setState(206);
				retorno();
				setState(207);
				match(LLAVEDER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(VOID);
				setState(210);
				id();
				setState(211);
				match(PARENIZQ);
				setState(212);
				match(PARENDER);
				setState(213);
				match(LLAVEIZQ);
				setState(214);
				instrucciones();
				setState(215);
				match(LLAVEDER);
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

	public static class LlamadafuncionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PARENIZQ() { return getToken(idParser.PARENIZQ, 0); }
		public Parametros2Context parametros2() {
			return getRuleContext(Parametros2Context.class,0);
		}
		public TerminalNode PARENDER() { return getToken(idParser.PARENDER, 0); }
		public LlamadafuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadafuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterLlamadafuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitLlamadafuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitLlamadafuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadafuncionContext llamadafuncion() throws RecognitionException {
		LlamadafuncionContext _localctx = new LlamadafuncionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_llamadafuncion);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				id();
				setState(220);
				match(PARENIZQ);
				setState(221);
				parametros2();
				setState(222);
				match(PARENDER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				id();
				setState(225);
				match(PARENIZQ);
				setState(226);
				match(PARENDER);
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

	public static class DeclaracionfuncionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PARENIZQ() { return getToken(idParser.PARENIZQ, 0); }
		public Parametros1Context parametros1() {
			return getRuleContext(Parametros1Context.class,0);
		}
		public TerminalNode PARENDER() { return getToken(idParser.PARENDER, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(idParser.PUNTOCOMA, 0); }
		public TerminalNode VOID() { return getToken(idParser.VOID, 0); }
		public DeclaracionfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracionfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracionfuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclaracionfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionfuncionContext declaracionfuncion() throws RecognitionException {
		DeclaracionfuncionContext _localctx = new DeclaracionfuncionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaracionfuncion);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				tipo();
				setState(231);
				id();
				setState(232);
				match(PARENIZQ);
				setState(233);
				parametros1();
				setState(234);
				match(PARENDER);
				setState(235);
				match(PUNTOCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(VOID);
				setState(238);
				id();
				setState(239);
				match(PARENIZQ);
				setState(240);
				parametros1();
				setState(241);
				match(PARENDER);
				setState(242);
				match(PUNTOCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				tipo();
				setState(245);
				id();
				setState(246);
				match(PARENIZQ);
				setState(247);
				match(PARENDER);
				setState(248);
				match(PUNTOCOMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				match(VOID);
				setState(251);
				id();
				setState(252);
				match(PARENIZQ);
				setState(253);
				match(PARENDER);
				setState(254);
				match(PUNTOCOMA);
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

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode IRETURN() { return getToken(idParser.IRETURN, 0); }
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(idParser.PUNTOCOMA, 0); }
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(IRETURN);
			setState(259);
			operando();
			setState(260);
			match(PUNTOCOMA);
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

	public static class Parametros1Context extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COMA() { return getToken(idParser.COMA, 0); }
		public Parametros1Context parametros1() {
			return getRuleContext(Parametros1Context.class,0);
		}
		public Parametros1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterParametros1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitParametros1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitParametros1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros1Context parametros1() throws RecognitionException {
		Parametros1Context _localctx = new Parametros1Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_parametros1);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				tipo();
				setState(263);
				id();
				setState(264);
				match(COMA);
				setState(265);
				parametros1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				tipo();
				setState(268);
				id();
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

	public static class Parametros2Context extends ParserRuleContext {
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public TerminalNode COMA() { return getToken(idParser.COMA, 0); }
		public Parametros2Context parametros2() {
			return getRuleContext(Parametros2Context.class,0);
		}
		public Parametros2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterParametros2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitParametros2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitParametros2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros2Context parametros2() throws RecognitionException {
		Parametros2Context _localctx = new Parametros2Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_parametros2);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				operando();
				setState(273);
				match(COMA);
				setState(274);
				parametros2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				operando();
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLAVEIZQ() { return getToken(idParser.LLAVEIZQ, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(idParser.LLAVEDER, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(LLAVEIZQ);
			setState(280);
			instrucciones();
			setState(281);
			match(LLAVEDER);
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

	public static class OperacionaritlogiContext extends ParserRuleContext {
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public OperadorbinarioContext operadorbinario() {
			return getRuleContext(OperadorbinarioContext.class,0);
		}
		public OperacionaritlogiContext operacionaritlogi() {
			return getRuleContext(OperacionaritlogiContext.class,0);
		}
		public UnariosizqContext unariosizq() {
			return getRuleContext(UnariosizqContext.class,0);
		}
		public UnariosderContext unariosder() {
			return getRuleContext(UnariosderContext.class,0);
		}
		public OperacionaritlogiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacionaritlogi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterOperacionaritlogi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitOperacionaritlogi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitOperacionaritlogi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionaritlogiContext operacionaritlogi() throws RecognitionException {
		OperacionaritlogiContext _localctx = new OperacionaritlogiContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_operacionaritlogi);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				operando();
				setState(284);
				operadorbinario();
				setState(285);
				operacionaritlogi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				unariosizq();
				setState(288);
				operando();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				unariosizq();
				setState(291);
				operando();
				setState(292);
				operadorbinario();
				setState(293);
				operacionaritlogi();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				operando();
				setState(296);
				unariosder();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(298);
				operando();
				setState(299);
				unariosder();
				setState(300);
				operadorbinario();
				setState(301);
				operacionaritlogi();
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

	public static class OperadorbinarioContext extends ParserRuleContext {
		public RelacionalesContext relacionales() {
			return getRuleContext(RelacionalesContext.class,0);
		}
		public AritmeticosContext aritmeticos() {
			return getRuleContext(AritmeticosContext.class,0);
		}
		public LogicosContext logicos() {
			return getRuleContext(LogicosContext.class,0);
		}
		public OperadorbinarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorbinario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterOperadorbinario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitOperadorbinario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitOperadorbinario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorbinarioContext operadorbinario() throws RecognitionException {
		OperadorbinarioContext _localctx = new OperadorbinarioContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_operadorbinario);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUALDAD:
			case DIFERENCIA:
			case MAYOR:
			case MENOR:
			case MAYORIGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				relacionales();
				}
				break;
			case SUMA:
			case RESTA:
			case DIVISION:
			case MULTIPLICACION:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				aritmeticos();
				}
				break;
			case AND:
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				logicos();
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

	public static class SContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_s);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("\nEmpiezo lectura \n"); 
				setState(311);
				instrucciones();
				System.out.println("Fin lectura \n"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0140\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6Y\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\t\3\t\3\t\5"+
		"\tu\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\177\n\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u008f\n\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b6\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u00dc\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u00e7\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0103\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0111\n\30\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0118\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0132"+
		"\n\33\3\34\3\34\3\34\5\34\u0137\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u013e"+
		"\n\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668\2\7\3\2\32\34\3\2\r\21\3\2\5\b\3\2\n\13\3\2\23\24\2\u0149\2:\3"+
		"\2\2\2\4<\3\2\2\2\6>\3\2\2\2\bJ\3\2\2\2\nX\3\2\2\2\fZ\3\2\2\2\16o\3\2"+
		"\2\2\20t\3\2\2\2\22~\3\2\2\2\24\u0080\3\2\2\2\26\u0083\3\2\2\2\30\u0085"+
		"\3\2\2\2\32\u0087\3\2\2\2\34\u008e\3\2\2\2\36\u0090\3\2\2\2 \u0092\3\2"+
		"\2\2\"\u0098\3\2\2\2$\u00b5\3\2\2\2&\u00db\3\2\2\2(\u00e6\3\2\2\2*\u0102"+
		"\3\2\2\2,\u0104\3\2\2\2.\u0110\3\2\2\2\60\u0117\3\2\2\2\62\u0119\3\2\2"+
		"\2\64\u0131\3\2\2\2\66\u0136\3\2\2\28\u013d\3\2\2\2:;\7\"\2\2;\3\3\2\2"+
		"\2<=\7#\2\2=\5\3\2\2\2>?\t\2\2\2?\7\3\2\2\2@A\5\n\6\2AB\5\b\5\2BK\3\2"+
		"\2\2CD\5*\26\2DE\5\b\5\2EK\3\2\2\2FG\5&\24\2GH\5\b\5\2HK\3\2\2\2IK\3\2"+
		"\2\2J@\3\2\2\2JC\3\2\2\2JF\3\2\2\2JI\3\2\2\2K\t\3\2\2\2LY\5\f\7\2MY\5"+
		"\24\13\2NY\5 \21\2OY\5\"\22\2PY\5$\23\2QR\5\64\33\2RS\7\3\2\2SY\3\2\2"+
		"\2TU\5(\25\2UV\7\3\2\2VY\3\2\2\2WY\5\62\32\2XL\3\2\2\2XM\3\2\2\2XN\3\2"+
		"\2\2XO\3\2\2\2XP\3\2\2\2XQ\3\2\2\2XT\3\2\2\2XW\3\2\2\2Y\13\3\2\2\2Z[\5"+
		"\6\4\2[\\\5\16\b\2\\\r\3\2\2\2]^\5\2\2\2^_\7\3\2\2_p\3\2\2\2`a\5\22\n"+
		"\2ab\7\3\2\2bp\3\2\2\2cd\5\2\2\2de\7\4\2\2ef\5\16\b\2fp\3\2\2\2gh\5\2"+
		"\2\2hi\7\4\2\2ij\5\22\n\2jp\3\2\2\2kl\5\22\n\2lm\7\4\2\2mn\5\16\b\2np"+
		"\3\2\2\2o]\3\2\2\2o`\3\2\2\2oc\3\2\2\2og\3\2\2\2ok\3\2\2\2p\17\3\2\2\2"+
		"qu\5\4\3\2ru\5\2\2\2su\5(\25\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\21\3\2\2"+
		"\2vw\5\2\2\2wx\7\f\2\2xy\5\20\t\2y\177\3\2\2\2z{\5\2\2\2{|\7\f\2\2|}\5"+
		"\64\33\2}\177\3\2\2\2~v\3\2\2\2~z\3\2\2\2\177\23\3\2\2\2\u0080\u0081\5"+
		"\22\n\2\u0081\u0082\7\3\2\2\u0082\25\3\2\2\2\u0083\u0084\t\3\2\2\u0084"+
		"\27\3\2\2\2\u0085\u0086\t\4\2\2\u0086\31\3\2\2\2\u0087\u0088\t\5\2\2\u0088"+
		"\33\3\2\2\2\u0089\u008f\7\n\2\2\u008a\u008f\7\13\2\2\u008b\u008f\7\25"+
		"\2\2\u008c\u008f\7\6\2\2\u008d\u008f\3\2\2\2\u008e\u0089\3\2\2\2\u008e"+
		"\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2"+
		"\2\2\u008f\35\3\2\2\2\u0090\u0091\t\6\2\2\u0091\37\3\2\2\2\u0092\u0093"+
		"\7!\2\2\u0093\u0094\7\26\2\2\u0094\u0095\5\64\33\2\u0095\u0096\7\27\2"+
		"\2\u0096\u0097\5\62\32\2\u0097!\3\2\2\2\u0098\u0099\7 \2\2\u0099\u009a"+
		"\7\26\2\2\u009a\u009b\5\f\7\2\u009b\u009c\5\64\33\2\u009c\u009d\7\3\2"+
		"\2\u009d\u009e\5\64\33\2\u009e\u009f\7\27\2\2\u009f\u00a0\5\62\32\2\u00a0"+
		"#\3\2\2\2\u00a1\u00a2\7 \2\2\u00a2\u00a3\7\26\2\2\u00a3\u00a4\5\24\13"+
		"\2\u00a4\u00a5\7\3\2\2\u00a5\u00a6\5\64\33\2\u00a6\u00a7\7\3\2\2\u00a7"+
		"\u00a8\5\64\33\2\u00a8\u00a9\7\27\2\2\u00a9\u00aa\5\62\32\2\u00aa\u00b6"+
		"\3\2\2\2\u00ab\u00ac\7 \2\2\u00ac\u00ad\7\26\2\2\u00ad\u00ae\5\24\13\2"+
		"\u00ae\u00af\7\3\2\2\u00af\u00b0\5\64\33\2\u00b0\u00b1\7\3\2\2\u00b1\u00b2"+
		"\5\64\33\2\u00b2\u00b3\7\27\2\2\u00b3\u00b4\5\n\6\2\u00b4\u00b6\3\2\2"+
		"\2\u00b5\u00a1\3\2\2\2\u00b5\u00ab\3\2\2\2\u00b6%\3\2\2\2\u00b7\u00b8"+
		"\5\6\4\2\u00b8\u00b9\5\2\2\2\u00b9\u00ba\7\26\2\2\u00ba\u00bb\5.\30\2"+
		"\u00bb\u00bc\7\27\2\2\u00bc\u00bd\7\30\2\2\u00bd\u00be\5\b\5\2\u00be\u00bf"+
		"\5,\27\2\u00bf\u00c0\7\31\2\2\u00c0\u00dc\3\2\2\2\u00c1\u00c2\7\35\2\2"+
		"\u00c2\u00c3\5\2\2\2\u00c3\u00c4\7\26\2\2\u00c4\u00c5\5.\30\2\u00c5\u00c6"+
		"\7\27\2\2\u00c6\u00c7\7\30\2\2\u00c7\u00c8\5\b\5\2\u00c8\u00c9\7\31\2"+
		"\2\u00c9\u00dc\3\2\2\2\u00ca\u00cb\5\6\4\2\u00cb\u00cc\5\2\2\2\u00cc\u00cd"+
		"\7\26\2\2\u00cd\u00ce\7\27\2\2\u00ce\u00cf\7\30\2\2\u00cf\u00d0\5\b\5"+
		"\2\u00d0\u00d1\5,\27\2\u00d1\u00d2\7\31\2\2\u00d2\u00dc\3\2\2\2\u00d3"+
		"\u00d4\7\35\2\2\u00d4\u00d5\5\2\2\2\u00d5\u00d6\7\26\2\2\u00d6\u00d7\7"+
		"\27\2\2\u00d7\u00d8\7\30\2\2\u00d8\u00d9\5\b\5\2\u00d9\u00da\7\31\2\2"+
		"\u00da\u00dc\3\2\2\2\u00db\u00b7\3\2\2\2\u00db\u00c1\3\2\2\2\u00db\u00ca"+
		"\3\2\2\2\u00db\u00d3\3\2\2\2\u00dc\'\3\2\2\2\u00dd\u00de\5\2\2\2\u00de"+
		"\u00df\7\26\2\2\u00df\u00e0\5\60\31\2\u00e0\u00e1\7\27\2\2\u00e1\u00e7"+
		"\3\2\2\2\u00e2\u00e3\5\2\2\2\u00e3\u00e4\7\26\2\2\u00e4\u00e5\7\27\2\2"+
		"\u00e5\u00e7\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e7)\3"+
		"\2\2\2\u00e8\u00e9\5\6\4\2\u00e9\u00ea\5\2\2\2\u00ea\u00eb\7\26\2\2\u00eb"+
		"\u00ec\5.\30\2\u00ec\u00ed\7\27\2\2\u00ed\u00ee\7\3\2\2\u00ee\u0103\3"+
		"\2\2\2\u00ef\u00f0\7\35\2\2\u00f0\u00f1\5\2\2\2\u00f1\u00f2\7\26\2\2\u00f2"+
		"\u00f3\5.\30\2\u00f3\u00f4\7\27\2\2\u00f4\u00f5\7\3\2\2\u00f5\u0103\3"+
		"\2\2\2\u00f6\u00f7\5\6\4\2\u00f7\u00f8\5\2\2\2\u00f8\u00f9\7\26\2\2\u00f9"+
		"\u00fa\7\27\2\2\u00fa\u00fb\7\3\2\2\u00fb\u0103\3\2\2\2\u00fc\u00fd\7"+
		"\35\2\2\u00fd\u00fe\5\2\2\2\u00fe\u00ff\7\26\2\2\u00ff\u0100\7\27\2\2"+
		"\u0100\u0101\7\3\2\2\u0101\u0103\3\2\2\2\u0102\u00e8\3\2\2\2\u0102\u00ef"+
		"\3\2\2\2\u0102\u00f6\3\2\2\2\u0102\u00fc\3\2\2\2\u0103+\3\2\2\2\u0104"+
		"\u0105\7\36\2\2\u0105\u0106\5\20\t\2\u0106\u0107\7\3\2\2\u0107-\3\2\2"+
		"\2\u0108\u0109\5\6\4\2\u0109\u010a\5\2\2\2\u010a\u010b\7\4\2\2\u010b\u010c"+
		"\5.\30\2\u010c\u0111\3\2\2\2\u010d\u010e\5\6\4\2\u010e\u010f\5\2\2\2\u010f"+
		"\u0111\3\2\2\2\u0110\u0108\3\2\2\2\u0110\u010d\3\2\2\2\u0111/\3\2\2\2"+
		"\u0112\u0113\5\20\t\2\u0113\u0114\7\4\2\2\u0114\u0115\5\60\31\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0118\5\20\t\2\u0117\u0112\3\2\2\2\u0117\u0116\3"+
		"\2\2\2\u0118\61\3\2\2\2\u0119\u011a\7\30\2\2\u011a\u011b\5\b\5\2\u011b"+
		"\u011c\7\31\2\2\u011c\63\3\2\2\2\u011d\u011e\5\20\t\2\u011e\u011f\5\66"+
		"\34\2\u011f\u0120\5\64\33\2\u0120\u0132\3\2\2\2\u0121\u0122\5\34\17\2"+
		"\u0122\u0123\5\20\t\2\u0123\u0132\3\2\2\2\u0124\u0125\5\34\17\2\u0125"+
		"\u0126\5\20\t\2\u0126\u0127\5\66\34\2\u0127\u0128\5\64\33\2\u0128\u0132"+
		"\3\2\2\2\u0129\u012a\5\20\t\2\u012a\u012b\5\32\16\2\u012b\u0132\3\2\2"+
		"\2\u012c\u012d\5\20\t\2\u012d\u012e\5\32\16\2\u012e\u012f\5\66\34\2\u012f"+
		"\u0130\5\64\33\2\u0130\u0132\3\2\2\2\u0131\u011d\3\2\2\2\u0131\u0121\3"+
		"\2\2\2\u0131\u0124\3\2\2\2\u0131\u0129\3\2\2\2\u0131\u012c\3\2\2\2\u0132"+
		"\65\3\2\2\2\u0133\u0137\5\26\f\2\u0134\u0137\5\30\r\2\u0135\u0137\5\36"+
		"\20\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\67\3\2\2\2\u0138\u0139\b\35\1\2\u0139\u013a\5\b\5\2\u013a\u013b\b\35"+
		"\1\2\u013b\u013e\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u0138\3\2\2\2\u013d"+
		"\u013c\3\2\2\2\u013e9\3\2\2\2\21JXot~\u008e\u00b5\u00db\u00e6\u0102\u0110"+
		"\u0117\u0131\u0136\u013d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}