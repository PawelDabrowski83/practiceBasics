package pl.basics2;

import org.junit.Test;
import pl.basics2.Main17_multiplicationArray;

import static org.junit.Assert.assertEquals;

public class Main17_multiplicationArrayTest {

    @Test
    public void shouldMultiplyArrayWork() {

        // given
        int[] input = new int[]{1, 2, 5, 10, 8};
        int expected = 80;

        // when
        int actual = Main17_multiplicationArray.multiplyArray(input);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMultiplyArrayGivenEmptyArrayReturnZero() {

        // given
        int[] input = new int[0];
        int expected = 0;

        // when
        int actual = Main17_multiplicationArray.multiplyArray(input);

        // then
        assertEquals(expected, actual);
    }
}
