package pl.basics5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class KeypadTest {
    static Keypad.Key key1;
    static Keypad.Key key2;
    static Keypad.Key key7;
    static Keypad.Key key10;
    static Keypad.Key key11;

    @BeforeAll
    public static void setUp(){
        key1 = new Keypad.Key(new char[]{'1'});
        key2 = new Keypad.Key(new char[]{'A', 'B', 'C', '2'});
        key7 = new Keypad.Key(new char[]{'P', 'Q', 'R', 'S', '7'});
        key10 = new Keypad.Key(new char[]{'*'});
        key11 = new Keypad.Key(new char[]{' ', '0'});
    }

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
                Arguments.of(9, ".LOL!"),
                Arguments.of(1, "A"),
                Arguments.of(2, "B"),
                Arguments.of(8, "BBBB")
        );
    }

    @DisplayName("should inner class Key method press work")
    @ParameterizedTest
    @MethodSource("pressArgumentsProvider")
    void press(int expected, char desired, Keypad.Key key){
        assertEquals(expected, key.press(desired));
    }
    private static Stream<Arguments> pressArgumentsProvider(){
        return Stream.of(
                Arguments.of(0, 'B', key10),
                Arguments.of(1, 'A', key2),
                Arguments.of(2, 'b', key2),
                Arguments.of(3, 'r', key7),
                Arguments.of(4, 'S', key7),
                Arguments.of(5, '7', key7),
                Arguments.of(1, '1', key1),
                Arguments.of(1, ' ', key11),
                Arguments.of(0, ' ', key10),
                Arguments.of(1, '*', key10)
        );
    }
}
