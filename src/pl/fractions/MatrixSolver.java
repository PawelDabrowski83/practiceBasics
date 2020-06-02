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
}
