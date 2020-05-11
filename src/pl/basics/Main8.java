package pl.basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }

    static class SetUtils {
        /*
        Implement two methods.
    The first method should create a set from a string of numbers separated by a space.
    The second method should remove all numbers greater than 10 from the given set.
         */

        public static Set<Integer> getSetFromString(String str) {

            Pattern pattern = Pattern.compile("\\d+");
            return str == null || str.isEmpty() ? new HashSet<>() :
                    Arrays.stream(str.split("\\s+"))
                            .filter(pattern.asPredicate())
                            .map(Integer::valueOf)
                            .collect(Collectors.toSet());
        }

        public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {

            return set == null || set.isEmpty() ? new HashSet<>() :
                    set.stream().filter(n -> n <= 10).collect(Collectors.toSet());
        }
    }


}
