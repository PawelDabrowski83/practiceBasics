package pl.basics2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static pl.basics2.Main22_matrixSolver.Fraction;
import static pl.basics2.Main22_matrixSolver.Row;

public class Main22_matrixSolverTest {

    @Test
    public void shouldFindGreatestCommonDenominatorWork() {
        assertEquals(25, Main22_matrixSolver.Utils.findGreatestCommonDivisor(100, 25));
        assertEquals(6, Main22_matrixSolver.Utils.findGreatestCommonDivisor(6, 36));
        assertEquals(1, Main22_matrixSolver.Utils.findGreatestCommonDivisor(11, 1));
        assertEquals(18, Main22_matrixSolver.Utils.findGreatestCommonDivisor(-18, 180));
        assertEquals(2, Main22_matrixSolver.Utils.findGreatestCommonDivisor(2, -12220));
        assertEquals(1, Main22_matrixSolver.Utils.findGreatestCommonDivisor(19, 0));
    }

    @Test
    public void shouldFractionReduceWork() {
        Fraction fraction = new Fraction(2, 4);
        assertEquals(new Fraction(1, 2), fraction.reduce());

        fraction = new Fraction(3, 7);
        assertEquals(new Fraction(3, 7), fraction.reduce());

        fraction = new Fraction(12, 120);
        assertEquals(new Fraction(1, 10), fraction.reduce());

        fraction = new Fraction(-18, 2);
        assertEquals(new Fraction(-9, 1), fraction.reduce());

        fraction = new Fraction(2, 2);
        assertEquals(new Fraction(1, 1), fraction.reduce());

        fraction = new Fraction(14, 1);
        assertEquals(new Fraction(14, 1), fraction.reduce());

        fraction = new Fraction(-2, 1);
        assertEquals(new Fraction(-2, 1), fraction.reduce());

        fraction = new Fraction(0, 1);
        assertEquals(new Fraction(0, 1), fraction.reduce());
    }

