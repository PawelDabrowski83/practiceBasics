package pl.fractions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Matrix {

    Map<Integer, Row> rows;

    public Matrix(Map<Integer, Row> rows) {
        this.rows = rows;
    }

    public Matrix() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matrix)) return false;

        Matrix matrix = (Matrix) o;

        return rows.equals(matrix.rows);
    }

    @Override
    public int hashCode() {
        return rows.hashCode();
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "rows=" + rows +
                '}';
    }

    public Matrix orderByLeadingEntry() {
        Map<Integer, Integer> rowsByLeadingEntry = new HashMap<>();
        for (int i = 0; i < this.rows.size(); i++) {
            rowsByLeadingEntry.put(i, this.rows.get(i).findLeadingEntryColumn());
        }
        System.out.println(">>> " + rowsByLeadingEntry);
        Map<Integer, Row> temp = new HashMap<>();
        while (temp.size() < this.rows.size()) {
            int min = rowsByLeadingEntry.values().stream()
                    .min(Comparator.naturalOrder())
                    .orElse(0);
            temp.putAll(this.rows.entrySet().stream()
                    .filter(e -> e.getValue().findLeadingEntryColumn() == min)
                    .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue)));
            rowsByLeadingEntry = rowsByLeadingEntry.entrySet().stream()
                    .filter(e -> !e.getValue().equals(min))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey, Map.Entry::getValue));
            System.out.println(min + " * " + temp);
        }
        return new Matrix(temp);

    }
}
