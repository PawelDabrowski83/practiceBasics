package pl.basics3;

public class Main1 {

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
}
