package pl.fractions;

import org.junit.Test;

import java.util.HashMap;

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
    public void shouldReduceRowToLeadingOneWork() {
        // given
        Matrix matrix = new Matrix();
        matrix.rows = new HashMap<>();
        Row row1 = new Row(new Fraction[]{
                new Fraction(1, 2), new Fraction(7, 1), new Fraction(-1, 1), new Fraction(0, 1)});
        Row row2 = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(3, 1), new Fraction(-1, 1), new Fraction(5, 1)});
        Row row3 = new Row(new Fraction[]{
                new Fraction(7, 15), new Fraction(0, 7), new Fraction(1, 1), new Fraction(1, 1)});
        Row row4 = new Row(new Fraction[]{
                new Fraction(7, 15), new Fraction(0, 7), new Fraction(3, -12), new Fraction(1, 2)});
        matrix.rows.put(0, row1);
        matrix.rows.put(1, row2);
        matrix.rows.put(2, row3);
        matrix.rows.put(3, row4);
        Matrix matrixExpected = new Matrix();
        matrixExpected.rows = new HashMap<>();
        row1 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(14, 1), new Fraction(-2, 1), new Fraction(0, 1)});
        row2 = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(1, 1), new Fraction(-1, 3), new Fraction(5, 3)});
        row3 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(0, 1), new Fraction(15, 7), new Fraction(15, 7)});
        row4 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(0, 1), new Fraction(-15, 28), new Fraction(15, 14)});
        matrixExpected.rows.put(0, row1);
        matrixExpected.rows.put(1, row2);
        matrixExpected.rows.put(2, row3);
        matrixExpected.rows.put(3, row4);

        // when
        Matrix matrixActual = Utils.reduceAllRowsToLeadingOne(matrix);

        // then
        assertEquals(matrixExpected, matrixActual);
    }

    @Test
    public void shouldReduceRowToLeadingOneWork2() {
        // given
        Matrix matrix = new Matrix();
        matrix.rows = new HashMap<>();
        Row row1 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(7, 1), new Fraction(9, 1), new Fraction(3, 1)});
        Row row2 = new Row(new Fraction[]{
                new Fraction(4, 1), new Fraction(2, 1), new Fraction(5, 1), new Fraction(2, 1)});
        Row row3 = new Row(new Fraction[]{
                new Fraction(6, 1), new Fraction(1, 1), new Fraction(3, 1), new Fraction(8, 1)});
        matrix.rows.put(0, row1);
        matrix.rows.put(1, row2);
        matrix.rows.put(2, row3);
        Matrix matrixExpected = new Matrix();
        matrixExpected.rows = new HashMap<>();
        row1 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(7, 1), new Fraction(9, 1), new Fraction(3, 1)});
        row2 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(1, 2), new Fraction(5, 4), new Fraction(1, 2)});
        row3 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(1, 6), new Fraction(1, 2), new Fraction(4, 3)});
        matrixExpected.rows.put(0, row1);
        matrixExpected.rows.put(1, row2);
        matrixExpected.rows.put(2, row3);

        // when
        Matrix matrixActual = Utils.reduceAllRowsToLeadingOne(matrix);

        // then
        assertEquals(matrixExpected, matrixActual);
    }
}
