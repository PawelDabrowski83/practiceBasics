package pl.basics6.ppj.c11;

import pl.basics6.ppj.c11.Phone.CellPhone;
import pl.basics6.ppj.c11.Phone.Person;
import pl.basics6.ppj.c11.Phone.Phone;
import pl.basics6.ppj.c11.Phone.Smartphone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        phoneTest();
    }

    public static void cookieTest() {
        Cookie cookie = new Cookie("ALFA", 415, "XP-112");
        System.out.println(cookie);
    }

    public static void pointTest() {
        Point2D p1 = new Point2D(2, 5);
        Point2D p2 = new Point2D(5, 9);
        System.out.println(p1.getDistance(p2));

        Point3D p3d1 = new Point3D(3, 3, 9);
        Point3D p3d2 = new Point3D(3, 4, 12);
        System.out.println(p3d1.getDistance(p3d2));
    }

    public static void callHistoryTest() {
        CellPhone c1 = new CellPhone("X", "red");
        c1.call("112");
        c1.call("123");
        c1.call("48948");
        c1.call("112");
        c1.call("123");
        c1.call("4");
        c1.call("7");
        c1.call("9");
        c1.call("1134");
        c1.call("111111112");
        c1.call("1111111111");
        c1.call("111111111111");

        System.out.println(Arrays.toString(c1.getCallsHistory()));
    }

    public static void phoneTest() {
        Phone janusz = new Phone("lead", "grey");
        Phone krystyna = new CellPhone("GSM", "blue");
        CellPhone zdzislaw = new CellPhone("GSM", "red");
        Smartphone rob = new Smartphone("GSM+", "white");
        Smartphone cecylia = new Smartphone("GSM", "orange");

        Person januszKontakt = new Person("Janusz", "Ch.", "092-112");
        Person krystynaKontakt = new Person("Krystyna", "Doberska", "777-666");
        Person robKontakt = new Person("Rob", "?", "999-123");
        cecylia.addContact(januszKontakt);
        cecylia.addContact(krystynaKontakt);
        cecylia.addContact(robKontakt);

        Phone[] phones = {janusz, krystyna, zdzislaw, rob, cecylia};

        for (Phone p : phones) {
            System.out.println("===================");
            p.call("092-112");
            p.call("012-234-432");
            p.call("999-123");
            p.getHistory();
        }
    }
}
