package pl.basics6.ppj.other;

public class Person {

    public String name;
    public String surname;
    public int bDay;
    public int age;

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

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static String getOlder(Person a, Person b){
        if (a.getAge() > b.getAge()){
            return a.getName();
        } else {
            return b.getName();
        }
    }
}
