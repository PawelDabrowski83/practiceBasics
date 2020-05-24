package pl.basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main20_SyllablesTest {

    @Test
    public void shouldCountSyllablesOne() {

        assertEquals(1, Main20_Syllables.countSyllables("is"));
        assertEquals(1, Main20_Syllables.countSyllables("the"));
        assertEquals(1, Main20_Syllables.countSyllables("ease"));
        assertEquals(1, Main20_Syllables.countSyllables("with"));
        assertEquals(1, Main20_Syllables.countSyllables("which"));
        assertEquals(1, Main20_Syllables.countSyllables("a"));
        assertEquals(1, Main20_Syllables.countSyllables("can"));
        assertEquals(1, Main20_Syllables.countSyllables("text"));

    }
    @Test
    public void shouldCountSyllablesTwoOrThree() {

        assertEquals(2, Main20_Syllables.countSyllables("reader"));
        assertEquals(3, Main20_Syllables.countSyllables("understand"));
        assertEquals(2, Main20_Syllables.countSyllables("written"));
        assertEquals(3, Main20_Syllables.countSyllables("nevermore"));
        assertEquals(3, Main20_Syllables.countSyllables("employee"));
        assertEquals(2, Main20_Syllables.countSyllables("sequence"));

    }

    @Test
    public void shouldCountSyllablesMore() {

        assertEquals(5, Main20_Syllables.countSyllables("Readability"));
        assertEquals(4, Main20_Syllables.countSyllables("publication"));
        assertEquals(8, Main20_Syllables.countSyllables("internationalization"));
        assertEquals(5, Main20_Syllables.countSyllables("unavailable"));


    }





    @Test (expected = NullPointerException.class)
    public void shouldThrowNPEGivenNull() {
        // given
        String input = null;

        // when
        int actual = Main20_Syllables.countSyllables(input);

        // then
        // NPE
    }
}
