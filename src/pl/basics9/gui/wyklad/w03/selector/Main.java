package pl.basics9.gui.wyklad.w03.selector;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student[] arr = {
                new Student("Sylvia", 2),
                new Student("Philipa", 67),
                new Student("Hugh", 535)
        };

        System.out.println(Arrays.toString(
                StudentSelector.filter(arr, new MyStudentCriteria())
        ));

        System.out.println(Arrays.toString(
                StudentSelector.filter(
                        arr, (s) -> s.getId() > 10 && s.getId() < 500)
        ));

    }
}

class MyStudentCriteria implements StudentSelector {
    @Override
    public boolean crit(Student student) {
        return student.getId() < 500;
    }
}