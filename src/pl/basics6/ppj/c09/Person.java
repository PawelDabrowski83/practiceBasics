package pl.basics6.ppj.c09;

/*
II. Przygotuj klase Person definiujaca prywatne pola:
• String name,
• int birthYear.
Klasa bedzie równiez definiowac:
• dwuargumentowy konstruktor, inicjujacy pola klasy;
• jednoargumentowy konstruktor, przyjmujacy jako parametr String name, natomiast
jako pole birthYear przypisujacy wartosc 1990 (wykorzystaj );
• metode getName() zwracajaca wartosc pola name;
• metode getAge() zwracajaca wiek osoby (przyjmujac obecny rok jak );
• statyczna funkcje getOlder przyjmujaca w liscie argumentów dwa obiekty klasy
Person i zwracajaca starsza osobe;
• statyczna funkcje getOldest przyjmujaca jako argument tablice obiektów klasy
Person i zwracajaca najstarsza osobe.
Utwórz w programie 4 obiekty klasy Person, a nastepnie umiesc je w tablicy. Przedstaw
wywołania wszystkich metod i funkcji na przykładach. Na zakonczenie przedstaw
własna implementacje mechanizmu sortowania tej tablicy w oparciu o zdefiniowane
funkcje.
 */
public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(String name) {
        this.name = name;
        this.birthYear = 1990;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return 2020 - birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear + "}\n";
    }

    public static Person getOlder(Person p1, Person p2) {
        if (p1.getAge() < p2.getAge()) {
            return p2;
        }
        return p1;
    }

    public static Person getOldest(Person[] people) {
        Person oldest = people[0];
        for (int i = 1; i < people.length; i++) {
            oldest = getOlder(oldest, people[i]);
        }
        return oldest;
    }

    public static void sort(Person[] people) {
        for (int i = 1; i < people.length; i++) {
            if (isDescending(people[i - 1], people[i])) {
                Person temp = people[i - 1];
                people[i - 1] = people[i];
                people[i] = temp;
                i = 1;
            }
        }

    }

    private static boolean isDescending(Person p1, Person p2) {
        return getOlder(p1, p2) == p1;
    }


}
