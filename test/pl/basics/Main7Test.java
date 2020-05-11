package pl.basics;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class Main7Test {

    Collection<String> phones;
    Collection<String> blocklist;
    Collection<String> phonesExpected;
    Collection<String> phonesActual;

    @Before
    public void setUp() {

        phones = new ArrayList<>(Arrays.asList("123", "456", "789", "555"));
        blocklist = new ArrayList<>(Collections.singletonList("555"));
    }

    @Test
    public void shouldFilterPhonesWork() {

        // given
        phonesExpected = new ArrayList<>(Arrays.asList("123", "456", "789"));

        // when
        phonesActual = Main7.CollectionUtils.filterPhones(phones, blocklist);

        // then
        assertEquals(phonesExpected, phonesActual);
    }

    @Test
    public void shouldFilterPhonesWorkWhenPhonesAreNull() {

        // given
        phones = null;
        blocklist = null;
        phonesExpected = new ArrayList<>();

        // when
        phonesActual = Main7.CollectionUtils.filterPhones(phones, blocklist);
    }

    @Test
    public void shouldFilterPhonesWorkWhenBlocklistIsNull() {

        // given
        blocklist = null;
        phonesExpected = new ArrayList<>(phones);

        // when
        phonesActual = Main7.CollectionUtils.filterPhones(phones, blocklist);

        // then
        assertEquals(phonesExpected, phonesActual);
    }

}
