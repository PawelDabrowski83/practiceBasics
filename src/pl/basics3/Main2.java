package pl.basics3;

import java.math.BigInteger;

public class Main2 {

    public static BigInteger calcDoubleFactorial(int n) {
        if (n <= 1) {
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.valueOf(n);
        if (n == 2) {
            return BigInteger.TWO;
        }
        return result.multiply(calcDoubleFactorial(n - 2));
    }
}
