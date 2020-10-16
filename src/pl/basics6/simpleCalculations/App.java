package pl.basics6.simpleCalculations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

    public int rearrange(int number){
        String numberAsString = String.valueOf(number);
        String[] digits = numberAsString.split("");
        List<String> digitsAsList = new ArrayList<>(Arrays.asList(digits));
        Collections.sort(digitsAsList);
        Collections.reverse(digitsAsList);
        int result = 0;
        try{
            result = Integer.parseInt(String.join("", digitsAsList));
        } catch (NumberFormatException e){
            e.printStackTrace();
        }

        return result;
    }

}
