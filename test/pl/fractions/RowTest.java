package pl.fractions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RowTest {

    @Test
    public void shouldRowMultiplyWork() {
        // {1/2, 7, -1, 0}
        Row row = new Row(new Fraction[]{new Fraction(1, 2), new Fraction(7, 1), new Fraction(-1, 1), new Fraction(0, 1)});
        Fraction multiplier = new Fraction(2, 1);
        Row rowExpected = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(14, 1), new Fraction(-2, 1), new Fraction(0, 1)});
        assertEquals(rowExpected, row.multiply(multiplier));

        multiplier = new Fraction(-3, 1);
        rowExpected = new Row(new Fraction[]{
                new Fraction(-3, 1), new Fraction(-42, 1), new Fraction(6, 1), new Fraction(0, 1)});
        assertEquals(rowExpected, row.multiply(multiplier));

        multiplier = new Fraction(2, 7);
        rowExpected = new Row(new Fraction[]{
                new Fraction(-6, 7), new Fraction(-12, 1), new Fraction(12, 7), new Fraction(0, 7)});
        assertEquals(rowExpected, row.multiply(multiplier));

        multiplier = new Fraction(7, 1);
        rowExpected = new Row(new Fraction[]{
                new Fraction(-6, 1), new Fraction(-84, 1), new Fraction(12, 1), new Fraction(0, 7)});
        assertEquals(rowExpected, row.multiply(multiplier));

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(7, 15), new Fraction(-8, 3), new Fraction(4, 7)});
        multiplier = new Fraction(15, 7);
        rowExpected = new Row(new Fraction[]{
                new Fraction(0, 14), new Fraction(1, 1), new Fraction(-40, 7), new Fraction(60, 49)});
        assertEquals(rowExpected, row.multiply(multiplier));

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(7, 15), new Fraction(-8, 3), new Fraction(4, 7)});
        multiplier = new Fraction(15, 7);
        rowExpected = new Row(new Fraction[]{
                new Fraction(0, 14), new Fraction(1, 1), new Fraction(-40, 7), new Fraction(60, 49)});
        assertEquals(rowExpected, row.multiply(multiplier));

    }



    @Test
    public void shouldFindLeadingEntryWork() {
        Row row = new Row(new Fraction[]{
                new Fraction(1, 2), new Fraction(7, 1), new Fraction(-1, 1), new Fraction(0, 1)});
        assertEquals(new Fraction(1, 2), row.findLeadingEntry());

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(7, 1), new Fraction(-1, 1), new Fraction(0, 1)});
        assertEquals(new Fraction(7, 1), row.findLeadingEntry());

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(1, 1), new Fraction(-1, 7), new Fraction(0, 1)});
        assertEquals(new Fraction(1, 1), row.findLeadingEntry());

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(0, 1), new Fraction(-1, 7), new Fraction(0, 1)});
        assertEquals(new Fraction(-1, 7), row.findLeadingEntry());

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(0, 1), new Fraction(0, 7), new Fraction(0, 1)});
        assertEquals(new Fraction(0, 1), row.findLeadingEntry());

    }

    @Test
    public void shouldFindLeadingEntryColumnWork() {
        Row row = new Row(new Fraction[]{
                new Fraction(1, 2), new Fraction(7, 1), new Fraction(-1, 1), new Fraction(0, 1)});
        assertEquals(0, row.findLeadingEntryColumn());

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(7, 1), new Fraction(-1, 1), new Fraction(0, 1)});
        assertEquals(1, row.findLeadingEntryColumn());

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(1, 1), new Fraction(-1, 7), new Fraction(0, 1)});
        assertEquals(1, row.findLeadingEntryColumn());

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(0, 1), new Fraction(-1, 7), new Fraction(0, 1)});
        assertEquals(2, row.findLeadingEntryColumn());

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(0, 1), new Fraction(0, 7), new Fraction(0, 1)});
        assertEquals(4, row.findLeadingEntryColumn());

    }



    @Test
    public void shouldReduceRowToOneWork() {
        Row row = new Row(new Fraction[]{
                new Fraction(1, 2), new Fraction(7, 1), new Fraction(-1, 1), new Fraction(0, 1)});
        Row rowExpected = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(14, 1), new Fraction(-2, 1), new Fraction(0, 1)});
        assertEquals(rowExpected, row.reduceRowToOne());

        row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(3, 1), new Fraction(-1, 1), new Fraction(5, 1)});
        rowExpected = new Row(new Fraction[]{
                new Fraction(0, 6), new Fraction(1, 1), new Fraction(-1, 3), new Fraction(5, 3)});
        assertEquals(rowExpected, row.reduceRowToOne());

        row = new Row(new Fraction[]{
                new Fraction(7, 15), new Fraction(0, 7)});
        rowExpected = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(0, 1)});
        assertEquals(rowExpected, row.reduceRowToOne());

        row = new Row(new Fraction[]{
                new Fraction(7, 15), new Fraction(0, 7), new Fraction(3, -12)});
        rowExpected = new Row(new Fraction[]{
                new Fraction(1, 1), new Fraction(0, 1), new Fraction(-15, 28)});
        assertEquals(rowExpected, row.reduceRowToOne());

        row = new Row(new Fraction[]{
                new Fraction(0, 15), new Fraction(0, 7), new Fraction(0, -12)});
        rowExpected = new Row(new Fraction[]{
                new Fraction(0, 1), new Fraction(0, 1), new Fraction(0, 1)});
        assertEquals(rowExpected, row.reduceRowToOne());
    }

    @Test
    public void shouldAddRowWork() {
        Row row = new Row(new Fraction[]{
                new Fraction(0, 2), new Fraction(3, 1), new Fraction(-1, 1), new Fraction(5, 1)});
        Row addingRow = new Row(new Fraction[]{
                new Fraction(1, 2), new Fraction(-1, 3), new Fraction(6, 2), new Fraction(0, 1)});
        Row expected = new Row(new Fraction[]{
                new Fraction(1, 2), new Fraction(8, 3), new Fraction(2, 1), new Fraction(5, 1)});
        assertEquals(expected, row.addRow(addingRow));

        row = new Row(new Fraction[]{
                new Fraction(1, 11), new Fraction(-2, 7), new Fraction(-3, 3), new Fraction(1, 1)});
        addingRow = new Row(new Fraction[]{
                new Fraction(-1, 2), new Fraction(-1, 3), new Fraction(6, 8), new Fraction(3, 2)});
        expected = new Row(new Fraction[]{
                new Fraction(-9, 22), new Fraction(-13, 21), new Fraction(-1, 4), new Fraction(5, 2)});
        assertEquals(expected, row.addRow(addingRow));
    }
}
