package pl.basics;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Main21_sudokuTest {

    @Test
    public void shouldGetDictionaryGiven3Return9() {
        // given
        int n = 3;
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // when
        int[] actual = Main21_sudoku.getDictionary(n);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetDictionaryGivenZeroReturn0() {
        // given
        int n = 0;
        int[] expected = {0};

        // when
        int[] actual = Main21_sudoku.getDictionary(n);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetDictionary1Return1() {
        // given
        int n = 1;
        int[] expected = {1};

        // when
        int[] actual = Main21_sudoku.getDictionary(n);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetDictionary2Return4() {
        // given
        int n = 2;
        int[] expected = {1, 2, 3, 4};

        // when
        int[] actual = Main21_sudoku.getDictionary(n);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCheckRowWork() {
        // given
        int[] dictionary = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] matrix = {
                {2, 1, 3, 5, 4, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9}
        };
        int row = 0;
        boolean expected = true;

        // when
        boolean actual = Main21_sudoku.checkRow(matrix, row, dictionary);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckColWork() {
        // given
        int[] dictionary = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] matrix = {
                {2, 1, 3, 5, 4, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9}
        };
        int col = 0;
        boolean expected = false;

        // when
        boolean actual = Main21_sudoku.checkCol(matrix, col, dictionary);

        // then
        assertEquals(expected, actual);
    }
}
