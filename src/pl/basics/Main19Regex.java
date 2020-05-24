package pl.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main19Regex {

    public static int makeStringEuphonious(String str) {

        final String VOWELS = "aeiouy";

        StringBuilder builder = new StringBuilder();


        for (String s : str.toLowerCase().split("")) {
            if (VOWELS.contains(s)) {
                builder.append("1");
            } else {
                builder.append("0");
            }
        }
        String binary = builder.toString();
        System.out.println("string: " + binary);
        Pattern findOnes = Pattern.compile("(111)[^1]|(11)");
        Pattern findZeros = Pattern.compile("(000)[^0]|(00)");
        binary = "111011111";
        int result = 0;
        Matcher matcher = findOnes.matcher(binary);

        if (matcher.find()) {
            result = matcher.groupCount() - 1;
            System.out.println("ones");
            System.out.println("matchergrouplent: " + matcher.group().length());
            System.out.println("count: " + matcher.groupCount());
            for (int i = 0; i < matcher.group().length(); i++) {
                System.out.println(i + " " + matcher.group(i));
            }
        }
        matcher = findZeros.matcher(binary);
        if (matcher.find()) {
            result += matcher.groupCount() - 1;
            System.out.println("zeros");
            for (int i = 0; i < matcher.group().length(); i++) {
                System.out.println(i + " " + matcher.group(i));
            }
        }

        return result;
    }
}
