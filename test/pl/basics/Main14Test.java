package pl.basics;

import org.junit.Test;
import static pl.basics.Main14.ExerciseInput;

public class Main14Test {

    @Test
    public void shouldGetLowestSeedMaximumWork() {

        // given
        ExerciseInput input = new ExerciseInput(1, 5, 5, 100);

        // when
        Main14.getLowestSeedMaximum(input);
    }
}
