package pl.basics6.ppj.other;

import java.util.Arrays;


public class PPJnew {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 6, 4},
                {3, 2, 8},
                {5, 2, 9}
        };

        int[][] modifiedArray = shiftRightArray(arr);

        for (int[] row : modifiedArray) {
            System.out.println(Arrays.toString(row));
        }
    }
    
    public static int[][] shiftRightArray(int[][] array) {

        int[][] tmp = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 3, k = 0; j > 0; j--, k++) {

                tmp[i][k] = array[i][j - 1];
                k++;
                if (k == 3) {
                    k = 0;
                }

            }
        }
        return tmp;
    }
    
    public static void randomTest() {
        int rows = 10;
        int cols = 5;
        while (rows-- > 0) {
            while (cols-- > 0) {
                double random = Math.random() * 10;
                System.out.println("random: " + random);
                double result = random - 20;
                System.out.println("double: " + result);
                int a = (int) result;
                System.out.println(a + " ");
            }
            System.out.println("***");
            cols = 5;
        }
    }

    public static void kolokwium() {
        long number = Long.MIN_VALUE;
        int oldestBitShift = 63; // 8 bytes - 1 bit
        long oldestBit = number >> (oldestBitShift) & 1;
        String answer = "Najstarszy bit to: " + oldestBit;
        System.out.println(answer);
    }

    public static void ZadanieAmstrong() {

        int[] arr = {153, 333, 370, 515, 407, 80, 1741725};

        for (int j = 0; j < arr.length; j++) {
            int myNumber = arr[j];
            int digits = countDigits(myNumber);

            int summa = 0;
            System.out.println("digits: " + digits);

            for (int i = 0; i < digits; i++) {
                int currentDigit = myNumber % 10;
                myNumber = myNumber / 10;

                summa = digitPowered(currentDigit, digits) + summa;
            }
            displayIfNumberIsArmstrong(summa, arr[j]);
        }
    }

    public static int countDigits(int number) {
        int digit = 1;

        while (number > 10) {
            digit++;
            number = number / 10;
        }
        return digit;
    }

    public static int digitPowered(int number, int index) {
        int summaIndex = 1;
        for (int b = 0; b < index; b++) {
            summaIndex = number * summaIndex;

            System.out.println(summaIndex);
        }
        return summaIndex;
    }

    public static void displayIfNumberIsArmstrong(int summa, int number) {
        if (summa == number) {
            System.out.println(number + "arm");
        } else {
            System.out.println(number + " nie arm");
        }
    }

    public static void ZadanieFibonacho() {
        int[] arr = {13, 14, 21};

        for (int i = 0; i < arr.length; i++) {
            int f1 = 0;
            int f2 = 1;
            for (int j = 1; j <= arr[i]; j++) {

                int testFebonachi = f1 + f2;
                f1 = f2;
                f2 = testFebonachi;
                if (arr[i] == testFebonachi) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }



    public static void Zadani3() {
        boolean test = true;
        int[] arr = {7, 10, 2, 20, 7, 30, 17, 21, 23, 31};
        for (int i = 0; i < arr.length; i++) {
            test = true;
            for (int j = 2; j < arr[i] - 1 && test; j++) {
                if (arr[i] % j == 0 && arr[i] != j) {
                    test = false;

                }

            }
            if (test == true) {
                System.out.println(arr[i]);
            }
        }
    }

    public static boolean Poruwnanie(int []arr1, int[]arr2){

        boolean poruwnanie= arr1.length== arr2.length ? true :false;
        return poruwnanie;
    }





    public static void zadanie3() {
        short a = 22357; //int    s1=0b 01 01 01 11 01 01 01 01;
        int check = 0b1; //

        int testKON = a & check;
        boolean answer1 = testKON == 0 ? true : false;
        System.out.println("1" + answer1);
        boolean answer2 = (a >> 2 & check) == 0 ? true : false;
        System.out.println("2" + answer2);
        boolean answer3 = (a >> 4 & check) == 0 ? true : false;

        System.out.println("3" + answer3);


        int reszta = a % 21;
        System.out.println("reszta: " + reszta);
        boolean parz = ((a | reszta) & 0b1) == 1 ? true : false;
        System.out.println(parz);
    }




    public static void tablica3(int a,int[] tab1 ,int [] tab2) {

        if (a < 0&&tab2.length!= tab1.length) {

            int size;

            if (tab1.length > tab2.length) {
                size = tab2.length;
            } else {
                size = tab1.length;
            }

            System.out.println(size + "=");


            int[] tab3 = new int[size+1];

            for (int i = 0; i < tab3.length-1; i++) {

                tab3[i] = tab1[i] + tab2[i];

                tab3[size]=a;
            }

            System.out.println(Arrays.toString(tab3));
        }

        else if(a>=0 && tab2.length!= tab1.length){
            int size;
            if(tab1.length> tab2.length) {
                size = tab1.length - tab2.length;
                int[] tab3 = new int[size+1];
                for (int i = tab2.length , k=0; i <tab1.length ; i++) {
                    tab3[k] = tab1[i];
                    k++;
                    tab3[size]=a;
                }
                System.out.println(Arrays.toString(tab3)+"tab1 bolshe");

            }
            else {
                size=tab2.length- tab1.length;
                int [] tab3=new int[size+1];
                for(int i =tab1.length,k=0;i< tab2.length;i++) {
                    tab3[k] =tab2[i];
                    k++;
                    tab3[size]=a;
                }

                System.out.println(Arrays.toString(tab3)+"tab2 bolsze");
            }

        }else {
            int size=tab1.length;
            int[] tab3=new int[size+1];
            for(int i=0;i< tab1.length-1;i++){
                tab3[i]=0;
                tab3[size]=a;

            }
            System.out.println(Arrays.toString(tab3));
        }



    }






    public static boolean mojaMetoda(char[] dane, char[] poszukiwane){
        int found = 0;
        for (int i = 0; i < dane.length && found < 3; i++){
            boolean isMatched = false;
            for (int j = 0; j < poszukiwane.length && !isMatched; j++){
                if (poszukiwane[j] == dane[i]){
                    found++;
                    isMatched = true;
                }
            }
        }
        return found == 3;
    }

    public static void zadanie4() {

        int[][] tab = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1,},
        };
        int count = 0;
        for (int[] row : tab) {
            count += row.length;

        }
        int[] tabX = new int[count];
        System.out.println(count);
        int countJ =0;
        for (int i = 0; i < tab.length; i++) {


            for (int j = 0;  j < tab[i].length; j++) {

                tabX[countJ] = tab[i][j];
                countJ++;
            }
        }
        System.out.println(Arrays.toString(tabX));


    }
}







