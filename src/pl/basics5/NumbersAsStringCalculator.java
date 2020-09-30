package pl.basics5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersAsStringCalculator {
    public static String add(String number1, String number2) {
        if (number1 == null || number2 == null || number1.isBlank() || number2.isBlank()){
            return "";
        }
        int[] number1Digits = FactorialString.convertStringToIntArray(number1);
        int[] number2Digits = FactorialString.convertStringToIntArray(number2);
        List<Integer> digits1 = Arrays.stream(number1Digits).boxed().collect(Collectors.toList());
        List<Integer> digits2 = Arrays.stream(number2Digits).boxed().collect(Collectors.toList());
        Collections.reverse(digits1);
        Collections.reverse(digits2);
        List<Integer> result = new ArrayList<>();
        int longest = Math.max(digits1.size(), digits2.size());
        int remainder = 0;
        for (int i = 0; i < longest; i++){
            int currentDigit = getIfExist(digits1, i) + getIfExist(digits2, i) + remainder;
            if (currentDigit > 9){
                remainder = currentDigit / 10;
                currentDigit = currentDigit % 10;
            }
            result.add(currentDigit);
        }
        if (remainder > 0){
            result.add(remainder);
        }
        Collections.reverse(result);
        return result.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static int getIfExist(List<Integer> list, int index){
        if (index >= list.size()){
            return 0;
        }
        return list.get(index);
    }


}
