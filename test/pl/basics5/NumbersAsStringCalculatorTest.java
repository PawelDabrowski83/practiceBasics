package pl.basics5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NumbersAsStringCalculatorTest {

    @DisplayName("should add() add two number-strings")
    @ParameterizedTest
    @MethodSource("addArgumentsProvider")
    void add(String expected, String number1, String number2){
        assertEquals(expected, NumbersAsStringCalculator.add(number1, number2));
    }
    private static Stream<Arguments> addArgumentsProvider(){
        return Stream.of(
//                Arguments.of("4", "2", "2"),
//                Arguments.of("10", "2", "8"),
                Arguments.of("11", "11", "0"),
                Arguments.of("100", "50", "50"),
                Arguments.of("111", "1", "110"),
                Arguments.of("", "", "2"),
                Arguments.of("", "2", ""),
                Arguments.of("", "", ""),
                Arguments.of("0", "0", "0"),
                Arguments.of("7", "0", "7"),
                Arguments.of("-1", "2", "-3"),
                Arguments.of("-20", "-10", "-10"),
                Arguments.of("-9", "-9", "0")
        );
    }
}
