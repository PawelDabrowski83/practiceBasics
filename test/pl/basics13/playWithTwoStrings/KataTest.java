package pl.basics13.playWithTwoStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {


    @Test
    public void Sample_tests() {
        assertEquals("abCCde", Kata.workOnStrings("abc","cde"));
        assertEquals("abcDeFGtrzWDEFGgGFhjkWqE", Kata.workOnStrings("abcdeFgtrzw", "defgGgfhjkwqe"));
        assertEquals("abcDEfgDEFGg", Kata.workOnStrings("abcdeFg", "defgG"));
        assertEquals("ABABbababa", Kata.workOnStrings("abab", "bababa"));
    }
}
