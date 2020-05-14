package pl.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main14 {
/*
Your job is to find the seed between A and B (both inclusively) that produces N pseudorandom numbers from 0
(inclusive) to K (exclusive). It should also have the maximum of these N numbers to be the minimum among all
 maximums of other seeds in this range.

Sounds complicated? Take a look at the example.

Here we have A = 7, B = 9, N = 4, K = 100. Let's suppose:

    For the seed 7, we get sequence 45, 99, 23, 67 – the maximum is 99.
    For the seed 8, we get 64, 34, 23, 9 – the maximum is 64.
    For the seed 9, we get 78, 34, 0, 11 – the maximum is 78.

Then the minimum among these maximums is 64.  That means, in this example, the seed we are looking for is 8.

The input contains numbers A, B, N, K in a single line in this order.

Your task is to output 2 numbers: a seed and it's maximum. If there are some seeds with equal minimal maximums,
 you should output the seed that is less than all other seeds.

Sample Input 1:
0 100 5 1000
Sample Output 1:
18
270

Sample Input 2:
0 100 1000 1000
Sample Output 2:
5
993

Sample Input 3:
0 100 10000 1000
Sample Output 3:
0
999
 */


    public static void main(String[] args) {

        ExerciseInput input;
        try (Scanner scanner = new Scanner(System.in)) {
            input = getNumbersFromScanner(scanner);
        };


    }

    static class ExerciseInput {

        final int seedFrom;
        final int seedTo;
        final int count;
        final int randLimit;

        public ExerciseInput(int seedFrom, int seedTo, int count, int randLimit) {
            this.seedFrom = seedFrom;
            this.seedTo = seedTo;
            this.count = count;
            this.randLimit = randLimit;
        }
    }

    public static ExerciseInput getNumbersFromScanner(Scanner scanner) {
        String input = scanner.nextLine();
        String[] words = new String[0];
        int[] numbers = new int[4];

        if (input != null) {
            words = input.split("\\s+");
        }

        if (words.length == 4) {
            for (int i = 0; i < 4; i++) {
                try {
                    numbers[i] = Integer.parseInt(words[i]);
                } catch (NumberFormatException e) {
                    numbers[i] = -1;
                    return new ExerciseInput(0, 0, 0, 0);
                }
            }
            return new ExerciseInput(numbers[0], numbers[1], numbers[2], numbers[3]);
        }

        return new ExerciseInput(0, 0, 0, 0);
    }

    public static int[] getLowestSeedMaximum(ExerciseInput input) {

        if (input == null) {
            return new int[]{0, 0};
        }
        int seedRange = input.seedTo - input.seedFrom + 1;

        Random random = new Random();
        Map<Integer, List<Integer>> maxMap = new HashMap<>();
        List<Integer> randomPool;

        for (int i = input.seedFrom; i < seedRange; i++) {
            random = new Random(i);
            randomPool = new ArrayList<>();
            for (int j = 0; j < input.count; j++) {
                randomPool.add(random.nextInt(input.randLimit));
            }
            maxMap.put(i, randomPool);
            System.out.println(i + " : " + Arrays.toString(randomPool.toArray()));
        }

        int lowestMaximum = maxMap.entrySet().stream()
                .map(n -> n.getValue().stream()
                        .max(Integer::compareTo)
                        .get())
                .min(Integer::compareTo)
                .get();


        System.out.println("lowest: " + lowestMaximum);



        return new int[0];
    }
}
