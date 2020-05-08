package pl.basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main5Test {

    Long val;
    int valueExpected;
    int valueActual;

    @Test
    public void shouldConvertLongIsNPESafe() {

        // given
        val = null;
        valueExpected = 0;

        // when
        valueActual = Main5.convertLong(val);

        // then
        assertEquals(valueExpected, valueActual);
    }

    @Test
    public void shouldConvertLongLimitIntegerGivenGreaterThanMax() {

        // given
        val = Long.MAX_VALUE;
        valueExpected = Integer.MAX_VALUE;

        // when
        valueActual = Main5.convertLong(val);

        // then
        assertEquals(valueExpected, valueActual);
    }

    @Test
    public void shouldConvertLongLimitIntegerGivenLowerThanMin() {

        // given
        val = Long.MIN_VALUE;
        valueExpected = Integer.MIN_VALUE;

        // when
        valueActual = Main5.convertLong(val);

        // then
        assertEquals(valueExpected, valueActual);
    }

    @Test
    public void shouldConvertLongWork() {

        // given
        val = 100_000L;
        valueExpected = 100_000;

        // when
        valueActual = Main5.convertLong(val);

        // then
        assertEquals(valueExpected, valueActual);
    }
}
