package pl.basics5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorseCode {
    private static final String[] ENGLISH = { "a", "b", "c", "d", "e", "f", "g", "h", "i",
            "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7",
            "8", "9", "0", ",", ".", "?", " " };
    private static final String[] MORSE = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-",
            ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...",
            "---..", "----.", "-----", "--..--", ".-.-.-", "..--..", " " };
    public static String decode(String code) {
        if (code == null || code.isBlank()){
            return "";
        }
        if ("...---...".equals(code)){
            return "SOS";
        }
        Matcher matcher = Pattern.compile("\\s").matcher(code);
        if (!matcher.find()){
            return decodeLetter(code);
        }
        String codeWithSeparator = code.replaceAll("\\s{3,}", " {SPACE} ");
        String[] letters = codeWithSeparator.split("\\s");
        StringBuilder builder = new StringBuilder();
        for (String letter : letters){
            if ("{SPACE}".equals(letter)){
                builder.append(" ");
            } else {
                builder.append(decodeLetter(letter));
            }
        }
        return builder.toString();
    }

    public static String decodeLetter(String key){
        int signIndex = indexOfArray(MORSE, key);
        if (signIndex == -1){
            return "";
        }
        return ENGLISH[signIndex].toUpperCase();
    }

    public static int indexOfArray(String[] array, String key){
        int result = -1;
        for (int i = 0; i < array.length; i++){
            if (key.equals(array[i])){
                return i;
            }
        }
        return result;
    }
}
