package pl.basics5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Exercise to calculate factorial without usage of BigInteger for big numbers - calculations
 * should be done on numbers represented as strings
 */
public class FactorialString {
    protected static final Pattern NUMBER = Pattern.compile("^(-?[1-9]|0|-?[1-9]\\d*)$");

    public static String multiplicateString(String base, String factor) {
        if (base == null || factor == null){
            return "";
        }
        if (!isValidNumber(base) || !isValidNumber(factor)){
            return "";
        }
        char[] baseArray = base.toCharArray();
        char[] factorArray = factor.toCharArray();
        return " ";
    }

    protected static boolean isValidNumber(String given){
        if (given == null || given.isBlank()){
            return false;
        }
        return NUMBER.matcher(given).matches();
    }

    protected static int[] convertStringToIntArray(String validNumber) throws IllegalArgumentException{
        if (validNumber == null || validNumber.isBlank()){
            return new int[0];
        }
        char[] chars = validNumber.toCharArray();
        int[] result = new int[chars.length];
        int i = 0;
        for (char c : chars){
            if(c == '-'){
                result[i] = -1;
                i++;
                continue;
            }
            int digit = -1;
            try {
                digit = Integer.parseInt(String.valueOf(c));
            } catch (NumberFormatException e){
                e.printStackTrace();
                throw new IllegalArgumentException("Given string does not represent a number");
            }
            result[i] = digit;
            i++;
        }
        return result;
    }
}
