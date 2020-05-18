package pl.basics;

import java.util.Arrays;

public class Main18 {

    public static void main(String[] args) {

        modifyArray();

    }

    public static void pseudocodePractice() {

        int[] a = new int[]{4, 0, 9, 2, 1};
        int[] b = new int[]{6, 3, 2, 9, 0};

        /*
        for i in 0..len(a):
    if i % 2 == 0:
        a[i] -= b[i]
    else:
        b[i] -= a[i]

    if a[i] % 2 == 0:
        a[i] += 1
        b[i] += 1
         */

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                a[i] -= b[i];
            } else {
                b[i] -= a[i];
            }
            if (a[i] % 2 == 0) {
                a[i] += 1;
                b[i] += 1;
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    public static void modifyArray() {

        int[] a = new int[]{9, 8, 3, 1, 5, 4};

        /*

        for i in 0..len(a):
        if a[i] % 2 == 0:
        a[i] += 1
        elif a[i] < len(a):
        a[i] += a[a[i]]}

         */

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                a[i] += 1;
            } else if (a[i] < a.length) {
                a[i] += a[a[i]];
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
