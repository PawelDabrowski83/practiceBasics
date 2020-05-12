package pl.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main9 {
    /*
    The program accepts two input strings of the same length; the first line contains the characters of the original
     alphabet, the second line - the symbols of a resulting alphabet, then goes a line you need to encode by
      the transmitted key, and another line to be decrypted.
     */

    public static void main(String[] args) throws IOException {
        char[] buffer = new char[1000];
        int i = 0;

        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int charNumber = reader.read();
            while (charNumber != -1 && i < 1000) {
                char c = (char) charNumber;
                buffer[i++] = c;
                charNumber = reader.read();
            }
        }

        // expecting exactly 4 words
        String[] words = new String(buffer).split("\\s+");
        String forKeys = "";
        String forValues = "";
        String toEncode = "";
        String toDecode = "";
        String encoded = "";
        String decoded = "";

        if (words.length == 4) {
            forKeys = words[0];
            forValues = words[1];
            toEncode = words[2];
            toDecode = words[3];
        } else {
            System.out.println("Incorrect input");
        }

        Map<Character, Character> cipher = getCipher(forKeys, forValues);
        encoded = encode(toEncode, cipher);
        decoded = decode(toDecode, cipher);

        // printing output
        System.out.println(encoded);
        System.out.println(decoded);
    }

    public static Map<Character, Character> getCipher(String key, String value) {
        char[] keys = new char[0];
        char[] values = new char[0];
        if (key != null && !key.isEmpty()) {
            keys = key.toCharArray();
        }
        if (value != null && !value.isEmpty()) {
            values = value.toCharArray();
        }

        Map<Character, Character> cipher = new HashMap<>();

        if (keys.length == values.length && keys.length > 0) {
            for (int i = 0; i < keys.length; i++) {
                cipher.put(keys[i], values[i]);
            }
        }
        return cipher;
    }

    public static String encode(String str, Map<Character, Character> cipher) {

        if (str == null || str.isEmpty()) {
            return "";
        }
        if (cipher == null || cipher.isEmpty()) {
            return str;
        }


        List<Character> results = new ArrayList<>();

        for (char c : str.toCharArray()) {
            results.add(cipher.getOrDefault(c, c));
        }
        return results.stream().map(Object::toString).collect(Collectors.joining());
    }

    public static String decode(String str, Map<Character, Character> cipher) {

        if (str == null || str.isEmpty()) {
            return "";
        }
        if (cipher == null || cipher.isEmpty()) {
            return str;
        }
        Map<Character, Character> swapped = cipher.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));

        return encode(str, swapped);

    }
}


