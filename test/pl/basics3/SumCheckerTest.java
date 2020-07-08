package pl.basics3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class SumCheckerTest {

    @DisplayName("Should check work")
    @ParameterizedTest(name = "{index} => expected={0}, bound={1}, a={2}, b={3}, c={4}")
    @MethodSource("checkArgumentsProvider")
    void check(boolean expected, int bound, int a, int b, int c) {
        assertEquals(expected, SumChecker.check(bound, a, b, c));
    }
    private static Stream<Arguments> checkArgumentsProvider() {
        return Stream.of(
                Arguments.of(true, 20, 1, 2, 18),
                Arguments.of(true, 20, 10, 10, 0),
                Arguments.of(true, 10, 5, 4, 6),
                Arguments.of(true, 10, 2, 6, 8),
                Arguments.of(false, 1, 0, 2, -7),
                Arguments.of(true, 5, -4, 1, 9),
                Arguments.of(false, 3, 2, 2, 2),
                Arguments.of(false, 10, 11, 12, 14),
                Arguments.of(false, 20, 3, -19, -20),
                Arguments.of(true, 0, -1, 2, 1),
                Arguments.of(true, 100, 1, 99, -9)
        );
    }
}
