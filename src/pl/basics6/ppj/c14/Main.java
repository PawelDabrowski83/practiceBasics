package pl.basics6.ppj.c14;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        InputStream is = System.in;
        Person person = null;
        try {
            person = new Person(is);    
        } catch (IncorrectInputException e) {
            System.out.println("Incorrect Input");
        }
        System.out.println(person);

    }

}
