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
        if (input.length == 0) {
            return new char[0];
        }
        char[] buffer = {input[0]};
        char[] longestBuffer = buffer;
        int startingPosition = 0;
        int currentPosition = 0;
        while (input.length - 1 > currentPosition) {
            currentPosition++;
            if (isCharPresent(input[currentPosition], buffer)) {
                if (longestBuffer.length < buffer.length) {
                    longestBuffer = buffer;
                }
                buffer = new char[]{input[currentPosition]};
                startingPosition = currentPosition;
            } else {
                buffer = slideRight(startingPosition, currentPosition);
            }
        }
        if (buffer.length > longestBuffer.length) {
            longestBuffer = buffer;
        }

        return longestBuffer;
    }

    protected char[] dropLeft() {
        return new char[0];
    }

    protected char[] slideRight(int startingPosition, int currentPosition) {
        if (input == null || input.length == 0) {
            return new char[0];
        }
        if (startingPosition > input.length) {
            startingPosition = 0;
        }
        if (currentPosition > input.length) {
            currentPosition = input.length;
        }
        return Arrays.copyOfRange(input, startingPosition, currentPosition);
    }

    protected static boolean isCharPresent(char given, char[] source) {
        if (source == null || source.length == 0) {
            return true;
        }
        return !new String(source).contains(String.valueOf(given));
    }
}
