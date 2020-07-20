package pl.basics4;

import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class WorldPopulationTest {

    WorldPopulation worldPopulation;

    @Before
    public void initialize() {
        worldPopulation = new WorldPopulation();
    }


    @DisplayName("Should readDataFromFile work?")
    @ParameterizedTest(name = "{index} => expected={0}, year={1}")
    @MethodSource("readDataFromFileArgumentsProvider")
    void shouldReadDataFromFileWork(long expected, int year) {
        initialize();
        String filePath = "files/dataset_91069.txt";
        File file = new File(filePath);
        Map<Integer, Long> datamap = new HashMap<>();
        try {
            datamap = worldPopulation.readDataFromFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(expected, datamap.getOrDefault(year, 0L).longValue());
    }
    private static Stream<Arguments> readDataFromFileArgumentsProvider() {
        return Stream.of(
                Arguments.of(2_557_628_654L, 1950),
                Arguments.of(3_350_425_793L, 1965),
                Arguments.of(6_709_049_780L, 2008)
        );
    }

    @DisplayName("Should findGreatestIncrease() work")
    @ParameterizedTest(name = "{index} => expected={0}, given={1}")
    @MethodSource("findGreatestIncreaseArgumentsProvider")
    void findGreatestIncrease(int expected, Map<Integer, Long> given) {
        initialize();
        assertEquals(expected, worldPopulation.findLargestIncrease(given));
    }
    private static Stream<Arguments> findGreatestIncreaseArgumentsProvider() {
        return Stream.of(
                Arguments.of(22,
                        Map.of(
                                19, 1000L,
                                20, 1100L,
                                21, 1200L,
                                22, 1500L
                        )
                ),
                Arguments.of(2000,
                        Map.of(
                                1995, 1000L,
                                1996, 1100L,
                                1997, 1200L,
                                1998, 1500L,
                                1999, 2000L,
                                2000, 3000L
                        )
                ),
                Arguments.of(2,
                        Map.of(
                                1, 5L,
                                2, 15L,
                                3, -16L,
                                4, -17L
                        ))
        );
    }

}
