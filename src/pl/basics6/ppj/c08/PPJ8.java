package pl.basics6.ppj.c08;

public class PPJ8 {
    public static void main(String[] args) {
        task05();
    }

    /*
    Zadeklaruj klase MethodCurrier implementujaca dwie nic niezwracajace metody
setValue. Pierwsza przyjmie jako parametr zmienna typu prostego int, natomiast
druga przyjmie jako parametr zmienna typu float. Obie metody wyswietla na ekranie
wartosci dostarczonych zmiennych z informacja jakiego typu był parametr.
Nastepnie nalezy utwórzyc obiekt klasy MethodCurrier i wywołac obie metody dostarczajac
jako parametry literały typu:
• int
• float
• char
• byte
Na jakiej podstawie podejmowana jest decyzja która z metod nalezy wywołac?
     */
    public static void task01() {
        MethodCurrier methodCurrier = new MethodCurrier();
        methodCurrier.setValue(13);
        methodCurrier.setValue(3.13f);
        methodCurrier.setValue('l');
        methodCurrier.setValue((byte) 4);
        // argument wejściowy jest rzutowany do int (w przypadku char i byte)
    }

    /*
    Zdefiniuj klase Number z polem typu int, oraz metodami setValue (przypisujaca
polu wartosc dostarczona jako parametr metody) i showValue (wyswietlajaca wartosc
pola).
Nastepnie rozszerz definicje klasy MethodCurrier z poprzedniego zadania o metode
setValue akceptujaca jako parametr klase Number.
Przedefiniuj wszystkie metody setValue tak aby wykonywały nastepujace czynnosci:
• wyswietlały stan zmiennej dostarczonej jako parametr,
• modyfikowały wartosc dostarczonej zmiennej,
• wyswietlały stan zmodyfikowanej zmiennej.
Na koniec przedstaw wywołanie wszystkich metod setValue i odpowiedz co zmieniły
wywołane metody?
     */
    public static void task02() {
        MethodCurrier methodCurrier = new MethodCurrier();
        Number number = new Number();
        number.setValue(8);
        methodCurrier.setValue(number);
        methodCurrier.setValue(13);
        methodCurrier.setValue(3.13f);
        methodCurrier.setValue('l');
        methodCurrier.setValue((byte) 4);
        // w przypadku przekazanej referencji metoda setValue modyfikuje stan obiektu. w innym przypadku kopiuje
        // wartość lokalnie i jej nie zwraca po zakończeniu operacji
    }

    /*
    Utwórz klase Person zawierajaca publiczne pola:
• String name
• String surname;
• int bDay;
Utwórz obiekt klasy Person i przechowaj go w zmiennej person. Wykorzystaj mozliwosc
dostepu do publicznych pól tej klasy i przypisz im literały lub wartosci opisujace
tworzona osobe.
     */
    public static void task03() {
        Person person = new Person();
        person.name = "Andrzej";
        person.surname = "Duda";
        person.bDay = 16;
    }

    /*
    Utwórz konstruktor dla klasy Person który zainicjuje wszystkie jej pola. Ponadto
utwórz metode show wypisujaca na ekran stan wszystkich pól. Działanie obu składowych
klasy przedstaw w programie.
     */
    public static void task04() {
        Person person = new Person("Andrzej", "Duda", 16);
        person.show();
    }

    /*
    Liczby zespolone składaja sie z czesci rzeczywistej i urojonej opisanych przez zmienne
typu double. Napisz klase Cplx implementujaca:
• prywatne pola obu liczb
• dwuparametrowy konstruktor
• funkcje dodawania (add(Cplx))
• funkcje odejmowania (sub(Cplx))
• funkcje mnozenia (mul(Cplx))
• funkcje zwiekszajaca czesc rzeczywista o jeden (inc())
• funkcje show wyswietlajaca dana liczbe zespolona w formacie 4 + 5i
Działanie zdefiniowanej klasy przedstaw na przykładach przynajmniej trzech róznych
liczb.
     */
    public static void task05() {
        Cplx complex1 = new Cplx(9, 1);
        Cplx complex2 = new Cplx(-1.2, -0.8);
        Cplx complex3 = new Cplx(10, 8.15);

        complex1.show();
        complex1.add(complex2);
        complex1.show();
        complex1.sub(complex2);
        complex1.mul(complex3);
        complex1.show();
        complex3.inc();
        complex3.show();
        complex2.show();

    }



}
