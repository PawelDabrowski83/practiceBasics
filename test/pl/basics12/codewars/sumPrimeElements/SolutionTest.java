package pl.basics12.codewars.sumPrimeElements;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @DisplayName("Should solve return proper response.")
    @ParameterizedTest
    @MethodSource("solveArgumentsProvider")
    void solve(int expected, int[] source) {
        // when
        int actual = Solution.solve(source);

        // then
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> solveArgumentsProvider() {
        return Stream.of(
                Arguments.of(0, new int[]{}),
                Arguments.of(7, new int[]{1, 2, 3, 4}),
                Arguments.of(13, new int[]{1, 2, 3, 4, 5, 6}),
                Arguments.of(47, new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15})
        );
    }
}
