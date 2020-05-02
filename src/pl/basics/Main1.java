package pl.basics;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numberAsString = String.valueOf(number);
        String[] split = numberAsString.split("");

        if (split[0].equals(split[3]) && split[1].equals(split[2])) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static int symetricDigits(int number) {

        String numberAsString = String.valueOf(number);
        String[] split = numberAsString.split("");
        int index = split.length;
        if (index < 4) {
            String[] temp = new String[4];
            for (int i = 0; i < 3; i++) {
                if (i < index) {
                    temp[i] = split[i];
                } else {
                    temp[i] = "0";
                }
            }
            split = temp;
        }

        if (split[0].equals(split[3]) && split[1].equals(split[2])) {
            return 1;
        } else {
            return 0;
        }

    }

    public static String chocolateDivide(int n, int m, int k) {
        // given chocolate bar size n x m divide it horizontally or vertically to get
        // k elements of choco
        if (n*m < k) {
            return "NO";
        } else {
            if (k % n == 0 || k % m == 0) {
                return "YES";
            } else {
                return "NO";
            }
        }

    }

    public static String collatzConjecture(int number) {
        StringBuilder builder = new StringBuilder();

        builder.append(number);

        do {
            if (number != 1) {
                builder.append(" ");

                if (number % 2 == 0) {
                    number /= 2;
                } else {
                    number *= 3;
                    number++;
                }


                builder.append(number);
            }
        } while (number != 1);

        return builder.toString();
    }

    public static int interestCalculator(int base, int percentage, int threshold) {
        double sum = base;
        int count = 0;

        do {
            if (base != threshold) {
                count++;
                sum += sum * (double) percentage / 100;
            }
        } while (sum < threshold);
        return count;
    }

    
}

