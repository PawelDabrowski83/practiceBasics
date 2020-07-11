package pl.basics3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class RegexFinderTest {

    @DisplayName("Should isRegexInMiddleWord work")
    @ParameterizedTest(name = "{index} => expected={0}, part={1}, given={2}")
    @MethodSource("isRegexInMiddleWordArgumentsProvider")
    void isRegexInMiddleWord(boolean expected, String part, String sentence) {
        assertEquals(expected, RegexFinder.isRegexInMiddleWord(part, sentence));
    }
    private static Stream<Arguments> isRegexInMiddleWordArgumentsProvider() {
        return Stream.of(
                Arguments.of(
                        true, "Gramm", "Java is the most popular programming language"
                ),
                Arguments.of(
                        true, "Press", "Regular expressions is hard to read, isnt it?"
                ),
                Arguments.of(
                        true, "press", "Regular expressions is hard to read, isnt it?"
                ),
                Arguments.of(
                        false, "some", "Wow! How awesome is that!"
                )
        );
    }
}
