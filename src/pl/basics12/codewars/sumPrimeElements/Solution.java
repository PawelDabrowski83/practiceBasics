package pl.basics12.codewars.sumPrimeElements;

public class Solution {

    public static int solve(int [] arr) {
        int sum = 0;
        if (arr == null || arr.length == 0) {
            return sum;
        }

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(i)) {
                sum += arr[i];
            }
        }
        return sum;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        int divisor = 2;
        while (divisor < number) {
            if (number % divisor++ == 0) {
                return false;
            }
        }
        return true;
    }

}
