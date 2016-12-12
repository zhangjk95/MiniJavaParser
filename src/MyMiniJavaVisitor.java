import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMiniJavaVisitor extends MiniJavaBaseVisitor<Tree> {

    @Override
    public Tree visit(ParseTree tree) {
        return visit(tree, null);
    }

    public Tree visit(ParseTree tree, Tree parent) {
        if (isError(tree)) {
            return new ErrorNodeImpl(new CommonToken(0, getDisplayName(tree)));
        }

        List<Tree> children = new ArrayList<>();

        Tree res = new Tree() {
            @Override
            public Tree getParent() {
                return parent;
            }

            @Override
            public Object getPayload() {
                return getDisplayName(tree);
            }

            @Override
            public Tree getChild(int i) {
                return children.get(i);
            }

            @Override
            public int getChildCount() {
                return children.size();
            }

            @Override
            public String toStringTree() {
                return null;
            }
        };

        for (int i = 0; i < tree.getChildCount(); i++) {
            ParseTree child = tree.getChild(i);
            while (getName(child).startsWith("Next") || getName(child).equals("Element") || getName(child).equals("Special")) {
                for (int j = 0; j < child.getChildCount(); j++) {
                    if (!(child.getChild(j) instanceof TerminalNodeImpl)) {
                        child = child.getChild(j);
                        break;
                    }
                }
            }
            if (!(child instanceof TerminalNodeImpl || isError(child) && child.getText().equals(""))) {
                children.add(visit(child, res));
            }
        }

        return res;
    }

    private String getName(ParseTree tree) {
        Pattern p = Pattern.compile("\\w+\\$(\\w+)Context");
        Matcher m = p.matcher(tree.getClass().getName());
        if (m.matches()) {
            return m.group(1);
        }
        else {
            return tree.getClass().getName();
        }
    }

    private String getDisplayName(ParseTree tree) {
        String name = getName(tree);
        if (name.equals("Identifier") || name.equals("Integer") || name.equals("Type") && tree.getChild(0) instanceof TerminalNodeImpl) {
            return String.format("%s \"%s\"", name, tree.getText());
        }
        else if (name.equals("SpecialElement")) {
            return tree.getText();
        }
        else {
            return name;
        }
    }

    private boolean isError(ParseTree tree) {
        if (tree instanceof ErrorNode) {
            return true;
        }
        if (tree instanceof ParserRuleContext) {
            ParserRuleContext s = (ParserRuleContext)tree;
            if (s.exception != null && s.stop != null && s.stop.getTokenIndex() < s.start.getTokenIndex()) {
                return true;
            };
        }
        boolean error = true;
        if (tree.getChildCount() == 0) {
            error = false;
        }
        for (int i = 0; i < tree.getChildCount(); i++) {
            ParseTree child = tree.getChild(i);
            if (!(child instanceof ErrorNode)) {
                error = false;
            }
        }
        return error;
    }
}