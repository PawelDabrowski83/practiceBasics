package pl.basics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main17_multiplicationArray {

    public static void main(String[] args) {
        int arraySize = 0;
        String[] arrayAsString = new String[0];
        try (Scanner scanner = new Scanner(System.in)) {
            arraySize = scanner.nextInt();
            arrayAsString = scanner.nextLine().split("\\s+");
        }

        int[] numbers = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            try {
                numbers[i] = Integer.parseInt(arrayAsString[i]);
            } catch (NumberFormatException e) {
                System.out.println("Unable to parse " + arrayAsString[i]);
            }
        }
    }

    public static int multiplyArray(int[] array) {
        if (array.length < 2) {
            return 0;
        }
        int[] temp = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::valueOf).toArray();
        return temp[0] * temp[1];
    }
}
