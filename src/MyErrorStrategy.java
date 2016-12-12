import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.misc.Pair;

public class MyErrorStrategy extends DefaultErrorStrategy {
    public Token recoverInline(Parser recognizer) throws RecognitionException {
        Token matchedSymbol = this.singleTokenDeletion(recognizer);
        if(matchedSymbol != null) {
            recognizer.consume();
            return matchedSymbol;
        } else if(this.singleTokenInsertion(recognizer)) {
            return this.getMissingSymbol(recognizer);
        } else if (this.singleTokenReplacement(recognizer)) {
            return this.getReplacementToken(recognizer);
        }
        else {
            singleTokenReplacement(recognizer);
            throw new InputMismatchException(recognizer);
        }
    }

    private boolean singleTokenReplacement(Parser recognizer) {
        IntervalSet expecting = this.getExpectedTokens(recognizer);
        return expecting.getMinElement() == expecting.getMaxElement() && recognizer.getVocabulary().getDisplayName(expecting.getMinElement()).matches("'\\w+'");
    }

    private Token getReplacementToken(Parser recognizer) {
        Token currentSymbol = recognizer.getCurrentToken();
        IntervalSet expecting = this.getExpectedTokens(recognizer);
        int token = expecting.getMinElement();
        recognizer.consume();
        System.err.printf("line %d:%d spelling mistake '%s' should be %s\n", currentSymbol.getLine(), currentSymbol.getCharPositionInLine(), currentSymbol.getText(), recognizer.getVocabulary().getDisplayName(token));
        return recognizer.getTokenFactory().create(new Pair(currentSymbol.getTokenSource(), currentSymbol.getTokenSource().getInputStream()), token, recognizer.getVocabulary().getDisplayName(token), 0, -1, -1, currentSymbol.getLine(), currentSymbol.getCharPositionInLine());
    }

    protected Token getMissingSymbol(Parser recognizer) {
        Token currentSymbol = recognizer.getCurrentToken();
        IntervalSet expecting = this.getExpectedTokens(recognizer);
        int expectedTokenType = expecting.getMinElement();
        String tokenText;
        if(expectedTokenType == -1) {
            tokenText = "<missing EOF>";
        } else {
            tokenText = "<missing " + recognizer.getVocabulary().getDisplayName(expectedTokenType) + ">";
        }

        Token current = currentSymbol;
        Token lookback = recognizer.getInputStream().LT(-1);
        if(currentSymbol.getType() == -1 && lookback != null) {
            current = lookback;
        }

        System.err.printf("line %d:%d missing %s at '%s'\n", currentSymbol.getLine(), currentSymbol.getCharPositionInLine(), recognizer.getVocabulary().getDisplayName(expectedTokenType), currentSymbol.getText());
        return recognizer.getTokenFactory().create(new Pair(current.getTokenSource(), current.getTokenSource().getInputStream()), expectedTokenType, tokenText, 0, -1, -1, current.getLine(), current.getCharPositionInLine());
    }
}
