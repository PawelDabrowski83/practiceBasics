package pl.basics4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Abbreviator {

    protected static final Pattern WORD = Pattern.compile("\\b\\w+");
    protected static final Pattern WORD_EXTENDED = Pattern.compile("(\\S*?[^\\w])?(\\w+)\\b(\\S*)");

    /*
    The word i18n is a common abbreviation of internationalization in the developer community, used instead of typing
     the whole word and trying to spell it correctly. Similarly, a11y is an abbreviation of accessibility.

Write a function that takes a string and turns any and all "words" (see below) within that string of length 4 or
greater into an abbreviation, following these rules:

    A "word" is a sequence of alphabetical characters. By this definition, any other character like a space or hyphen
     (eg. "elephant-ride") will split up a series of letters into two words (eg. "elephant" and "ride").
    The abbreviated version of the word should have the first letter, then the number of removed characters, then
     the last letter (eg. "elephant ride" => "e6t r2e").

     */

    public String abbreviate(String given) {

        String[] words = given.split("\\s+");
        List<String> result = new ArrayList<>();

        for (String string : words) {
            Matcher matcher = WORD_EXTENDED.matcher(string);
            if (matcher.find()) {
                String prefix = matcher.group(1) == null ? "" : matcher.group(1);
                String middle = simplyAbbreviate(matcher.group(2));
                String suffix = matcher.group(3) == null ? "" : matcher.group(3);
                result.add(String.join(prefix, middle, suffix));
            }
        }
        return String.join(" ", result);
    }

    private String simplyAbbreviate(String given) {
        if (given == null || given.isEmpty()) {
            return "";
        }
        if (given.length() < 4) {
            return given;
        }
        Matcher matcher = WORD.matcher(given);
        StringBuilder builder = new StringBuilder();
        boolean isFirst = true;
        while (matcher.find()) {
            if (isFirst) {
                isFirst = false;
            } else {
                builder.append(" ");
            }
            String word = given.substring(matcher.start(), matcher.end());
            if (word.length() < 4) {
                builder.append(word);
            } else {
                builder.append(word, 0, 1);
                builder.append(word.length() - 2);
                builder.append(word, word.length() - 1, word.length());
            }
        }
        return builder.toString();
    }
}
