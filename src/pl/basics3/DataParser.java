package pl.basics3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataParser {

    protected final static Pattern DATA_PATTERN = Pattern.compile("^(18\\d\\d|19\\d\\d|20[0-1]\\d|2020)-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$");

    public static String formatData(String input) {
        Matcher matcher = DATA_PATTERN.matcher(input);
        String day;
        String month;
        String year;
        if (matcher.find()) {
            month = matcher.group(2);
            day = matcher.group(3);
            year = matcher.group(1);
            return String.format("%s/%s/%s", month, day, year);
        }
        return "";
    }
}
