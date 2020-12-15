package pl.basics7.strategy;

public class DivideCalculatorStrategy implements CalculatorStrategy {

    public static final String DIVISION_BY_ZERO = "Unknown operation";

    @Override
    public String calculate(int a, int b) {
        if(b == 0) {
            return DIVISION_BY_ZERO;
        }
        return String.valueOf(a / b);
    }
}
