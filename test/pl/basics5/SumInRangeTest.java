package pl.basics5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class SumInRangeTest {

    @DisplayName("should sumInRange() calculate sum of next numbers from start inclusive to end exclusive")
    @ParameterizedTest(name = "{index} => expected={0}, start={1}, end={2}")
    @MethodSource("sumInRangeArgumentsProvider")
    void sumInRange(int expected, int from, int to) {
        assertEquals(expected, SumInRange.sumInRange(from, to));
    }
    private static Stream<Arguments> sumInRangeArgumentsProvider() {
        return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(0, 5, 5),
                Arguments.of(60, 10, 15)
        );
    }
}
