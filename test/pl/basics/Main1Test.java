package pl.basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main1Test {

    @Test
    public void shouldNumberWork() {

        assertEquals(1, Main1.symetricDigits(2002));
        assertEquals(0, Main1.symetricDigits(1224));
        assertEquals(1, Main1.symetricDigits(9009));
        assertEquals(1, Main1.symetricDigits(2332));
        assertEquals(0, Main1.symetricDigits(122));
        assertEquals(1, Main1.symetricDigits(1221));
        assertEquals(0, Main1.symetricDigits(103));
    }

    @Test
    public void shouldChocolateDivideWork() {

        assertEquals("YES", Main1.chocolateDivide(4, 2, 6));
        assertEquals("NO", Main1.chocolateDivide(2, 10, 7));
        assertEquals("YES", Main1.chocolateDivide(7, 4, 21));
        assertEquals("NO", Main1.chocolateDivide(3, 3, 2));
        assertEquals("YES", Main1.chocolateDivide(5, 5, 15));
        assertEquals("NO", Main1.chocolateDivide(5, 12, 100));
    }

    @Test
    public void shouldCollatzConjecture() {

        assertEquals("1", Main1.collatzConjecture(1));
        assertEquals("10 5 16 8 4 2 1", Main1.collatzConjecture(10));
        assertEquals("7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1", Main1.collatzConjecture(7));
        assertEquals("3 10 5 16 8 4 2 1", Main1.collatzConjecture(3));
    }

    @Test
    public void shouldCalculatorWork() {

        assertEquals(0, Main1.interestCalculator(100, 100, 100));
        assertEquals(3, Main1.interestCalculator(1, 100, 8));
        assertEquals(2, Main1.interestCalculator(100, 15, 120));
    }

}
