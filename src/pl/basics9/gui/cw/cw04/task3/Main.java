package pl.basics9.gui.cw.cw04.task3;

import pl.basics9.gui.cw.cw04.task2.ICalc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<Double> numbers = getRandNumbers(10, 1, 100);
        List<Double> result = calculate(numbers, (a, b) -> a + b);

        System.out.println("=== === ===");
        System.out.println(numbers);
        System.out.println(result);
    }

    public static List<Double> calculate(List<Double> numbers, ICalc operation) {
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (i == j) {
                    continue;
                }
                double first = numbers.get(i);
                double second = numbers.get(j);
                result.add(operation.oblicz(first, second));
            }
        }
        return result;
    }

    private static double getRandomNumber(int from, int to) {
        return ThreadLocalRandom.current().nextDouble(1, 101);
    }

    private static List<Double> getRandNumbers(int size, int from, int to) {
        List<Double> numbers = new ArrayList<>();

        while (size-- > 0) {
            numbers.add(getRandomNumber(from, to));
        }
        return numbers;
    }
}
