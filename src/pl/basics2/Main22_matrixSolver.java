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
            if (numerator == 0 || denominator == 0) {
                return new Fraction(0, 1);
            }
            int greatestCommonDivisor = Utils.findGreatestCommonDivisor(numerator, denominator);
            if (greatestCommonDivisor > 1) {
                return new Fraction(numerator / greatestCommonDivisor, denominator / greatestCommonDivisor);
            }
            return this;
        }

        public Fraction findOpposite() {
            return new Fraction(denominator, numerator);
        }

        public Fraction addFraction(Fraction addedFraction) {
            Fraction resultFraction = new Fraction(this.numerator, this.denominator);
            if (denominator > addedFraction.denominator && denominator % addedFraction.denominator == 0) {
                int difference = denominator / addedFraction.denominator;
                addedFraction = new Fraction(addedFraction.numerator * difference, denominator);
            } else if (addedFraction.denominator > denominator && addedFraction.denominator % denominator == 0) {
                int difference = addedFraction.denominator / denominator;
                resultFraction = new Fraction(numerator * difference, denominator * difference);
            } else if (resultFraction.denominator != addedFraction.denominator) {
                resultFraction = new Fraction(this.numerator * addedFraction.denominator,
                                                this.denominator * addedFraction.denominator);
                addedFraction = new Fraction(addedFraction.numerator * this.denominator,
                                                addedFraction.denominator * this.denominator);
            }

            resultFraction = new Fraction(numerator + addedFraction.numerator, denominator);

            return resultFraction;
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

        public Matrix(List<Row> rows) {
            this.rows = rows;
        }
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

        public Row addRow(Row addedRow) {
            if (this.numbers.length != addedRow.numbers.length) {
                throw new IllegalArgumentException("Rows have different length: " +
                        this.toString() + " : " + addedRow.toString());
            }
            int counter = 0;
            for (Fraction fraction : addedRow.numbers) {

            }
            return this;
        }

        public Fraction findLeadingEntry() {
            for (Fraction fraction : numbers) {
                if (!new Fraction(0, 1).equals(fraction)) {
                    return fraction;
                }
            }
            return new Fraction(0, 1);
        }

        public Row reduceRowToOne() {
            Fraction leadingEntry = this.findLeadingEntry();
            if (!new Fraction(0, 1).equals(leadingEntry)) {
                this.multiply(leadingEntry.findOpposite());
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

        public static Fraction addTwoFractions(Fraction fraction1, Fraction fraction2) {
            return new Fraction(0, 1);
        }

        public static int findCommonDenominator(Fraction fraction1, Fraction fraction2) {
            int denom1 = Math.abs(fraction1.denominator);
            int denom2 = Math.abs(fraction2.denominator);

            if (denom1 == 0 && denom2 == 0) {
                return 1;
            }

            if (denom1 > denom2 && denom1 % denom2 == 0) {
                return denom1;
            }
            if (denom2 > denom1 && denom2 % denom1 == 0) {
                return denom2;
            }
            if (denom1 == denom2) {
                return denom1;
            } else {
                return denom1 * denom2;
            }
        }



    }

}


