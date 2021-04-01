package pl.basics9.gui.w01.persons;

public class Student extends Person {

    protected String id;

    public Student(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    @Override
    public String getDesc() {
        return "Student " + id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
