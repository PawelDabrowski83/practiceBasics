package pl.basics9.gui.cw.cw05.task2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(31);
        set.add(28);
        set.add(31);
        set.add(30);
        set.add(31);
        set.add(30);
        set.add(31);
        set.add(31);
        set.add(30);
        set.add(31);
        set.add(30);
        set.add(31);

        set.forEach(System.out::println);
    }
}
