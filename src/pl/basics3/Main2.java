package pl.basics3;

import java.math.BigInteger;

public class Main2 {

    public static BigInteger calcDoubleFactorial(int n) {
        if (n <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(calcDoubleFactorial(n - 2));
    }
}
