package pl.basics3;

import org.junit.Test;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class Main2Test {

    @Test
    public void shouldCalcDoubleFactorialGiven7Return105() {
        // given
        int n = 7;
        BigInteger expected = BigInteger.valueOf(105);

        // when
        BigInteger actual = Main2.calcDoubleFactorial(n);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcDoubleFactorialGiven8Return384() {
        // given
        int n = 8;
        BigInteger expected = BigInteger.valueOf(384);

        // when
        BigInteger actual = Main2.calcDoubleFactorial(n);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcDoubleFactorialGiven3Return3() {
        // given
        int n = 3;
        BigInteger expected = BigInteger.valueOf(3);

        // when
        BigInteger actual = Main2.calcDoubleFactorial(n);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcDoubleFactorialGiven1Return1() {
        // given
        int n = 1;
        BigInteger expected = BigInteger.ONE;

        // when
        BigInteger actual = Main2.calcDoubleFactorial(n);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcDoubleFactorialGiven0Return1() {
        // given
        int n = 0;
        BigInteger expected = BigInteger.ONE;

        // when
        BigInteger actual = Main2.calcDoubleFactorial(n);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcDoubleFactorialGiven4Return8() {
        // given
        int n = 4;
        BigInteger expected = BigInteger.valueOf(8);

        // when
        BigInteger actual = Main2.calcDoubleFactorial(n);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcDoubleFactorialGiven5Return15() {
        // given
        int n = 5;
        BigInteger expected = BigInteger.valueOf(15);

        // when
        BigInteger actual = Main2.calcDoubleFactorial(n);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcDoubleFactorialGivenNeg3Return1() {
        // given
        int n = -3;
        BigInteger expected = BigInteger.ONE;

        // when
        BigInteger actual = Main2.calcDoubleFactorial(n);

        // then
        assertEquals(expected, actual);
    }
}
