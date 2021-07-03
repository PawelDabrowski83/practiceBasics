package pl.basics9.gui.cw.cw04.task4;

import java.util.ArrayList;
import java.util.List;

public class CountingList {
    private List<String> words;
    private List<Integer> sumOfLetters;

    public CountingList() {
        this.words = new ArrayList<>();
        this.sumOfLetters = new ArrayList<>();
    }

    public void add(String word) {
        words.add(word);
        sumOfLetters.add(calculateWord(word));
    }

    private int calculateWord(String word) {
        int sum = 0;
        for (char c : word.toCharArray()) {
            sum += calculateLetter(c);
        }
        return sum;
    }

    private int calculateLetter(char c) {
        return c;
    }

    public String get(int index) {
        return words.get(index);
    }

    public int count(int index) {
        return sumOfLetters.get(index);
    }

    @Override
    public String toString() {
        return words.toString() + "\n" + sumOfLetters.toString();
    }
}
