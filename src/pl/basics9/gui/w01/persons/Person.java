package pl.basics9.gui.w01.persons;

public abstract class Person implements Comparable<Person>{

    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getDesc();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person person) {
        return this.age - person.age;
    }
}
