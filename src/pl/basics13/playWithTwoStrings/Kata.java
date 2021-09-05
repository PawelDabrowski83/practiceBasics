package pl.basics13.playWithTwoStrings;

import java.util.Locale;

public class Kata {
    public static String workOnStrings(String abc, String cde) {
        return "";
    }

    protected static boolean isCharPresent(char c, String str) {
        return str.toLowerCase(Locale.ROOT).contains(String.valueOf(c));
    }
}
