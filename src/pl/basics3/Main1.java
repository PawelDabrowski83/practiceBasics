package pl.basics3;

import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {
        System.out.println(Integer.toString(11, 16));
    }

    public static String decimalToBinary(int decimal) {
        StringBuilder builder = new StringBuilder();
        int number = decimal;
        while (number > 0) {
            if (number % 2 == 0) {
                builder.append("0");
            } else {
                builder.append("1");
            }
            number /= 2;
        }

        return builder.reverse().toString();
    }

    public static String decimalToAny(int decimal, int base) {
        if (decimal == 0 || base > 36) {
            return "0";
        }
        if (base == 1) {
            char[] chars = new char[decimal];
            Arrays.fill(chars, '1');
            return new String(chars);
        }
        StringBuilder builder = new StringBuilder();
        int number = decimal;
        while (number > 0) {
            if (number % base == 0) {
                builder.append("0");
            } else {
                int remainder = number % base;
                System.out.println("rem:" + remainder);
                String hex = "";
                if (remainder > 9) {
                    hex = String.valueOf((char) (remainder + 87));
                    builder.append(hex);
                } else {
                    builder.append(number % base);
                }
            }
            number /= base;
        }
        return builder.reverse().toString();
    }
}
