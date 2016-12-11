import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import org.antlr.v4.runtime.DefaultErrorStrategy;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStream is = args.length > 0 ? new FileInputStream(args[0]) : System.in;

        ANTLRInputStream input = new ANTLRInputStream(is);
        MiniJavaLexer lexer = new MiniJavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);
        parser.setErrorHandler(new MyErrorStrategy());
        ParseTree tree = parser.goal();
        MyMiniJavaVisitor visitor = new MyMiniJavaVisitor(parser);
        Tree tree2 = visitor.visit(tree);

        JFrame frame = new JFrame("Abstract Syntax Tree");
        JPanel panel = new JPanel();
        JScrollPane scrollPane = new JScrollPane(panel);
        TreeViewer viewer = new TreeViewer(null, tree2);
        //TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
        viewer.setScale(1.5);
        panel.add(viewer);
        frame.add(scrollPane);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}