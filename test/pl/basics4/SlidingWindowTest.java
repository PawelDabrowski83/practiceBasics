package pl.basics4;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class SlidingWindowTest {

    @DisplayName("Should findLongestUniqueStreak() work")
    @ParameterizedTest(name = "{index} => expected={0}, given={1}")
    @MethodSource("findLongestUniqueStreakArgumentsProvider")
    void findLongestUniqueStreak(char[] expected, SlidingWindow given) {
        assertArrayEquals(expected, given.findLongestUniqueStreak());
    }
    private static Stream<Arguments> findLongestUniqueStreakArgumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new char[]{'a', 'c'},
                        new SlidingWindow(new char[]{'a', 'c', 'a'})
                ),
                Arguments.of(
                        new char[]{'a'},
                        new SlidingWindow(new char[]{'a', 'a', 'a'})
                ),
                Arguments.of(
                        new char[]{'a', 'b', 'c', 'e'},
                        new SlidingWindow(new char[]{'a', 'a', 'a', 'b', 'c', 'e', 'a'})
                ),
                Arguments.of(
                        new char[0],
                        new SlidingWindow(new char[0])
                ),
                Arguments.of(
                        new char[]{';', 'a', 't'},
                        new SlidingWindow(new char[]{'0', ';', 'a', 't', 't'})
                ),
                Arguments.of(
                        new char[]{'x', 'y', 'z'},
                        new SlidingWindow(new char[]{'x', 'y', 'z'})
                ),
                Arguments.of(
                        new char[]{'k', 'o', 't'},
                        new SlidingWindow(new char[]{'o', 't', 't', 'k', 'o', 't'})
                )
        );
    }

    @DisplayName("slideRight() should add new character from input array to buffer")
    @ParameterizedTest(name = "{index} => expected={0}, given={1}, startingPosition={2}, currentPosition={3}")
    @MethodSource("slideRightArgumentsProvider")
    void slideRight(char[] expected, SlidingWindow slidingWindow, int startingPosition, int currentPosition) {
        assertArrayEquals(expected, slidingWindow.slideRight(startingPosition, currentPosition));
    }
    private static Stream<Arguments> slideRightArgumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new char[]{'a', 'b', 'c'},
                        new SlidingWindow(new char[]{'a', 'b', 'c', 'd'}),
                        0,
                        3
                ),
                Arguments.of(
                        new char[]{'a', 'b', 'c', 'd'},
                        new SlidingWindow(new char[]{'a', 'b', 'c', 'd'}),
                        0,
                        4
                ),
                Arguments.of(
                        new char[]{'x', 'y'},
                        new SlidingWindow(new char[]{'a', 'x', 'y'}),
                        1,
                        3
                ),
                Arguments.of(
                        new char[]{';'},
                        new SlidingWindow(new char[]{';', ';'}),
                        0,
                        1
                ),
                Arguments.of(
                        new char[]{'x', 'y', 'z'},
                        new SlidingWindow(new char[]{'a', 'x', 'y', 'z', 'z'}),
                        1,
                        4
                ),
                Arguments.of(
                        new char[0],
                        new SlidingWindow(new char[0]),
                        1,
                        4
                ),
                Arguments.of(
                        new char[0],
                        new SlidingWindow(new char[0]),
                        -1,
                        3
                ),
                Arguments.of(
                        new char[]{'x', 'y', 'z', 'z'},
                        new SlidingWindow(new char[]{'a', 'x', 'y', 'z', 'z'}),
                        1,
                        13
                )
        );
    }

    @Test(expected=NullPointerException.class)
    public void shouldSlideRightGivenNullThrowsNPE() {
        SlidingWindow slidingWindow = null;
        slidingWindow.slideRight(0,1);
    }

    @DisplayName("isCharPresent checks if char array contains a char")
    @ParameterizedTest(name = "{index} => expected={0}, char={1}, array={2}")
    @MethodSource("isCharPresentArgumentsProvider")
    void isCharPresent(boolean expected, char given, char[] source) {
        assertEquals(expected, SlidingWindow.isCharPresent(given, source));
    }
    private static Stream<Arguments> isCharPresentArgumentsProvider() {
        return Stream.of(
                Arguments.of(
                        false,
                        'a',
                        new char[]{'a', 'b'}
                ),
                Arguments.of(
                        false,
                        'z',
                        new char[]{'z'}
                ),
                Arguments.of(
                        false,
                        't',
                        new char[]{'a', 'b', 'c', 't'}
                ),
                Arguments.of(
                        true,
                        'a',
                        new char[0]
                ),
                Arguments.of(
                        true,
                        ' ',
                        new char[]{'a', 'z', 'x'}
                )
        );
    }

    @Test
    public void shouldFindLongestUniqueStreakWork() {
        SlidingWindow slidingWindow = new SlidingWindow(new char[]{'a'});
        assertArrayEquals(new char[]{'a'}, slidingWindow.findLongestUniqueStreak());
    }

    @Test
    public void shouldIsCharPresentGivenNullReturnFalse() {
        SlidingWindow slidingWindow = new SlidingWindow(null);
        assertTrue(SlidingWindow.isCharPresent('z', null));
    }

}
