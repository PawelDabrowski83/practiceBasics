package pl.basics5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Exercise to calculate factorial without usage of BigInteger for big numbers - calculations
 * should be done on numbers represented as strings
 */
public class FactorialString {
    protected static final Pattern NUMBER = Pattern.compile("^(-?[0-9]|-?[1-9]\\d*)$");

    public static String multiplicateString(String base, String factor) {
        if (base == null || base.isBlank() || factor == null || factor.isBlank()){
            return "";
        }
        return " ";
    }

    protected static boolean isValidNumber(String given){
        return false;
    }
}
