package pl.basics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main15_readFile {

    public static void main(String[] args) {
        /*
        Here is a file containing a sequence of integers separated by spaces.

Download it and write a Java program that counts numbers that are greater than or equal to 9999.
         */

        String pathToFile = "files/dataset_91022.txt";
        File file = new File(pathToFile);
        String input = "";
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                input = scanner.nextLine();
            }
        } catch (IOException e) {
            System.out.println("cannot read file: " + e.getMessage());
        }

        String[] numbersAsString = input.split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String str : numbersAsString) {
            try {
                int number = Integer.parseInt(str);
                if (number >= 9999) {
                    numbers.add(number);
                }
            } catch (NumberFormatException e) {
                System.out.println("unable to read: " + e.getMessage());
            }
        }

        System.out.println("count: " + numbers.size());
    }
}
