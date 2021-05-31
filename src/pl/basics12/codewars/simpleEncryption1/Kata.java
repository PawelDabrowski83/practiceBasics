package pl.basics12.codewars.simpleEncryption1;

public class Kata {

    public static String encrypt(final String text, final int n) {
        if (isNullOrBlank(text)) {
            return text;
        }
        String result = text;
        for (int i = n; i > 0; i--) {
            result = encode(result);
        }
        return result;
    }

    private static boolean isNullOrBlank(String text) {
        return text == null || text.isBlank();
    }

    private static String encode(final String text) {
        return  takeSecondCharStartingAt(1, text)
                .append(takeSecondCharStartingAt(0, text))
                .toString();
    }

    private static StringBuilder takeSecondCharStartingAt(int start, String text) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = start; i < text.length(); i += 2) {
            stringBuilder.append(text.charAt(i));
        }
        return stringBuilder;
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (isNullOrBlank(encryptedText)) {
            return encryptedText;
        }
        String result = encryptedText;
        int counter = n;
        while (counter-- > 0) {
            result = decode(result);
        }
        return result;
    }

    private static String decode(final String text) {
        StringBuilder source = new StringBuilder(text);
        int half = text.length() / 2;
        StringBuilder result = new StringBuilder();
        int first = half;
        int second = 0;
        while (first < text.length()) {
            result.append(source.charAt(first++));
            if (second < half) {
                result.append(source.charAt(second++));
            }
        }
        return result.toString();
    }

}
