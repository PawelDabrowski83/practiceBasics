package pl.basics6.ppj;

import java.util.Scanner;

public class PPJ5 {
    public static void main(String[] args) {
        task09();
    }

    static void ops1(){
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++){
            num[i] = (int) (Math.random() * 100);
            System.out.println(num[i]);
        }

        for (int i = 0; i < num.length; i++){
            if (num[i] > 15) {
                System.out.println(num[i]);
            }
        }

        // ===============
        double[] arrDouble = new double[3];

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i < arrDouble.length){
            double tmp = scanner.nextDouble();
            arrDouble[i] = tmp;
            i += 1;
        }
    }

    static void task2(){
        Scanner scanner = new Scanner(System.in);
        double[] dynArr = new double[3];
        int indexDynArr = 0;
        double tmp;
        while((tmp = scanner.nextDouble()) != 0){
            if (indexDynArr >= dynArr.length) {
                double[] tmpArr = new double[dynArr.length*2];
                for(int i = 0; i < dynArr.length; i++){
                    tmpArr[i] = dynArr[i];
                }
                dynArr = tmpArr;
            }
            dynArr[indexDynArr++] = tmp;
        }
    }

    static void task3(){
        int value = 0b1100;
        int valueToLeft = value << 1; // 0b11000
        int valueToRight = value >> 1; // 0b110
        System.out.println("wartość początkowa: " + value);
        System.out.println("przesunięcie w lewo: " + valueToLeft);
        System.out.println("przesunięcie w prawo: " + valueToRight);
    }

    static void task4(){
        int value = 12;
        System.out.print(value & 0b1);
        System.out.print(value & 0b10);
        System.out.print(value & 0b100);
        System.out.print(value & 0b1000);
        System.out.println();
        System.out.print(value >> 3 & 1);
        System.out.print(value >> 2 & 1);
        System.out.print(value >> 1 & 1);
        System.out.print(value >> 0 & 1);
        System.out.println((char) 110);
        String.valueOf(18).toCharArray();
    }

    static void task5() {
        int[] arr = new int[10];

        int fill = 0;
        for (int i = 0; i <=3; i++){
            arr[i] = i*10;
            fill++;
        }
        arr[4] = 40; // wstawienie ręczne
        fill++;

        System.out.print(fill + ": ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();

        // wstawienie elementu do tablicy pomiędzy dwie wartości
        int into = 1;
        for (int i = fill; i > into; i--) {
            arr[i] = arr[i-1];
        }
        arr[into] = 25;
        fill++;

        System.out.print(fill + ": ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();

        //==============================
        int delElement = 2;
        for(int i = delElement + 1; i < fill; i++) {
            arr[i-1] = arr[i];
            fill--;
        }
        arr[fill] = 0;
        fill--;

        System.out.print(fill + ": ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();

        //================================
        // sortowanie tablicy

        int[] arrDisorder = new int[20];
        for (int i = 0; i < arrDisorder.length; i++){
            arrDisorder[i] = (int) (Math.random()*10);
        }

        for (int j = 0; j < arrDisorder.length-1; j++) {
            int indexMin = j;
            for (int i = indexMin + 1; i < arrDisorder.length; i++) {
                if(arrDisorder[indexMin] > arrDisorder[i]){
                    indexMin = i;
                }
            }
            int tmp = arrDisorder[indexMin];
            arrDisorder[indexMin] = arrDisorder[j];
            arrDisorder[j] = tmp;

            System.out.print("arrDisorder: ");
            for (int i : arrDisorder) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
    }

    static void task6(){

        int[][] arr2D = new int[4][3];

        for (int i = 0; i < arr2D.length; i++){
            for (int j = 0; j < arr2D[i].length; j++){
                System.out.print(arr2D[i][j] + ",");
            }
            System.out.println();
        }

        //=======
        int[][] arr2DS = new int[4][];

        for (int i = 0; i < arr2DS.length; i++){
            arr2DS[i] = new int[(int) (Math.random()*6)];
        }

        for (int i = 0; i < arr2DS.length; i++){
            for (int j = 0; j < arr2DS[i].length; j++){
                System.out.print(arr2DS[i][j] + ",");
            }
            System.out.println();
        }

        arr2D = arr2DS;

    }

    static void task7(){
        char literka = 'g';
        System.out.println(literka);
        System.out.println((int) literka);
        System.out.println(literka & 1);
        System.out.println("czy liczba 12 jest parzysta " + ((12 & 1) == 0));

        int liczba = 1327;

        System.out.print((liczba >> 11) & 1);
        System.out.print((liczba >> 10) & 1);
        System.out.print((liczba >> 9) & 1);
        System.out.print((liczba >> 8) & 1);
        System.out.print((liczba >> 7) & 1);
        System.out.print((liczba >> 6) & 1);
        System.out.print((liczba >> 5) & 1);
        System.out.print((liczba >> 4) & 1);
        System.out.print((liczba >> 3) & 1);
        System.out.print((liczba >> 2) & 1);
        System.out.print((liczba >> 1) & 1);
        System.out.print((liczba >> 0) & 1);
        System.out.println();

        int number = 0b11011010;
        int eight = 0b1001;
        int result = number & eight;
        System.out.println(result);

        liczba = 6;
        System.out.println((liczba >> 0) & 0b111);
       int value = 5;
        System.out.print(value >> 18 & 7);
        System.out.print(value >> 15 & 7);
        System.out.print(value >> 12 & 7);
        System.out.print(value >> 9 & 7);
        System.out.print(value >> 6 & 7);
        System.out.print(value >> 3 & 7);
        System.out.print(value >> 0 & 7);
        System.out.println();

        System.out.print(9 >> 0 & 0b111);
    }

    static void task8(){
        int andrzej = 1327;
        int kontrAndrzej = 0b1111;

        System.out.print(andrzej >> 12 & kontrAndrzej);
        System.out.print(" ");
        System.out.print(andrzej >> 8 & kontrAndrzej);
        System.out.print(" ");
        System.out.print(andrzej >> 4 & kontrAndrzej);
        System.out.print(" ");
        System.out.print(andrzej >> 0 & kontrAndrzej);

        System.out.println(0x52f == andrzej);
    }

    static void task09(){
//        int licznik = 100;
//        while (licznik > 0 || licznik == 0) {
//            System.out.println(licznik);
//            licznik = licznik - 1;
//        }

        for (int i = 0; i < 10; i = i--) {
            System.out.println(i);
        }
    }

    
}
