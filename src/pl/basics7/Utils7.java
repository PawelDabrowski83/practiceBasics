package pl.basics7;

public class Utils7 {

    public static int parseInt(String number) {
        int result = Integer.MIN_VALUE;
        try {
            result = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Not a valid number: " + number);
        }
        return result;
    }
}
