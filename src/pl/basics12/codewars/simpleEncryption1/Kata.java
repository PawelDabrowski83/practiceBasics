package pl.basics12.codewars.simpleEncryption1;

public class Kata {

    public static String encrypt(final String text, final int n) {
        if (text == null || text.isBlank()) {
            return text;
        }
        String result = text;
        int counter = n;
        while (counter-- > 0) {
            result = encode(result);
        }
        return result;
    }

    private static String encode(final String text) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < text.length(); i += 2) {
            stringBuilder.append(text.charAt(i));
        }
        for (int i = 0; i < text.length(); i += 2) {
            stringBuilder.append(text.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (encryptedText == null || encryptedText.isBlank()) {
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
