package pl.basics4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class NumberDecrementorTest {

    @DisplayName("should decrementFourNumbers work")
    @ParameterizedTest(name = "{index} => expected={0}, given={1}")
    @MethodSource("decrementFourNumbersArgumentsProvider")
    void decrementFourNumbers(String expected, String given) {
        assertEquals(expected, NumberDecrementor.decrementFourNumbers(given));
    }
    private static Stream<Arguments> decrementFourNumbersArgumentsProvider() {
        return Stream.of(
                Arguments.of("2 92 0 11", "3 93 1 12"),
                Arguments.of("-1 -33 22 103", "0 -32 23 104"),
                Arguments.of("-1 -1 1 2", "0 0 2 3"),
                Arguments.of("", "sample text"),
                Arguments.of("", "2 2 2 2 3 43"),
                Arguments.of("", ""),
                Arguments.of("", "3 candles")
        );
    }
}
