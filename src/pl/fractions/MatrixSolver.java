package pl.fractions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MatrixSolver {

    public Matrix orderByLeadingEntry(Matrix matrix) {
        Map<Integer, Integer> rowsByLeadingEntry = new HashMap<>();
        for (int i = 0; i < matrix.rows.size(); i++) {
            rowsByLeadingEntry.put(i, matrix.rows.get(i).findLeadingEntryColumn());
        }
        Map<Integer, Row> temp = new HashMap<>();
        while (temp.size() < matrix.rows.size()) {
            int min = rowsByLeadingEntry.values().stream()
                    .min(Comparator.naturalOrder())
                    .orElse(0);
            matrix.rows.entrySet().stream()
                    .filter(e -> e.getValue().findLeadingEntryColumn() == min)
                    .forEach(n -> temp.put(temp.size(), n.getValue()));
            rowsByLeadingEntry = rowsByLeadingEntry.entrySet().stream()
                    .filter(e -> !e.getValue().equals(min))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey, Map.Entry::getValue));
        }
        return new Matrix(temp);
    }

    public Matrix reduceColumnToOne(int column, Matrix matrix) {
        Map<Integer, Row> temp = new HashMap<>(Map.copyOf(matrix.rows));
        for (Map.Entry<Integer, Row> row : matrix.rows.entrySet()) {
            if (row.getValue().findLeadingEntryColumn() == column) {
                temp.put(row.getKey(), row.getValue().reduceRowToOne());
            }
        }
        matrix.rows = temp;
        return matrix;
    }

    public Matrix reduceColumnToOnlyOneRow(int column, Matrix matrix) {
        Matrix temp = new Matrix(matrix.rows);
        return matrix;
    }

    public Matrix solveMatrix(Matrix matrix) {
        Matrix result = orderByLeadingEntry(new Matrix(matrix.rows));
        // make all leading entries 1
        for (Map.Entry<Integer, Row> row : matrix.rows.entrySet()) {
            if (!new Fraction(1, 1).equals(row.getValue().findLeadingEntry())) {
                result.rows.put(row.getKey(), row.getValue().reduceRowToOne());
            }
        }
        for (int i = 0; i < result.rows.size(); i++) {
            System.out.println("i: " + i + " result.rows: " + result.rows);
            Map<Integer, Row> valuesInOneColumn = result.rows.entrySet().stream()
                    .filter(e -> e.getValue().findLeadingEntryColumn() == 0)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            System.out.println("kolumny z liczbą: " + valuesInOneColumn);
            if (valuesInOneColumn.size() > 1) {
                int counter = 1;
                Row firstRow = valuesInOneColumn.get(0);
                while (valuesInOneColumn.size() > 1) {
                    Row currentRow = valuesInOneColumn.get(1);
                    Row finalCurrentRow = currentRow;
                    int currentRowKey = valuesInOneColumn.entrySet().stream()
                            .filter(e -> e.getValue().equals(finalCurrentRow))
                            .findFirst().map(Map.Entry::getKey)
                            .orElse(-1);
                    System.out.println("previous: " + firstRow);
                    currentRow = currentRow.multiply(new Fraction(-1, 1));
                    System.out.println("current (-1): " + currentRow);
                    currentRow = currentRow.addRow(firstRow);
                    System.out.println("current added: " + currentRow);
                    currentRow = currentRow.reduceRowToOne();
                    System.out.println("currentReduced: " + currentRow);
                    result.rows.put(currentRowKey, currentRow);
                    Row finalCurrentRow1 = currentRow;
                    valuesInOneColumn.entrySet().removeIf(e -> finalCurrentRow1.equals(e.getValue()));
                }
            }
        }


        return result;
    }
}
