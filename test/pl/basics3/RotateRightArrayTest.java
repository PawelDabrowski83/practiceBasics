package pl.basics3;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateRightArrayTest {

    @Test
    public void shouldRotateRightArrayWork1() {
        // given
        int[] array = {1, 2, 3, 4, 5};
        int step = 1;
        int[] expected = {5, 1, 2, 3, 4};

        // when
        int[] actual = RotateRightArray.rotateRightArray(array, step);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRotateRightArrayWork2() {
        // given
        int[] array = {1, 2, 3, 4, 5};
        int step = 2;
        int[] expected = {4, 5, 1, 2, 3};

        // when
        int[] actual = RotateRightArray.rotateRightArray(array, step);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRotateRightArrayWork3() {
        // given
        int[] array = {1, 2, 3, 4, 5};
        int step = 8;
        int[] expected = {3, 4, 5, 1, 2};

        // when
        int[] actual = RotateRightArray.rotateRightArray(array, step);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRotateRightArrayWork4() {
        // given
        int[] array = {11, 21, 1, 41, 51, 78, 90};
        int step = 10_000;
        int[] expected = {41, 51, 78, 90, 11, 21, 1};

        // when
        int[] actual = RotateRightArray.rotateRightArray(array, step);

        // then
        assertArrayEquals(expected, actual);
    }
}