    @Test
    public void shouldRowMultiplyWork() {
        // {1/2, 7, -1, 0}
        Row row = new Row(new Fraction[]{new Fraction(1, 2), new Fraction(7, 1), new Fraction(-1, 1), new Fraction(0, 1)});
        Fraction multiplier = new Fraction(2, 1);
        Row rowExpected = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(14, 1), new Fraction(-2, 1), new Fraction(0, 1)});
        assertEquals(rowExpected, row.multiply(multiplier));

        multiplier = new Fraction(-3, 1);
        rowExpected = new Row(new Fraction[]{
                new Fraction(-3, 1), new Fraction(-42, 1), new Fraction(6, 1), new Fraction(0, 1)});
        assertEquals(rowExpected, row.multiply(multiplier));

        multiplier = new Fraction(2, 7);
        rowExpected = new Row(new Fraction[]{
                new Fraction(-6, 7), new Fraction(-12, 1), new Fraction(12, 7), new Fraction(0, 7)});
        assertEquals(rowExpected, row.multiply(multiplier));

        multiplier = new Fraction(7, 1);
        rowExpected = new Row(new Fraction[]{
                new Fraction(-6, 1), new Fraction(-84, 1), new Fraction(12, 1), new Fraction(0, 7)});
        assertEquals(rowExpected, row.multiply(multiplier));

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(7, 15), new Fraction(-8, 3), new Fraction(4, 7)});
        multiplier = new Fraction(15, 7);
        rowExpected = new Row(new Fraction[]{
                new Fraction(0, 14), new Fraction(1, 1), new Fraction(-40, 7), new Fraction(60, 49)});
        assertEquals(rowExpected, row.multiply(multiplier));

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(7, 15), new Fraction(-8, 3), new Fraction(4, 7)});
        multiplier = new Fraction(15, 7);
        rowExpected = new Row(new Fraction[]{
                new Fraction(0, 14), new Fraction(1, 1), new Fraction(-40, 7), new Fraction(60, 49)});
        assertEquals(rowExpected, row.multiply(multiplier));

    }

    @Test
    public void shouldZeroFractionsEqualThemselves() {
        Fraction fraction1 = new Fraction(0, 9);
        Fraction fraction2 = new Fraction(0, 1);
        assertEquals(fraction1, fraction2);
    }

    @Test
    public void shouldFindLeadingEntryWork() {
        Row row = new Row(new Fraction[]{
                new Fraction(1, 2), new Fraction(7, 1), new Fraction(-1, 1), new Fraction(0, 1)});
        assertEquals(new Fraction(1, 2), row.findLeadingEntry());

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(7, 1), new Fraction(-1, 1), new Fraction(0, 1)});
        assertEquals(new Fraction(7, 1), row.findLeadingEntry());

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(1, 1), new Fraction(-1, 7), new Fraction(0, 1)});
        assertEquals(new Fraction(1, 1), row.findLeadingEntry());

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(0, 1), new Fraction(-1, 7), new Fraction(0, 1)});
        assertEquals(new Fraction(-1, 7), row.findLeadingEntry());

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(0, 1), new Fraction(0, 7), new Fraction(0, 1)});
        assertEquals(new Fraction(0, 1), row.findLeadingEntry());

    }

    @Test
    public void shouldFindOppositeWork() {
        Fraction fraction = new Fraction(1, 2);
        assertEquals(new Fraction(2, 1), fraction.findOpposite());

        fraction = new Fraction(0, 1);
        assertEquals(new Fraction(1, 0), fraction.findOpposite());

        fraction = new Fraction(-3, 15);
        assertEquals(new Fraction(15, -3), fraction.findOpposite());

        fraction = new Fraction(-8, 3);
        assertEquals(new Fraction(3, -8), fraction.findOpposite());
    }

    @Test
    public void shouldReduceRowToOneWork() {
        Row row = new Row(new Fraction[]{
                new Fraction(1, 2), new Fraction(7, 1), new Fraction(-1, 1), new Fraction(0, 1)});
        Row rowExpected = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(14, 1), new Fraction(-2, 1), new Fraction(0, 1)});
        assertEquals(rowExpected, row.reduceRowToOne());

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(3, 1), new Fraction(-1, 1), new Fraction(5, 1)});
        rowExpected = new Row(new Fraction[]{
                new Fraction(0, 6), new Fraction(1, 1), new Fraction(-1, 3), new Fraction(5, 3)});
        assertEquals(rowExpected, row.reduceRowToOne());

        row = new Row(new Fraction[]{
                new Fraction(7, 15), new Fraction(0, 7)});
        rowExpected = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(0, 1)});
        assertEquals(rowExpected, row.reduceRowToOne());

        row = new Row(new Fraction[]{
                new Fraction(7, 15), new Fraction(0, 7), new Fraction(3, -12)});
        rowExpected = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(0, 1), new Fraction(15, -28)});
        assertEquals(rowExpected, row.reduceRowToOne());
    }

    @Test
    public void shouldAddFractionWork() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 4);
        assertEquals(new Fraction(3, 4), fraction1.addFraction(fraction2));
        assertEquals(new Fraction(1, 1), fraction1.addFraction(fraction1));
        assertEquals(new Fraction(1, 2), fraction2.addFraction(fraction2));
        assertEquals(new Fraction(3,4), fraction2.addFraction(fraction1));

        fraction1 = new Fraction(0, 8);
        fraction2 = new Fraction(1, 4);
        assertEquals(new Fraction(1, 4), fraction1.addFraction(fraction2));

        fraction1 = new Fraction(-1, 8);
        fraction2 = new Fraction(1, 4);
        assertEquals(new Fraction(1, 8), fraction1.addFraction(fraction2));

        fraction1 = new Fraction(-1, 7);
        fraction2 = new Fraction(2, 3);
        assertEquals(new Fraction(11, 21), fraction1.addFraction(fraction2));

        fraction1 = new Fraction(0, 8);
        fraction2 = new Fraction(0, 1);
        assertEquals(new Fraction(0, 1), fraction1.addFraction(fraction2));

    }

    @Test
    public void shouldFindCommonDenominatorWork() {
        assertEquals(4, Main22_matrixSolver.Utils.findCommonDenominator(new Fraction(1, 2), new Fraction(1, 4)));
        assertEquals(1, Main22_matrixSolver.Utils.findCommonDenominator(new Fraction(1, 1), new Fraction(9, 1)));
        assertEquals(5, Main22_matrixSolver.Utils.findCommonDenominator(new Fraction(1, -5), new Fraction(3, 5)));
        assertEquals(6, Main22_matrixSolver.Utils.findCommonDenominator(new Fraction(1, 2), new Fraction(1, 3)));
        assertEquals(6, Main22_matrixSolver.Utils.findCommonDenominator(new Fraction(1, 2), new Fraction(1, -3)));
        assertEquals(6, Main22_matrixSolver.Utils.findCommonDenominator(new Fraction(0, 2), new Fraction(1, 3)));
        assertEquals(1, Main22_matrixSolver.Utils.findCommonDenominator(new Fraction(1, 0), new Fraction(1, 0)));
    }
}
