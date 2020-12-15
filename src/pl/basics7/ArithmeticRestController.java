package pl.basics7;

/*
obviously it is not a real controller
 */
public class ArithmeticRestController {

    private final ArithmeticService arithmeticService;

    public ArithmeticRestController(ArithmeticService arithmeticService) {
        this.arithmeticService = arithmeticService;
    }

    public String getPath(String[] args) {
        String operation = args[0];
        String firstNumber = args[1];
        String secondNumber = args[2];
        return arithmeticService.execute(operation, firstNumber, secondNumber);
    }
}
