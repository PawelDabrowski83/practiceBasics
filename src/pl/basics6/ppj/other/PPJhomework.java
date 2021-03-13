package pl.basics6.ppj.other;

import java.util.Scanner;

public class PPJhomework {

    public static void main(String[] args) {
    }

    /*
    Napisz program wyswietlajacy wartosci od 1 do 10. Wykorzystaj w tym celu petle.
     */
    static void task01(){
        for (int i = 0; i < 10; i++){
            System.out.println(i + 1);
        }
    }

    /*
    Dana jest zmienna int wrt. Zmodyfikuj poprzedni program, tak aby wyswietlał wartosci
bedace wynikiem mnozenia kolejnej wartosci zmiennej petli i zmiennej wrt
     */
    static void task02(){
        int wrt = 10;
        for (int i = 0; i < 10; i++){
            System.out.println((i + 1) * wrt);
        }
    }

    /*
    Przedstaw program ilustrujacy podstawowa róznice pomiedzy petlami while i do–while
     */
    static void task03(){

        /*
        Gdy warunek while jest fałszywy, pętla nie wykona się ani razu.
        Pętla do while wykonuje się raz przed sprawdzeniem warunku.
         */

        boolean condition = false;

        while(condition == true){
            System.out.println("pętla while");
        }

        do {
            System.out.println("Pętla do while");
        } while(condition == true);
    }

