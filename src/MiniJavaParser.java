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
		RULE_expression = 11, RULE_andExpr = 12, RULE_lessExpr = 13, RULE_addExpr = 14, 
		RULE_multiplyExpr = 15, RULE_notExpr = 16, RULE_newarrayExpr = 17, RULE_newidExpr = 18, 
		RULE_arrayExpr = 19, RULE_functionExpr = 20, RULE_element = 21, RULE_args = 22, 
		RULE_special = 23, RULE_specialElement = 24, RULE_identifier = 25, RULE_integer = 26;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "name", "baseclass", "varDeclarations", 
		"methodDeclarations", "varDeclaration", "methodDeclaration", "type", "statement", 
		"expression", "andExpr", "lessExpr", "addExpr", "multiplyExpr", "notExpr", 
		"newarrayExpr", "newidExpr", "arrayExpr", "functionExpr", "element", "args", 
		"special", "specialElement", "identifier", "integer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'public'", "'static'", "'void'", "'main'", "'('", "'String'", 
		"'['", "']'", "')'", "'}'", "'class'", "'extends'", "';'", "','", "'return'", 
		"'int'", "'boolean'", "'if'", "'else'", "'while'", "'System.out.println'", 
		"'='", "'&&'", "'<'", "'+'", "'-'", "'*'", "'!'", "'new'", "'.'", "'length'", 
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
			setState(54);
			mainClass();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(55);
				classDeclaration();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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
			setState(63);
			name();
			setState(64);
			match(T__0);
			setState(65);
			match(T__1);
			setState(66);
			match(T__2);
			setState(67);
			match(T__3);
			setState(68);
			match(T__4);
			setState(69);
			match(T__5);
			setState(70);
			match(T__6);
			setState(71);
			match(T__7);
			setState(72);
			match(T__8);
			setState(73);
			identifier();
			setState(74);
			match(T__9);
			setState(75);
			match(T__0);
			setState(76);
			statement();
			setState(77);
			match(T__10);
			setState(78);
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
			setState(80);
			name();
			setState(82);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(81);
				baseclass();
				}
			}

			setState(84);
			match(T__0);
			setState(85);
			varDeclarations();
			setState(86);
			methodDeclarations();
			setState(87);
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
			setState(89);
			match(T__11);
			setState(90);
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
			setState(92);
			match(T__12);
			setState(93);
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
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << Identifier))) != 0)) {
				{
				{
				setState(95);
				varDeclaration();
				}
				}
				setState(100);
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
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(101);
				methodDeclaration();
				}
				}
				setState(106);
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
			setState(107);
			type();
			setState(108);
			identifier();
			setState(109);
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
			setState(111);
			match(T__1);
			setState(112);
			type();
			setState(113);
			identifier();
			setState(114);
			match(T__5);
			setState(126);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << Identifier))) != 0)) {
				{
				setState(115);
				type();
				setState(116);
				identifier();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(117);
					match(T__14);
					setState(118);
					type();
					setState(119);
					identifier();
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(128);
			match(T__9);
			setState(129);
			match(T__0);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					varDeclaration();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
				{
				{
				setState(136);
				statement();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(T__15);
			setState(143);
			expression();
			setState(144);
			match(T__13);
			setState(145);
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
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__16);
				setState(148);
				match(T__7);
				setState(149);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(Identifier);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllStantementContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public AllStantementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAllStantement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAllStantement(this);
		}
	}
	public static class SprintContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SprintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterSprint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitSprint(this);
		}
	}
	public static class IndentifierContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndentifierContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIndentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIndentifier(this);
		}
	}
	public static class IdentifierOneofArrayContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierOneofArrayContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifierOneofArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifierOneofArray(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitWhile(this);
		}
	}
	public static class IfContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIf(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AllStantementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(T__0);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
					{
					{
					setState(156);
					statement();
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				match(T__10);
				}
				break;
			case 2:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__18);
				setState(164);
				match(T__5);
				setState(165);
				expression();
				setState(166);
				match(T__9);
				setState(167);
				statement();
				setState(168);
				match(T__19);
				setState(169);
				statement();
				}
				break;
			case 3:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(T__20);
				setState(172);
				match(T__5);
				setState(173);
				expression();
				setState(174);
				match(T__9);
				setState(175);
				statement();
				}
				break;
			case 4:
				_localctx = new SprintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(T__21);
				setState(178);
				match(T__5);
				setState(179);
				expression();
				setState(180);
				match(T__9);
				setState(181);
				match(T__13);
				}
				break;
			case 5:
				_localctx = new IndentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				identifier();
				setState(184);
				match(T__22);
				setState(185);
				expression();
				setState(186);
				match(T__13);
				}
				break;
			case 6:
				_localctx = new IdentifierOneofArrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				identifier();
				setState(189);
				match(T__7);
				setState(190);
				expression();
				setState(191);
				match(T__8);
				setState(192);
				match(T__22);
				setState(193);
				expression();
				setState(194);
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
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
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
			setState(198);
			andExpr(0);
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

	public static class AndExprContext extends ParserRuleContext {
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
	 
		public AndExprContext() { }
		public void copyFrom(AndExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NextAndContext extends AndExprContext {
		public LessExprContext lessExpr() {
			return getRuleContext(LessExprContext.class,0);
		}
		public NextAndContext(AndExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextAnd(this);
		}
	}
	public static class AndContext extends AndExprContext {
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public LessExprContext lessExpr() {
			return getRuleContext(LessExprContext.class,0);
		}
		public AndContext(AndExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAnd(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		return andExpr(0);
	}

	private AndExprContext andExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExprContext _localctx = new AndExprContext(_ctx, _parentState);
		AndExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_andExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextAndContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(201);
			lessExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndContext(new AndExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_andExpr);
					setState(203);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(204);
					match(T__23);
					setState(205);
					lessExpr(0);
					}
					} 
				}
				setState(210);
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

	public static class LessExprContext extends ParserRuleContext {
		public LessExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessExpr; }
	 
		public LessExprContext() { }
		public void copyFrom(LessExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LessThanContext extends LessExprContext {
		public LessExprContext lessExpr() {
			return getRuleContext(LessExprContext.class,0);
		}
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public LessThanContext(LessExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLessThan(this);
		}
	}
	public static class NextLessContext extends LessExprContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public NextLessContext(LessExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextLess(this);
		}
	}

	public final LessExprContext lessExpr() throws RecognitionException {
		return lessExpr(0);
	}

	private LessExprContext lessExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LessExprContext _localctx = new LessExprContext(_ctx, _parentState);
		LessExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_lessExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextLessContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(212);
			addExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LessThanContext(new LessExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lessExpr);
					setState(214);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(215);
					match(T__24);
					setState(216);
					addExpr(0);
					}
					} 
				}
				setState(221);
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

	public static class AddExprContext extends ParserRuleContext {
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
	 
		public AddExprContext() { }
		public void copyFrom(AddExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends AddExprContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public MultiplyExprContext multiplyExpr() {
			return getRuleContext(MultiplyExprContext.class,0);
		}
		public AddContext(AddExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAdd(this);
		}
	}
	public static class SubtractContext extends AddExprContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public MultiplyExprContext multiplyExpr() {
			return getRuleContext(MultiplyExprContext.class,0);
		}
		public SubtractContext(AddExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitSubtract(this);
		}
	}
	public static class NextPlusContext extends AddExprContext {
		public MultiplyExprContext multiplyExpr() {
			return getRuleContext(MultiplyExprContext.class,0);
		}
		public NextPlusContext(AddExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextPlus(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		return addExpr(0);
	}

	private AddExprContext addExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddExprContext _localctx = new AddExprContext(_ctx, _parentState);
		AddExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_addExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextPlusContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(223);
			multiplyExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(231);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new AddExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(225);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(226);
						match(T__25);
						setState(227);
						multiplyExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new SubtractContext(new AddExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(228);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(229);
						match(T__26);
						setState(230);
						multiplyExpr(0);
						}
						break;
					}
					} 
				}
				setState(235);
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

	public static class MultiplyExprContext extends ParserRuleContext {
		public MultiplyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExpr; }
	 
		public MultiplyExprContext() { }
		public void copyFrom(MultiplyExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NextMultiplyContext extends MultiplyExprContext {
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public NextMultiplyContext(MultiplyExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextMultiply(this);
		}
	}
	public static class MultiplyContext extends MultiplyExprContext {
		public MultiplyExprContext multiplyExpr() {
			return getRuleContext(MultiplyExprContext.class,0);
		}
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public MultiplyContext(MultiplyExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMultiply(this);
		}
	}

	public final MultiplyExprContext multiplyExpr() throws RecognitionException {
		return multiplyExpr(0);
	}

	private MultiplyExprContext multiplyExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplyExprContext _localctx = new MultiplyExprContext(_ctx, _parentState);
		MultiplyExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_multiplyExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextMultiplyContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(237);
			notExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplyContext(new MultiplyExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_multiplyExpr);
					setState(239);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(240);
					match(T__27);
					setState(241);
					notExpr();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class NotExprContext extends ParserRuleContext {
		public NotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpr; }
	 
		public NotExprContext() { }
		public void copyFrom(NotExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends NotExprContext {
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public NotContext(NotExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNot(this);
		}
	}
	public static class NextNotContext extends NotExprContext {
		public NewarrayExprContext newarrayExpr() {
			return getRuleContext(NewarrayExprContext.class,0);
		}
		public NextNotContext(NotExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextNot(this);
		}
	}

	public final NotExprContext notExpr() throws RecognitionException {
		NotExprContext _localctx = new NotExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_notExpr);
		try {
			setState(250);
			switch (_input.LA(1)) {
			case T__28:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__28);
				setState(248);
				notExpr();
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
				setState(249);
				newarrayExpr();
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

	public static class NewarrayExprContext extends ParserRuleContext {
		public NewarrayExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newarrayExpr; }
	 
		public NewarrayExprContext() { }
		public void copyFrom(NewarrayExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewarrayContext extends NewarrayExprContext {
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public NewarrayContext(NewarrayExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNewarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNewarray(this);
		}
	}
	public static class NextneWarrayContext extends NewarrayExprContext {
		public NewidExprContext newidExpr() {
			return getRuleContext(NewidExprContext.class,0);
		}
		public NextneWarrayContext(NewarrayExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextneWarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextneWarray(this);
		}
	}

	public final NewarrayExprContext newarrayExpr() throws RecognitionException {
		NewarrayExprContext _localctx = new NewarrayExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_newarrayExpr);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new NewarrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(T__29);
				setState(253);
				match(T__16);
				setState(254);
				match(T__7);
				setState(255);
				special();
				setState(256);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new NextneWarrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				newidExpr();
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

	public static class NewidExprContext extends ParserRuleContext {
		public NewidExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newidExpr; }
	 
		public NewidExprContext() { }
		public void copyFrom(NewidExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewContext extends NewidExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NewContext(NewidExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNew(this);
		}
	}
	public static class NextNewidContext extends NewidExprContext {
		public ArrayExprContext arrayExpr() {
			return getRuleContext(ArrayExprContext.class,0);
		}
		public NextNewidContext(NewidExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextNewid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextNewid(this);
		}
	}

	public final NewidExprContext newidExpr() throws RecognitionException {
		NewidExprContext _localctx = new NewidExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_newidExpr);
		try {
			setState(267);
			switch (_input.LA(1)) {
			case T__29:
				_localctx = new NewContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(T__29);
				setState(262);
				identifier();
				setState(263);
				match(T__5);
				setState(264);
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
				setState(266);
				arrayExpr(0);
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

	public static class ArrayExprContext extends ParserRuleContext {
		public ArrayExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpr; }
	 
		public ArrayExprContext() { }
		public void copyFrom(ArrayExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NextArrayContext extends ArrayExprContext {
		public FunctionExprContext functionExpr() {
			return getRuleContext(FunctionExprContext.class,0);
		}
		public NextArrayContext(ArrayExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextArray(this);
		}
	}
	public static class ArrayContext extends ArrayExprContext {
		public ArrayExprContext arrayExpr() {
			return getRuleContext(ArrayExprContext.class,0);
		}
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public ArrayContext(ArrayExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArray(this);
		}
	}

	public final ArrayExprContext arrayExpr() throws RecognitionException {
		return arrayExpr(0);
	}

	private ArrayExprContext arrayExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArrayExprContext _localctx = new ArrayExprContext(_ctx, _parentState);
		ArrayExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_arrayExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextArrayContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(270);
			functionExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayContext(new ArrayExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_arrayExpr);
					setState(272);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(273);
					match(T__7);
					setState(274);
					special();
					setState(275);
					match(T__8);
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class FunctionExprContext extends ParserRuleContext {
		public FunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpr; }
	 
		public FunctionExprContext() { }
		public void copyFrom(FunctionExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NextFunctionContext extends FunctionExprContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public NextFunctionContext(FunctionExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNextFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNextFunction(this);
		}
	}
	public static class FunctionLenghContext extends FunctionExprContext {
		public FunctionExprContext functionExpr() {
			return getRuleContext(FunctionExprContext.class,0);
		}
		public FunctionLenghContext(FunctionExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFunctionLengh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFunctionLengh(this);
		}
	}
	public static class FunctionVariableContext extends FunctionExprContext {
		public FunctionExprContext functionExpr() {
			return getRuleContext(FunctionExprContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunctionVariableContext(FunctionExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFunctionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFunctionVariable(this);
		}
	}

	public final FunctionExprContext functionExpr() throws RecognitionException {
		return functionExpr(0);
	}

	private FunctionExprContext functionExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FunctionExprContext _localctx = new FunctionExprContext(_ctx, _parentState);
		FunctionExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_functionExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NextFunctionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(283);
			element();
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(295);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new FunctionLenghContext(new FunctionExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_functionExpr);
						setState(285);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(286);
						match(T__30);
						setState(287);
						match(T__31);
						}
						break;
					case 2:
						{
						_localctx = new FunctionVariableContext(new FunctionExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_functionExpr);
						setState(288);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(289);
						match(T__30);
						setState(290);
						identifier();
						setState(291);
						match(T__5);
						setState(292);
						args();
						setState(293);
						match(T__9);
						}
						break;
					}
					} 
				}
				setState(299);
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
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
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
			setState(307);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				integer();
				}
				break;
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				specialElement();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				identifier();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				match(T__5);
				setState(304);
				andExpr(0);
				setState(305);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<SpecialContext> special() {
			return getRuleContexts(SpecialContext.class);
		}
		public SpecialContext special(int i) {
			return getRuleContext(SpecialContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__28) | (1L << T__29) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << Identifier) | (1L << INTEGER_LITERAL))) != 0)) {
				{
				setState(309);
				special();
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(310);
					match(T__14);
					setState(311);
					special();
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
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
		enterRule(_localctx, 46, RULE_special);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				specialElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				andExpr(0);
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
		enterRule(_localctx, 48, RULE_specialElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
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
		enterRule(_localctx, 50, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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
		enterRule(_localctx, 52, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
			return andExpr_sempred((AndExprContext)_localctx, predIndex);
		case 13:
			return lessExpr_sempred((LessExprContext)_localctx, predIndex);
		case 14:
			return addExpr_sempred((AddExprContext)_localctx, predIndex);
		case 15:
			return multiplyExpr_sempred((MultiplyExprContext)_localctx, predIndex);
		case 19:
			return arrayExpr_sempred((ArrayExprContext)_localctx, predIndex);
		case 20:
			return functionExpr_sempred((FunctionExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean andExpr_sempred(AndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lessExpr_sempred(LessExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean addExpr_sempred(AddExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplyExpr_sempred(MultiplyExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arrayExpr_sempred(ArrayExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean functionExpr_sempred(FunctionExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u014e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\5\4U\n\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\7\7c\n"+
		"\7\f\7\16\7f\13\7\3\b\7\bi\n\b\f\b\16\bl\13\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\5\n\u0081"+
		"\n\n\3\n\3\n\3\n\7\n\u0086\n\n\f\n\16\n\u0089\13\n\3\n\7\n\u008c\n\n\f"+
		"\n\16\n\u008f\13\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u009c\n\13\3\f\3\f\7\f\u00a0\n\f\f\f\16\f\u00a3\13\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c7\n\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00d1\n\16\f\16\16\16\u00d4\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00dc\n\17\f\17\16\17\u00df\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00ea\n\20\f\20"+
		"\16\20\u00ed\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f5\n\21\f\21"+
		"\16\21\u00f8\13\21\3\22\3\22\3\22\5\22\u00fd\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0106\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010e"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0118\n\25\f\25\16"+
		"\25\u011b\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u012a\n\26\f\26\16\26\u012d\13\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0136\n\27\3\30\3\30\3\30\7\30\u013b\n\30\f\30\16"+
		"\30\u013e\13\30\5\30\u0140\n\30\3\31\3\31\3\31\3\31\5\31\u0146\n\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\34\2\b\32\34\36 (*\35\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\3\3\2#%\u0156\28\3\2\2\2"+
		"\4A\3\2\2\2\6R\3\2\2\2\b[\3\2\2\2\n^\3\2\2\2\fd\3\2\2\2\16j\3\2\2\2\20"+
		"m\3\2\2\2\22q\3\2\2\2\24\u009b\3\2\2\2\26\u00c6\3\2\2\2\30\u00c8\3\2\2"+
		"\2\32\u00ca\3\2\2\2\34\u00d5\3\2\2\2\36\u00e0\3\2\2\2 \u00ee\3\2\2\2\""+
		"\u00fc\3\2\2\2$\u0105\3\2\2\2&\u010d\3\2\2\2(\u010f\3\2\2\2*\u011c\3\2"+
		"\2\2,\u0135\3\2\2\2.\u013f\3\2\2\2\60\u0145\3\2\2\2\62\u0147\3\2\2\2\64"+
		"\u0149\3\2\2\2\66\u014b\3\2\2\28<\5\4\3\29;\5\6\4\2:9\3\2\2\2;>\3\2\2"+
		"\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\2\2\3@\3\3\2\2\2AB\5\b"+
		"\5\2BC\7\3\2\2CD\7\4\2\2DE\7\5\2\2EF\7\6\2\2FG\7\7\2\2GH\7\b\2\2HI\7\t"+
		"\2\2IJ\7\n\2\2JK\7\13\2\2KL\5\64\33\2LM\7\f\2\2MN\7\3\2\2NO\5\26\f\2O"+
		"P\7\r\2\2PQ\7\r\2\2Q\5\3\2\2\2RT\5\b\5\2SU\5\n\6\2TS\3\2\2\2TU\3\2\2\2"+
		"UV\3\2\2\2VW\7\3\2\2WX\5\f\7\2XY\5\16\b\2YZ\7\r\2\2Z\7\3\2\2\2[\\\7\16"+
		"\2\2\\]\5\64\33\2]\t\3\2\2\2^_\7\17\2\2_`\5\64\33\2`\13\3\2\2\2ac\5\20"+
		"\t\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\r\3\2\2\2fd\3\2\2\2gi\5"+
		"\22\n\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\17\3\2\2\2lj\3\2\2\2"+
		"mn\5\24\13\2no\5\64\33\2op\7\20\2\2p\21\3\2\2\2qr\7\4\2\2rs\5\24\13\2"+
		"st\5\64\33\2t\u0080\7\b\2\2uv\5\24\13\2v}\5\64\33\2wx\7\21\2\2xy\5\24"+
		"\13\2yz\5\64\33\2z|\3\2\2\2{w\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2"+
		"~\u0081\3\2\2\2\177}\3\2\2\2\u0080u\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\7\f\2\2\u0083\u0087\7\3\2\2\u0084\u0086\5\20"+
		"\t\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008d\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\5\26"+
		"\f\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\22"+
		"\2\2\u0091\u0092\5\30\r\2\u0092\u0093\7\20\2\2\u0093\u0094\7\r\2\2\u0094"+
		"\23\3\2\2\2\u0095\u0096\7\23\2\2\u0096\u0097\7\n\2\2\u0097\u009c\7\13"+
		"\2\2\u0098\u009c\7\24\2\2\u0099\u009c\7\23\2\2\u009a\u009c\7&\2\2\u009b"+
		"\u0095\3\2\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2"+
		"\2\2\u009c\25\3\2\2\2\u009d\u00a1\7\3\2\2\u009e\u00a0\5\26\f\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00c7\7\r\2\2\u00a5\u00a6\7\25"+
		"\2\2\u00a6\u00a7\7\b\2\2\u00a7\u00a8\5\30\r\2\u00a8\u00a9\7\f\2\2\u00a9"+
		"\u00aa\5\26\f\2\u00aa\u00ab\7\26\2\2\u00ab\u00ac\5\26\f\2\u00ac\u00c7"+
		"\3\2\2\2\u00ad\u00ae\7\27\2\2\u00ae\u00af\7\b\2\2\u00af\u00b0\5\30\r\2"+
		"\u00b0\u00b1\7\f\2\2\u00b1\u00b2\5\26\f\2\u00b2\u00c7\3\2\2\2\u00b3\u00b4"+
		"\7\30\2\2\u00b4\u00b5\7\b\2\2\u00b5\u00b6\5\30\r\2\u00b6\u00b7\7\f\2\2"+
		"\u00b7\u00b8\7\20\2\2\u00b8\u00c7\3\2\2\2\u00b9\u00ba\5\64\33\2\u00ba"+
		"\u00bb\7\31\2\2\u00bb\u00bc\5\30\r\2\u00bc\u00bd\7\20\2\2\u00bd\u00c7"+
		"\3\2\2\2\u00be\u00bf\5\64\33\2\u00bf\u00c0\7\n\2\2\u00c0\u00c1\5\30\r"+
		"\2\u00c1\u00c2\7\13\2\2\u00c2\u00c3\7\31\2\2\u00c3\u00c4\5\30\r\2\u00c4"+
		"\u00c5\7\20\2\2\u00c5\u00c7\3\2\2\2\u00c6\u009d\3\2\2\2\u00c6\u00a5\3"+
		"\2\2\2\u00c6\u00ad\3\2\2\2\u00c6\u00b3\3\2\2\2\u00c6\u00b9\3\2\2\2\u00c6"+
		"\u00be\3\2\2\2\u00c7\27\3\2\2\2\u00c8\u00c9\5\32\16\2\u00c9\31\3\2\2\2"+
		"\u00ca\u00cb\b\16\1\2\u00cb\u00cc\5\34\17\2\u00cc\u00d2\3\2\2\2\u00cd"+
		"\u00ce\f\4\2\2\u00ce\u00cf\7\32\2\2\u00cf\u00d1\5\34\17\2\u00d0\u00cd"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\33\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\b\17\1\2\u00d6\u00d7\5\36"+
		"\20\2\u00d7\u00dd\3\2\2\2\u00d8\u00d9\f\4\2\2\u00d9\u00da\7\33\2\2\u00da"+
		"\u00dc\5\36\20\2\u00db\u00d8\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00de\35\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e1\b\20\1\2\u00e1\u00e2\5 \21\2\u00e2\u00eb\3\2\2\2\u00e3\u00e4\f"+
		"\5\2\2\u00e4\u00e5\7\34\2\2\u00e5\u00ea\5 \21\2\u00e6\u00e7\f\4\2\2\u00e7"+
		"\u00e8\7\35\2\2\u00e8\u00ea\5 \21\2\u00e9\u00e3\3\2\2\2\u00e9\u00e6\3"+
		"\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\37\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\b\21\1\2\u00ef\u00f0\5\"\22"+
		"\2\u00f0\u00f6\3\2\2\2\u00f1\u00f2\f\4\2\2\u00f2\u00f3\7\36\2\2\u00f3"+
		"\u00f5\5\"\22\2\u00f4\u00f1\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3"+
		"\2\2\2\u00f6\u00f7\3\2\2\2\u00f7!\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa"+
		"\7\37\2\2\u00fa\u00fd\5\"\22\2\u00fb\u00fd\5$\23\2\u00fc\u00f9\3\2\2\2"+
		"\u00fc\u00fb\3\2\2\2\u00fd#\3\2\2\2\u00fe\u00ff\7 \2\2\u00ff\u0100\7\23"+
		"\2\2\u0100\u0101\7\n\2\2\u0101\u0102\5\60\31\2\u0102\u0103\7\13\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0106\5&\24\2\u0105\u00fe\3\2\2\2\u0105\u0104\3\2"+
		"\2\2\u0106%\3\2\2\2\u0107\u0108\7 \2\2\u0108\u0109\5\64\33\2\u0109\u010a"+
		"\7\b\2\2\u010a\u010b\7\f\2\2\u010b\u010e\3\2\2\2\u010c\u010e\5(\25\2\u010d"+
		"\u0107\3\2\2\2\u010d\u010c\3\2\2\2\u010e\'\3\2\2\2\u010f\u0110\b\25\1"+
		"\2\u0110\u0111\5*\26\2\u0111\u0119\3\2\2\2\u0112\u0113\f\4\2\2\u0113\u0114"+
		"\7\n\2\2\u0114\u0115\5\60\31\2\u0115\u0116\7\13\2\2\u0116\u0118\3\2\2"+
		"\2\u0117\u0112\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a)\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\b\26\1\2\u011d"+
		"\u011e\5,\27\2\u011e\u012b\3\2\2\2\u011f\u0120\f\5\2\2\u0120\u0121\7!"+
		"\2\2\u0121\u012a\7\"\2\2\u0122\u0123\f\4\2\2\u0123\u0124\7!\2\2\u0124"+
		"\u0125\5\64\33\2\u0125\u0126\7\b\2\2\u0126\u0127\5.\30\2\u0127\u0128\7"+
		"\f\2\2\u0128\u012a\3\2\2\2\u0129\u011f\3\2\2\2\u0129\u0122\3\2\2\2\u012a"+
		"\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c+\3\2\2\2"+
		"\u012d\u012b\3\2\2\2\u012e\u0136\5\66\34\2\u012f\u0136\5\62\32\2\u0130"+
		"\u0136\5\64\33\2\u0131\u0132\7\b\2\2\u0132\u0133\5\32\16\2\u0133\u0134"+
		"\7\f\2\2\u0134\u0136\3\2\2\2\u0135\u012e\3\2\2\2\u0135\u012f\3\2\2\2\u0135"+
		"\u0130\3\2\2\2\u0135\u0131\3\2\2\2\u0136-\3\2\2\2\u0137\u013c\5\60\31"+
		"\2\u0138\u0139\7\21\2\2\u0139\u013b\5\60\31\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0140\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013f\u0137\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"/\3\2\2\2\u0141\u0146\5\66\34\2\u0142\u0146\5\62\32\2\u0143\u0146\5\64"+
		"\33\2\u0144\u0146\5\32\16\2\u0145\u0141\3\2\2\2\u0145\u0142\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\61\3\2\2\2\u0147\u0148\t\2\2"+
		"\2\u0148\63\3\2\2\2\u0149\u014a\7&\2\2\u014a\65\3\2\2\2\u014b\u014c\7"+
		"\'\2\2\u014c\67\3\2\2\2\34<Tdj}\u0080\u0087\u008d\u009b\u00a1\u00c6\u00d2"+
		"\u00dd\u00e9\u00eb\u00f6\u00fc\u0105\u010d\u0119\u0129\u012b\u0135\u013c"+
		"\u013f\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}