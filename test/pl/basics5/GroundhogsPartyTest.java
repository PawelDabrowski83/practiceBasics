package pl.basics5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class GroundhogsPartyTest {

    @DisplayName("should isPartyFun work correctly")
    @ParameterizedTest(name = "{index} => expected={0}, input={1}")
    @MethodSource("isPartyFunArgumentsProvider")
    void isPartyFun(boolean expected, String input) {
        assertEquals(expected, GroundhogsParty.isPartyFun(input));
    }
    private static Stream<Arguments> isPartyFunArgumentsProvider() {
        return Stream.of(
                Arguments.of(false, "5 false"),
                Arguments.of(false, "21 false"),
                Arguments.of(false, "1920393 false"),
                Arguments.of(false, "-100 true"),
                Arguments.of(false, "14 true"),
                Arguments.of(false, "26 true"),
                Arguments.of(true, "15 true"),
                Arguments.of(true, "25 true"),
                Arguments.of(true, "10 false"),
                Arguments.of(true, "20 false"),
                Arguments.of(false, "9 false")
        );
    }
}
