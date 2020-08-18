package pl.basics5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Enough is enough!
 *
 * Alice and Bob were on a holiday. Both of them took many pictures of the places they've been, and now they want
 * to show Charlie their entire collection. However, Charlie doesn't like these sessions, since the motive usually
 * repeats. He isn't fond of seeing the Eiffel tower 40 times. He tells them that he will only sit during the session
 * if they show the same motive at most N times. Luckily, Alice and Bob are able to encode the motive as a number.
 * Can you help them to remove numbers such that their list contains each number only up to N times, without changing
 * the order?
 *
 * Task
 *
 * Given a list lst and a number N, create a new list that contains each number of lst at most N times without
 * reordering. For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2]
 * since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
 */
public class DeleteOccurencesBeyondLimit {
    /**
     * remove repeated elements within and beyond limit from source array without changing order
     * @param source given array
     * @param limit should be greater than 0
     * @return target array
     */
    public static int[] deleteNth(int[] source, int limit) {
        if (limit < 0) {
            limit = 1;
        }
        if (limit == 1 || source == null || source.length == 0) {
            return new int[0];
        }
        List<Integer> heap = new LinkedList<>();
        Integer[] given = Arrays.stream(source).boxed().toArray(Integer[]::new);
        for (Integer i : given) {
            if (countRepetitions(i, heap) <= limit - 2) {
                heap.add(i);
            }
        }
        return heap.stream().unordered().mapToInt(Integer::intValue).toArray();

    }

    private static int countRepetitions(Integer i, List<Integer> list) {
        return (int) list.stream().filter(n -> n.equals(i)).count();
    }
}
