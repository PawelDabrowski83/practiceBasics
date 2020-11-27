package pl.basics6.ppj;

import java.util.Scanner;

public class PPJnew {

    public static void main(String[] args) {
//        System.out.println("wpisz liczbe");
//        Scanner nombre = new Scanner(System.in);
//        int szkaner = nombre.nextInt();
//        int s = 7;
//        while( szkaner != 7 ){
//
//
//            if(szkaner > 7){
//                System.out.println("za dużo");
//                System.out.println("wpisz nowa liczbe");
//            } else {
//                System.out.println("za mało");
//                System.out.println("wpisz nowa liczbe");
//
//            }
//            szkaner = nombre.nextInt();
//        }
//
//        System.out.print("koniec");

        int loops = 100;
        while(loops-- > 0){
            double random = Math.random() * 20;
            int casted = (int) random;
            System.out.println("random: " + random + ", casted to int: " + casted);
        }



    }

}
