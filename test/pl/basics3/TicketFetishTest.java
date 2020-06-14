package pl.basics3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

@DisplayName("Should TicketFetish methods work")
public class TicketFetishTest {

    @DisplayName("Should isTicketLucky work")
    @ParameterizedTest(name = "{index} => expected={0}, input={1}")
    @MethodSource("isTicketLuckyArgumentsProvider")
    void isTicketLucky(boolean expected, String input) {
        assertEquals(expected, TicketFetish.isTicketLucky(input));
    }
    private static Stream<Arguments> isTicketLuckyArgumentsProvider() {
        return Stream.of(
                Arguments.of(true, "1125156004"),
                Arguments.of(false, "12345"),
                Arguments.of(true, "123321"),
                Arguments.of(true, "0002324000"),
                Arguments.of(false, "0"),
                Arguments.of(false, "821294292392391292424232093")
        );
    }
}
