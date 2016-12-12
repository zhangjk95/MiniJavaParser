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
	 * Enter a parse tree produced by the {@code mainMethod}
	 * labeled alternative in {@link MiniJavaParser#mainmethodleaf}.
	 * @param ctx the parse tree
	 */
	void enterMainMethod(MiniJavaParser.MainMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainMethod}
	 * labeled alternative in {@link MiniJavaParser#mainmethodleaf}.
	 * @param ctx the parse tree
	 */
	void exitMainMethod(MiniJavaParser.MainMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mainParam}
	 * labeled alternative in {@link MiniJavaParser#paramfomain}.
	 * @param ctx the parse tree
	 */
	void enterMainParam(MiniJavaParser.MainParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainParam}
	 * labeled alternative in {@link MiniJavaParser#paramfomain}.
	 * @param ctx the parse tree
	 */
	void exitMainParam(MiniJavaParser.MainParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class}
	 * labeled alternative in {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClass(MiniJavaParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class}
	 * labeled alternative in {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClass(MiniJavaParser.ClassContext ctx);
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
	 * Enter a parse tree produced by {@link MiniJavaParser#methods}.
	 * @param ctx the parse tree
	 */
	void enterMethods(MiniJavaParser.MethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methods}.
	 * @param ctx the parse tree
	 */
	void exitMethods(MiniJavaParser.MethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(MiniJavaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(MiniJavaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(MiniJavaParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(MiniJavaParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(MiniJavaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(MiniJavaParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(MiniJavaParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(MiniJavaParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(MiniJavaParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(MiniJavaParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(MiniJavaParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(MiniJavaParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(MiniJavaParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(MiniJavaParser.ReturnTypeContext ctx);
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
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniJavaParser.BlockContext ctx);
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
	 * Enter a parse tree produced by the {@code output}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOutput(MiniJavaParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code output}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOutput(MiniJavaParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MiniJavaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MiniJavaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignArray}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignArray(MiniJavaParser.AssignArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignArray}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignArray(MiniJavaParser.AssignArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn(MiniJavaParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn(MiniJavaParser.ReturnContext ctx);
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
	 * labeled alternative in {@link MiniJavaParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterNextAnd(MiniJavaParser.NextAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextAnd}
	 * labeled alternative in {@link MiniJavaParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitNextAnd(MiniJavaParser.NextAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link MiniJavaParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(MiniJavaParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link MiniJavaParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(MiniJavaParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isLessThan}
	 * labeled alternative in {@link MiniJavaParser#lessExpr}.
	 * @param ctx the parse tree
	 */
	void enterIsLessThan(MiniJavaParser.IsLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isLessThan}
	 * labeled alternative in {@link MiniJavaParser#lessExpr}.
	 * @param ctx the parse tree
	 */
	void exitIsLessThan(MiniJavaParser.IsLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextLess}
	 * labeled alternative in {@link MiniJavaParser#lessExpr}.
	 * @param ctx the parse tree
	 */
	void enterNextLess(MiniJavaParser.NextLessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextLess}
	 * labeled alternative in {@link MiniJavaParser#lessExpr}.
	 * @param ctx the parse tree
	 */
	void exitNextLess(MiniJavaParser.NextLessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link MiniJavaParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(MiniJavaParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link MiniJavaParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(MiniJavaParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link MiniJavaParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(MiniJavaParser.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link MiniJavaParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(MiniJavaParser.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextAdd}
	 * labeled alternative in {@link MiniJavaParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterNextAdd(MiniJavaParser.NextAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextAdd}
	 * labeled alternative in {@link MiniJavaParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitNextAdd(MiniJavaParser.NextAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextMultiply}
	 * labeled alternative in {@link MiniJavaParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void enterNextMultiply(MiniJavaParser.NextMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextMultiply}
	 * labeled alternative in {@link MiniJavaParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void exitNextMultiply(MiniJavaParser.NextMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link MiniJavaParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(MiniJavaParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link MiniJavaParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(MiniJavaParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link MiniJavaParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNot(MiniJavaParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link MiniJavaParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNot(MiniJavaParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextNot}
	 * labeled alternative in {@link MiniJavaParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNextNot(MiniJavaParser.NextNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextNot}
	 * labeled alternative in {@link MiniJavaParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNextNot(MiniJavaParser.NextNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newarray}
	 * labeled alternative in {@link MiniJavaParser#newarrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterNewarray(MiniJavaParser.NewarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newarray}
	 * labeled alternative in {@link MiniJavaParser#newarrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitNewarray(MiniJavaParser.NewarrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextneWarray}
	 * labeled alternative in {@link MiniJavaParser#newarrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterNextneWarray(MiniJavaParser.NextneWarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextneWarray}
	 * labeled alternative in {@link MiniJavaParser#newarrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitNextneWarray(MiniJavaParser.NextneWarrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link MiniJavaParser#newidExpr}.
	 * @param ctx the parse tree
	 */
	void enterNew(MiniJavaParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link MiniJavaParser#newidExpr}.
	 * @param ctx the parse tree
	 */
	void exitNew(MiniJavaParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextNewid}
	 * labeled alternative in {@link MiniJavaParser#newidExpr}.
	 * @param ctx the parse tree
	 */
	void enterNextNewid(MiniJavaParser.NextNewidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextNewid}
	 * labeled alternative in {@link MiniJavaParser#newidExpr}.
	 * @param ctx the parse tree
	 */
	void exitNextNewid(MiniJavaParser.NextNewidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextFunction}
	 * labeled alternative in {@link MiniJavaParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterNextFunction(MiniJavaParser.NextFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextFunction}
	 * labeled alternative in {@link MiniJavaParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitNextFunction(MiniJavaParser.NextFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link MiniJavaParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterArray(MiniJavaParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link MiniJavaParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitArray(MiniJavaParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getLength}
	 * labeled alternative in {@link MiniJavaParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterGetLength(MiniJavaParser.GetLengthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getLength}
	 * labeled alternative in {@link MiniJavaParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitGetLength(MiniJavaParser.GetLengthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link MiniJavaParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(MiniJavaParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link MiniJavaParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(MiniJavaParser.MethodCallContext ctx);
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