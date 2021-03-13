package pl.basics6.ppj.c10.word;

/*
V. Utwórz klase Word zawierajaca pole tablice typu char[] i pole typu int. Bezparametrowy
konstruktor tworzacy wyraz zainicjuje pola odpowiednio: tablica o rozmiarze
100 elementów i wartoscia 0. Metoda addChar(char) pozwoli na dopisywanie kolejnych
znaków do ciagu. Metoda show() wyswietli ciag, a metoda length() zwróci
ilosc znaków w ciagu.
Działanie programu przedstaw na przykładzie.
 */
public class Word {
    private char[] chars;
    private int counter;

    public Word() {
        this.chars = new char[100];
        this.counter = 0;
    }

    public void addChar(char currentChar) {
        prepareChars();
        chars[counter++] = currentChar;
    }

    private void prepareChars() {
        if (counter == chars.length) {
            char[] temp = new char[chars.length * 2];
            for (int i = 0; i < chars.length; i++) {
                temp[i] = chars[i];
            }
            chars = temp;
        }
    }

    public int length() {
        return counter;
    }

    public void show() {
        String result = "";
        for (int i = 0; i < counter; i++) {
            result += chars[i]; // we did not introduce StringBuilder or String.valueOf yet
        }
        System.out.println(result);
    }
}
