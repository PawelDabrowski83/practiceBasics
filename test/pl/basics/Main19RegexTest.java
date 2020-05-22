package pl.basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main19RegexTest {

    @Test
    public void shouldGivenEmptyReturnZero() {

        // given
        String input = "";
        int expected = 0;

        // when
        int actual = Main19Regex.makeStringEuphonious(input);

        // then
        assertEquals(expected, actual);

    }

    @Test
    public void shouldEuphoniousWorkWithRegularStrings() {

        assertEquals(1, Main19Regex.makeStringEuphonious("player"));
        assertEquals(0, Main19Regex.makeStringEuphonious("garage"));
        assertEquals(1, Main19Regex.makeStringEuphonious("schedule"));
        assertEquals(2, Main19Regex.makeStringEuphonious("employee"));
    }

    @Test
    public void shouldEuphoniousWorkWithEdgyCases() {

        assertEquals(1, Main19Regex.makeStringEuphonious("aaa"));
        assertEquals(3, Main19Regex.makeStringEuphonious("hhhhhhh"));
        assertEquals(0, Main19Regex.makeStringEuphonious("aabbaabb"));
    }
}
