package pl.basics6;

import org.junit.jupiter.api.Test;
import pl.basics6.simpleCalculations.App;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void shouldTestWork(){
        App app = new App();
        assertEquals(321, app.rearrange(321));
    }
}
