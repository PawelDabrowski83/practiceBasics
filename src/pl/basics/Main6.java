package pl.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main6 {

    public static void main(String[] args) throws IOException {
        /*
Write a program that reads a sequence of integer numbers in a loop and adds up all numbers.
If a new number is equal to 0, the program must stop the loop and output the accumulated sum.
 When the sum is equal or exceeded 1000 (the barrier), the program should also stop and output
  the value equal to sum - 1000.

Note, the input can contain extra numbers. Just ignore them.
         */
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {

        }
    }

    public static int addSequencedNumbers(int[] sequence) {

        int sum = 0;
        for (int i : sequence) {
            sum += i;
            if (i == 0) {
                return sum;
            }
            if (sum > 1000) {
                return (sum - 1000);
            }
        }
        return sum;
    }


}
