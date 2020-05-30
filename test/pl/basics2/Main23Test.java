package pl.basics2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main23Test {

    @Test
    public void shouldFindMaxDivisibleNWork() {
        // given
        int[] numbers = {54, 16, 59, 98, 83, 90, 12, 42, 36};
        int expected = 36;

        // when
        int actual = Main23.findMaxDivisibleN(numbers);

        // then
        assertEquals(expected, actual);
    }
}
