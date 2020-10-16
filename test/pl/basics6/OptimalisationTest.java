package pl.basics6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pl.basics6.simpleCalculations.Optimalisation;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptimalisationTest {

    @DisplayName("should optimise() work")
    @ParameterizedTest
    @MethodSource("optimiseArgumentsProvider")
    void optimise(int expected, int[] array, int tasks){
        assertEquals(expected, Optimalisation.optimise(array, tasks));
    }
    private static Stream<Arguments> optimiseArgumentsProvider(){
        return Stream.of(
                Arguments.of(4, new int[]{2, 2, 3, 1, 3, 1}, 3),
                Arguments.of(4, new int[]{2, 2, 3, 1, 1, 3}, 5)
        );
    }
}
