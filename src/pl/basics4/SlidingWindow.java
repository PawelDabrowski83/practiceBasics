package pl.basics4;

import java.util.Arrays;

public class SlidingWindow {

    protected char[] input;

    public SlidingWindow(char[] input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "SlidingWindow{" +
                "input=" + Arrays.toString(input) +
                '}';
    }

    public char[] findLongestUniqueStreak() {

        return new char[0];
    }

    protected char[] dropLeft() {
        return new char[0];
    }

    protected char[] slideRight() {
        return new char[0];
    }
}
