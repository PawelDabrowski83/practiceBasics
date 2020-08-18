package pl.basics5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertArrayEquals;

public class DeleteOccurencesBeyondLimitTest {

    @DisplayName("should deleteNth() removes repeating numbers in collection beyond n limit")
    @ParameterizedTest(name = "{index} => expected={0}, source={1}, n={2}")
    @MethodSource("deleteNthArgumentsProvider")
    void deleteNth(int[] expected, int[] source, int limit) {
        assertArrayEquals(expected, DeleteOccurencesBeyondLimit.deleteNth(source, limit));
    }
    private static Stream<Arguments> deleteNthArgumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 2, 3, 4, 5, 7},
                        new int[]{1, 2, 3, 4, 1, 1, 2, 3, 1, 1, 2, 5, 7},
                        2
                ),
                Arguments.of(
                        new int[]{1, 2, 3, 4, 1, 2, 3, 5, 7},
                        new int[]{1, 2, 3, 4, 1, 1, 2, 3, 1, 1, 2, 5, 7},
                        3
                ),
                Arguments.of(
                        new int[0],
                        new int[0],
                        4
                ),
                Arguments.of(
                        new int[]{1, 2, 3, 4, 1, 1, 2, 3, 1, 1, 2, 5, 7},
                        new int[]{1, 2, 3, 4, 1, 1, 2, 3, 1, 1, 2, 5, 7},
                        Integer.MAX_VALUE
                ),
                Arguments.of(
                        new int[0],
                        new int[]{1, 2, 3, 4, 1, 1, 2, 3, 1, 1, 2, 5, 7},
                        Integer.MIN_VALUE
                ),
                Arguments.of(
                        new int[]{9, 8, 6, 4, 3, 2, 1},
                        new int[]{9, 8, 6, 4, 3, 2, 1},
                        2
                ),
                Arguments.of(
                        new int[0],
                        new int[]{1, 2, 3, 4, 1, 1, 2, 3, 1, 1, 2, 5, 7},
                        0
                )
        );
    }
}
