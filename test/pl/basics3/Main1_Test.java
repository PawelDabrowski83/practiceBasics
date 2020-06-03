package pl.basics3;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

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
}
