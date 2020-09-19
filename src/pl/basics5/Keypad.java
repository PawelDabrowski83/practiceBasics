package pl.basics5;

/**
 * Write a module that can calculate the amount of button presses required for any phrase. Punctuation can be ignored
 * for this exercise. Likewise, you can assume the phone doesn't distinguish between upper/lowercase characters (but
 * you should allow your module to accept input in either for convenience).
 */
public class Keypad {
    public static final int KEYPAD_SIZE = 12;
    public static Key[] keys = new Key[KEYPAD_SIZE];

    public static void assignCharset(){
        keys[0] = new Key(new char[]{'1'});
        keys[1] = new Key(new char[]{'A', 'B', 'C', '2'});
        keys[2] = new Key(new char[]{'D', 'E', 'F', '3'});
        keys[3] = new Key(new char[]{'G', 'H', 'I', '4'});
        keys[4] = new Key(new char[]{'J', 'K', 'L', '5'});
        keys[5] = new Key(new char[]{'M', 'N', 'O', '6'});
        keys[6] = new Key(new char[]{'P', 'Q', 'R', 'S', '7'});
        keys[7] = new Key(new char[]{'T', 'U', 'V', '8'});
        keys[8] = new Key(new char[]{'W', 'X', 'Y', 'Z', '9'});
        keys[9] = new Key(new char[]{'*'});
        keys[10] =new Key(new char[]{' ', '0'});
        keys[11] =new Key(new char[]{'#'});
    }

    public static int countPresses(String given) {
        assignCharset();
        int sum = 0;
        if (given == null || given.isEmpty()) {
            return sum;
        }

        return sum;
    }

    static class Key{
        public char[] chars;

        public Key(char[] chars) {
            this.chars = chars;
        }

        public char[] getChars() {
            return chars;
        }

        public int press(char desired){
            int index = 1;
            for (char c : chars){
                if (c == Character.toUpperCase(desired)){
                    return index;
                }
                index++;
            }
            return 0;
        }
    }
}
