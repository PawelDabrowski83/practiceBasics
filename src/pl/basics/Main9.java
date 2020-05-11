package pl.basics;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main9 {

    public static void main(String[] args) {

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

        Set<Character> results = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            results.add(cipher.getOrDefault(c, c));
        }
        return results.stream().toString();
    }

    public static String decode(String str, Map<Character, Character> cipher) {

        Map<Character, Character> swapped = cipher.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));

        return encode(str, swapped);

    }
}
