package pl.basics9.gui.w03.enums;

import pl.basics9.gui.w01.persons.Lecturer;
import pl.basics9.gui.w01.persons.MyList;
import pl.basics9.gui.w01.persons.Person;
import pl.basics9.gui.w01.persons.Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sylvia", 36, "s0678");
        Student s2 = new Student("Philipa", 48, "s0002");


        Person[] arr2 = {s1, s2};

        Arrays.sort(arr2, new StudentSortComparator(StudentSortType.BY_NAME));

        System.out.println(Arrays.toString(arr2));
    }
}
