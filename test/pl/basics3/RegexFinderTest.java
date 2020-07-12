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

    @DisplayName("Should containsWordLength() work")
    @ParameterizedTest(name = "{index} => expected={0}, length={1}, sentence={2}")
    @MethodSource("containsWordLengthArgumentsProvider")
    void containsWordLength(boolean expected, int length, String sentence) {
        assertEquals(expected, RegexFinder.containsWordLength(length, sentence));
    }
    private static Stream<Arguments> containsWordLengthArgumentsProvider() {
        return Stream.of(
                Arguments.of(true, 4, "Java is the most popular programming language"),
                Arguments.of(true, 3, "Java is the most popular programming language"),
                Arguments.of(false, 11, "Regular expression is hard to read, isnt it?"),
                Arguments.of(true, 4, "Wow! How awesome is that!")
        );
    }

    @DisplayName("Should removeExtraSpaces() work")
    @ParameterizedTest(name = "{index} => expected={0}, given={1}")
    @MethodSource("removeExtraSpacesArgumentsProvider")
    void removeExtraSpaces(String expected, String given) {
        assertEquals(expected, RegexFinder.removeExtraSpaces(given));
    }
    private static Stream<Arguments> removeExtraSpacesArgumentsProvider() {
        return Stream.of(
                Arguments.of("Just a text", "Just                  a                   text"),
                Arguments.of("The Java language was initially called Oak after an oak tree that stood outside" +
                        " Gosling's office. Later the project went by the name Green and was finally renamed Java," +
                        " from Java coffee.",
                        "   The \tJava   language was initially called Oak after an oak tree \t\tthat stood" +
                                "     outside Gosling's  office. Later the project went    by the     name Green" +
                                "   and was finally \trenamed Java, \tfrom Java coffee.  ")
        );
    }
}
