package pl.basics12.codewars.highestScoringWord;

public class Kata {

    public static String high(String s) {
        if (s == null || s.isBlank()) {
            return "";
        }
        int highestScore = 0;
        String highestWord = "";
        String[] words = s.split(" ");
        for (String str : words) {
            int currentScore = getScore(str);
            if (currentScore > highestScore) {
                highestWord = str;
                highestScore = currentScore;
            }
        }
        return highestWord;
    }

    private static int getScore(String s) {
        return s.chars().map(n -> n - 96).sum();
    }
}
