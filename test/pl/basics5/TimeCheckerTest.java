package pl.basics5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class TimeCheckerTest {

    @DisplayName("should checkTime() check if time string is formatted in hh:mm format")
    @ParameterizedTest
    @MethodSource("checkTimeArgumentsProvider")
    void checkTime(boolean expected, String provided){
        assertEquals(expected, TimeChecker.checkTime(provided));
    }
    private static Stream<Arguments> checkTimeArgumentsProvider(){
        return Stream.of(
                Arguments.of(true, "00:00"),
                Arguments.of(false, "0:01"),
                Arguments.of(false, ":18"),
                Arguments.of(false, "24:00"),
                Arguments.of(false, "21:60"),
                Arguments.of(false, "1100"),
                Arguments.of(false, "-2:00"),
                Arguments.of(true, "13:49"),
                Arguments.of(true, "09:00"),
                Arguments.of(true, "23:59"),
                Arguments.of(false, "")
        );
    }
}
