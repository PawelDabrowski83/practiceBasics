package pl.basics6.ppj.c10;

import pl.basics6.ppj.c10.fruits.Fruit;
import pl.basics6.ppj.c10.fruits.Pomegranate;
import pl.basics6.ppj.c10.shapes.Cyllinder;
import pl.basics6.ppj.c10.shapes.KulaNa;
import pl.basics6.ppj.c10.shapes.Square;
import pl.basics6.ppj.c10.word.Word;

public class Main {

    public static void main(String[] args) {
        geometric();
        wordExample();
        fruitsExample();
    }

    public static void geometric() {
        Square square = new Square(10);
        System.out.println(square);

        Cyllinder cyllinder = new Cyllinder(10, 4);
        System.out.println(cyllinder);

        KulaNa kulana = new KulaNa(square);
        System.out.println(kulana.getRadius());
        double res = 2 * Math.sqrt(3);
        System.out.println(res);
    }

    public static void wordExample() {
        Word word = new Word();
        word.addChar('a');
        word.addChar('b');
        word.addChar('z');
        System.out.println("dł.: " + word.length());
        word.show();
        word.addChar('d');
        System.out.println("dł.: " + word.length());
        word.show();
    }

    public static void fruitsExample() {
        Fruit fruit = new Fruit("apple");
        Pomegranate pomegranate = new Pomegranate("granat", 199);
        System.out.println(fruit.toString());
        System.out.println(pomegranate.toString());
    }
}
