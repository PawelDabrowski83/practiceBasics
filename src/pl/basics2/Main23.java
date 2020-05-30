package pl.basics2;

public class Main23 {

    public static int findMaxDivisibleN (int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int currentMax = Integer.MIN_VALUE;
        int counter = 0;
        while (counter < numbers.length) {
            if (numbers[counter] % 4 == 0 & numbers[counter] > currentMax) {
                currentMax = numbers[counter];
            }
            counter++;
        }
        return currentMax;
    }
}
