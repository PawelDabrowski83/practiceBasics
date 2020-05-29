package pl.basics2;

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

            if (getNumerator() != fraction.getNumerator()) return false;
            return getDenominator() == fraction.getDenominator();
        }

        @Override
        public int hashCode() {
            int result = getNumerator();
            result = 31 * result + getDenominator();
            return result;
        }
    }

    static class Row {

    }

    static class Utils {
        public static int findGreatestCommonDivisor(int first, int second) {

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


