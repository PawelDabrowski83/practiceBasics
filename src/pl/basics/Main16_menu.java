package pl.basics;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main16_menu {

    private static final String COMMAND_LINE = "Input the action (add, remove, import, export, ask, exit):";
    private static final String[] OPERATIONS = {"add", "remove", "import", "export", "ask", "exit"};
    private static final String EXIT_MESSAGE = "Bye bye!";
    private static final String ADD_CARD = "The card:";
    private static final String CARD_DUPLICATE = "The card \"%s\" already exists.";
    private static final String ADD_DEFINITION = "The definition of the card:";
    private static final String DEFINITION_DUPLICATE = "The definition \"%s\" already exists.";
    private static final String CARD_ADDED = "The pair (\"%s\":\"%s\") has been added.";
    private static final String REMOVE_CARD = "The card:";
    private static final String CARD_REMOVED = "The card has been removed.";
    private static final String CARD_NOT_EXISTING = "Can't remove \"%s\": there is no such card.";

    public static void main(String[] args) {

        File file = new File("null.txt");

        Map<String, String> cards = new HashMap<>();
        System.out.println(COMMAND_LINE);

        try (Scanner scanner = new Scanner(file)) {
            String input = "";
            while (scanner.hasNextLine()) {
                input = scanner.nextLine().trim().toLowerCase();

                switch (input) {
                    case "add":
                        addCard(scanner, cards);
                        break;
                    case "remove":

                        break;
                    case "import":

                        break;
                    case "export":

                        break;
                    case "ask":

                        break;
                    case "exit":
                        System.out.println(EXIT_MESSAGE);
                        return;
                    default:
                        System.out.println(COMMAND_LINE);
                }
            }
        } catch (IOException e) {
            System.out.println("File not found.");
        }
    }

    public static void addCard(Scanner scanner, Map<String, String> cards) {

        System.out.println(ADD_CARD);
        String card = scanner.nextLine().trim().toLowerCase();

        while (card.isEmpty() || cards.containsKey(card)) {
            if (card.isEmpty()) {
                System.out.println(ADD_CARD);
            } else {
                System.out.printf(CARD_DUPLICATE, card);
            }
            card = scanner.nextLine().trim().toLowerCase();
        }

        System.out.println(ADD_DEFINITION);
        String definition = scanner.nextLine().trim().toLowerCase();

        while (definition.isEmpty() || cards.containsValue(definition)) {
            if (definition.isEmpty()) {
                System.out.println(ADD_DEFINITION);
            } else {
                System.out.printf(DEFINITION_DUPLICATE, definition);
            }
            definition = scanner.nextLine().trim().toLowerCase();
        }
        cards.put(card, definition);
        System.out.printf(CARD_ADDED, card, definition);
    }

    public static void removeCard(Scanner scanner, Map<String, String> cards) {

        System.out.println(REMOVE_CARD);
    }
}
