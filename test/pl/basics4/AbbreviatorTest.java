package pl.basics4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class AbbreviatorTest {

    private Abbreviator abbreviator = new Abbreviator();

    @DisplayName("Should abbreviate() work")
    @ParameterizedTest(name = "{index} => expected={0}, given={1}")
    @MethodSource("abbreviateArgumentsProvider")
    void abbreviate(String expected, String given) {
        assertEquals(expected, abbreviator.abbreviate(given));
    }
    private static Stream<Arguments> abbreviateArgumentsProvider() {
        return Stream.of(
                Arguments.of("e6t", "elephant"),
                Arguments.of("are", "are"),
                Arguments.of("", ""),
                Arguments.of("r3s", "rides"),
                Arguments.of("r4y", "really"),
                Arguments.of("fun", "fun"),
                Arguments.of("in", "in"),
                Arguments.of("a", "a"),
                Arguments.of("i9y", "indubitably"),
                Arguments.of("s8s", "suspicious"),
                Arguments.of("e6t r2e", "elephant-ride"),
                Arguments.of("a8y", "accurately"),
                Arguments.of("r3s!", "rides!"),
                Arguments.of(".r4y", ".really"),
                Arguments.of("(fun)", "(fun)"),
                Arguments.of("in...", "in...")
        );
    }
}
