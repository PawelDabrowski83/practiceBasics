package pl.basics9.gui.w03.trudnaLambda;

public class Main {

    public static void main(String[] args) {
        A a = (x) -> {
            System.out.println(x);
        };
        a.fun(5);

        a = System.out::println;
        a.fun(7);

        B b = int[]::new;
        int[] tab = b.fun(10);
        System.out.println(tab.length);

        C c = Person::new;
        System.out.println(
                c.fun(6, 7)
        );

        c = (x, y) -> new Person(x, y);
        System.out.println(
                c.fun(8, 9)
        );

    }
}

interface A {
    void fun(int x);
}

interface B {
    int[] fun(int size);
}

class Person {

    int x, y;

    public Person(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Person{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

interface C {
    Person fun(int a, int b);
}