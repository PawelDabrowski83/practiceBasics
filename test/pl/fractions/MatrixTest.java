package pl.fractions;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class MatrixTest {

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
        Matrix matrixActual = matrix.orderByLeadingEntry();

        // then
        assertEquals(matrixExpected, matrixActual);
    }
}