    /*
    Utwórz program wyswietlajacy na ekran pierwsze 10 elementów szeregu geometrycznego 1 / 2^n; n = 0 -> Inf
     */
    static void task04(){
        double sum = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Wartość wyrazu n: " + i);
            int base = 2;
            int valueOfPower = base;
            if (i == 0){
                valueOfPower = 1;
            }
            for (int j = i; j >0; j--){
                if (j > 1){
                    valueOfPower = valueOfPower * base;
                }
            }
            double value = 1.0 / valueOfPower;
            sum += value;
            System.out.println(sum);
            System.out.println();
        }
    }

    /*
    Napisz program, który wykorzystujac petle utworzy szachownice składajacy sie z literałów
reprezentujacych gwiazdke (*) i spacje: (kształt)
1 * * * * *
2  * * * *
3 * * * * *
4  * * * *
5 * * * * *
6  * * * *

     */
    static void task05(){
        int height = 6;
        int width = 9;
        String dot = "*";
        String space = " ";
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                String print =      i % 2 == 0 && j % 2 == 0 ? dot :
                                    i % 2 == 1 && j % 2 == 1 ? dot : space;
                System.out.print(print);
            }
            System.out.println();
        }
    }

    /*
    Utwórz program który wczyta wartosc size i wyswietli na ekranie ponizszy znak o
rozmiarze (2size+1) na (2size+1):

1 . . . . * . . . .
2 . . . * * * . . .
3 . . * * * * * . .
4 . * * * * * * * .
5 * * * * * * * * *
6 . * * * * * * * .
7 . . * * * * * . .
8 . . . * * * . . .
9 . . . . * . . . .

     */
    static void task06(){

        Scanner scanner = new Scanner(System.in);
        // bez walidacji danych przyjmuję, że size jest liczbą i jest większa niż 0
        int size = scanner.nextInt();

        int finalSize = 2 * size + 1;
        int middle = size;

        for (int i = 0; i < finalSize; i++){
            for (int j = 0; j < finalSize; j++){
                String print =      i <= middle && (j >= middle - i && j <= middle + i) ? "*" :
                                    i > middle && (j >= i - middle && j <= middle + finalSize - 1 - i) ? "*" : ".";
                System.out.print(print);
                if (j != finalSize - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
    Zadeklaruj tablice zmiennych typu char i wypełnij ja trzema dowolnymi znakami.
Nastepnie przeanalizuj tablice i wskaz indeks elementu o najmniejszej wartosci.
     */
    static void task07(){
        char[] array = {'x', 'z', 'b'};

        int minIndex = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] < array[minIndex]){
                minIndex = i;
            }
        }

        System.out.println("Indeks elementu o najmniejszej wartości: " + minIndex);
    }

    /*
    Utwórz dwie tablice zmiennych typu byte i wypełnij je wartosciami z przedziału
0 do 2. Nastepnie napisz program sprawdzajacy czy obie tablice maja identyczna
zawartosc.
     */
    static void task08(){
        byte[] first = {2, 1, 0, 1};
        byte[] second = {2, 1, 0, 1, 2};

        boolean isEqual = true;

        if (first.length != second.length){
            isEqual = false;
        }

        for (int i = 0; i < first.length && isEqual; i++){
            isEqual = first[i] == second[i];
        }

        String answer = isEqual ? "Tablice mają identyczną zawartość." : "Tablice nie mają identycznej zawartości.";
        System.out.println(answer);
    }

    /*
    Przygotuj program wybierajacy z tablicy dwie wartosci, których suma bedzie najblizsza
wartosci 0.
     */
    static void task09(){
        double[] values = {8.2, 99.0, -16.34, 2.14, -3.1415, 10.0, -15.99, 8.14, 16.13};
        double lowestSum = Double.MAX_VALUE;
        double firstNumber = Double.MAX_VALUE;
        double secondNumber = Double.MAX_VALUE;
        double target = 0.0;

        for (int i = 0; i < values.length - 1 && lowestSum != 0; i++){
            for (int j = i + 1; j < values.length && lowestSum != 0; j++){
                double baseNumber = values[i];
                double curNumber = values[j];
                double localSum = baseNumber + curNumber;
                if (localSum * localSum < lowestSum * lowestSum){
                    lowestSum = localSum;
                    firstNumber = baseNumber;
                    secondNumber = curNumber;
                }
            }
        }
        System.out.println("Suma najbliższa wartości 0 to: " + lowestSum + " a liczby to: " + firstNumber + " oraz " + secondNumber);
    }

    /*
    Utwórz jednowymiarowa tablice zmiennych int o losowo wybranym rozmiarze pomiedzy
10 a 15. Nastepnie wykonaj kroki:
• wypełnij jej elementy kolejnymi wartosciami poczynajac od 0, np {0, 1, 2,
3, 4, 5};
• wymieszaj wszystkie elementy w tej tablicy, np rezultatem mogłoby byc: {5,
2, 3, 1, 4, 0}
• zwizualizuj rezultat tak aby przedstawiał mape permutacji, tak jak ponizej:
5 2 3 1 4 0
. . . . . *
. . . * . .
. * . . . .
. . * . . .
. . . . * .
* . . . . .
     */
    static void task10(){
        int arraySize = (int) (10 + (Math.random() * 6));
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            array[i] = i;
        }

        int[] randomized = new int[arraySize];

        int randomizeStep = 0;
        while (randomizeStep < arraySize){

            int randomNumber = (int) (Math.random() * (array.length));
            randomized[randomizeStep] = array[randomNumber];

            int[] temp = new int[array.length - 1];
            for (int i = 0; i < temp.length; i++){
                if (i < randomNumber){
                    temp[i] = array[i];
                } else {
                    temp[i] = array[i+1];
                }
            }
            array = temp;
            randomizeStep++;
        }

        for (int headers : randomized) {
            System.out.print(headers + " ");
        }
        System.out.println();

        for (int rows = 0; rows < randomized.length; rows++){
            for (int cols = 0; cols < randomized.length; cols++){
                int randomValue = randomized[cols];
                String print = rows == randomValue ? "*" : ".";
                System.out.print(print);
                if(cols != randomized.length - 1){
                    if(randomValue >= 10){
                        System.out.print("  ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    /*
    Wprowadz z klawiatury 9 cyfr i przechowaj kazda z nich w kolejnych elementach
10 elementowej tablicy ISBN. Nastepnie uzupełnij ostatnia 10 wartosc jako sume
kontrolna.
     */
    static void task11(){
        Scanner scanner = new Scanner(System.in);
        int[] ISBN = new int[10]; // there is no validation here, because task is implying that input is only digits

        int counter = 0;
        while(counter < 9){
            ISBN[counter] = scanner.nextInt();
            counter++;
        }

        int sum = 0;
        int step = 10;
        for (int number : ISBN){
            sum += number * step--;
        }
        int checksum = 11 - sum % 11;
        ISBN[9] = checksum;

        System.out.print("Full ISBN number: ");
        for (int i : ISBN){
            System.out.print(i);
        }
        System.out.println();

    }
}
