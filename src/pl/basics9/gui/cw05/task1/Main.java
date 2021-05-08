package pl.basics9.gui.cw05.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ala");
        list.add("ma");
        list.add("Kota");
        list.add("a");
        list.add("Kot");
        list.add("ma");
        list.add("Ale");

        System.out.println("Wielkość listy: " + list.size());
        list.forEach(System.out::println);

        System.out.println("---");

        list.stream()
                .map(String::toLowerCase)
                .filter(n -> n.endsWith("a"))
                .forEach(System.out::println);
    }
}
