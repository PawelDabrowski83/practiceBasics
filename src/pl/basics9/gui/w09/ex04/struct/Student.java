package pl.basics9.gui.w09.ex04.struct;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int id;
    private double grade;
    private boolean graduate;

    public Student(String name, int id, double grade, boolean graduate) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.graduate = graduate;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public boolean isGraduate() {
        return graduate;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setGraduate(boolean graduate) {
        this.graduate = graduate;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}
