package pl.basics13.playWithTwoStrings;

import java.util.Locale;

public class Kata {
    public static String workOnStrings(String abc, String cde) {
        StringBuilder stringBuilder = new StringBuilder();
        return "";
    }

    protected static boolean isCharPresent(char c, String str) {
        return str.toLowerCase(Locale.ROOT).contains(String.valueOf(c));
    }

    protected static String transformString(String source, String filter) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = source.toCharArray();
        for (char c : chars) {
            if (isCharPresent(c, filter)) {

            }
        }
        return "";
    }

    protected static char swap(char c) {
        return Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
    }
}
