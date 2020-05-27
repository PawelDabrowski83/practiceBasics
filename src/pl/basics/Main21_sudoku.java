package pl.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Main21_sudoku {
    public static void main(String[] args) {
        int n;
        int[][] sudoku;

        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            sudoku = new int[n * n][n * n];
            for (int[] row : sudoku) {
                int counter = 0;
                for (int number : row) {
                    row[counter] = scanner.nextInt();
                    counter++;
                }
            }
        }

        int[] dictionary = getDictionary(n);
//        checkRow(sudoku, 0, dictionary);





    }

    public static int[] getDictionary(int n) {
        if (n < 1) {
            return new int[] {0};
        }
        int[] result = new int[n * n];
        for (int i = 0; i < n * n; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    public static boolean checkRow(int[][] matrix, int row, int[] numbers) {
        int[] matrixRowSorted = Arrays.copyOf(matrix[row], matrix.length);
        Arrays.sort(matrixRowSorted);
        return Arrays.equals(matrixRowSorted, numbers);
    }

    public static boolean checkCol(int[][] matrix, int col, int[] numbers) {
        int[] matrixColSorted = new int[matrix[0].length];
        int counter = 0;
        for (int ignored : matrix[0]) {
            matrixColSorted[counter] = matrix[counter][col];
            counter++;
        }
        Arrays.sort(matrixColSorted);
        return Arrays.equals(matrixColSorted, numbers);
    }
}