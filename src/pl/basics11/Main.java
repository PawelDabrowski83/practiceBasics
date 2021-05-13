package pl.basics11;

import pl.basics6.ppj.c09.Person;

public class Main {
    public static void main(String[] args) {

        ArrayBox<String> arrayBox = new ArrayBox<>(2);

//        System.out.println(arrayBox.add("Test"));
//        System.out.println(arrayBox.add("aaa"));
//        System.out.println(arrayBox.add("iif"));
//        System.out.println(arrayBox.add("aaaaaaaa"));
//        System.out.println(arrayBox.swap(0, 1));
//        System.out.println(arrayBox.search("iif"));

        Book b1 = new Book("Autor", "Tytul", 150);
        Book b2 = new Book("Autor", "Tytul", 19);
        Book b3 = new Book("Autor", "Tytul", 415);

        ArrayBox<Book> arrayBox1 = new ArrayBox<>(3);
        arrayBox1.add(b1);
        arrayBox1.add(b2);
        arrayBox1.add(b3);

        System.out.println(arrayBox1.min());


    }
}
