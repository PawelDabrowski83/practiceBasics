package pl.basics12.codewars.whoLikesIt;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @DisplayName("Should whoLikesIt() display proper message")
    @Test
    public void whoLikesIt_zeroArgs() {
        // given
        String expected = Solution.LIKES_ZERO;

        // when
        String actual = Solution.whoLikesIt();

        // then
        assertEquals(expected, actual);
    }

    @DisplayName("Should whoLikesIt with one name display proper message")
    @Test
    public void whoLikesIt_oneArg(String name) {
        // given
        String expected = String.format(Solution.LIKES_ONE, name);

        // when
        String actual = Solution.whoLikesIt(name);

        // then
        assertEquals(expected, actual);
    }

    /*


    private static Stream<Arguments> whoLikesItArgumentProvider() {
        return Stream.of(
//                Arguments.of("no one likes this", ""),
                Arguments.of("Peter likes this", "Peter"),
                Arguments.of("Jacob and Alex like this", "Jacob", "Alex"),
                Arguments.of("Max, John and Mark like this", "Max", "John", "Mark"),
                Arguments.of("Alex, Jacob and 2 others like this", "Alex", "Jacob", "Mark", "Max"),
                Arguments.of("Alex, Jacob and 4 others like this", "Alex", "Jacob", "Mark", "Max", "Tony", "Greg")
        );
    }


     */

}
