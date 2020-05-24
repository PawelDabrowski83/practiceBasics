package pl.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main20_Syllables {

    public static int countSyllables(String word) {
        String vowels = "[aeiouy]+";
        Pattern vowelsPattern = Pattern.compile(vowels);
        String tempWord = new String(word.toLowerCase());
        if (word.matches("\\?+e$")) {
            tempWord = tempWord.replace("e$", "");
        }
        Matcher matcher = vowelsPattern.matcher(tempWord);
        System.out.println(tempWord + " " + matcher.find());

        String devoweled = new String(tempWord.replaceAll(vowels, ""));
        if (matcher.matches() || devoweled.isEmpty()) {
            return 1;
        }
        int count = 0;
        System.out.println(tempWord);
        while (vowelsPattern.matcher(tempWord).find())
            count++;

        return count;
//        String firstLetter = String.valueOf(tempWord.charAt(0));
//        if (firstLetter.matches(vowels)) {
//            return word.split(vowels).length - 1;
//        }
//        return word.split(vowels).length - 1;
    }
}
