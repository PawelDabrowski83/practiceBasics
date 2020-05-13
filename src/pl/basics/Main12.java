package pl.basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of cards:");
        int numberOfCards = input.nextInt();
        input.nextLine();
        String[] cards = new String[numberOfCards];
        String[] definitions = new String[numberOfCards];
        Map<String, String> flashcards = new HashMap<>();
        int count=0;
        while(count<numberOfCards)
        {
            System.out.println("The card #"+(count+1)+":");
            String cardInput = input.nextLine();
            while (checkDuplicate(cardInput, cards)) {
                System.out.println("The card \"" + cardInput + "\" already exists. Try again:");
                cardInput = input.nextLine();
            }
            cards[count] = cardInput;

            System.out.println("The definition of the card #"+(count+1)+":");
            String definitionInput = input.nextLine();
            while (checkDuplicate(definitionInput, definitions)) {
                System.out.println("The definition \"" + definitionInput + "\" already exists. Try again:");
                definitionInput = input.nextLine();
            }
            definitions[count]= definitionInput;
            flashcards.put(cardInput, definitionInput);
            count++;
        }
        for(int i=0; i<numberOfCards; i++)
        {
            System.out.println("Print the definition of \""+cards[i]+"\":");
            String answer = input.nextLine();
            if(answer.equalsIgnoreCase(definitions[i]))
            {
                System.out.println("Correct answer.");
            }
            else
            {
                System.out.println("Wrong answer. The correct one is \""+definitions[i]+"\".");
            }


        }
    }

    public static boolean checkDuplicate(String str, String[] array) {
        return Arrays.stream(array).anyMatch(str::equalsIgnoreCase);
    }

    public static String checkDefinition(String input, Map<String, String> flashcards) {
        return flashcards.entrySet().stream().filter(n -> n.getValue().equalsIgnoreCase(input)).map(Map.Entry::getKey).collect(Collectors.joining());
    }

}
