package pl.basics3;


public class SumChecker {
    /**
     * Write a program that reads the numbers a, b, c and checks if any pair of them sums to 20.
     *
     * The program must output true or false.
     * @param bound target number
     * @param a given number to check
     * @param b given number to check
     * @param c given number to check
     * @return true if any pair sums to int bound
     */
    public static boolean check(int bound, int a, int b, int c) {
        return a + b == bound || a + c == bound || b + c == bound;
    }
}
