package pl.basics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Integer, String> map = new TreeMap<>();
        Arrays.stream(scanner.nextLine().split("\\s")).forEach(s -> {
            String[] pair = s.split(":");
            map.put(Integer.parseInt(pair[0]), pair[1]);
        });

        Map<Integer, String> res = MapUtils.getSubMap(map);
        res.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    static class MapUtils {
        public static Map<Integer, String> getSubMap(TreeMap<Integer, String> map) {
            if (map == null || map.size() == 0) {
                return new TreeMap<>();
            }

            int first = map.keySet().stream().findFirst().get();
            Map<Integer, String> subMap = new TreeMap<>();

            if (first % 2 == 0) {
                // even
                Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
                while (iterator.hasNext() && subMap.size() < 5) {
                    Map.Entry<Integer, String> entry = iterator.next();
                    subMap.put(entry.getKey(), entry.getValue());

                }
            } else {
                // odd
                SortedMap<Integer, String> sortedMap = map.descendingMap();
                Iterator<Map.Entry<Integer, String>> iterator = sortedMap.entrySet().iterator();
                while (iterator.hasNext() && subMap.size() < 5) {
                    Map.Entry<Integer, String> entry = iterator.next();
                    subMap.put(entry.getKey(), entry.getValue());
                }

            }
        return subMap;
        }
    }

}
