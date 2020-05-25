package pl.basics;

import java.util.regex.Pattern;

public class Main20_Syllables {

    public static int countSyllables(String word) {
        String vowels = "[aeiou]+";
        Pattern vowelsPattern = Pattern.compile(vowels);
        String tempWord = word.toLowerCase();
        // cut final E (voiceless)
        if (word.matches("\\w*e\\b") && word.matches("\\w*[^bl]e")) {
            tempWord = tempWord.replaceAll("e\\b", "");
        }

        int result = 0;

        // check for Y as a vowel
        Pattern vowelYPattern = Pattern.compile("[^aeiou](y)");
        if (tempWord.matches("\\b\\w*[^aeiou](y)")) {
            result += (int) vowelYPattern.matcher(tempWord).results().count();
        }
        result += (int) vowelsPattern.matcher(tempWord).results().count();
        return result == 0 ? 1: result;
    }
}
