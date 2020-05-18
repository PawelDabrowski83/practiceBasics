package pl.basics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main16_menu {

    private static final String COMMAND_LINE = "Input the action (add, remove, import, export, ask, exit):";
    private static final String EXIT_MESSAGE = "Bye bye!";
    private static final String ADD_CARD = "The card:";
    private static final String CARD_DUPLICATE = "The card \"%s\" already exists." + System.lineSeparator();
    private static final String ADD_DEFINITION = "The definition of the card:";
    private static final String DEFINITION_DUPLICATE = "The definition \"%s\" already exists." + System.lineSeparator();
    private static final String CARD_ADDED = "The pair (\"%s\":\"%s\") has been added." + System.lineSeparator();
    private static final String REMOVE_CARD = "The card:";
    private static final String CARD_REMOVED = "The card has been removed.";
    private static final String CARD_NOT_EXISTING = "Can't remove \"%s\": there is no such card." + System.lineSeparator();
    private static final String IMPORT_CARD = "File name:";
    private static final String IMPORT_FAIL = "File not found.";
    private static final String IMPORT_SUCCESS = "%d cards have been loaded." + System.lineSeparator();
    private static final Pattern CARD_DEFINITION_PATTERN = Pattern.compile("\"(.+)\":\"(.+)\"");
    private static final String EXPORT_CARD = "File name:";
    private static final String EXPORT_SUCCESS = "%d cards have been saved." + System.lineSeparator();
    private static final String ASK_HOW_MANY = "How many times to ask?";
    private static final String ASK_QUESTION = "Print the definition of \"%s\":" + System.lineSeparator();
    private static final String ASK_QUESTION_CORRECT = "Correct answer.";
    private static final String ASK_QUESTION_FAIL = "Wrong answer. The correct one is \"%s\", you've just written the definition of \"%s\"." + System.lineSeparator();
    private static final String ASK_QUESTION_WRONG = "Wrong answer. The correct one is \"%s\"." + System.lineSeparator();

    public static void main(String[] args) {

        File file = new File("null.txt");

        Map<String, String> cards = new HashMap<>();
        System.out.println(COMMAND_LINE);

        try (Scanner scanner = new Scanner(System.in)) {
            String input = "";
            while (scanner.hasNextLine() && !"exit".equalsIgnoreCase(input)) {
                input = scanner.nextLine().trim().toLowerCase();

                switch (input) {
                    case "add":
                        addCard(scanner, cards);
                        break;
                    case "remove":
                        removeCard(scanner, cards);
                        break;
                    case "import":
                        importCards(scanner, cards);
                        break;
                    case "export":
                        exportCards(scanner, cards);
                        break;
                    case "ask":
                        askQuestion(scanner, cards);
                        break;
                    case "exit":
                        System.out.println(EXIT_MESSAGE);
                        return;
                    default:
                        System.out.println();
                        System.out.println(COMMAND_LINE);
                }
            }
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
                System.out.println();
                System.out.println(COMMAND_LINE);
                return;
            }
            card = scanner.nextLine().trim().toLowerCase();
        }

        System.out.println(ADD_DEFINITION);
        String definition = scanner.nextLine().trim().toLowerCase();

        if (definition.isEmpty() || cards.containsValue(definition)) {
            if (definition.isEmpty()) {
                System.out.println(ADD_DEFINITION);
            } else {
                System.out.printf(DEFINITION_DUPLICATE, definition);
                System.out.println();
                System.out.println(COMMAND_LINE);
                return;
            }
            definition = scanner.nextLine().trim().toLowerCase();
        }
        cards.put(card, definition);
        System.out.printf(CARD_ADDED, card, definition);
        System.out.println();
        System.out.println(COMMAND_LINE);
    }

    public static void removeCard(Scanner scanner, Map<String, String> cards) {

        System.out.println(REMOVE_CARD);
        String card = scanner.nextLine().trim().toLowerCase();

        if (card.isEmpty() || !cards.containsKey(card)) {
            if (card.isEmpty()) {
                System.out.println(REMOVE_CARD);
            } else {
                System.out.printf(CARD_NOT_EXISTING, card);
                return;
            }
            System.out.println(CARD_REMOVED);
        }
        System.out.println();
        System.out.println(COMMAND_LINE);
    }

    public static void importCards(Scanner scanner, Map<String, String> cards) {

        System.out.println(IMPORT_CARD);
        String fileName = scanner.nextLine().trim();

        File file = new File(fileName);
        int count = 0;

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String newLine = fileScanner.nextLine();
                if (newLine.matches(CARD_DEFINITION_PATTERN.pattern())) {
                    Matcher matcher = CARD_DEFINITION_PATTERN.matcher(newLine);
                    matcher.matches(); // necessary to check matcher.group
                    cards.put(matcher.group(1), matcher.group(2));
                    count++;
                }
            }
            System.out.printf(IMPORT_SUCCESS, count);
        } catch (IOException e) {
            System.out.println(IMPORT_FAIL);
        }
        System.out.println();
        System.out.println(COMMAND_LINE);
    }

    public static void exportCards(Scanner scanner, Map<String, String> cards) {

        System.out.println(EXPORT_CARD);
        String fileName = scanner.nextLine().trim();

        File file = new File(fileName);
        int count = 0;

        try (FileWriter fileWriter = new FileWriter(file)) {
            for (Map.Entry<String, String> record : cards.entrySet()) {
                fileWriter.write("\"" + record.getKey() + "\":\"" + record.getValue() + "\"" + System.lineSeparator());
                fileWriter.flush();
                count++;
            }
        } catch (IOException e) {
            System.out.println(IMPORT_FAIL);
            return;
        }
        System.out.printf(EXPORT_SUCCESS, count);
        System.out.println();
        System.out.println(COMMAND_LINE);
    }

    public static void askQuestion(Scanner scanner, Map<String, String> cards) {

        System.out.println(ASK_HOW_MANY);

        String numberAsString = scanner.nextLine().trim();
        int number = 0;
        try {
            number = Integer.parseInt(numberAsString);
        } catch (NumberFormatException e) {
            System.out.println("Cannot parse " + numberAsString);
        }

        Map<Integer, String> auxilaryMap = new HashMap<>();

        int counter = 0;
        for (String key : cards.keySet()) {
            auxilaryMap.put(counter, key);
            counter++;
        }
//        Iterator<Map.Entry<Integer, String>> iterator = auxilaryMap.entrySet().iterator();
        Random random = new Random();

        while (number > 0) {
            int randomized = random.nextInt(counter);
            String cardEntry = auxilaryMap.get(randomized);
            String definitionEntry = cards.get(cardEntry);

            System.out.printf(ASK_QUESTION, cardEntry);
            String answer = scanner.nextLine().trim();

            if (definitionEntry.equalsIgnoreCase(answer)) {
                System.out.println(ASK_QUESTION_CORRECT);
            } else if (cards.containsValue(answer)) {
                String cardFoundByDefinition = cards.entrySet().stream()
                        .filter(n -> n.getValue().equalsIgnoreCase(answer))
                        .map(Map.Entry::getKey)
                        .collect(Collectors.joining());
                System.out.printf(ASK_QUESTION_FAIL, definitionEntry, cardFoundByDefinition);
            } else {
                System.out.printf(ASK_QUESTION_WRONG, definitionEntry);
            }
            number--;

        }
        System.out.println();
        System.out.println(COMMAND_LINE);
    }
}
