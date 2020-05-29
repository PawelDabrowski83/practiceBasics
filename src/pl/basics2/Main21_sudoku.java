package pl.basics2;

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
                for (int ignored : row) {
                    row[counter] = scanner.nextInt();
                    counter++;
                }
            }
        }

        int[] dictionary = getDictionary(n);
        int[] square = new int[n];
        for (int i = 0; i < n * n; i++) {
            if (!checkRow(sudoku, i, dictionary) || !checkCol(sudoku, i, dictionary)) {
                System.out.println("NO");
                return;
            };
        }
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (!checkSquare(sudoku, new int[]{y, x}, n)) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
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

    public static boolean checkSquare(int[][] matrix, int[] square, int n) {
        if (square[0] > n - 1 || square[1] > n - 1) {
            return false;
        }
        int[] numbers = getDictionary(n);
        int[] matrixSquareSorted = new int[matrix[0].length];
        int rowCounter = n * square[0];
        int colCounter = n * square[1];

        int counter = 0;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                matrixSquareSorted[counter] = matrix[x + rowCounter][y + colCounter];
                counter++;
            }
        }
        Arrays.sort(matrixSquareSorted);
        return Arrays.equals(matrixSquareSorted, numbers);

    }
}