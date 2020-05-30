package pl.fractions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static pl.fractions.Utils.addTwoFractions;
import static pl.fractions.Utils.findCommonDenominator;
import static pl.fractions.Utils.findGreatestCommonDivisor;

public class UtilsTest {

    @Test
    public void shouldFindGreatestCommonDenominatorWork() {
        assertEquals(25, findGreatestCommonDivisor(100, 25));
        assertEquals(6, findGreatestCommonDivisor(6, 36));
        assertEquals(1, findGreatestCommonDivisor(11, 1));
        assertEquals(18, findGreatestCommonDivisor(-18, 180));
        assertEquals(2, findGreatestCommonDivisor(2, -12220));
        assertEquals(1, findGreatestCommonDivisor(19, 0));
    }

    @Test
    public void shouldAddFractionWork() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 4);
        assertEquals(new Fraction(3, 4), addTwoFractions(fraction1, fraction2));
        assertEquals(new Fraction(1, 1), addTwoFractions(fraction1, new Fraction(1, 2)));
        assertEquals(new Fraction(-1, 2), addTwoFractions(new Fraction(-1, 4), new Fraction(-1, 4)));
        assertEquals(new Fraction(3,4), addTwoFractions(fraction1, fraction2));

        fraction1 = new Fraction(0, 8);
        fraction2 = new Fraction(1, 4);
        assertEquals(new Fraction(1, 4), addTwoFractions(fraction1, fraction2));

        fraction1 = new Fraction(-1, 8);
        fraction2 = new Fraction(1, 4);
        assertEquals(new Fraction(1, 8), addTwoFractions(fraction1, fraction2));

        fraction1 = new Fraction(-1, 7);
        fraction2 = new Fraction(2, 3);
        assertEquals(new Fraction(11, 21), addTwoFractions(fraction1, fraction2));

        fraction1 = new Fraction(0, 8);
        fraction2 = new Fraction(0, 1);
        assertEquals(new Fraction(0, 1), addTwoFractions(fraction1, fraction2));

        fraction1 = new Fraction(3, 1);
        fraction2 = new Fraction(-1, 3);
        assertEquals(new Fraction(8, 3), addTwoFractions(fraction1, fraction2));

    }

    @Test
    public void shouldFindCommonDenominatorWork() {
        assertEquals(4, findCommonDenominator(new Fraction(1, 2), new Fraction(1, 4)));
        assertEquals(1, findCommonDenominator(new Fraction(1, 1), new Fraction(9, 1)));
        assertEquals(5, findCommonDenominator(new Fraction(1, -5), new Fraction(3, 5)));
        assertEquals(6, findCommonDenominator(new Fraction(1, 2), new Fraction(1, 3)));
        assertEquals(6, findCommonDenominator(new Fraction(1, 2), new Fraction(1, -3)));
        assertEquals(6, findCommonDenominator(new Fraction(0, 2), new Fraction(1, 3)));
        assertEquals(1, findCommonDenominator(new Fraction(1, 0), new Fraction(1, 0)));
    }

    @Test
    public void shouldReduceRowToOneWork() {
        Matrix matrix = new Matrix();
        Row row1 = new Row(new Fraction[]{
                new Fraction(1, 2), new Fraction(7, 1), new Fraction(-1, 1), new Fraction(0, 1)});
        Row row2 = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(3, 1), new Fraction(-1, 1), new Fraction(5, 1)});
        Row row3 = new Row(new Fraction[]{
                new Fraction(7, 15), new Fraction(0, 7)});
        Row row4 = new Row(new Fraction[]{
                new Fraction(7, 15), new Fraction(0, 7), new Fraction(3, -12)});
        matrix.rows.add(row1);
        matrix.rows.add(row2);
        matrix.rows.add(row3);
        matrix.rows.add(row4);
        Matrix matrixExpected = new Matrix();
        row1 = new Row(new Fraction[]{
                new Fraction(1, 2), new Fraction(7, 1), new Fraction(-1, 1), new Fraction(0, 1)});
        row2 = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(3, 1), new Fraction(-1, 1), new Fraction(5, 1)});
        row3 = new Row(new Fraction[]{
                new Fraction(7, 15), new Fraction(0, 7)});
        row4 = new Row(new Fraction[]{
                new Fraction(7, 15), new Fraction(0, 7), new Fraction(3, -12)});
        matrixExpected.rows.add(row1);
        matrixExpected.rows.add(row2);
        matrixExpected.rows.add(row3);
        matrixExpected.rows.add(row4);

    }
}
