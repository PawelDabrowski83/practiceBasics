package pl.fractions;

import java.util.Arrays;

public class Row {

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
                    fraction.denominator * factor.denominator).shape();
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
        for (Fraction ignored : addedRow.numbers) {
            numbers[counter] = Utils.addTwoFractions(numbers[counter], addedRow.numbers[counter]);
            counter++;
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
