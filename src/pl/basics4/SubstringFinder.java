package pl.basics4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringFinder {

    private final String text;

    public SubstringFinder(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    protected int countOccurances(String textToMatch) {
        if (text == null || text.isEmpty() || textToMatch == null || textToMatch.isEmpty()) {
            return 0;
        }
        Pattern TO_MATCH = Pattern.compile(textToMatch);
        Matcher matcher = TO_MATCH.matcher(text);

        return (int) matcher.results().count();
    }
}
