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
                for (int ignored : row) {
                    row[counter] = scanner.nextInt();
                    counter++;
                }
            }
        }

        int[] dictionary = getDictionary(n);
        for (int i = 0; i < n * n; i++) {
            if (!checkRow(sudoku, i, dictionary) || !checkCol(sudoku, i, dictionary) || !checkSquare(sudoku, i, dictionary)) {
                System.out.println("NO");
                return;
            };
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

    public static boolean checkSquare(int[][] matrix, int square, int[] numbers) {
        int [] matrixSquareSorted = new int[matrix[0].length];
        int rowCounter = 0;
        int colCounter = 0;
        switch (square) {
            case 0:
                break;
            case 1:
                colCounter = 3;
                break;
            case 2:
                colCounter = 6;
                break;
            case 3:
                rowCounter = 3;
                break;
            case 4:
                rowCounter = 3;
                colCounter = 3;
                break;
            case 5:
                rowCounter = 3;
                colCounter = 6;
                break;
            case 6:
                rowCounter = 6;
                break;
            case 7:
                rowCounter = 6;
                colCounter = 3;
                break;
            case 8:
                rowCounter = 6;
                colCounter = 6;
                break;
            default:
                return false;
        }
        int counter = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                matrixSquareSorted[counter] = matrix[x + rowCounter][y + colCounter];
                counter++;
            }
        }
        Arrays.sort(matrixSquareSorted);
        return Arrays.equals(matrixSquareSorted, numbers);

    }
}