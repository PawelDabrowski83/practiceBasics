package pl.basics4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class LongestWordTest {

    @DisplayName("should findLongestWord() return longest word in given text")
    @ParameterizedTest(name = "{index} => expected={0}, text={1}")
    @MethodSource("findLongestWordArgumentsProvider")
    void findLongestWord(String expected, String text) {
        assertEquals(expected, LongestWord.findLongestWord(text));
    }
    private static Stream<Arguments> findLongestWordArgumentsProvider() {
        return Stream.of(
                Arguments.of(
                        "three",
                        "one two three four five six"
                ),
                Arguments.of(
                        "abc",
                        "abc"
                ),
                Arguments.of(
                        "",
                        ""
                ),
                Arguments.of(
                        "jestem;",
                        "1 jestem jestem; dwa"
                ),
                Arguments.of(
                        "opoka",
                        "baza opoka janul micha sobol"
                )

        );
    }
}
