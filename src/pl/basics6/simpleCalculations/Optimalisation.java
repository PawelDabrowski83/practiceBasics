package pl.basics6.simpleCalculations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Optimalisation {
    public static int optimise(int[] array, int tasks) {
        List<Integer> integerList = Arrays.stream(array).boxed().sorted().collect(Collectors.toList());

        int maxTime = 0;
        int currentTime = 0;
        int buckets = array.length / tasks;
        int remainder = array.length % tasks;

        while (remainder > 0){
            int closestToAverage = findClosestToAverage(array);
            currentTime = integerList.remove(integerList.indexOf(closestToAverage));
            integerList.remove(integerList.size() - 1);
            if (currentTime > maxTime){
                maxTime = currentTime;
            }
            remainder--;
        }

        while (integerList.size() > 0){
            int currentBucket = buckets;
            currentTime = 0;
            while(currentBucket > 0){
                if (integerList.size() % 2 != 0){
                    int current = integerList.get(integerList.size() / 2);
                    integerList.remove(integerList.size() / 2);
                    currentTime += current;
                    currentBucket--;
                } else {
                    int current = integerList.get(0) + integerList.get(integerList.size() - 1);
                    integerList.remove(0);
                    integerList.remove(integerList.size() -1);
                    currentTime += current;
                    currentBucket -= 2;
                }
            }
            if (currentTime > maxTime){
                maxTime = currentTime;
            }
        }
        return maxTime;
    }

    private static int findClosestToAverage(int[] array){
        if (array.length == 0){
            return 0;
        }
        if (array.length == 1){
            return array[0];
        }
        int sum = 0;
        int count = 0;
        for (int i : array){
            sum += i;
            count++;
        }
        double average = (double) sum / count;
        return getClosestTo(average, array);
    }

    private static int getClosestTo(double number, int[] array){
        double minDistance = Double.MAX_VALUE;
        int target = 0;
        for (int i : array){
            double currentDistance = Math.abs(i - number);
            if (currentDistance < minDistance){
                minDistance = currentDistance;
                target = i;
            }
        }
        return target;
    }
}
