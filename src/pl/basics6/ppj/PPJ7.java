package pl.basics6.ppj;

import java.util.Arrays;

public class PPJ7 {

    public static void main(String[] args) {

    }

    /*
    Dana jest przykładowa tablica int[] tab = {1,2,3,4,4,3,2,1}. Napisz program
wyswietlajacy na ekranie true, gdy elementy czytane od poczatku do konca i od
konca do poczatku beda takie same, lub false w przeciwnym przypadku (wpp).
     */
    static void task01(){
        int[] tab = {1,2,3,4,4,3,2,1};
        System.out.println(isPalindrome(tab));
    }

    private static boolean isPalindrome(int[] array) {
        if (array == null) {
            return false;
        }

        int index = 0;
        while (index < array.length / 2) {
            if (array[index] != array[array.length - 1 - index]) {
                return false;
            }
            index++;
        }
        return true;
    }

    /*
    Utwórz program tworzacy tablice zmiennych typu long i wypełnij ja wartosciami
takimi ze ti+1 = ti + 1 gdzie i jest indeksem w tablicy. Nastepnie utwórz program
losujacy dwa dowolne indeksy w tej tablicy i zamieniajacy obie wartosci. Operacje
te powtarzaj tak długo, jak długo dwa sasiadujace ze soba elementy sa kolejnymi
wartosciami.
     */
    public static void task02() {
        long[] array = new long[20];
        array[0] = 115;
        fillArrayIncrementingValues(array);
        System.out.println(Arrays.toString(array));

        while (hasAscendingElements(array)) {
            switchRandomElements(array);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillArrayIncrementingValues(long[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 1;
        }
    }

    public static boolean hasAscendingElements(long[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1] + 1) {
                return true;
            }
        }
        return false;
    }

