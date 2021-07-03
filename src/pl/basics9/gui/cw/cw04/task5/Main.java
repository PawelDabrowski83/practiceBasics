package pl.basics9.gui.cw.cw04.task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Ala", "ma", "kota"));

        words.forEach((s -> {
            System.out.println(s);
        }));
        words.sort(Comparator.comparing(String::length));
        words.forEach(System.out::println);
    }
}
