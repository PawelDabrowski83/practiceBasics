package pl.basics2;

public class Main22_matrixSolver {

    public static void main(String[] args) {

    }

    class Fraction {
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

        public Fraction reduce(Fraction fraction) {
            int greatestCommonDivisor = Utils.findGreatestCommonDivisor(fraction.numerator, fraction.denominator);
            if (greatestCommonDivisor > 1) {
                return new Fraction(numerator / greatestCommonDivisor, denominator / greatestCommonDivisor);
            }
            return fraction;
        }


    }

    static class Row {

    }

    static class Utils {
        public static int findGreatestCommonDivisor(int first, int second) {

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


