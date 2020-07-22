package pl.basics4;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NumberDecrementor {
    protected static final Pattern FOUR_NUMBERS = Pattern.compile("^(-?\\d+)\\s*(-?\\d+)\\s*(-?\\d+)\\s*(-?\\d+)$");

    public static String decrementFourNumbers(String given) {
        if (given == null || given.isEmpty()) {
            return "";
        }
        Matcher matcher = FOUR_NUMBERS.matcher(given);
        if (matcher.matches()) {
            return Arrays.stream(given.split("\\s+"))
                    .map(Integer::parseInt)
                    .map(n -> n - 1)
                    .map(n -> Integer.toString(n))
                    .collect(Collectors.joining(" "));
        }
        return "";
    }
}
