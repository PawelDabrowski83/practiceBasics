package pl.basics3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFinder {
    /**
     * Check if String part is found in String sentence but not in the beginning or the end of word.
     * @param part - word to find
     * @param sentence - given sentence
     * @return if true, String part is found in sentence but not in the beginning or the end of the word.
     */
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