    public static void switchRandomElements(long[] array) {
        int first = getRandom(array.length);
        int second = getRandom(array.length);
        long temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    private static int getRandom(int range) {
        return (int) (Math.random() * range);
    }

    /*
    Utwórz i wypełnij losowymi wartosciami dwie tablice o takim samym rozmiarze i
typach odpowiednio int i double. Przyjmij ze elementy na tym samym indeksie
(w obu tablicach) sa nierozerwalnie z soba połaczone, co oznacza ze wykonywanie
dowolnej operacji na elemencie pod indeksem X w jednej tablicy bedzie wymagało
takiej samej operacji w drugiej tablicy. Posortuj te dane rosnaco, przyjmujac jako
kryterium sume wartosci na tym samym indeksie w obu tablicach.
     */
    public static void task03() {
        int[] arrayInts = new int[15];
        double[] arrayDoubles = new double[15];
        fillWithRandom(arrayInts);
        fillWithRandom(arrayDoubles);

        double[] sums = sumUpIntAndDoubleArray(arrayInts, arrayDoubles);

        extendedBubbleSort(sums, arrayInts, arrayDoubles);

        System.out.println(Arrays.toString(arrayInts));
        System.out.println(Arrays.toString(arrayDoubles));
        System.out.println(Arrays.toString(sums));
    }

    private static void fillWithRandom(int[] array) {
        int counter = 0;
        for (int ignored : array) {
            array[counter++] = (int) (Math.random() * 100);
        }
    }

    private static void fillWithRandom(double[] array) {
        int counter = 0;
        for (double ignored : array) {
            array[counter++] = Math.random() * 100;
        }
    }

    private static double[] sumUpIntAndDoubleArray(int[] arr1, double[] arr2) {
        double[] result = new double[arr2.length];
        int counter = 0;
        for (double ignored : arr2) {
            result[counter] = arr1[counter] + arr2[counter];
            counter++;
        }
        return result;
    }

    private static void extendedBubbleSort(double[] key, int[] arr1, double[] arr2) {
        for (int i = 1; i < key.length; i++) {
            if (key[i] < key [i - 1]) {
                extendedSwitchElements(i - 1, i, key, arr1, arr2);
                i = 0;
            }
        }
    }

    private static void extendedSwitchElements(int el1, int el2, double[] key, int[] arr1, double[] arr2) {
        double temp = key[el1];
        key[el1] = key[el2];
        key[el2] = temp;

        int temporary = arr1[el1];
        arr1[el1] = arr1[el2];
        arr1[el2] = temporary;

        temp = arr2[el1];
        arr2[el1] = arr2[el2];
        arr2[el2] = temp;
    }

    /*
    Dana jest tablica:
1 int [ ] [ ] tab = {
2 {1 , 0 , 0 , 0 , 0} ,
3 {0 , 1 , 0 , 0} ,
4 {0 , 0 , 1}
5 } ;
Napisz program, który zamieni tab na tablice jednowymiarowa, zawierajaca wszystkie
elementy zawarte wewnatrz tablicy dwuwymiarowej.
     */
    public static void task04() {
        int[][] tab = {
                {1 , 0 , 0 , 0 , 0} ,
                {0 , 1 , 0 , 0} ,
                {0 , 0 , 1}
                } ;
        int[] answer = flatten2dArray(tab);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] flatten2dArray(int[][] array) {
        int countLength = 0;
        for (int[] tab : array) {
            countLength += tab.length;
        }

        int[] result = new int[countLength];
        int counter = 0;
        for (int[] tab : array) {
            for (int number : tab) {
                result[counter++] = number;
            }
        }
        return result;
    }

    /*
    Utwórz trzy tablice zmiennych typu int o losowych rozmiarach i wypełnij je losowymi
wartosciami. Nastepnie utwórz tablice, której elementami beda przygotowane
wczesniej tablice. Wyswietl wszystkie wylosowane wartosci wykorzystujac utworzona
tablice dwuwymiarowa.
     */
    public static void task05() {
        int[] first = new int[getRandom(20)];
        int[] second = new int[getRandom(11)];
        int[] third = new int[getRandom(6)];
        fillWithRandom(first);
        fillWithRandom(second);
        fillWithRandom(third);
        int[][] mainArray = {first, second, third};

        for (int[] tab : mainArray) {
            System.out.println(Arrays.toString(tab));
        }
    }

    /*
    Utwórz dwuwymiarowa tablice zmiennych typu float o rozmiarze 8 x 8. Wypełnij
ja losowymi wartosciami, a nastepnie policz sume elementów na lewej i prawej
przekatnej.
     */
    public static void task06() {
        float[][] array = new float[8][8];
        int counter = 0;

        for (float[] ignored : array) {
            fillWithRandom(array[counter++]);
        }

        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
                if (j == (7- i)) {
                    sum += array[i][7 - i];
                }
            }
        }
        System.out.println("sum: " + sum);
    }

    private static void fillWithRandom(float[] array) {
        int counter = 0;
        for (float ignored : array) {
            array[counter++] = (float) Math.random();
        }
    }

    /*
    Dana jest dwuwymiarowa tablica jak w ponizszym kodzie:
1 int tab [ ] [ ] = {
2 { 1 , 2 , 3 , 4} ,
3 { 5 , 6 , 7 , 8} ,
4 { 9 ,10 ,11 ,12} ,
5 {13 ,14 ,15 ,16}
6 } ;
Utwórz program, który odczyta wartosci idac po spirali tak aby otrzymac nastepujacy
efekt:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
     */
    public static void task07() {
        int[][] tab = {
                { 1 , 2 , 3 , 4} ,
                { 5 , 6 , 7 , 8} ,
                { 9 ,10 ,11 ,12} ,
                {13 ,14 ,15 ,16}
                } ;
        spiralize(tab);
    }

    private static void spiralize(int[][] array) {
        int limit = array.length;
        int rows = 0;
        int cols = 0;
        while (true) {
            System.out.print(array[rows][cols] + " ");
            if (rows == 0 && cols != 3) {
                cols++;
            } else if (cols == 3 && rows != 3) {
                rows++;
            } else if (rows == 3 && cols != 0) {
                cols--;
            } else if (cols == 0 && rows != 1) {
                rows--;
            } else if (rows == 1 && cols != 2) {
                cols++;
            } else if (cols == 2 && rows != 2) {
                rows++;
            } else if (cols == 2) {
                cols--;
            } else {
                break;
            }
        }
    }

    /*
    Utwórz bezrezultatowa metode show przyjmujaca parametr typu int, której celem
bedzie wyswietlenie na ekran dostarczonej wartosci. Działanie utworzonej metody
przedstaw w programie.
     */
    public static void task08() {
        int number = 101;
        show(number);
    }

    public static void show(int number) {
        System.out.println(number);
    }

    /*
    Dana jest zmienna typu int o wartosci 5 i nazwie wrt. Napisz bezrezultatowa metode
modifyValue przyjmujaca jako parametr zmienna typu int. Zadaniem metody
bedzie:
• wyswietlenie wartosci dostarczonej zmiennej,
• modyfikacja zmiennej przez zapisanie w niej wyniku mnozenia przez 5,
• wyswietlenie wartosci zmodyfikowanej zmiennej
Utwórz program wyswietlajacy stan zmiennej wrt przed i po wywołaniu metody
modifyValue.
Jaki jest powód uzyskanego rezultatu?
     */
    public static void task09() {
        int wrt = 5;
        System.out.println("Wartość przed uruchomieniem metody: " + wrt);
        modifyValue(wrt);
        System.out.println("Wartość po uruchomieniu metody: " + wrt);
        // zmianie ulegała tylko zmienna lokalna w metodzie modifyValue
    }

    public static void modifyValue(int number) {
        System.out.println("Wyświetlenie: " + number);
        number *= 5;
        System.out.println("Zmodyfikowana wartość: " + number);
    }

    /*
    Utwórz metode findMax, przyjmujaca jako argumenty trzy parametry typu int i
zwracajaca najwieksza z dostarczonych wartosci. zadanie zrealizuj wykorzystujac jedynie
dwie instrukcje if
     */
    public static void task10() {
        int a = 1;
        int b = 10;
        int c = 12;
        System.out.println(findMax(a, b, c));
    }

    private static int findMax(int par1, int par2, int par3) {
        if (par1 > par2 && par1 > par3) {
            return par1;
        }
        if (par2 > par3) {
            return par2;
        }
        return par3;
    }

    /*
    Dana jest tablica zmiennych typu char przechowujaca napis Ala ma kota. Napisz
metode, która policzy ile razy wystapiły znaki składajace sie na ciag dostarczony
jako argument.
     */
    public static void task11() {
        char[] napis = "Ala ma kota".toCharArray();
        System.out.println("wystąpienia: " + countMatches(napis, "z"));
    }

    public static int countMatches(char[] word, String expression) {
        char[] filter = expression.toCharArray();
        int matches = 0;
        for (char value : word) {
            for (char c : filter) {
                if (c == value) {
                    matches++;
                }
            }
        }
        return matches;
    }

    /*
    Utwórz i wypełnij losowymi wartosciami dwie tablice zmiennych typu int. Nastepnie
utwórz metode przyjmujaca obie tablice i dodatkowo wartosc typu int jako
argumenty. Zadaniem metody bedzie:
• dostarczenie tablicy, której wartosciami beda sumy elementów na tych samych
indeksach, gdy wartosc argumentu typu int bedzie mniejsza od 0;
Uwaga - elementy które nie maja pary, powinny zostac pominiete
• dostarczenie tablicy zawierajacej tylko te elementy, które nie maja "pary"indeksowej,
gdy wartosc argumentu typu int bedzie wieksza lub równa 0
• dostarczenie elementu pustego gdy tablice sa tej samej długosci.
     */
    public static void task12() {
        int[] first = new int[20];
        int[] second = new int[11];
        fillWithRandom(first);
        fillWithRandom(second);

        String answer = Arrays.toString(compareArrays(first, second, -1));
        System.out.println(answer);

    }

    private static int[] compareArrays(int[] array1, int[] array2, int OPERATION_TYPE) {
        if (array1.length == array2.length) {
            return new int[0];
        }
        if (OPERATION_TYPE < 0) {
            int lengthLongerArray = array1.length > array2.length ? array1.length : array2.length;
            int[] sum = new int [lengthLongerArray];
            for (int i = 0; i < sum.length; i++) {
                if (i < array1.length) {
                    sum[i] += array1[i];
                }
                if (i < array2.length) {
                    sum[i] = array2[i];
                }
            }
            return sum;
        } else {
            int arr1Length = array1.length;
            int arr2Length = array2.length;
            boolean isArr1Longer = arr1Length > arr2Length;

            int missingPieces = 0;
            if (isArr1Longer) {
                missingPieces = arr1Length - arr2Length;
            } else {
                missingPieces = arr2Length - arr1Length;
            }
            int[] missing = new int[missingPieces];
            for (int i = 0; i < missing.length; i++) {
                if (isArr1Longer) {
                    missing[i] = array1[i + arr2Length];
                } else {
                    missing[i] = array2[i + arr1Length];
                }
            }
            return missing;
        }
    }









}
