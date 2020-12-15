package pl.basics6.ppj;

import java.util.Arrays;

public class PPJnew {

    public static void main(String[] args) {
        int[] tablica1 = {1, 2, 3, 4};
        int[] tablica2 = {0, 1, 2, 3};
        tablica3(-1, tablica1, tablica2);


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







