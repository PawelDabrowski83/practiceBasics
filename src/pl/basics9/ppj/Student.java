package pl.basics9.ppj;

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


}
