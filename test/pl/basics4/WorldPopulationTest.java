package pl.basics4;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class WorldPopulationTest {

    @Test
    public void shouldReadDataFromFileWork() {
        String filePath = "files/dataset_91069.txt";
        File file = new File(filePath);
        WorldPopulation worldPopulation = new WorldPopulation();
        Map<Integer, Long> datamap = new HashMap<>();
        try {
            datamap = worldPopulation.readDataFromFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(3_712_697_742L, datamap.getOrDefault(1970, 0L).longValue());
        assertNotEquals(3_712_697_741L, datamap.getOrDefault(1970, 0L).longValue());
        assertEquals(4_160_185_010L, datamap.getOrDefault(1976, 0L).longValue());
    }
}
