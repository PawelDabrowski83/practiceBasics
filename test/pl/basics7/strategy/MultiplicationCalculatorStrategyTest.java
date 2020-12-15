package pl.basics7.strategy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationCalculatorStrategyTest {

    CalculatorStrategy strategy = new MultiplicationCalculatorStrategy();

    @DisplayName("should calculate perform correct calculations")
    @ParameterizedTest
    @MethodSource("calculateArgumentsProvider")
    void calculate (String expected, int a, int b) {
        assertEquals(expected, strategy.calculate(a, b));
    }
    private static Stream<Arguments> calculateArgumentsProvider() {
        return Stream.of(
                Arguments.of("100", 20, 5),
                Arguments.of("1000", 100, 10),
                Arguments.of("0", 0, 2),
                Arguments.of("-45", -15, 3),
                Arguments.of("200", -20, -10)
        );
    }
}
