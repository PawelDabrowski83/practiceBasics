package pl.basics5;

public class SumInRange {
    public static int sumInRange(int from, int to) {
        if (to - from == 0 || to < from) {
            return 0;
        }
        int sum = 0;
        int counter = from;
        while (counter < to) {
            sum += counter;
            counter++;
        }
        return sum;
    }
}
