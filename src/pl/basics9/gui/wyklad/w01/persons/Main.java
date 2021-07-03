package pl.basics9.gui.wyklad.w01.persons;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sylvia", 36, "s0678");
        Student s2 = new Student("Philipa", 48, "s0002");

        Student[] arr = {s1, s2};

        for (Student s : arr) {
            System.out.println(s.getDesc());
        }


        Lecturer l1 = new Lecturer("tomaszew", 30, new String[]{"PPJ", "GUI"});

        Person[] arr2 = {s1, s2, l1};

        MyList<Person> myListG = new MyList<Person>();
        myListG.add(s1);
        myListG.add(s2);
        myListG.add(l1);
        myListG.show();

        System.out.println("=======================");
        for(Student s : arr) {
            System.out.println(s.getDesc());
        }

        Arrays.sort(arr);

        for(Student s : arr) {
            System.out.println(s.getDesc());
        }
    }
}
