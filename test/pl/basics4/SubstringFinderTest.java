package pl.basics4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;


public class SubstringFinderTest {

    @DisplayName("should countOccurances returns number of substring occurance in given text")
    @ParameterizedTest(name = "{index} => expected={0}, substring={1}, text={2}")
    @MethodSource("countOccurancesArgumentsProvider")
    void countOccurances(int expected, SubstringFinder substringFinder, String text) {
        assertEquals(expected, substringFinder.countOccurances(text));
    }
    private static Stream<Arguments> countOccurancesArgumentsProvider() {
        return Stream.of(
                Arguments.of(
                        1,
                        new SubstringFinder("hello there"),
                        "the"
                ),
                Arguments.of(
                        3,
                        new SubstringFinder("hello yellow jello"),
                        "ll"
                ),
                Arguments.of(
                        0,
                        new SubstringFinder(""),
                        "abc"
                ),
                Arguments.of(
                        0,
                        new SubstringFinder("xyz"),
                        "abc"
                ),
                Arguments.of(
                        0,
                        new SubstringFinder("abc"),
                        ""
                )
        );
    }
}
