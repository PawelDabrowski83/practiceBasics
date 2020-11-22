package pl.basics6.ppj;

import java.util.List;

public class Homework01 {

    public static void main(String[] args) {
        int s23551;
//        int 3abc;
//        int @test;
//        int void;
//        int null;
        List<Integer> numbers = List.of(9, 2, 12, 10, 0, 1, 19, -3);
        for (int number : numbers){
            System.out.print("number: " + number);
            System.out.println(isEven(number));
        }

    }

    public static boolean isEven(int value){
        return (value & 1) == 0;
    }
}
