package pl.basics12.codewars.whoLikesIt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Task described here: https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java
 */

public class Solution {
    public static final String LIKES_ZERO = "no one likes this";
    public static final String LIKES_ONE = "%s likes this";
    public static final String LIKES_TWO = "%s and %s like this";
    public static final String LIKES_THREE = "%s, %s and %s like this";
    public static final String LIKES_FOUR_AND_MORE = "%s, %s and %d more like this";

    public static String whoLikesIt(String... names) {
        List<String> words = Arrays.asList(names);

        if (words.size() == 0) {
            return LIKES_ZERO;
        }
        return "";
    }
}
