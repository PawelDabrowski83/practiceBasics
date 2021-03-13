package pl.basics6.ppj.c12.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        char[] buffer = new char[2];
        String filename = "D:\\PPJ\\Nowy folder\\1.txt";
        int charCounter = 0;

        try {
            FileInputStream fis = new FileInputStream(filename);
            int currentChar = fis.read();

            while (currentChar != -1) {
                char inputChar = (char) currentChar;
                buffer[charCounter++] = inputChar;
                currentChar = fis.read();
                if (charCounter >= buffer.length - 1) {
                    buffer = doubleArray(buffer);
                }
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Pojemność bufora przed redukcją: " + buffer.length);
        buffer = reduceArray(charCounter, buffer);
        System.out.println("Pojemność bufora po redukcji: " + buffer.length);

        displayText(buffer);
        displayLetterFrequency(buffer);
    }

    private static void displayText(char[] buffer) {
        for (char c : buffer) {
            System.out.print(c);
        }
        System.out.println();
    }

    private static void displayLetterFrequency(char[] buffer) {
        System.out.println("Sprawdzenie częstości wystąpienia znaków:");
        char[] history = new char[8];
        int counter = 0;
        for (char c : buffer) {
            if (!wasDisplayed(c, history)) {
                System.out.println("Znak: " + c + " występuje: " + countChar(c, buffer) + " razy.");
                history[counter++] = c;
                if (counter >= history.length - 1) {
                    history = doubleArray(history);
                }
            }

        }
    }

    private static int countChar(char given, char[] source) {
        int counter = 0;
        for (char c : source) {
            if (c == given) {
                counter++;
            }
        }
        return counter;
    }

    private static char[] doubleArray(char[] array) {
        char[] tmp = new char[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
        return array;
    }

    private static char[] reduceArray(int bound, char[] array) {
        char[] tmp = new char[bound];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = array[i];
        }
        return tmp;
    }

    private static boolean wasDisplayed(char given, char[] history) {
        return contains(given, history);
    }

    private static boolean contains(char given, char[] array) {
        for (char c : array) {
            if (c == given) {
                return true;
            }
        }
        return false;
    }
}
