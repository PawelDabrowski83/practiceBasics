package pl.basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main1Test {

    @Test
    public void shouldNumberWork() {

        assertEquals(1, Main1.symetricDigits(2002));
        assertEquals(0, Main1.symetricDigits(1224));
        assertEquals(1, Main1.symetricDigits(9009));
        assertEquals(1, Main1.symetricDigits(2332));
        assertEquals(0, Main1.symetricDigits(122));
        assertEquals(1, Main1.symetricDigits(1221));
        assertEquals(0, Main1.symetricDigits(103));
    }

    @Test
    public void shouldChocolateDivideWork() {

        assertEquals("YES", Main1.chocolateDivide(4, 2, 6));
        assertEquals("NO", Main1.chocolateDivide(2, 10, 7));
        assertEquals("YES", Main1.chocolateDivide(7, 4, 21));
        assertEquals("NO", Main1.chocolateDivide(3, 3, 2));
        assertEquals("YES", Main1.chocolateDivide(5, 5, 15));
        assertEquals("NO", Main1.chocolateDivide(5, 12, 100));
    }

}
