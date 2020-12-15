package pl.basics6.ppj.c08;

public class Person {

    public String name;
    public String surname;
    public int bDay;

    public Person() {
    }

    public Person(String name, String surname, int bDay) {
        this.name = name;
        this.surname = surname;
        this.bDay = bDay;
    }

    public void show() {
        System.out.println("Person");
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("bDay: " + bDay);
    }
}
