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

    @Test
    public void swapTest() {
        assertEquals('a', Kata.swap('A'));
        assertEquals('Z', Kata.swap('z'));
        assertEquals(' ', Kata.swap(' '));
    }

    @Test
    public void countCharTest() {
        assertEquals(0, Kata.countChar('a', "zxy"));
        assertEquals(0, Kata.countChar('a', ""));
        assertEquals(1, Kata.countChar('c', "abc"));
        assertEquals(2, Kata.countChar('a', "aba"));
    }
}
