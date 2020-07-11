package pl.basics3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFinder {
    public static boolean isRegexInMiddleWord(String part, String sentence) {
        if (part == null || sentence == null) {
            return false;
        }
        String regex = "\\b\\S+" + part + "\\S+\\b";
        Pattern PATTERN = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = PATTERN.matcher(sentence);
        return matcher.find();
    }
}
