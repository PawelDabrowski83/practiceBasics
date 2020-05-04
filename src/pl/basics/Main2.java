package pl.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {


    }

    public static boolean isVowel(char ch) {
        // write your code here
        return  Character.toString(ch).matches("[aAeEiIoOuU]");
    }

    public static String getFullname(String firstName, String lastName) {
        String result = "";
        if (firstName != null && !firstName.isEmpty()) {
            result = firstName;
        }
        if (lastName != null && !lastName.isEmpty()) {
            if ("".equals(result)) {
                result = lastName;
            } else {
                result += " " + lastName;
            }

        }
        if (firstName == null && lastName == null || "".equals(firstName) && "".equals(lastName)) {
            result = "Unknown";
        }
        return result; // write your code here
    }

    public static String factorialString(int n) {
        String numberAsString = String.valueOf(n);
        int counter = n;
        List<Character> digits = new ArrayList<>();
        List<Character> result = new ArrayList<>();

        while (counter > 1) {
            counter--;

            for (int i = 0; i < numberAsString.length(); i++) {
                digits.add(numberAsString.charAt(numberAsString.length() - 1 - i));
            }
            Collections.reverse(digits);
            numberAsString = digits.toString();
        }
        if (digits.isEmpty()) {
            return "1";
        }
        return listToString(digits);
    }

    public static String listToString(List list) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            builder.append(list.get(i));
        }
        return builder.toString();
    }
}
