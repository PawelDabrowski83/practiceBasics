package pl.basics9.gui.cw09.ex01;

public class NumberValidator {

    public static boolean isValidNumber(String word) {
        try {
            Integer.parseInt(word);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int getNumber(String word) {
        int number = Integer.MIN_VALUE;
        try{
            number = Integer.parseInt(word);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return number;
    }
}
