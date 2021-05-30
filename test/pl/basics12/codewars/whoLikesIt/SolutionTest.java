package pl.basics12.codewars.whoLikesIt;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @DisplayName("Should whoLikesIt() display proper message")
    @MethodSource("whoLikesItArgumentProvider")
    @ParameterizedTest
    void whoLikesIt(String expected, String... input) {
        // given

        // when
        String actual = Solution.whoLikesIt(input);

        // then
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> whoLikesItArgumentProvider() {
        return Stream.of(
                Arguments.of("no one likes this", ""),
                Arguments.of("Peter likes this", "Peter"),
                Arguments.of("Jacob and Alex like this", "Jacob", "Alex"),
                Arguments.of("Max, John and Mark like this", "Max", "John", "Mark"),
                Arguments.of("Alex, Jacob and 2 others like this", "Alex", "Jacob", "Mark", "Max"),
                Arguments.of("Alex, Jacob and 4 others like this", "Alex", "Jacob", "Mark", "Max", "Tony", "Greg")
        );
    }

}
