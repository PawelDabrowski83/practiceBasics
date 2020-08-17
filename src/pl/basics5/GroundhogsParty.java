package pl.basics5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroundhogsParty {
    protected static final Pattern INPUT_PATTERN = Pattern.compile("(-?\\d+)\\s(true|false)");

    public static boolean isPartyFun(String input) throws IllegalArgumentException{
        GroundhogsInput config = getInput(input);
        if (config.isWeekend() && config.getCups() < 26 && config.getCups() > 14) {
            return true;
        }
        return !config.isWeekend() && config.getCups() < 21 && config.getCups() > 9;
    }


    private static GroundhogsInput getInput(String input) throws IllegalArgumentException{
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Matcher matcher = INPUT_PATTERN.matcher(input);
        boolean isWeekend;
        int cups;
        if (matcher.find()) {
            try {
                cups = Integer.parseInt(matcher.group(1));
                isWeekend = Boolean.parseBoolean(matcher.group(2));
                return new GroundhogsInput(isWeekend, cups);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

        }
        throw new IllegalArgumentException();
    }
}
