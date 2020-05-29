package pl.basics2;

import java.util.Arrays;
import java.util.List;

public class Main22_matrixSolver {

    public static void main(String[] args) {

    }

    static class Fraction {
        final int numerator;
        final int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public Fraction reduce() {
            int greatestCommonDivisor = Utils.findGreatestCommonDivisor(numerator, denominator);
            if (greatestCommonDivisor > 1) {
                return new Fraction(numerator / greatestCommonDivisor, denominator / greatestCommonDivisor);
            }
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Fraction)) return false;

            Fraction fraction = (Fraction) o;

            if (getNumerator() == 0 && fraction.getNumerator() == 0) {
                return true;
            }

            if (getNumerator() != fraction.getNumerator()) return false;
            return getDenominator() == fraction.getDenominator();
        }

        @Override
        public int hashCode() {
            int result = getNumerator();
            result = 31 * result + getDenominator();
            return result;
        }

        @Override
        public String toString() {
            return "Fraction{" + numerator + " /" + denominator + "}";
        }
    }

    static class Matrix {
        List<Row> rows;
    }

    static class Row {
        Fraction[] numbers;

        public Row(Fraction[] numbers) {
            this.numbers = numbers;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Row)) return false;

            Row row = (Row) o;

            // Probably incorrect - comparing Object[] arrays with Arrays.equals
            return Arrays.equals(numbers, row.numbers);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(numbers);
        }

        @Override
        public String toString() {
            return "Row{" +
                    "numbers=" + Arrays.toString(numbers) +
                    '}';
        }

        public Row multiply(Fraction factor) {
            int counter = 0;
            for (Fraction fraction : numbers) {
                numbers[counter] = new Fraction(fraction.numerator * factor.numerator,
                                                fraction.denominator * factor.denominator).reduce();
                counter++;
            }
            return this;
        }
    }

    static class Utils {
        public static int findGreatestCommonDivisor(int first, int second) {

            if (first == 0 || second == 0) {
                return 1;
            }
            first = Math.abs(first);
            second = Math.abs(second);

            while (first != second) {
                if (second > first) {
                    second -= first;
                } else {
                    first -= second;
                }
            }
            return first;
        }



    }

}


