// Generated from MiniJava.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mainMethod}
	 * labeled alternative in {@link MiniJavaParser#mainmethodleaf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethod(MiniJavaParser.MainMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code class}
	 * labeled alternative in {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(MiniJavaParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#baseclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseclass(MiniJavaParser.BaseclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethods(MiniJavaParser.MethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(MiniJavaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(MiniJavaParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(MiniJavaParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(MiniJavaParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(MiniJavaParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(MiniJavaParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(MiniJavaParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiniJavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiniJavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(MiniJavaParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(MiniJavaParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code output}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(MiniJavaParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(MiniJavaParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignArray}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignArray(MiniJavaParser.AssignArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(MiniJavaParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nextAnd}
	 * labeled alternative in {@link MiniJavaParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextAnd(MiniJavaParser.NextAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link MiniJavaParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(MiniJavaParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isLessThan}
	 * labeled alternative in {@link MiniJavaParser#lessExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsLessThan(MiniJavaParser.IsLessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nextLess}
	 * labeled alternative in {@link MiniJavaParser#lessExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextLess(MiniJavaParser.NextLessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link MiniJavaParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(MiniJavaParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link MiniJavaParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract(MiniJavaParser.SubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nextPlus}
	 * labeled alternative in {@link MiniJavaParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextPlus(MiniJavaParser.NextPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nextMultiply}
	 * labeled alternative in {@link MiniJavaParser#multiplyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextMultiply(MiniJavaParser.NextMultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link MiniJavaParser#multiplyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(MiniJavaParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link MiniJavaParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(MiniJavaParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nextNot}
	 * labeled alternative in {@link MiniJavaParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextNot(MiniJavaParser.NextNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newarray}
	 * labeled alternative in {@link MiniJavaParser#newarrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewarray(MiniJavaParser.NewarrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nextneWarray}
	 * labeled alternative in {@link MiniJavaParser#newarrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextneWarray(MiniJavaParser.NextneWarrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new}
	 * labeled alternative in {@link MiniJavaParser#newidExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(MiniJavaParser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nextNewid}
	 * labeled alternative in {@link MiniJavaParser#newidExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextNewid(MiniJavaParser.NextNewidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nextArray}
	 * labeled alternative in {@link MiniJavaParser#arrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextArray(MiniJavaParser.NextArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array}
	 * labeled alternative in {@link MiniJavaParser#arrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(MiniJavaParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nextFunction}
	 * labeled alternative in {@link MiniJavaParser#functionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextFunction(MiniJavaParser.NextFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getLength}
	 * labeled alternative in {@link MiniJavaParser#functionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetLength(MiniJavaParser.GetLengthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link MiniJavaParser#functionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(MiniJavaParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(MiniJavaParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(MiniJavaParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial(MiniJavaParser.SpecialContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(MiniJavaParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#specialElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialElement(MiniJavaParser.SpecialElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MiniJavaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(MiniJavaParser.IntegerContext ctx);
}