package pl.basics5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class KeypadTest {
    @DisplayName("should countPresses work")
    @ParameterizedTest
    @MethodSource("countPressesArgumentsProvider")
    void countPresses(int expected, String given){
        assertEquals(expected, Keypad.countPresses(given));
    }
    private static Stream<Arguments> countPressesArgumentsProvider(){
        return Stream.of(
                Arguments.of(9, "LOL"),
                Arguments.of(13, "HOW R U"),
                Arguments.of(0, ""),
                Arguments.of(9, ".LOL!")
        );
    }
}
