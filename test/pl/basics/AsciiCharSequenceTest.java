package pl.basics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AsciiCharSequenceTest {

    CharSequence charSequence;
    byte[] bytes;

    @Before
    public void setUp() {

        bytes = new byte[]{98, 112, 110, 111, 111, 99, 123};
        charSequence = new AsciiCharSequence(bytes);

    }

    @Test
    public void shouldLengthWork() {

        assertEquals(7, charSequence.length());
        assertNotEquals(5, charSequence.length());
    }

    @Test
    public void shouldCharAtWork() {

        // given
        char char0Expected = (char) 98;
        char char1Expected = (char) 112;
        char char6Expected = (char) 123;

        // when
        char char0Actual = charSequence.charAt(0);
        char char1Actual = charSequence.charAt(1);
        char char6Actual = charSequence.charAt(6);

        // then
        assertEquals(char0Expected, char0Actual);
        assertEquals(char1Expected, char1Actual);
        assertEquals(char6Expected, char6Actual);
        assertNotEquals(char0Expected, char6Actual);
    }

    @Test
    public void shouldSubSequenceWork() {

        // given
        byte[] subsequenceBytes = new byte[]{110, 111, 111, 99}; // subSequence [2-6)
        CharSequence expectedCharSequence = new AsciiCharSequence(subsequenceBytes);

        // when
        CharSequence actualCharSequence = charSequence.subSequence(2, 6);

        // then
        assertEquals(expectedCharSequence, actualCharSequence);
        assertNotEquals(expectedCharSequence, new AsciiCharSequence(new byte[]{}));

    }

    @Test
    public void shouldToStringWork() {

        // given
        String expectedString = new String(bytes);

        // when
        String actualString = charSequence.toString();

        // then
        assertEquals(expectedString, actualString);
        assertNotEquals(expectedString, "");
        assertEquals("bpnooc{", actualString);
    }
}
