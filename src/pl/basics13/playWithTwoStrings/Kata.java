package pl.basics13.playWithTwoStrings;

import java.util.Locale;

public class Kata {
    public static String workOnStrings(String abc, String cde) {
        return  transformString(abc, cde) +
                transformString(cde, abc);
    }

    protected static boolean isCharPresent(char c, String str) {
        return str.toLowerCase(Locale.ROOT).contains(String.valueOf(c));
    }

    protected static String transformString(String source, String filter) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = source.toCharArray();
        for (char c : chars) {
            int charRepetitions = countChar(c, filter);
            if (charRepetitions % 2 == 0) {
                stringBuilder.append(c);
            } else {
                stringBuilder.append(swap(c));
            }
        }
        return stringBuilder.toString();
    }

    protected static char swap(char c) {
        return Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
    }

    protected static int countChar(char c, String str) {
        char lowerChar = Character.toLowerCase(c);
        String lowerStr = str.toLowerCase(Locale.ROOT);
        return (int) lowerStr.chars().filter(n -> n == lowerChar).count();
    }
}
