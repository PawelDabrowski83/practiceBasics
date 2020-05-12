package pl.basics;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class Main11Test {

    int firstKey;
    int lastKey;
    TreeMap<Integer, String> map;
    TreeMap<Integer, String> mapExpected;
    Map<Integer, String> mapActual;

    @Test
    public void shouldGetSubMapEvenWork() {
    /*
        if the first key % 2 != 0, return sub-map from firstKey inclusive to firstKey + 4
        inclusive in descending order
     */

        // given
        map = new TreeMap<>();
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");

        firstKey = map.keySet().stream().findFirst().get();
        mapExpected = new TreeMap<>();
        mapExpected.put(2, "two");
        mapExpected.put(3, "three");
        mapExpected.put(4, "four");
        mapExpected.put(5, "five");
        mapExpected.put(6, "six");

        // when
        mapActual = Main11.MapUtils.getSubMap(map);

        // then
        assertEquals(mapExpected, mapActual);
    }

    @Test
    public void shouldGetSubMapOddWork() {
    /*
        if firstKey % 2 != 0 return sub-map from lastKey - 4 inclusive to the lastKey
         inclusive in descending order.
     */

        // given
        map = new TreeMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");

        firstKey = map.keySet().stream().findFirst().get();
        mapExpected = new TreeMap<>();
        mapExpected.put(5, "five");
        mapExpected.put(6, "six");
        mapExpected.put(7, "seven");
        mapExpected.put(8, "eight");
        mapExpected.put(9, "nine");

        // when
        mapActual = Main11.MapUtils.getSubMap(map);

        // then
        assertEquals(mapExpected, mapActual);
    }
}
