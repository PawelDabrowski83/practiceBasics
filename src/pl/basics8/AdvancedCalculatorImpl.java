package pl.basics8;

public class AdvancedCalculatorImpl implements Calculator {

    private final CalculatorService calculatorService;

    public AdvancedCalculatorImpl(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @Override
    public int add(int a, int b) {
        return calculatorService.add(a, b);
    }
}
