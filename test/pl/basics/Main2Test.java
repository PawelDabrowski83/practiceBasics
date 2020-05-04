package pl.basics;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class Main2Test {

    @Test
    public void shouldIsVowelWork() {

        // given

        // when
        assertTrue(Main2.isVowel('a'));
        assertFalse(Main2.isVowel('Y'));
        assertTrue(Main2.isVowel('O'));
        assertFalse(Main2.isVowel('z'));

    }
}
