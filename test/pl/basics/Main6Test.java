package pl.basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Main6Test {

    int[] numbers;
    int expected;
    int actual;

    @Test
    public void shouldAddSequenceNumbersStopGivenZero() {

        // given
        numbers = new int[]{10, 2, 0, 13, 100};
        expected = 12;

        // when
        actual = Main6.addSequencedNumbers(numbers);

        // then
        assertEquals(expected, actual);
        assertNotEquals(0, actual);
        assertNotEquals(125, actual);
    }

    @Test (expected = NullPointerException.class)
    public void shouldThrowNPEGivenNull() {

        // given
        numbers = null;

        // when
        actual = Main6.addSequencedNumbers(numbers);

        // then
        // NullPointer
    }

    @Test
    public void shouldAddSequenceNumbersWork() {

        // given
        numbers = new int[]{1, 16, 2, 90, 2, 22, 199, 945};
        expected = 277;

        // when
        actual = Main6.addSequencedNumbers(numbers);

        // then
        assertEquals(expected, actual);
        assertNotEquals(1277, actual);
        assertNotEquals(0, actual);
    }
}
