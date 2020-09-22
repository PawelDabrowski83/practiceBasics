package pl.basics5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

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
}
