package pl.basics4;

import org.junit.Ignore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pl.basics4.SlidingWindow;
import java.util.stream.Stream;

import static org.junit.Assert.assertArrayEquals;

public class SlidingWindowTest {

    @DisplayName("Should findLongestUniqueStreak() work")
    @ParameterizedTest(name = "{index} => expected={0}, given={1}")
    @MethodSource("findLongestUniqueStreakArgumentsProvider")
    void findLongestUniqueStreak(char[] expected, char[] given) {
        SlidingWindow slidingWindow = new SlidingWindow(given);
        assertArrayEquals(expected, slidingWindow.findLongestUniqueStreak());
    }
    private static Stream<Arguments> findLongestUniqueStreakArgumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new char[]{'a', 'c'},
                        new char[]{'a', 'c', 'a'}
                ),
                Arguments.of(
                        new char[]{'a'},
                        new char[]{'a', 'a', 'a'}
                ),
                Arguments.of(
                        new char[]{'a', 'b', 'c', 'e'},
                        new char[]{'a', 'a', 'a', 'b', 'c', 'e', 'a'}
                ),
                Arguments.of(
                        new char[0],
                        new char[0]
                ),
                Arguments.of(
                        new char[]{';', 'a', 't'},
                        new char[]{'0', ';', 'a', 't', 't'}
                ),
                Arguments.of(
                        new char[]{'x', 'y', 'z'},
                        new char[]{'x', 'y', 'z'}
                ),
                Arguments.of(
                        new char[]{'k', 'o', 't'},
                        new char[]{'o', 't', 't', 'k', 'o', 't'}
                )
        );
    }

//    @Ignore
//    @DisplayName("Should dropLeft() work")
//    @ParameterizedTest(name = "{index} => expected={0}, given={1}")
//    @MethodSource("dropLeftArgumentsProvider")
//    void dropLeft(char[] expected, char[] given) {
//        assertArrayEquals(expected, SlidingWindow.dropLeft(given));
//    }
//    private static Stream<Arguments> dropLeftArgumentsProvider() {
//        return Stream.of(
//                Arguments.of(
//                        new char[]{'a', 'b'},
//                        new char[]{'c', 'a', 'b'}
//                ),
//                Arguments.of(
//                        new char[]{'x', 'y', 'z'},
//                        new char[]{'x', 'x', 'y', 'z'}
//                ),
//                Arguments.of(
//                        new char[0],
//                        new char[]{';'}
//                ),
//                Arguments.of(
//                        new char[0],
//                        new char[0]
//                )
//        );
//    }
//
//    @Ignore
//    @DisplayName("slideRight() add another character to end of an array")
//    @ParameterizedTest(name = "{index} => expected={0}, given={1}")
//    @MethodSource("slideRightArgumentsProvider")
//    void slideRight(char[] expected, char[] given) {
//        assertArrayEquals(expected, SlidingWindow.slideRight(given));
//    }
}
