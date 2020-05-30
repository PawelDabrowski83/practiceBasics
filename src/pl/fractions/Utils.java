package pl.fractions;

public class Utils {

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
        int commonDenominator = findCommonDenominator(fraction1, fraction2);
        if (commonDenominator > fraction1.denominator) {
            int difference = commonDenominator / fraction1.denominator;
            fraction1 = new Fraction(fraction1.numerator * difference, fraction1.denominator * difference);
        }
        if (commonDenominator > fraction2.denominator) {
            int difference = commonDenominator / fraction2.denominator;
            fraction2 = new Fraction(fraction2.numerator * difference, fraction2.denominator * difference);
        }
        return new Fraction(fraction1.numerator + fraction2.numerator, fraction1.denominator).shape();
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

    public static Matrix reduceAllRowsToLeadingOne(Matrix matrix) {
        int counter = 0;
        for (Row row : matrix.rows) {
            matrix.rows.set(counter, matrix.rows.get(counter).reduceRowToOne());
            counter++;
        }
        return matrix;
    }



}

