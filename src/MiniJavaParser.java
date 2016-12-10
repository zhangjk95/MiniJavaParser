// Generated from MiniJava.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, Identifier=36, INTEGER_LITERAL=37, 
		WS=38, COMMENT=39;
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_name = 3, 
		RULE_baseclass = 4, RULE_varDeclarations = 5, RULE_methodDeclarations = 6, 
		RULE_varDeclaration = 7, RULE_methodDeclaration = 8, RULE_type = 9, RULE_statement = 10, 
		RULE_expression = 11, RULE_and = 12, RULE_less = 13, RULE_plus = 14, RULE_multiply = 15, 
		RULE_not = 16, RULE_newarray = 17, RULE_newid = 18, RULE_array = 19, RULE_function = 20, 
		RULE_element = 21, RULE_special = 22, RULE_specialElement = 23, RULE_identifier = 24, 
		RULE_integer = 25;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "name", "baseclass", "varDeclarations", 
		"methodDeclarations", "varDeclaration", "methodDeclaration", "type", "statement", 
		"expression", "and", "less", "plus", "multiply", "not", "newarray", "newid", 
		"array", "function", "element", "special", "specialElement", "identifier", 
		"integer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'public'", "'static'", "'void'", "'main'", "'('", "'String'", 
		"'['", "']'", "')'", "'}'", "'class'", "'extends'", "';'", "','", "'return'", 
		"'int'", "'boolean'", "'if'", "'else'", "'while'", "'System.out.println'", 
		"'='", "'&&'", "'<'", "'-'", "'+'", "'*'", "'!'", "'new'", "'.'", "'length'", 
		"'true'", "'false'", "'this'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Identifier", "INTEGER_LITERAL", "WS", "COMMENT"
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

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniJavaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			mainClass();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(53);
				classDeclaration();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(EOF);
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

	public static class MainClassContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			name();
			setState(62);
			match(T__0);
			setState(63);
			match(T__1);
			setState(64);
			match(T__2);
			setState(65);
			match(T__3);
			setState(66);
			match(T__4);
			setState(67);
			match(T__5);
			setState(68);
			match(T__6);
			setState(69);
			match(T__7);
			setState(70);
			match(T__8);
			setState(71);
			identifier();
			setState(72);
			match(T__9);
			setState(73);
			match(T__0);
			setState(74);
			statement();
			setState(75);
			match(T__10);
			setState(76);
			match(T__10);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public VarDeclarationsContext varDeclarations() {
			return getRuleContext(VarDeclarationsContext.class,0);
		}
		public MethodDeclarationsContext methodDeclarations() {
			return getRuleContext(MethodDeclarationsContext.class,0);
		}
		public BaseclassContext baseclass() {
			return getRuleContext(BaseclassContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			name();
			setState(80);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(79);
				baseclass();
				}
			}

			setState(82);
			match(T__0);
			setState(83);
			varDeclarations();
			setState(84);
			methodDeclarations();
			setState(85);
			match(T__10);
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

	public static class NameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__11);
			setState(88);
			identifier();
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

	public static class BaseclassContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BaseclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBaseclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBaseclass(this);
		}
	}

	public final BaseclassContext baseclass() throws RecognitionException {
		BaseclassContext _localctx = new BaseclassContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_baseclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__12);
			setState(91);
			identifier();
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

	public static class VarDeclarationsContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public VarDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclarations(this);
		}
	}

	public final VarDeclarationsContext varDeclarations() throws RecognitionException {
		VarDeclarationsContext _localctx = new VarDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << Identifier))) != 0)) {
				{
				{
				setState(93);
				varDeclaration();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MethodDeclarationsContext extends ParserRuleContext {
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public MethodDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclarations(this);
		}
	}

	public final MethodDeclarationsContext methodDeclarations() throws RecognitionException {
		MethodDeclarationsContext _localctx = new MethodDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(99);
				methodDeclaration();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			type();
			setState(106);
			identifier();
			setState(107);
			match(T__13);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__1);
			setState(110);
			type();
			setState(111);
			identifier();
			setState(112);
			match(T__5);
			setState(124);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << Identifier))) != 0)) {
				{
				setState(113);
				type();
				setState(114);
				identifier();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(115);
					match(T__14);
					setState(116);
					type();
					setState(117);
					identifier();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(126);
			match(T__9);
			setState(127);
			match(T__0);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					varDeclaration();
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
				{
				{
				setState(134);
				statement();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(T__15);
			setState(141);
			expression();
			setState(142);
			match(T__13);
			setState(143);
			match(T__10);
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

	public static class TypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__16);
				setState(146);
				match(T__7);
				setState(147);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				identifier();
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

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(T__0);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
					{
					{
					setState(154);
					statement();
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(T__18);
				setState(162);
				match(T__5);
				setState(163);
				expression();
				setState(164);
				match(T__9);
				setState(165);
				statement();
				setState(166);
				match(T__19);
				setState(167);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(T__20);
				setState(170);
				match(T__5);
				setState(171);
				expression();
				setState(172);
				match(T__9);
				setState(173);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				match(T__21);
				setState(176);
				match(T__5);
				setState(177);
				expression();
				setState(178);
				match(T__9);
				setState(179);
				match(T__13);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				identifier();
				setState(182);
				match(T__22);
				setState(183);
				expression();
				setState(184);
				match(T__13);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				identifier();
				setState(187);
				match(T__7);
				setState(188);
				expression();
				setState(189);
				match(T__8);
				setState(190);
				match(T__22);
				setState(191);
				expression();
				setState(192);
				match(T__13);
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

	public static class ExpressionContext extends ParserRuleContext {
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			and(0);
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

	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
	 
		public AndContext() { }
		public void copyFrom(AndContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NextAndContext extends AndContext {
		public LessContext less() {
			return getRuleContext(LessContext.class,0);
		}
		public NextAndContext(AndContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextAnd(this);
		}
	}
	public static class AndToContext extends AndContext {
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public LessContext less() {
			return getRuleContext(LessContext.class,0);
		}
		public AndToContext(AndContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAndTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAndTo(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		return and(0);
	}

	private AndContext and(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndContext _localctx = new AndContext(_ctx, _parentState);
		AndContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextAndContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(199);
			less(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndToContext(new AndContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_and);
					setState(201);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(202);
					match(T__23);
					setState(203);
					less(0);
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LessContext extends ParserRuleContext {
		public LessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less; }
	 
		public LessContext() { }
		public void copyFrom(LessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LessThanContext extends LessContext {
		public LessContext less() {
			return getRuleContext(LessContext.class,0);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public LessThanContext(LessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLessThan(this);
		}
	}
	public static class NextLessContext extends LessContext {
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public NextLessContext(LessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextLess(this);
		}
	}

	public final LessContext less() throws RecognitionException {
		return less(0);
	}

	private LessContext less(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LessContext _localctx = new LessContext(_ctx, _parentState);
		LessContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_less, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextLessContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(210);
			plus(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LessThanContext(new LessContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_less);
					setState(212);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(213);
					match(T__24);
					setState(214);
					plus(0);
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PlusContext extends ParserRuleContext {
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
	 
		public PlusContext() { }
		public void copyFrom(PlusContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PlusToContext extends PlusContext {
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public PlusToContext(PlusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPlusTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPlusTo(this);
		}
	}
	public static class NextPlusContext extends PlusContext {
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public NextPlusContext(PlusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextPlus(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		return plus(0);
	}

	private PlusContext plus(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PlusContext _localctx = new PlusContext(_ctx, _parentState);
		PlusContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_plus, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextPlusContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(221);
			multiply(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PlusToContext(new PlusContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_plus);
					setState(223);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(224);
					_la = _input.LA(1);
					if ( !(_la==T__25 || _la==T__26) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(225);
					multiply(0);
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplyContext extends ParserRuleContext {
		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply; }
	 
		public MultiplyContext() { }
		public void copyFrom(MultiplyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NextMultiplyContext extends MultiplyContext {
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public NextMultiplyContext(MultiplyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextMultiply(this);
		}
	}
	public static class MultiplyToContext extends MultiplyContext {
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public MultiplyToContext(MultiplyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMultiplyTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMultiplyTo(this);
		}
	}

	public final MultiplyContext multiply() throws RecognitionException {
		return multiply(0);
	}

	private MultiplyContext multiply(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplyContext _localctx = new MultiplyContext(_ctx, _parentState);
		MultiplyContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_multiply, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextMultiplyContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(232);
			not();
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplyToContext(new MultiplyContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_multiply);
					setState(234);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(235);
					match(T__27);
					setState(236);
					not();
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NotContext extends ParserRuleContext {
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
	 
		public NotContext() { }
		public void copyFrom(NotContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NextNotContext extends NotContext {
		public NewarrayContext newarray() {
			return getRuleContext(NewarrayContext.class,0);
		}
		public NextNotContext(NotContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextNot(this);
		}
	}
	public static class NotToContext extends NotContext {
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public NotToContext(NotContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNotTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNotTo(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_not);
		try {
			setState(245);
			switch (_input.LA(1)) {
			case T__28:
				_localctx = new NotToContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(T__28);
				setState(243);
				not();
				}
				break;
			case T__5:
			case T__29:
			case T__32:
			case T__33:
			case T__34:
			case Identifier:
			case INTEGER_LITERAL:
				_localctx = new NextNotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				newarray();
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

	public static class NewarrayContext extends ParserRuleContext {
		public NewarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newarray; }
	 
		public NewarrayContext() { }
		public void copyFrom(NewarrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewarrayToContext extends NewarrayContext {
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public NewarrayToContext(NewarrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNewarrayTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNewarrayTo(this);
		}
	}
	public static class NextneWarrayContext extends NewarrayContext {
		public NewidContext newid() {
			return getRuleContext(NewidContext.class,0);
		}
		public NextneWarrayContext(NewarrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextneWarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextneWarray(this);
		}
	}

	public final NewarrayContext newarray() throws RecognitionException {
		NewarrayContext _localctx = new NewarrayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_newarray);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new NewarrayToContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__29);
				setState(248);
				match(T__16);
				setState(249);
				match(T__7);
				setState(250);
				special();
				setState(251);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new NextneWarrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				newid();
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

	public static class NewidContext extends ParserRuleContext {
		public NewidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newid; }
	 
		public NewidContext() { }
		public void copyFrom(NewidContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewToContext extends NewidContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NewToContext(NewidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNewTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNewTo(this);
		}
	}
	public static class NextNewidContext extends NewidContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public NextNewidContext(NewidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextNewid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextNewid(this);
		}
	}

	public final NewidContext newid() throws RecognitionException {
		NewidContext _localctx = new NewidContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_newid);
		try {
			setState(262);
			switch (_input.LA(1)) {
			case T__29:
				_localctx = new NewToContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(T__29);
				setState(257);
				identifier();
				setState(258);
				match(T__5);
				setState(259);
				match(T__9);
				}
				break;
			case T__5:
			case T__32:
			case T__33:
			case T__34:
			case Identifier:
			case INTEGER_LITERAL:
				_localctx = new NextNewidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				array(0);
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

	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NextArrayContext extends ArrayContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public NextArrayContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextArray(this);
		}
	}
	public static class ArrayToContext extends ArrayContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public ArrayToContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayTo(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		return array(0);
	}

	private ArrayContext array(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArrayContext _localctx = new ArrayContext(_ctx, _parentState);
		ArrayContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_array, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextArrayContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(265);
			function(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayToContext(new ArrayContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_array);
					setState(267);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(268);
					match(T__7);
					setState(269);
					special();
					setState(270);
					match(T__8);
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NextFunctionContext extends FunctionContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public NextFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextFunction(this);
		}
	}
	public static class FunctionNoneContext extends FunctionContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionNoneContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFunctionNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFunctionNone(this);
		}
	}
	public static class FunctionLenghContext extends FunctionContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionLenghContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFunctionLengh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFunctionLengh(this);
		}
	}
	public static class FunctionVariableContext extends FunctionContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<SpecialContext> special() {
			return getRuleContexts(SpecialContext.class);
		}
		public SpecialContext special(int i) {
			return getRuleContext(SpecialContext.class,i);
		}
		public FunctionVariableContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFunctionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFunctionVariable(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		return function(0);
	}

	private FunctionContext function(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FunctionContext _localctx = new FunctionContext(_ctx, _parentState);
		FunctionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_function, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextFunctionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(278);
			element();
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new FunctionLenghContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(280);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(281);
						match(T__30);
						setState(282);
						match(T__31);
						}
						break;
					case 2:
						{
						_localctx = new FunctionNoneContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(283);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(284);
						match(T__30);
						setState(285);
						identifier();
						setState(286);
						match(T__5);
						setState(287);
						match(T__9);
						}
						break;
					case 3:
						{
						_localctx = new FunctionVariableContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(289);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(290);
						match(T__30);
						setState(291);
						identifier();
						setState(292);
						match(T__5);
						{
						setState(293);
						special();
						setState(298);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__14) {
							{
							{
							setState(294);
							match(T__14);
							setState(295);
							special();
							}
							}
							setState(300);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						setState(301);
						match(T__9);
						}
						break;
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public SpecialElementContext specialElement() {
			return getRuleContext(SpecialElementContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_element);
		try {
			setState(315);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				integer();
				}
				break;
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				specialElement();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				identifier();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				match(T__5);
				setState(312);
				and(0);
				setState(313);
				match(T__9);
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

	public static class SpecialContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public SpecialElementContext specialElement() {
			return getRuleContext(SpecialElementContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public SpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitSpecial(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_special);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				specialElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				and(0);
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

	public static class SpecialElementContext extends ParserRuleContext {
		public SpecialElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterSpecialElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitSpecialElement(this);
		}
	}

	public final SpecialElementContext specialElement() throws RecognitionException {
		SpecialElementContext _localctx = new SpecialElementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_specialElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(Identifier);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(MiniJavaParser.INTEGER_LITERAL, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(INTEGER_LITERAL);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return and_sempred((AndContext)_localctx, predIndex);
		case 13:
			return less_sempred((LessContext)_localctx, predIndex);
		case 14:
			return plus_sempred((PlusContext)_localctx, predIndex);
		case 15:
			return multiply_sempred((MultiplyContext)_localctx, predIndex);
		case 19:
			return array_sempred((ArrayContext)_localctx, predIndex);
		case 20:
			return function_sempred((FunctionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean and_sempred(AndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean less_sempred(LessContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean plus_sempred(PlusContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiply_sempred(MultiplyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean array_sempred(ArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u014c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4"+
		"S\n\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\7\7a\n\7\f\7\16"+
		"\7d\13\7\3\b\7\bg\n\b\f\b\16\bj\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\nz\n\n\f\n\16\n}\13\n\5\n\177\n\n\3\n\3\n\3\n"+
		"\7\n\u0084\n\n\f\n\16\n\u0087\13\n\3\n\7\n\u008a\n\n\f\n\16\n\u008d\13"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009a\n\13\3"+
		"\f\3\f\7\f\u009e\n\f\f\f\16\f\u00a1\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c5\n\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u00cf\n\16\f\16\16\16\u00d2\13\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u00da\n\17\f\17\16\17\u00dd\13\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\7\20\u00e5\n\20\f\20\16\20\u00e8\13\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u00f0\n\21\f\21\16\21\u00f3\13\21\3\22\3\22\3"+
		"\22\5\22\u00f8\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0101\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0109\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\7\25\u0113\n\25\f\25\16\25\u0116\13\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u012b\n\26\f\26\16\26\u012e\13\26\3\26\3\26\7\26\u0132"+
		"\n\26\f\26\16\26\u0135\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u013e"+
		"\n\27\3\30\3\30\3\30\3\30\5\30\u0144\n\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\33\2\b\32\34\36 (*\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\2\4\3\2\34\35\3\2#%\u0154\2\66\3\2\2\2\4?\3\2\2\2\6P\3\2"+
		"\2\2\bY\3\2\2\2\n\\\3\2\2\2\fb\3\2\2\2\16h\3\2\2\2\20k\3\2\2\2\22o\3\2"+
		"\2\2\24\u0099\3\2\2\2\26\u00c4\3\2\2\2\30\u00c6\3\2\2\2\32\u00c8\3\2\2"+
		"\2\34\u00d3\3\2\2\2\36\u00de\3\2\2\2 \u00e9\3\2\2\2\"\u00f7\3\2\2\2$\u0100"+
		"\3\2\2\2&\u0108\3\2\2\2(\u010a\3\2\2\2*\u0117\3\2\2\2,\u013d\3\2\2\2."+
		"\u0143\3\2\2\2\60\u0145\3\2\2\2\62\u0147\3\2\2\2\64\u0149\3\2\2\2\66:"+
		"\5\4\3\2\679\5\6\4\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2"+
		"\2<:\3\2\2\2=>\7\2\2\3>\3\3\2\2\2?@\5\b\5\2@A\7\3\2\2AB\7\4\2\2BC\7\5"+
		"\2\2CD\7\6\2\2DE\7\7\2\2EF\7\b\2\2FG\7\t\2\2GH\7\n\2\2HI\7\13\2\2IJ\5"+
		"\62\32\2JK\7\f\2\2KL\7\3\2\2LM\5\26\f\2MN\7\r\2\2NO\7\r\2\2O\5\3\2\2\2"+
		"PR\5\b\5\2QS\5\n\6\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\3\2\2UV\5\f\7\2"+
		"VW\5\16\b\2WX\7\r\2\2X\7\3\2\2\2YZ\7\16\2\2Z[\5\62\32\2[\t\3\2\2\2\\]"+
		"\7\17\2\2]^\5\62\32\2^\13\3\2\2\2_a\5\20\t\2`_\3\2\2\2ad\3\2\2\2b`\3\2"+
		"\2\2bc\3\2\2\2c\r\3\2\2\2db\3\2\2\2eg\5\22\n\2fe\3\2\2\2gj\3\2\2\2hf\3"+
		"\2\2\2hi\3\2\2\2i\17\3\2\2\2jh\3\2\2\2kl\5\24\13\2lm\5\62\32\2mn\7\20"+
		"\2\2n\21\3\2\2\2op\7\4\2\2pq\5\24\13\2qr\5\62\32\2r~\7\b\2\2st\5\24\13"+
		"\2t{\5\62\32\2uv\7\21\2\2vw\5\24\13\2wx\5\62\32\2xz\3\2\2\2yu\3\2\2\2"+
		"z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~s\3\2\2\2~\177\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7\f\2\2\u0081\u0085\7\3\2\2\u0082"+
		"\u0084\5\20\t\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u008b\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u008a\5\26\f\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\7\22\2\2\u008f\u0090\5\30\r\2\u0090\u0091\7\20\2\2\u0091\u0092"+
		"\7\r\2\2\u0092\23\3\2\2\2\u0093\u0094\7\23\2\2\u0094\u0095\7\n\2\2\u0095"+
		"\u009a\7\13\2\2\u0096\u009a\7\24\2\2\u0097\u009a\7\23\2\2\u0098\u009a"+
		"\5\62\32\2\u0099\u0093\3\2\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2"+
		"\u0099\u0098\3\2\2\2\u009a\25\3\2\2\2\u009b\u009f\7\3\2\2\u009c\u009e"+
		"\5\26\f\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00c5"+
		"\7\r\2\2\u00a3\u00a4\7\25\2\2\u00a4\u00a5\7\b\2\2\u00a5\u00a6\5\30\r\2"+
		"\u00a6\u00a7\7\f\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\7\26\2\2\u00a9\u00aa"+
		"\5\26\f\2\u00aa\u00c5\3\2\2\2\u00ab\u00ac\7\27\2\2\u00ac\u00ad\7\b\2\2"+
		"\u00ad\u00ae\5\30\r\2\u00ae\u00af\7\f\2\2\u00af\u00b0\5\26\f\2\u00b0\u00c5"+
		"\3\2\2\2\u00b1\u00b2\7\30\2\2\u00b2\u00b3\7\b\2\2\u00b3\u00b4\5\30\r\2"+
		"\u00b4\u00b5\7\f\2\2\u00b5\u00b6\7\20\2\2\u00b6\u00c5\3\2\2\2\u00b7\u00b8"+
		"\5\62\32\2\u00b8\u00b9\7\31\2\2\u00b9\u00ba\5\30\r\2\u00ba\u00bb\7\20"+
		"\2\2\u00bb\u00c5\3\2\2\2\u00bc\u00bd\5\62\32\2\u00bd\u00be\7\n\2\2\u00be"+
		"\u00bf\5\30\r\2\u00bf\u00c0\7\13\2\2\u00c0\u00c1\7\31\2\2\u00c1\u00c2"+
		"\5\30\r\2\u00c2\u00c3\7\20\2\2\u00c3\u00c5\3\2\2\2\u00c4\u009b\3\2\2\2"+
		"\u00c4\u00a3\3\2\2\2\u00c4\u00ab\3\2\2\2\u00c4\u00b1\3\2\2\2\u00c4\u00b7"+
		"\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c5\27\3\2\2\2\u00c6\u00c7\5\32\16\2\u00c7"+
		"\31\3\2\2\2\u00c8\u00c9\b\16\1\2\u00c9\u00ca\5\34\17\2\u00ca\u00d0\3\2"+
		"\2\2\u00cb\u00cc\f\4\2\2\u00cc\u00cd\7\32\2\2\u00cd\u00cf\5\34\17\2\u00ce"+
		"\u00cb\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\33\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\b\17\1\2\u00d4\u00d5"+
		"\5\36\20\2\u00d5\u00db\3\2\2\2\u00d6\u00d7\f\4\2\2\u00d7\u00d8\7\33\2"+
		"\2\u00d8\u00da\5\36\20\2\u00d9\u00d6\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\35\3\2\2\2\u00dd\u00db\3\2\2"+
		"\2\u00de\u00df\b\20\1\2\u00df\u00e0\5 \21\2\u00e0\u00e6\3\2\2\2\u00e1"+
		"\u00e2\f\4\2\2\u00e2\u00e3\t\2\2\2\u00e3\u00e5\5 \21\2\u00e4\u00e1\3\2"+
		"\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\37\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\b\21\1\2\u00ea\u00eb\5\"\22"+
		"\2\u00eb\u00f1\3\2\2\2\u00ec\u00ed\f\4\2\2\u00ed\u00ee\7\36\2\2\u00ee"+
		"\u00f0\5\"\22\2\u00ef\u00ec\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2!\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5"+
		"\7\37\2\2\u00f5\u00f8\5\"\22\2\u00f6\u00f8\5$\23\2\u00f7\u00f4\3\2\2\2"+
		"\u00f7\u00f6\3\2\2\2\u00f8#\3\2\2\2\u00f9\u00fa\7 \2\2\u00fa\u00fb\7\23"+
		"\2\2\u00fb\u00fc\7\n\2\2\u00fc\u00fd\5.\30\2\u00fd\u00fe\7\13\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u0101\5&\24\2\u0100\u00f9\3\2\2\2\u0100\u00ff\3\2"+
		"\2\2\u0101%\3\2\2\2\u0102\u0103\7 \2\2\u0103\u0104\5\62\32\2\u0104\u0105"+
		"\7\b\2\2\u0105\u0106\7\f\2\2\u0106\u0109\3\2\2\2\u0107\u0109\5(\25\2\u0108"+
		"\u0102\3\2\2\2\u0108\u0107\3\2\2\2\u0109\'\3\2\2\2\u010a\u010b\b\25\1"+
		"\2\u010b\u010c\5*\26\2\u010c\u0114\3\2\2\2\u010d\u010e\f\4\2\2\u010e\u010f"+
		"\7\n\2\2\u010f\u0110\5.\30\2\u0110\u0111\7\13\2\2\u0111\u0113\3\2\2\2"+
		"\u0112\u010d\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115)\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\b\26\1\2\u0118"+
		"\u0119\5,\27\2\u0119\u0133\3\2\2\2\u011a\u011b\f\6\2\2\u011b\u011c\7!"+
		"\2\2\u011c\u0132\7\"\2\2\u011d\u011e\f\5\2\2\u011e\u011f\7!\2\2\u011f"+
		"\u0120\5\62\32\2\u0120\u0121\7\b\2\2\u0121\u0122\7\f\2\2\u0122\u0132\3"+
		"\2\2\2\u0123\u0124\f\4\2\2\u0124\u0125\7!\2\2\u0125\u0126\5\62\32\2\u0126"+
		"\u0127\7\b\2\2\u0127\u012c\5.\30\2\u0128\u0129\7\21\2\2\u0129\u012b\5"+
		".\30\2\u012a\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\f"+
		"\2\2\u0130\u0132\3\2\2\2\u0131\u011a\3\2\2\2\u0131\u011d\3\2\2\2\u0131"+
		"\u0123\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134+\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u013e\5\64\33\2\u0137\u013e"+
		"\5\60\31\2\u0138\u013e\5\62\32\2\u0139\u013a\7\b\2\2\u013a\u013b\5\32"+
		"\16\2\u013b\u013c\7\f\2\2\u013c\u013e\3\2\2\2\u013d\u0136\3\2\2\2\u013d"+
		"\u0137\3\2\2\2\u013d\u0138\3\2\2\2\u013d\u0139\3\2\2\2\u013e-\3\2\2\2"+
		"\u013f\u0144\5\64\33\2\u0140\u0144\5\60\31\2\u0141\u0144\5\62\32\2\u0142"+
		"\u0144\5\32\16\2\u0143\u013f\3\2\2\2\u0143\u0140\3\2\2\2\u0143\u0141\3"+
		"\2\2\2\u0143\u0142\3\2\2\2\u0144/\3\2\2\2\u0145\u0146\t\3\2\2\u0146\61"+
		"\3\2\2\2\u0147\u0148\7&\2\2\u0148\63\3\2\2\2\u0149\u014a\7\'\2\2\u014a"+
		"\65\3\2\2\2\32:Rbh{~\u0085\u008b\u0099\u009f\u00c4\u00d0\u00db\u00e6\u00f1"+
		"\u00f7\u0100\u0108\u0114\u012c\u0131\u0133\u013d\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}