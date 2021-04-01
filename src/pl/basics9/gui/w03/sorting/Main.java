package pl.basics9.gui.w03.sorting;

import pl.basics9.gui.w03.selector.Student;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student[] arr = {
                new Student("Sylvia", 2),
                new Student("Philipa", 67),
                new Student("Hugh", 535),
                new Student("Sylvia", 1)
        };

        System.out.println(
                Arrays.toString(arr)
        );
        Arrays.sort(
                arr, Comparator.comparing(Student::getName)
                .thenComparing(Student::getId)
        );
        System.out.println(
                Arrays.toString(arr)
        );

    }
}
