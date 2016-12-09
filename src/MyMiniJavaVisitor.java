import org.antlr.v4.runtime.tree.Tree;

public class MyMiniJavaVisitor extends MiniJavaBaseVisitor<Tree> {
    @Override
    public Tree visitExpression(MiniJavaParser.ExpressionContext ctx) {
        ctx.ex
    }
}