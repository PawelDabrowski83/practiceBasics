package pl.basics6.simpleCalculations;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(hash(78));
        System.out.println(hash(41));
        System.out.println(hash(33));

        String[] arrays = new String[]{"1", "3", "2"};
        List<String> temp = new ArrayList<>(Arrays.asList(arrays));
        Collections.sort(temp);

        BigInteger.valueOf(Long.parseLong("546"));



    }

    public static int hash(int k){
        return ((k * 7) + 42) % 71;
    }
}
