package pl.fractions;

public class Fraction {

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

    public Fraction shape() {
        return this.checkFloatingMinus().reduce();
    }

    public Fraction reduce() {
        int greatestCommonDivisor = Utils.findGreatestCommonDivisor(numerator, denominator);
        if (greatestCommonDivisor > 1) {
            return new Fraction(numerator / greatestCommonDivisor, denominator / greatestCommonDivisor);
        }
        return this;
    }

    public Fraction checkFloatingMinus() {
        if (denominator < 0) {
            if (numerator < 0) {
                return new Fraction(Math.abs(numerator), Math.abs(denominator));
            } else {
                return new Fraction(numerator * -1, Math.abs(denominator));
            }
        } else if (numerator == 0 || denominator == 0) {
            return new Fraction(0, 1);
        }
        return this;
    }

    public Fraction findOpposite() {
        return new Fraction(denominator, numerator).shape();
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

