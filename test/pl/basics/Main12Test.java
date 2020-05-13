package pl.basics;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Main12Test {

    @Test
    public void shouldCheckDefinitionWork() {

        // given
        String answer = "black";
        Map<String, String> definitions = new HashMap<>();
        definitions.put("black", "white");
        definitions.put("red", "blue");
        definitions.put("grey", "grey");
        definitions.put("brown", "yellow");
        definitions.put("white", "black");

        String expected = "white";

        // when
        String actual = Main12.checkDefinition(answer, definitions);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckDefinitionWorkGivenWrongAnswer() {

        // given
        String answer = "pink";
        Map<String, String> definitions = new HashMap<>();
        definitions.put("black", "white");
        definitions.put("red", "blue");
        definitions.put("grey", "grey");
        definitions.put("brown", "yellow");
        definitions.put("white", "black");

        String expected = "";

        // when
        String actual = Main12.checkDefinition(answer, definitions);

        // then
        assertEquals(expected, actual);
    }

}
