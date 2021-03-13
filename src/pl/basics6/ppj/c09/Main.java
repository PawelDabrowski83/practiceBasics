package pl.basics6.ppj.c09;

import pl.basics6.ppj.c09.donkey.Baloon;
import pl.basics6.ppj.c09.donkey.Donkey;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        testCorn();
//        testPerson();
//        testDonkey();
        Corn c1=new Corn(6);
        Popcorn[] cupOfPopcorn = c1.makePopcorn();
        System.out.println(cupOfPopcorn);

        for(int i=0;i<cupOfPopcorn.length;i++)
            System.out.println(Arrays.toString(cupOfPopcorn));
    }

    public static void testCorn() {
        for (int i = 0; i < 10; i++) {
            Corn corn = new Corn(i);
            Popcorn[] popcorns = corn.makePopcorn();
            System.out.println("i=" + i + " length: " + popcorns.length + "  " + Arrays.toString(popcorns));
        }
    }

    public static void testPerson() {
        Person p1 = new Person("Janusz", 1984);
        Person p2 = new Person("Alicja", 2001);
        Person p3 = new Person("Jonasz", 2010);
        Person p4 = new Person("Teresa", 1986);
        Person p5 = new Person("Krystyna", 1997);


        Person[] people = {p1, p2, p3, p4, p5};

        System.out.println(Person.getOldest(people).getName());

        Person.sort(people);
        System.out.println(Arrays.toString(people));
    }

    public static void testBaloons() {
        int counter = 0;
        Baloon[] baloons = new Baloon[200004];
        for (Baloon baloon : baloons) {
            baloons[counter++] = new Baloon();
        }

    }

    public static void testDonkey() {
        Donkey donkey = new Donkey(1);
        while (!donkey.isFlying()) {
            donkey.addBaloon(new Baloon());
        }
    }


}
