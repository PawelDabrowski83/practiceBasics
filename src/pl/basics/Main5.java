package pl.basics;

public class Main5 {

    public static void main(String[] args) {

    }

    public static int convertLong(Long val) {
        if (val == null) {
            return 0;
        } else {
            if (val > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (val < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else {
                return Math.toIntExact(val);
            }
        }

    }
}
