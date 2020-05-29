package pl.basics2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static pl.basics2.Main22_matrixSolver.Fraction;

public class Main22_matrixSolverTest {

    @Test
    public void shouldFindGreatestCommonDenominatorWork() {
        assertEquals(25, Main22_matrixSolver.Utils.findGreatestCommonDivisor(100, 25));
        assertEquals(6, Main22_matrixSolver.Utils.findGreatestCommonDivisor(6, 36));
        assertEquals(1, Main22_matrixSolver.Utils.findGreatestCommonDivisor(11, 1));
        assertEquals(18, Main22_matrixSolver.Utils.findGreatestCommonDivisor(-18, 180));
        assertEquals(2, Main22_matrixSolver.Utils.findGreatestCommonDivisor(2, -12220));
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
    }
}
