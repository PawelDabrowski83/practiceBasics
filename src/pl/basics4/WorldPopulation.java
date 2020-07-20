package pl.basics4;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorldPopulation {

    protected static final Pattern DATA_INPUT = Pattern.compile("(\\d{4})\\s+(\\S+)");
    protected static final Logger logger = Logger.getLogger(WorldPopulation.class.getName());
    protected static FileHandler fh;

    protected Map<Integer, Long> worldPopulation;

    public Map<Integer, Long> getWorldPopulation() {
        return worldPopulation;
    }

    public void setWorldPopulation(Map<Integer, Long> worldPopulation) {
        this.worldPopulation = worldPopulation;
    }

    public Map<Integer, Long> readDataFromFile(File file) throws IOException {
        logger.setLevel(Level.FINE);
        try {
            fh = new FileHandler("files/logs/WorldPopulation.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.fine("readDataFromFile: " + file.getName());

        Map<Integer, Long> targetMap = new HashMap<>();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            logger.fine(nextLine);
            Matcher matcher = DATA_INPUT.matcher(nextLine);
            if (matcher.find()) {
                int year = 0;
                long population = 0;
                try {
                    year = Integer.parseInt(matcher.group(1));
                    population = Long.parseLong(matcher.group(2).replaceAll(",", ""));
                    logger.fine(String.format("parsed: year %d and population %d", year, population));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    logger.fine(String.format("ParsingError with: %s. Result: year %d and population %d", nextLine, year, population));
                }
                targetMap.put(year, population);
            }
        }
        return targetMap;
    }
}
