package pl.basics3;

import java.util.Arrays;

public class RotateRightArray {

    public static int[] rotateRightArray(int[] array, int step) {
        int[] source = Arrays.copyOf(array, array.length);
        int stepAdjusted = step % array.length;
        if (source.length == 0) {
            return new int[0];
        }
        int[] temp = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            if ((stepAdjusted + i) >= source.length) {
                temp[stepAdjusted + i - source.length] = source[i];
            } else {
                temp[stepAdjusted + i] = source[i];
            }
        }
        return temp;
    }
}
