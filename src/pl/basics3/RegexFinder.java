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

    /**
     * Check if sentence have a word with given length.
     * @param length - length of word, only [a-zA-Z] chars matter
     * @param sentence - sentence to check
     * @return - if true, there is a word with given length
     */
    public static boolean containsWordLength(int length, String sentence) {
        if (length < 1 || sentence == null) {
            return false;
        }
        String regex = ".*\\b[a-zA-Z]{" + length + "}[,.!?]?\\b.*";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(sentence).matches();
    }

    /**
     * Removing extra spaces and tabulations, replacing them with single one. Trim included.
     * @param given - text to transform
     * @return - string without extra spaces
     */
    public static String removeExtraSpaces(String given) {
        if (given == null) {
            return "";
        }
        return given.replaceAll("\\s+", " ").trim();
    }

    /**
     * Remove html tags. Given null returns empty.
     * @param given - text to modify
     * @return output text
     */
    public static String removeTags(String given) {
        if (given == null) {
            return "";
        }
        return given.replaceAll("</?[\\w\\s-\"=]+/?>", "");
    }

    /**
     * Remove java comments from given text (code)
     * @param given - given text to modify
     * @return - text with comments removed
     */
    public static String removeComments(String given) {
        if (given == null) {
            return "";
        }
        return given.replaceAll("/\\*[\\s\\w*-=]*?\\*/|//.*", "").trim();
    }

    /**
     * Extract large numbers (more than 10 digits) from given text
     * @param given - text to look for numbers
     * @return - string with numbers in format \d:(length)
     */
    public static String extractLargeNumbers(String given) {
        if (given == null || given.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        Pattern pattern = Pattern.compile("(\\d{10,})");
        Matcher matcher = pattern.matcher(given);
        boolean firstLine = true;
        while (matcher.find()) {
            if (!firstLine) {
                builder.append(System.lineSeparator());
            } else {
                firstLine = false;
            }
            builder.append(given, matcher.start(), matcher.end());
            builder.append(":");
            builder.append(matcher.end() - matcher.start());
        }
        return builder.toString();
    }
}
