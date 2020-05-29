package pl.basics2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main22_matrixSolverTest {

    @Test
    public void shouldFindGreatestCommonDenominatorWork() {
        assertEquals(25, Main22_matrixSolver.Utils.findGreatestCommonDivisor(100, 25));
        assertEquals(6, Main22_matrixSolver.Utils.findGreatestCommonDivisor(6, 36));
        assertEquals(1, Main22_matrixSolver.Utils.findGreatestCommonDivisor(11, 1));
    }
}
