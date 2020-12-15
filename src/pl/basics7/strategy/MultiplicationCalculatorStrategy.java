package pl.basics7.strategy;

public class MultiplicationCalculatorStrategy implements CalculatorStrategy {

    @Override
    public String calculate(int a, int b) {
        return String.valueOf(a * b);
    }
}
