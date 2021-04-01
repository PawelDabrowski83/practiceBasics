package pl.basics9.gui.cw04.task2;

public class Main {
    public static void main(String[] args) {
        ICalc myAdd = (a, b) -> a + b;
        ICalc mySubtract = (a, b) -> a - b;
        ICalc myMultiply = (a, b) -> a * b;
        ICalc myDivide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException();
            }
            return a/b;
        };

        double a = 11.1;
        double b = 10;

        System.out.println(myAdd.oblicz(a, b));
        System.out.println(mySubtract.oblicz(a, b));
        System.out.println(myMultiply.oblicz(a, b));
        try {
            System.out.println(myDivide.oblicz(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }

    }
}
