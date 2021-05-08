package pl.basics10.iterable;

import java.util.*;
import java.util.function.Consumer;

public class IterNap implements Iterable<Character> {

    private final String message;
    private int counter = 0;

    public IterNap(String message) {
        this.message = message;
    }

    @Override
    public void forEach(Consumer<? super Character> action) {
        Objects.requireNonNull(action);
        for (Character t : message.toCharArray()) {
            action.accept(t);
        }
    }

    @Override
    public Spliterator<Character> spliterator() {
        return null;
    }

    @Override
    public Iterator<Character> iterator() {
        List<Character> chars = new ArrayList<>();
        for (char c : message.toCharArray()) {
            chars.add(c);
        }

        return chars.iterator();
    }

    public Iterator<Character> ustawPoczatek(int poczatek) {
        List<Character> chars = new ArrayList<>();
        for (char c : message.toCharArray()) {
            chars.add(c);
        }

        Iterator<Character> iterator = chars.iterator();
        while(poczatek-- > 0) {
            iterator.next();
        }
        return iterator;
    }
}
