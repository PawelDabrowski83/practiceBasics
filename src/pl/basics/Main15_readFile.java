package pl.basics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main15_readFile {

    public static void main(String[] args) {
        /*
        Here is a file containing a sequence of integers. Each number begins a new line.

Download the file and write a Java program that counts the number of even numbers in this
 file. You should stop counting either if you get 0 or the last number is reached.
         */

        String pathToFile = "files/dataset_91065.txt";
        File file = new File(pathToFile);
        List<String> input = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                input.add(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("cannot read file: " + e.getMessage());
        }

        int count = 0;
        boolean zeroFound = false;


        for (String str : input) {
            try {
                int number = Integer.parseInt(str);
                if (number != 0 && number % 2 == 0) {
                    count++;
                }

                if (number == 0) {
                    zeroFound = true;
                    System.out.println("count: " + count);
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("unable to read: " + e.getMessage());
            }
        }

        System.out.println("count: " + count);
    }
}
