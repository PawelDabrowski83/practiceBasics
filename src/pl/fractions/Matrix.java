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


}
