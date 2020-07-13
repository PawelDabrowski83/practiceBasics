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

    @DisplayName("Should removeTags() work")
    @ParameterizedTest(name = "{index} => expected={0}, given={1}")
    @MethodSource("removeTagsArgumentsProvider")
    void removeTags(String expected, String given) {
        assertEquals(expected, RegexFinder.removeTags(given));
    }
    private static Stream<Arguments> removeTagsArgumentsProvider() {
        return Stream.of(
                Arguments.of("Simple header", "<h1>Simple header</h1>"),
                Arguments.of("Header with bold text", "<h2>Header with <b>bold</b> text</h2>")
        );
    }

    @DisplayName("Should removeComments() work")
    @ParameterizedTest(name = "{index} => expected={0}, given={1}")
    @MethodSource("removeCommentsArgumentsProvider")
    void removeComments(String expected, String given) {
        assertEquals(expected, RegexFinder.removeComments(given));
    }
    private static Stream<Arguments> removeCommentsArgumentsProvider() {
        return Stream.of(
                Arguments.of("Integer variable = new Integer(\"0\");",
                        "Integer variable /* it only contains integers */= new Integer(\"0\"); // now contains zero"),
                Arguments.of("String s = \"123\";",
                        "/* new line */String /* we need String, not int */s /* bad name, I think */= \"123\";"),
                Arguments.of("int b = 0; b = b * b ;",
                        "int b = 0;/* expression */ b = b /* **/* b /* b * b = b squared */; // 0 * 0 = 0")
        );
    }

    @DisplayName("Should extractLargeNumbers() work")
    @ParameterizedTest(name = "{index} => expected={0}, given={1}")
    @MethodSource("extractLargeNumbersArgumentsProvider")
    void extractLargeNumbers(String expected, String given) {
        assertEquals(expected, RegexFinder.extractLargeNumbers(given));
    }
    private static Stream<Arguments> extractLargeNumbersArgumentsProvider() {
        return Stream.of(
                Arguments.of("609348676234:12\n" +
                        "609348679311:12",
                        "If X is 609348676234, Y is 3077, the sum is 609348679311.")
        );
    }
}
