package pl.basics5;

public class MorseCode {
    private static final String[] english = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
            "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
            ",", ".", "?" };
    private static final String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.." };
    public static String decode(String code) {
        return "";
    }

    public static String get(String morse){
        return "";
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
