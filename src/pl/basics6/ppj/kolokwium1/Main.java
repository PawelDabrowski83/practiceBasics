package pl.basics6.ppj.kolokwium1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task2();
        while(true)
        System.out.println(5);
    }

    /*
    Uzupełnij ciało metody (bez tworzenia nagłówka), w której zostanie zadeklarowana zmienna typu double. Następnie
    zainicjuj ją dowolnym literałem zmiennej rzeczywistej z wskazaniem że jest to literał typu double. Wreszcie wyświetl
     na ekranie informację jaka jest reszta z dzielenia tej liczby przez 5.

W programie nie wolno wykorzystywać żadnych konwersji lub bibliotek z wyłączeniem operacji System.out.println().
     */
    public static void task1() {
        double number = 9.5d;

        System.out.println("reszta z dzielenia przez 5: " + number % 5.0);
    }

    public static void task2() {
        final String STAR = "*";
        final String DASH = "_";

        String message = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j <= i && i < 5) {
                    message += STAR;
                } else {
                    if (i >= 5 && j >= i) {
                        message += STAR;
                    } else {
                        message += DASH;
                    }
                }

            }
            message += '\n';
        }
        System.out.println(message);
    }
    
    /*
    Utwórz funkcję getNotSelected, która przyjmuje jako argumenty: 
- tablicę zmiennych o nazwie data typu long,
- oraz tablicę zmiennych typu int o nazwie select. 

Celem działania tej funkcji będzie zwrócenie jednowymiarowej tablicy zawierającej te wartości z tablicy data, 
których indeksy nie zostały podane w tablicy selected
     */
    public static void task3() {
        long[] data = {1, 2, 3, 4, 5, 6};
        int[] selected = {2, 3, 4, 5};
        long[] answer = getNotSelected(data, selected);

        System.out.println(Arrays.toString(answer));
    }
    
    public static long[] getNotSelected(long[] data, int[] select) {
        long[] tmp = new long[data.length];
        int fill = 0;

        for (int i = 0; i < data.length; i++) {
            if (!foundInArray(data[i], select)) {
                tmp[fill++] = data[i];
            }
        }
        long[] returned = new long[fill];
        for (int i = 0; i < returned.length; i++) {
            returned[i] = tmp[i];
        }
        return returned;
    }

    public static boolean foundInArray(long number, int[] array) {
        for (int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}
