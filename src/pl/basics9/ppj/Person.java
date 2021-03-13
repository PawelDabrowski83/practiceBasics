package pl.basics9.ppj;

public abstract class Person implements Comparable<Person>{

    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getDesc();

    @Override
    public int compareTo(Person person) {
        return this.age - person.age;
    }
}
