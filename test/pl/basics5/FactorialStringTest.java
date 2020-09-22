package pl.basics5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialStringTest {

    @DisplayName("should multiplicateString() do correct calculations")
    @ParameterizedTest
    @MethodSource("multiplicateStringArgumentsProvider")
    void multiplicateString(String expected, String base, String factor){
        assertEquals(expected, FactorialString.multiplicateString(base, factor));
    }
    private static Stream<Arguments> multiplicateStringArgumentsProvider(){
        return Stream.of(
                Arguments.of("4", "2", "2"),
                Arguments.of("10", "2", "5"),
                Arguments.of("0", "17", "0"),
                Arguments.of("-15", "-3", "5"),
                Arguments.of("-19", "1", "-19"),
                Arguments.of("100", "10", "10"),
                Arguments.of("10000", "-100", "-100"),
                Arguments.of("", "", "6"),
                Arguments.of("", "4", ""),
                Arguments.of("", "", ""),
                Arguments.of("", "kot", "19"),
                Arguments.of("", "-9", "test"),
                Arguments.of("", "?", "44"),
                Arguments.of("", "jfwjfwf", "..,")
        );
    }

    @DisplayName("should isValidNumber check if given string matches with number pattern")
    @ParameterizedTest
    @MethodSource("isValidNumberArgumentsProvider")
    void isValidNumber(boolean expected, String given){
        assertEquals(expected, FactorialString.isValidNumber(given));
    }
    private static Stream<Arguments> isValidNumberArgumentsProvider(){
        return Stream.of(
                Arguments.of(true, "4"),
                Arguments.of(true, "-10"),
                Arguments.of(true, "0"),
                Arguments.of(true, "11"),
                Arguments.of(true, "24824294704234927092740420957027403248092750223048028520385023840720705209483"),
                Arguments.of(false, "-0"),
                Arguments.of(false, "kot"),
                Arguments.of(false, ";"),
                Arguments.of(false, "18k"),
                Arguments.of(false, "-y"),
                Arguments.of(false, ""),
                Arguments.of(false, " ")
        );
    }

    @DisplayName("should convertStringToIntArray produce int array with digits only")
    @ParameterizedTest
    @MethodSource("convertStringToIntArrayArgumentsProvider")
    void convertStringToIntArrayArgumentsProvider(int[] expected, String given){
        assertArrayEquals(expected, FactorialString.convertStringToIntArray(given));
    }
    private static Stream<Arguments> convertStringToIntArrayArgumentsProvider(){
        return Stream.of(
                Arguments.of(new int[]{1, 0, 0}, "100"),
                Arguments.of(new int[]{1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0}, "12345678901234567890"),
                Arguments.of(new int[]{-1, 4}, "-4"),
                Arguments.of(new int[]{-1, 1, 4}, "-14"),
                Arguments.of(new int[]{0}, "0"),
                Arguments.of(new int[0], "")
        );
    }

}
