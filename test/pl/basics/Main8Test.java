package pl.basics;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Main8Test {

    String str;
    Set<Integer> integers;
    Set<Integer> setExpected;
    Set<Integer> setActual;

    @Before
    public void setUp() {
        str = "0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20";
        integers = new LinkedHashSet<>(Arrays.asList(7, 8, 9, 10, 11, 12, 13, 14, 15));
    }

    @Test
    public void shouldGetSetFromStringWork() {

        // given
        setExpected = new LinkedHashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

        // when
        setActual = Main8.SetUtils.getSetFromString(str);

        // then
        assertEquals(setExpected, setActual);
        assertNotEquals(new LinkedHashSet<>(), setActual);
    }

    @Test
    public void shouldGetSetFromStringGivenNullReturnEmptySet() {
        // given
        str = null;
        setExpected = new LinkedHashSet<>();

        // when
        setActual = Main8.SetUtils.getSetFromString(str);

        // then
        assertEquals(setExpected, setActual);
    }

    @Test
    public void shouldGetSetFromStringGivenEmptyStringReturnEmptySet() {

        // given
        str = "";
        setExpected = new LinkedHashSet<>();

        // when
        setActual = Main8.SetUtils.getSetFromString(str);

        // then
        assertEquals(setExpected, setActual);
    }

    @Test
    public void shouldRemoveGreater10Work() {

        // given
        setExpected = new LinkedHashSet<>(Arrays.asList(7, 8, 9, 10));

        // when
        setActual = Main8.SetUtils.removeAllNumbersGreaterThan10(integers);

        // then
        assertEquals(setExpected, setActual);
    }

    @Test
    public void shouldRemoveGreater10GivenNullReturnEmptySet() {

        // given
        integers = null;
        setExpected = new LinkedHashSet<>();

        // when
        setActual = Main8.SetUtils.removeAllNumbersGreaterThan10(integers);

        // then
        assertEquals(setExpected, setActual);
    }

    @Test
    public void shouldRemoveGreater10GivenEmptySetReturnEmptySet() {

        // given
        integers = new LinkedHashSet<>();
        setExpected = new LinkedHashSet<>();

        // when
        setActual = Main8.SetUtils.removeAllNumbersGreaterThan10(integers);

        // then
        assertEquals(setExpected, setActual);
    }
}
