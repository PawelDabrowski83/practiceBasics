package pl.fractions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {

    @Test
    public void shouldFractionReduceWork() {
        Fraction fraction = new Fraction(2, 4);
        assertEquals(new Fraction(1, 2), fraction.reduce());

        fraction = new Fraction(3, 7);
        assertEquals(new Fraction(3, 7), fraction.reduce());

        fraction = new Fraction(12, 120);
        assertEquals(new Fraction(1, 10), fraction.reduce());

        fraction = new Fraction(-18, 2);
        assertEquals(new Fraction(-9, 1), fraction.reduce());

        fraction = new Fraction(2, 2);
        assertEquals(new Fraction(1, 1), fraction.reduce());

        fraction = new Fraction(14, 1);
        assertEquals(new Fraction(14, 1), fraction.reduce());

        fraction = new Fraction(-2, 1);
        assertEquals(new Fraction(-2, 1), fraction.reduce());

        fraction = new Fraction(0, 1);
        assertEquals(new Fraction(0, 1), fraction.reduce());
    }

    @Test
    public void shouldZeroFractionsEqualThemselves() {
        Fraction fraction1 = new Fraction(0, 9);
        Fraction fraction2 = new Fraction(0, 1);
        assertEquals(fraction1, fraction2);
    }

    @Test
    public void shouldFindOppositeWork() {
        Fraction fraction = new Fraction(1, 2);
        assertEquals(new Fraction(2, 1), fraction.findOpposite());

        fraction = new Fraction(0, 1);
        assertEquals(new Fraction(0, 1), fraction.findOpposite());

        fraction = new Fraction(-3, 15);
        assertEquals(new Fraction(-5, 1), fraction.findOpposite());

        fraction = new Fraction(-8, 3);
        assertEquals(new Fraction(-3, 8), fraction.findOpposite());
    }

    @Test
    public void shouldCheckFloatingMinusWork() {
        assertEquals(new Fraction(1, 1), new Fraction(1, 1).checkFloatingMinus());
        assertEquals(new Fraction(-1, 1), new Fraction(-1, 1).checkFloatingMinus());
        assertEquals(new Fraction(1, 1), new Fraction(-1, -1).checkFloatingMinus());
        assertEquals(new Fraction(-1, 1), new Fraction(1, -1).checkFloatingMinus());
        assertEquals(new Fraction(0, 1), new Fraction(0, -1).checkFloatingMinus());
        assertEquals(new Fraction(0, 1), new Fraction(-1, 0).checkFloatingMinus());
    }


}
