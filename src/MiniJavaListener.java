// Generated from MiniJava.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(MiniJavaParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(MiniJavaParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#baseclass}.
	 * @param ctx the parse tree
	 */
	void enterBaseclass(MiniJavaParser.BaseclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#baseclass}.
	 * @param ctx the parse tree
	 */
	void exitBaseclass(MiniJavaParser.BaseclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarations(MiniJavaParser.VarDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarations(MiniJavaParser.VarDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarations(MiniJavaParser.MethodDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarations(MiniJavaParser.MethodDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAllStatement(MiniJavaParser.AllStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAllStatement(MiniJavaParser.AllStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(MiniJavaParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(MiniJavaParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(MiniJavaParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(MiniJavaParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sprint}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSprint(MiniJavaParser.SprintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sprint}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSprint(MiniJavaParser.SprintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indentifier}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIndentifier(MiniJavaParser.IndentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indentifier}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIndentifier(MiniJavaParser.IndentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierOneofArray}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierOneofArray(MiniJavaParser.IdentifierOneofArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierOneofArray}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierOneofArray(MiniJavaParser.IdentifierOneofArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextAnd}
	 * labeled alternative in {@link MiniJavaParser#and}.
	 * @param ctx the parse tree
	 */
	void enterNextAnd(MiniJavaParser.NextAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextAnd}
	 * labeled alternative in {@link MiniJavaParser#and}.
	 * @param ctx the parse tree
	 */
	void exitNextAnd(MiniJavaParser.NextAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andTo}
	 * labeled alternative in {@link MiniJavaParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAndTo(MiniJavaParser.AndToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andTo}
	 * labeled alternative in {@link MiniJavaParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAndTo(MiniJavaParser.AndToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link MiniJavaParser#less}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(MiniJavaParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link MiniJavaParser#less}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(MiniJavaParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextLess}
	 * labeled alternative in {@link MiniJavaParser#less}.
	 * @param ctx the parse tree
	 */
	void enterNextLess(MiniJavaParser.NextLessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextLess}
	 * labeled alternative in {@link MiniJavaParser#less}.
	 * @param ctx the parse tree
	 */
	void exitNextLess(MiniJavaParser.NextLessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusTo}
	 * labeled alternative in {@link MiniJavaParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlusTo(MiniJavaParser.PlusToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusTo}
	 * labeled alternative in {@link MiniJavaParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlusTo(MiniJavaParser.PlusToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextPlus}
	 * labeled alternative in {@link MiniJavaParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterNextPlus(MiniJavaParser.NextPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextPlus}
	 * labeled alternative in {@link MiniJavaParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitNextPlus(MiniJavaParser.NextPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextMultiply}
	 * labeled alternative in {@link MiniJavaParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterNextMultiply(MiniJavaParser.NextMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextMultiply}
	 * labeled alternative in {@link MiniJavaParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitNextMultiply(MiniJavaParser.NextMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyTo}
	 * labeled alternative in {@link MiniJavaParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyTo(MiniJavaParser.MultiplyToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyTo}
	 * labeled alternative in {@link MiniJavaParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyTo(MiniJavaParser.MultiplyToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notTo}
	 * labeled alternative in {@link MiniJavaParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNotTo(MiniJavaParser.NotToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notTo}
	 * labeled alternative in {@link MiniJavaParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNotTo(MiniJavaParser.NotToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextNot}
	 * labeled alternative in {@link MiniJavaParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNextNot(MiniJavaParser.NextNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextNot}
	 * labeled alternative in {@link MiniJavaParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNextNot(MiniJavaParser.NextNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newarrayTo}
	 * labeled alternative in {@link MiniJavaParser#newarray}.
	 * @param ctx the parse tree
	 */
	void enterNewarrayTo(MiniJavaParser.NewarrayToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newarrayTo}
	 * labeled alternative in {@link MiniJavaParser#newarray}.
	 * @param ctx the parse tree
	 */
	void exitNewarrayTo(MiniJavaParser.NewarrayToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextneWarray}
	 * labeled alternative in {@link MiniJavaParser#newarray}.
	 * @param ctx the parse tree
	 */
	void enterNextneWarray(MiniJavaParser.NextneWarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextneWarray}
	 * labeled alternative in {@link MiniJavaParser#newarray}.
	 * @param ctx the parse tree
	 */
	void exitNextneWarray(MiniJavaParser.NextneWarrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newTo}
	 * labeled alternative in {@link MiniJavaParser#newid}.
	 * @param ctx the parse tree
	 */
	void enterNewTo(MiniJavaParser.NewToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newTo}
	 * labeled alternative in {@link MiniJavaParser#newid}.
	 * @param ctx the parse tree
	 */
	void exitNewTo(MiniJavaParser.NewToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextNewid}
	 * labeled alternative in {@link MiniJavaParser#newid}.
	 * @param ctx the parse tree
	 */
	void enterNextNewid(MiniJavaParser.NextNewidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextNewid}
	 * labeled alternative in {@link MiniJavaParser#newid}.
	 * @param ctx the parse tree
	 */
	void exitNextNewid(MiniJavaParser.NextNewidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextArray}
	 * labeled alternative in {@link MiniJavaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterNextArray(MiniJavaParser.NextArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextArray}
	 * labeled alternative in {@link MiniJavaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitNextArray(MiniJavaParser.NextArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayTo}
	 * labeled alternative in {@link MiniJavaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayTo(MiniJavaParser.ArrayToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayTo}
	 * labeled alternative in {@link MiniJavaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayTo(MiniJavaParser.ArrayToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextFunction}
	 * labeled alternative in {@link MiniJavaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterNextFunction(MiniJavaParser.NextFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextFunction}
	 * labeled alternative in {@link MiniJavaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitNextFunction(MiniJavaParser.NextFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionLengh}
	 * labeled alternative in {@link MiniJavaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLengh(MiniJavaParser.FunctionLenghContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionLengh}
	 * labeled alternative in {@link MiniJavaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLengh(MiniJavaParser.FunctionLenghContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionVariable}
	 * labeled alternative in {@link MiniJavaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunctionVariable(MiniJavaParser.FunctionVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionVariable}
	 * labeled alternative in {@link MiniJavaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunctionVariable(MiniJavaParser.FunctionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(MiniJavaParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(MiniJavaParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(MiniJavaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(MiniJavaParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#special}.
	 * @param ctx the parse tree
	 */
	void enterSpecial(MiniJavaParser.SpecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#special}.
	 * @param ctx the parse tree
	 */
	void exitSpecial(MiniJavaParser.SpecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#specialElement}.
	 * @param ctx the parse tree
	 */
	void enterSpecialElement(MiniJavaParser.SpecialElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#specialElement}.
	 * @param ctx the parse tree
	 */
	void exitSpecialElement(MiniJavaParser.SpecialElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MiniJavaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MiniJavaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(MiniJavaParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(MiniJavaParser.IntegerContext ctx);
}