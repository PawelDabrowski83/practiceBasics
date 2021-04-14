package pl.basics9.gui.cw04.rockPaperScissors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZagranieTest {

    @ParameterizedTest
    @MethodSource("shouldBeatWorkArgsProvider")
    public void shouldBeatWorkArgsProvider(Zagranie expected, Zagranie given) {
        // when
        Zagranie actual = Zagranie.beat(given);

        // then
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> shouldBeatWorkArgsProvider() {
        return Stream.of(
                Arguments.of(Zagranie.KAMIEN, Zagranie.NOZYCE),
                Arguments.of(Zagranie.PAPIER, Zagranie.KAMIEN),
                Arguments.of(Zagranie.NOZYCE, Zagranie.PAPIER)
        );
    }

    @ParameterizedTest
    @MethodSource("shouldCheckWorkArgsProvider")
    public void shouldCheckWorkArgsProvider(Zagranie play1, Zagranie play2, int expectedResult) {
        // when
        int actualResult = Zagranie.check(play1, play2);

        // then
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> shouldCheckWorkArgsProvider() {
        return Stream.of(
                Arguments.of(Zagranie.KAMIEN, Zagranie.KAMIEN, 0),
                Arguments.of(Zagranie.KAMIEN, Zagranie.PAPIER, -1),
                Arguments.of(Zagranie.KAMIEN, Zagranie.NOZYCE, 1),
                Arguments.of(Zagranie.PAPIER, Zagranie.KAMIEN, 1),
                Arguments.of(Zagranie.PAPIER, Zagranie.NOZYCE, -1),
                Arguments.of(Zagranie.NOZYCE, Zagranie.PAPIER, 1),
                Arguments.of(Zagranie.NOZYCE, Zagranie.KAMIEN, -1)
        );
    }
}
