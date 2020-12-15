package pl.basics7;

import pl.basics7.strategy.*;

public class ArithmeticService {

    private static CalculatorStrategy strategy;

    public String execute(String operation, String firstNumber, String secondNumber) {
        chooseStrategy(operation);
        int a = Utils7.parseInt(firstNumber);
        int b = Utils7.parseInt(secondNumber);
        return strategy.calculate(a, b);
    }

    private void chooseStrategy(String operation) {
        strategy = switch (operation) {
            case "add" -> new AddCalculatorStrategy();
            case "subtract" -> new SubtractCalculatorStrategy();
            case "multiplication" -> new MultiplicationCalculatorStrategy();
            case "divide" -> new DivideCalculatorStrategy();
            default -> throw new IllegalArgumentException("incorrect operation description");
        };
    }
}
