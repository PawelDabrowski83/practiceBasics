package pl.basics4;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {

    public static String findLongestWord(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }
        if (!text.contains(" ")) {
            return text;
        }
        String[] words = text.split("\\s+");
        Arrays.sort(words, new DescendingStringComparator());
        return words[0];
    }

    static class DescendingStringComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return Integer.compare(o2.length(), o1.length());
        }
    }

}
