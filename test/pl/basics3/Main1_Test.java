package pl.basics3;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Main1_Test {

    @Test
    public void shouldDecimalToBinaryWork() {
        // given
        int[] numbers = {8, 2, 1, 10, 7, 13};
        String[] expected = {"1000", "10", "1", "1010", "111", "1101"};

        // when
        int counter = 0;
        String[] actual = new String[expected.length];
        for (int ignored : numbers) {
            actual[counter] = Main1.decimalToBinary(numbers[counter]);
            counter++;
        }

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldDecimalToAnyWork() {
        // given
        int[] numbers = {2, 2, 8, 9, 10, 1, 11, 13, 7};
        int[] base = {2, 8, 8, 8, 8, 8, 8, 8, 4};
        String[] expected = {"10", "2", "10", "11", "12", "1", "13", "15", "13"};

        // when
        int counter = 0;
        String[] actual = new String[expected.length];
        for (int ignored : numbers) {
            actual[counter] = Main1.decimalToAny(numbers[counter], base[counter]);
            counter++;
        }
        System.out.println(Arrays.toString(actual));

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldDecimalToAnyWork1() {
        // given
        int number = 2;
        int base = 8;
        String expected = "2";

        // when
        String actual = Main1.decimalToAny(number, base);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecimalToAnyTarget36Work() {
        // given
        int number = 1000;
        int targetRadix = 36;
        String expected = "rs";

        // when
        String actual = Main1.decimalToAny(number, targetRadix);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecimalToAnyTarget16ThriceBaseWork() {
        // given
        int number = 48;
        int targetRadix = 16;
        String expected = "30";

        // when
        String actual = Main1.decimalToAny(number, targetRadix);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldConvertFractionToRadixWork1() {
        // given
        double number = 0.234;
        int radix = 7;
        int precision = 5;
        String expected = "0.14315";

        // when
        String actual = Main1.convertFractionToRedix(number, radix, precision);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldConvertFractionToRadixWork2() {
        // given
        double number = 0.234;
        int radix = 36;
        int precision = 3;
        String expected = "0.8f9";

        // when
        String actual = Main1.convertFractionToRedix(number, radix, precision);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldConvertFractionToRadixWork3() {
        // given
        double number = 10.234;
        int radix = 7;
        int precision = 5;
        String expected = "13.14315";

        // when
        String actual = Main1.convertFractionToRedix(number, radix, precision);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldConvertFractionToRadixWork4() {
        // given
        double number = 0.5168;
        int radix = 19;
        int precision = 5;
        String expected = "0.9fadg";

        // when
        String actual = Main1.convertFractionToRedix(number, radix, precision);

        // then
        assertEquals(expected, actual);
    }


}
