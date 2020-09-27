package pl.basics5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class MorseCodeTest {

    @DisplayName("should decode() work")
    @ParameterizedTest
    @MethodSource("decodeArgumentsProvider")
    void decode(String expected, String code){
        assertEquals(expected, MorseCode.decode(code));
    }
    private static Stream<Arguments> decodeArgumentsProvider(){
        return Stream.of(
                Arguments.of("HEY JUDE", ".... . -.--   .--- ..- -.. ."),
                Arguments.of("SOS", "···−−−···"),
                Arguments.of("A", ".-"),
                Arguments.of("1", ".----"),
                Arguments.of("Q", "--.-")
        );
    }

    @DisplayName("should indexOfArray() return index of given key")
    @ParameterizedTest
    @MethodSource("indexOfArrayArgumentsProvider")
    void indexOfArray(int expected, String[] array, String key){
        assertEquals(expected, MorseCode.indexOfArray(array, key));
    }
    private static Stream<Arguments> indexOfArrayArgumentsProvider(){
        return Stream.of(
                Arguments.of(0, new String[]{"1", "a", "c"}, "1"),
                Arguments.of(1, new String[]{"a", "b", "c", "d", "e", "a"}, "b"),
                Arguments.of(0, new String[]{"a", "b", "c", "d", "e", "a"}, "a"),
                Arguments.of(4, new String[]{"a", "b", "c", "d", "e", "a"}, "e"),
                Arguments.of(-1, new String[]{"a", "b"}, "c"),
                Arguments.of(-1, new String[0], "abc"),
                Arguments.of(-1, new String[]{"a", "-1", "c"}, "")
        );
    }
}
