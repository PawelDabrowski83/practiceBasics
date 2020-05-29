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

    }

    @Test
    public void shouldZeroFractionsEqualThemselves() {
        Fraction fraction1 = new Fraction(0, 9);
        Fraction fraction2 = new Fraction(0, 1);
        assertEquals(fraction1, fraction2);
    }
}
