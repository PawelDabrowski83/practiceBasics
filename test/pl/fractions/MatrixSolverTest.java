package pl.fractions;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class MatrixSolverTest {

    MatrixSolver matrixSolver;

    @Before
    public void setUp() {
        matrixSolver = new MatrixSolver();
    }

    @Test
    public void shouldOrderByLeadingEntryWork() {
        // given
        Matrix matrix = new Matrix();
        matrix.rows = new HashMap<>();
        Row row1 = new Row(new Fraction[]{
                new Fraction(1, 2), new Fraction(7, 1), new Fraction(-1, 1), new Fraction(0, 1)});
        Row row2 = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(3, 1), new Fraction(-1, 1), new Fraction(5, 1)});
        Row row3 = new Row(new Fraction[]{
                new Fraction(7, 15), new Fraction(0, 7), new Fraction(1, 1), new Fraction(1, 1)});
        Row row4 = new Row(new Fraction[]{
                new Fraction(0, 1), new Fraction(0, 7), new Fraction(3, -12), new Fraction(1, 2)});
        matrix.rows.put(0, row1);
        matrix.rows.put(1, row2);
        matrix.rows.put(2, row3);
        matrix.rows.put(3, row4);
        Matrix matrixExpected = new Matrix();
        matrixExpected.rows = new HashMap<>();
        row1 = new Row(new Fraction[]{
                new Fraction(1, 2), new Fraction(7, 1), new Fraction(-1, 1), new Fraction(0, 1)});
        row2 = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(3, 1), new Fraction(-1, 1), new Fraction(5, 1)});
        row3 = new Row(new Fraction[]{
                new Fraction(7, 15), new Fraction(0, 7), new Fraction(1, 1), new Fraction(1, 1)});
        row4 = new Row(new Fraction[]{
                new Fraction(0, 1), new Fraction(0, 7), new Fraction(3, -12), new Fraction(1, 2)});
        matrixExpected.rows.put(0, row1);
        matrixExpected.rows.put(2, row2);
        matrixExpected.rows.put(1, row3);
        matrixExpected.rows.put(3, row4);

        // when
        Matrix matrixActual = matrixSolver.orderByLeadingEntry(matrix);

        // then
        assertEquals(matrixExpected, matrixActual);
    }

    @Test
    public void shouldOrderByLeadingEntryWork2() {
        // given
        Matrix matrix = new Matrix();
        matrix.rows = new HashMap<>();
        Row row1 = new Row(new Fraction[]{
                new Fraction(0, 1), new Fraction(0, 1), new Fraction(5, 1), new Fraction(9, 1)});
        Row row2 = new Row(new Fraction[]{
                new Fraction(0, 1), new Fraction(-1, 1), new Fraction(3, 1), new Fraction(13, 1)});
        Row row3 = new Row(new Fraction[]{
                new Fraction(3, 1), new Fraction(2, 7), new Fraction(-5, 1), new Fraction(13, 1)});
        Row row4 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(0, 7), new Fraction(3, -12), new Fraction(1, 2)});
        matrix.rows.put(0, row1);
        matrix.rows.put(1, row2);
        matrix.rows.put(2, row3);
        matrix.rows.put(3, row4);
        Matrix matrixExpected = new Matrix();
        matrixExpected.rows = new HashMap<>();
        matrixExpected.rows.put(3, row1);
        matrixExpected.rows.put(2, row2);
        matrixExpected.rows.put(0, row3);
        matrixExpected.rows.put(1, row4);

        // when
        Matrix matrixActual = matrixSolver.orderByLeadingEntry(matrix);

        // then
        assertEquals(matrixExpected, matrixActual);
    }

    @Test
    public void shouldOrderByLeadingEntryWork3() {
        // given
        Matrix matrix = new Matrix();
        matrix.rows = new HashMap<>();
        Row row1 = new Row(new Fraction[]{
                new Fraction(0, 1), new Fraction(0, 1), new Fraction(5, 1), new Fraction(9, 1)});
        Row row2 = new Row(new Fraction[]{
                new Fraction(8, 1), new Fraction(-1, 1), new Fraction(3, 1), new Fraction(13, 1)});
        Row row3 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(2, 7), new Fraction(-5, 1), new Fraction(13, 1)});
        Row row4 = new Row(new Fraction[]{
                new Fraction(-3, 1), new Fraction(0, 7), new Fraction(3, -12), new Fraction(1, 2)});
        matrix.rows.put(0, row1);
        matrix.rows.put(1, row2);
        matrix.rows.put(2, row3);
        matrix.rows.put(3, row4);
        Matrix matrixExpected = new Matrix();
        matrixExpected.rows = new HashMap<>();
        matrixExpected.rows.put(3, row1);
        matrixExpected.rows.put(0, row2);
        matrixExpected.rows.put(1, row3);
        matrixExpected.rows.put(2, row4);

        // when
        Matrix matrixActual = matrixSolver.orderByLeadingEntry(matrix);

        // then
        assertEquals(matrixExpected, matrixActual);
    }

    @Test
    public void shouldReduceColumnToOneWork() {
        // given
        Matrix matrix = new Matrix();
        matrix.rows = new HashMap<>();
        Row row1 = new Row(new Fraction[]{
                new Fraction(2, 1), new Fraction(0, 1), new Fraction(5, 1), new Fraction(9, 1)});
        Row row2 = new Row(new Fraction[]{
                new Fraction(8, 1), new Fraction(-1, 1), new Fraction(3, 1), new Fraction(13, 1)});
        Row row3 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(2, 7), new Fraction(-5, 1), new Fraction(13, 1)});
        Row row4 = new Row(new Fraction[]{
                new Fraction(-3, 1), new Fraction(0, 7), new Fraction(-3, 12), new Fraction(1, 2)});
        matrix.rows.put(0, row1);
        matrix.rows.put(1, row2);
        matrix.rows.put(2, row3);
        matrix.rows.put(3, row4);
        Matrix matrixExpected = new Matrix();
        matrixExpected.rows = new HashMap<>();
        row1 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(0, 1), new Fraction(5, 2), new Fraction(9, 2)});
        row2 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(-1, 8), new Fraction(3, 8), new Fraction(13, 8)});
        row3 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(2, 7), new Fraction(-5, 1), new Fraction(13, 1)});
        row4 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(0, 1), new Fraction(1, 12), new Fraction(-1, 6)});
        matrixExpected.rows.put(0, row1);
        matrixExpected.rows.put(1, row2);
        matrixExpected.rows.put(2, row3);
        matrixExpected.rows.put(3, row4);

        // when
        Matrix matrixActual = matrixSolver.reduceColumnToOne(0, matrix);

        // then
        assertEquals(matrixExpected, matrixActual);
    }

    @Test
    public void shouldReduceColumnToOneWork2() {
        // given
        Matrix matrix = new Matrix();
        matrix.rows = new HashMap<>();
        Row row1 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(0, 1), new Fraction(5, 1), new Fraction(9, 1)});
        Row row2 = new Row(new Fraction[]{
                new Fraction(0, 1), new Fraction(-1, 1), new Fraction(3, 1), new Fraction(13, 1)});
        Row row3 = new Row(new Fraction[]{
                new Fraction(0, 1), new Fraction(2, 7), new Fraction(-5, 1), new Fraction(13, 1)});
        Row row4 = new Row(new Fraction[]{
                new Fraction(0, 1), new Fraction(0, 7), new Fraction(-3, 12), new Fraction(1, 2)});
        matrix.rows.put(0, row1);
        matrix.rows.put(1, row2);
        matrix.rows.put(2, row3);
        matrix.rows.put(3, row4);
        Matrix matrixExpected = new Matrix();
        matrixExpected.rows = new HashMap<>();
        row1 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(0, 1), new Fraction(5, 1), new Fraction(9, 1)});
        row2 = new Row(new Fraction[]{
                new Fraction(0, 1), new Fraction(1, 1), new Fraction(-3, 1), new Fraction(-13, 1)});
        row3 = new Row(new Fraction[]{
                new Fraction(0, 1), new Fraction(1, 1), new Fraction(-35, 2), new Fraction(91, 2)});
        row4 = new Row(new Fraction[]{
                new Fraction(0, 1), new Fraction(0, 1), new Fraction(-3, 12), new Fraction(1, 2)});
        matrixExpected.rows.put(0, row1);
        matrixExpected.rows.put(1, row2);
        matrixExpected.rows.put(2, row3);
        matrixExpected.rows.put(3, row4);

        // when
        Matrix matrixActual = matrixSolver.reduceColumnToOne(1, matrix);

        // then
        assertEquals(matrixExpected, matrixActual);
    }

    @Test
    public void shouldSolveMatrixWork() {
        // given
        Matrix matrix = new Matrix();
        matrix.rows = new HashMap<>();
        Row row1 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(0, 1), new Fraction(5, 1), new Fraction(9, 1)});
        Row row2 = new Row(new Fraction[]{
                new Fraction(2, 1), new Fraction(8, 1), new Fraction(-1, 1), new Fraction(3, 1)});
        Row row3 = new Row(new Fraction[]{
                new Fraction(7, 1), new Fraction(2, 1), new Fraction(1, 1), new Fraction(2, 1)});
        matrix.rows.put(0, row1);
        matrix.rows.put(1, row2);
        matrix.rows.put(2, row3);
        Matrix matrixExpected = new Matrix();
        matrixExpected.rows = new HashMap<>();
        row1 = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(0, 1), new Fraction(5, 1), new Fraction(9, 1)});
        row2 = new Row(new Fraction[]{
                new Fraction(0, 1), new Fraction(1, 1), new Fraction(-11, 8), new Fraction(-15, 8)});
        row3 = new Row(new Fraction[]{
                new Fraction(0, 1), new Fraction(0, 1), new Fraction(1, 1), new Fraction(229, 125)});
        matrixExpected.rows.put(0, row1);
        matrixExpected.rows.put(1, row2);
        matrixExpected.rows.put(2, row3);

        // when
        Matrix matrixActual = matrixSolver.solveMatrix(matrix);

        // then
        assertEquals(matrixExpected, matrixActual);

    }
}
