package pl.basics6.ppj.c14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryChecker {
    public static final Pattern BINARY_STRING = Pattern.compile("[01]+");
    public static final Pattern BINARY_ENDS_ONE = Pattern.compile("^1[01]*1$|^1$");
    public static final Pattern SPECIAL_WORDS = Pattern.compile("aaaabbcch|bbaaaacch|ccaaacch|bbaaaabbh|abch");
    public static final Pattern LESS_STRICT_SPECIAL_WORDS = Pattern.compile("[abc]+h");

    public static void main(String[] args) {
        String[] input = {
                "0101011010",
                "0",
                "23619",
                "000000000",
                "101010100111",
                "11",
                "1"
        };

        String[] specialStrings = {
                "aaaabbcch",
                "bbaaaacch",
                "ccaaacch",
                "bbaaaabbh",
                "abch"
        };

        System.out.println("Simple binary");
        for (String binary : input) {
            System.out.println("Checking: " + binary + " " + isBinary(binary));
        }
        System.out.println();

        System.out.println("Binary with 1 at start and end");
        for (String binary : input) {
            System.out.println("Checking: " + binary + " " + isBinaryWithOneOnEnds(binary));
        }

        System.out.println();

        System.out.println("Only special strings and nothing else should pass.");
        for (String binary : specialStrings) {
            System.out.println("Checking: " + binary + " " + isSpecialString(binary));
        }


    }

    public static boolean isBinary(String binary) {
        if (binary == null) {
            return false;
        }
        Matcher matcher = BINARY_STRING.matcher(binary);
        return matcher.matches();
    }

    public static boolean isBinaryWithOneOnEnds(String binary) {
        if (binary == null) {
            return false;
        }
        Matcher matcher = BINARY_ENDS_ONE.matcher(binary);
        return matcher.matches();
    }

    public static boolean isSpecialString(String binary) {
        if (binary == null) {
            return false;
        }
        Matcher matcher = SPECIAL_WORDS.matcher(binary);
        return matcher.matches();
    }
}
