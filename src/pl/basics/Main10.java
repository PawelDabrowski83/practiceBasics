package pl.basics;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main10 {

    public static void main(String[] args) {

        String input = "";

        try (Scanner scanner = new Scanner(System.in)) {
            input = scanner.nextLine();
        }

        if (input.isEmpty()) {
            return;
        }

        Map<String, Integer> wordCount = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        for (String word : input.split("\\s+")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        wordCount.entrySet().stream().map(n -> n.getKey() + " " + n.getValue()).forEach(System.out::println);
    }
}
