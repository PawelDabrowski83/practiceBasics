package pl.basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class Main2Test {

    @Test
    public void shouldIsVowelWork() {

        // given

        // then
        assertTrue(Main2.isVowel('a'));
        assertFalse(Main2.isVowel('Y'));
        assertTrue(Main2.isVowel('O'));
        assertFalse(Main2.isVowel('z'));

    }

    @Test
    public void shouldGetFullnameWork() {

        assertEquals("Unknown", Main2.getFullname(null, null));
        assertEquals("firstName", Main2.getFullname("firstName", null));
        assertEquals("Unknown", Main2.getFullname("", ""));
        assertEquals("lastName", Main2.getFullname(null, "lastName"));
    }

    @Test
    public void shouldFactorialStringWork() {

        assertEquals("1", Main2.factorialString(1));
        assertEquals("2", Main2.factorialString(2));
        assertEquals("6", Main2.factorialString(3));
        assertEquals("24", Main2.factorialString(4));
    }
}
