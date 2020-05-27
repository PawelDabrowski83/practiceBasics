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

    @Test
    public void shouldCheckSquare1Work() {
        // given
        int[] dictionary = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] matrix = {
                {9, 5, 7, 6, 1, 3, 2, 8, 4},
                {4, 8, 3, 2, 5, 7, 1, 9, 6},
                {6, 1, 2, 8, 4, 9, 5, 3, 7},
                {1, 7, 8, 3, 6, 4, 9, 5, 2},
                {5, 2, 4, 9, 7, 1, 3, 6, 8},
                {3, 6, 9, 5, 2, 8, 7, 4, 1},
                {8, 4, 5, 7, 9, 2, 6, 1, 3},
                {2, 9, 1, 4, 3, 6, 8, 7, 5},
                {7, 3, 6, 1, 8, 5, 4, 2, 9}
        };
        int square = 1;
        boolean expected = true;

        // when
        boolean actual = Main21_sudoku.checkSquare(matrix, square, dictionary);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckSquare2Work() {
        // given
        int[] dictionary = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] matrix = {
                {9, 5, 7, 6, 1, 3, 2, 8, 4},
                {4, 8, 3, 2, 5, 7, 1, 9, 6},
                {6, 1, 2, 8, 4, 9, 5, 3, 7},
                {1, 7, 8, 3, 6, 4, 9, 5, 2},
                {5, 2, 4, 9, 7, 1, 3, 6, 8},
                {3, 6, 9, 5, 2, 8, 7, 4, 1},
                {8, 4, 5, 7, 9, 2, 6, 1, 3},
                {2, 9, 1, 4, 3, 6, 8, 7, 5},
                {7, 3, 6, 1, 8, 5, 4, 2, 9}
        };
        int square = 2;
        boolean expected = true;

        // when
        boolean actual = Main21_sudoku.checkSquare(matrix, square, dictionary);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckSquare3Work() {
        // given
        int[] dictionary = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] matrix = {
                {9, 5, 7, 6, 1, 3, 2, 8, 4},
                {4, 8, 3, 2, 5, 7, 1, 9, 6},
                {6, 1, 2, 8, 4, 9, 5, 3, 7},
                {1, 7, 8, 3, 6, 4, 9, 5, 2},
                {5, 2, 4, 9, 7, 1, 3, 6, 8},
                {3, 6, 9, 5, 2, 8, 7, 4, 1},
                {8, 4, 5, 7, 9, 2, 6, 1, 3},
                {2, 9, 1, 4, 3, 6, 8, 7, 5},
                {7, 3, 6, 1, 8, 5, 4, 2, 9}
        };
        int square = 3;
        boolean expected = true;

        // when
        boolean actual = Main21_sudoku.checkSquare(matrix, square, dictionary);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckSquare4Work() {
        // given
        int[] dictionary = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] matrix = {
                {9, 5, 7, 6, 1, 3, 2, 8, 4},
                {4, 8, 3, 2, 5, 7, 1, 9, 6},
                {6, 1, 2, 8, 4, 9, 5, 3, 7},
                {1, 7, 8, 3, 6, 4, 9, 5, 2},
                {5, 2, 4, 9, 7, 1, 3, 6, 8},
                {3, 6, 9, 5, 2, 8, 7, 4, 1},
                {8, 4, 5, 7, 9, 2, 6, 1, 3},
                {2, 9, 1, 4, 3, 6, 8, 7, 5},
                {7, 3, 6, 1, 8, 5, 4, 2, 9}
        };
        int square = 4;
        boolean expected = true;

        // when
        boolean actual = Main21_sudoku.checkSquare(matrix, square, dictionary);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckSquare5Work() {
        // given
        int[] dictionary = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] matrix = {
                {9, 5, 7, 6, 1, 3, 2, 8, 4},
                {4, 8, 3, 2, 5, 7, 1, 9, 6},
                {6, 1, 2, 8, 4, 9, 5, 3, 7},
                {1, 7, 8, 3, 6, 4, 9, 5, 2},
                {5, 2, 4, 9, 7, 1, 3, 6, 8},
                {3, 6, 9, 5, 2, 8, 7, 4, 1},
                {8, 4, 5, 7, 9, 2, 6, 1, 3},
                {2, 9, 1, 4, 3, 6, 8, 7, 5},
                {7, 3, 6, 1, 8, 5, 4, 2, 9}
        };
        int square = 5;
        boolean expected = true;

        // when
        boolean actual = Main21_sudoku.checkSquare(matrix, square, dictionary);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckSquare6Work() {
        // given
        int[] dictionary = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] matrix = {
                {9, 5, 7, 6, 1, 3, 2, 8, 4},
                {4, 8, 3, 2, 5, 7, 1, 9, 6},
                {6, 1, 2, 8, 4, 9, 5, 3, 7},
                {1, 7, 8, 3, 6, 4, 9, 5, 2},
                {5, 2, 4, 9, 7, 1, 3, 6, 8},
                {3, 6, 9, 5, 2, 8, 7, 4, 1},
                {8, 4, 5, 7, 9, 2, 6, 1, 3},
                {2, 9, 1, 4, 3, 6, 8, 7, 5},
                {7, 3, 6, 1, 8, 5, 4, 2, 9}
        };
        int square = 6;
        boolean expected = true;

        // when
        boolean actual = Main21_sudoku.checkSquare(matrix, square, dictionary);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckSquare7Work() {
        // given
        int[] dictionary = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] matrix = {
                {9, 5, 7, 6, 1, 3, 2, 8, 4},
                {4, 8, 3, 2, 5, 7, 1, 9, 6},
                {6, 1, 2, 8, 4, 9, 5, 3, 7},
                {1, 7, 8, 3, 6, 4, 9, 5, 2},
                {5, 2, 4, 9, 7, 1, 3, 6, 8},
                {3, 6, 9, 5, 2, 8, 7, 4, 1},
                {8, 4, 5, 7, 9, 2, 6, 1, 3},
                {2, 9, 1, 4, 3, 6, 8, 7, 5},
                {7, 3, 6, 1, 8, 5, 4, 2, 9}
        };
        int square = 7;
        boolean expected = true;

        // when
        boolean actual = Main21_sudoku.checkSquare(matrix, square, dictionary);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckSquare8Work() {
        // given
        int[] dictionary = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] matrix = {
                {9, 5, 7, 6, 1, 3, 2, 8, 4},
                {4, 8, 3, 2, 5, 7, 1, 9, 6},
                {6, 1, 2, 8, 4, 9, 5, 3, 7},
                {1, 7, 8, 3, 6, 4, 9, 5, 2},
                {5, 2, 4, 9, 7, 1, 3, 6, 8},
                {3, 6, 9, 5, 2, 8, 7, 4, 1},
                {8, 4, 5, 7, 9, 2, 6, 1, 3},
                {2, 9, 1, 4, 3, 6, 8, 7, 5},
                {7, 3, 6, 1, 8, 5, 4, 2, 9}
        };
        int square = 8;
        boolean expected = true;

        // when
        boolean actual = Main21_sudoku.checkSquare(matrix, square, dictionary);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckSquare9Work() {
        // given
        int[] dictionary = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] matrix = {
                {9, 5, 7, 6, 1, 3, 2, 8, 4},
                {4, 8, 3, 2, 5, 7, 1, 9, 6},
                {6, 1, 2, 8, 4, 9, 5, 3, 7},
                {1, 7, 8, 3, 6, 4, 9, 5, 2},
                {5, 2, 4, 9, 7, 1, 3, 6, 8},
                {3, 6, 9, 5, 2, 8, 7, 4, 1},
                {8, 4, 5, 7, 9, 2, 6, 1, 3},
                {2, 9, 1, 4, 3, 6, 8, 7, 5},
                {7, 3, 6, 1, 8, 5, 4, 2, 9}
        };
        int square = 9;
        boolean expected = true;

        // when
        boolean actual = Main21_sudoku.checkSquare(matrix, square, dictionary);

        // then
        assertEquals(expected, actual);
    }
}
