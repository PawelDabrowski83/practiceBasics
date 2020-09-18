package pl.basics5;

import java.util.regex.Pattern;

public class TimeChecker {
    protected static final Pattern HOUR_MINUTES = Pattern.compile("^(?:[01]\\d|2[0-3]):[0-5]\\d$");

    /**
     * checks if string is time in format hh:mm
     * @param provided given string
     * @return true if formatting is valid
     */
    public static boolean checkTime(String provided) {
        if (provided == null || provided.isEmpty()) {
            return false;
        }
        return HOUR_MINUTES.matcher(provided).find();
    }
}
