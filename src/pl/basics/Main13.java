package pl.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main13 {

    public static void main(String[] args) {


    }

    public static int solution(int N, int K) {
        // write your code in Java SE 8
        int sum = N;
        int remainingK = K;
        int result = 0;

        if (K == 0 || N == 1) {
            return N - 1;
        }
        while (sum > 0) {
            if (sum % 2 == 0 && remainingK > 0) {
                sum /= 2;
                remainingK--;
            } else {
                sum -= 1;
            }
            result++;
        }

        return result - 1;

    }

    public static int travelSolution(int[] A) {

        List<Integer> travel = Arrays.stream(A).boxed().collect(Collectors.toList());
        List<Integer> uniqueNumbers = new ArrayList<>(travel);

        Map<Integer, Integer> dictionary = new HashMap<>();
        uniqueNumbers.forEach(n -> dictionary.put(n, dictionary.getOrDefault(n, 0) + 1));

        dictionary.forEach((k, v) -> System.out.println(k + " => " + v));

        int targetNumber = dictionary.size();
        List<Integer> sublist = new ArrayList<>();

        for (int j = targetNumber; j < travel.size(); j++) {

            for (int i = 0; i < travel.size() - j; i++) {
                sublist = travel.subList(i, i + j);
                if (sublist.containsAll(dictionary.keySet())) {
                    return sublist.size();
                }
            }
        }

        return 0;
    }


}
