package pl.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<String> phones = Arrays.asList(scanner.nextLine().split("\\s+"));
        Collection<String> blockList = Arrays.asList(scanner.nextLine().split("\\s+"));

        Collection<String> nonBlockedPhones = CollectionUtils.filterPhones(
                new ArrayList<>(phones), new ArrayList<>(blockList));

        System.out.println(nonBlockedPhones.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }

    static class CollectionUtils {

        public static Collection<String> filterPhones(Collection<String> phones,
                                                      Collection<String> blacklist) {
            if (phones == null) {
                return new ArrayList<String>();
            }
            if (blacklist == null) {
                return new ArrayList<String>(phones);
            }

            return phones.stream().filter(n -> !blacklist.contains(n)).collect(Collectors.toList());
        }
    }
}
