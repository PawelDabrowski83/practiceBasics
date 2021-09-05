package pl.basics13.playWithTwoStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {


    @Test
    public void Sample_tests() {
        assertEquals("abCCde", Kata.workOnStrings("abc","cde"));
        assertEquals("abcDeFGtrzWDEFGgGFhjkWqE", Kata.workOnStrings("abcdeFgtrzw", "defgGgfhjkwqe"));
        assertEquals("abcDEfgDEFGg", Kata.workOnStrings("abcdeFg", "defgG"));
        assertEquals("ABABbababa", Kata.workOnStrings("abab", "bababa"));
    }

    @Test
    public void isCharPresentTest() {
        assertTrue(Kata.isCharPresent('a', "abc"));
        assertTrue(Kata.isCharPresent('a', "BABA"));
        assertFalse(Kata.isCharPresent('z', "xeddex"));
        assertFalse(Kata.isCharPresent('.', ""));
    }
}
