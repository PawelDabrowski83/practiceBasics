package pl.basics9.gui.cw02.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(1);
        Square square2 = new Square(6);
        Square square3 = new Square(1);
        Square square4 = new Square(4);
        Square square5 = new Square(2);

        Square[] squares = {square1, square2, square3, square4, square5};

        for (Square square : squares) {
            System.out.println(square);
        }

        Arrays.sort(squares);
        System.out.println("\n" + "po sortowaniu:");

        for (Square square : squares) {
            System.out.println(square);
        }
    }
}
