package pl.basics9.gui.w01.persons;

import java.util.Arrays;

public class Lecturer extends Person {

    String[] subjects;

    public Lecturer(String name, int age, String[] subjects) {
        super(name, age);
        this.subjects = subjects;
    }


    @Override
    public String getDesc() {
        return "Lecturer " + Arrays.toString(subjects);
    }
}
