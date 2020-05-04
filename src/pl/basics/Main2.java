package pl.basics;

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
}
