package pl.basics;

import org.junit.Test;
import static pl.basics.Main14.ExerciseInput;

public class Main14Test {

    @Test
    public void shouldGetLowestSeedMaximumWork() {

        // given
        ExerciseInput input = new ExerciseInput(1, 5, 5, 100);
        ExerciseInput input2 = new ExerciseInput(234, 678, 10, 10);

        // when
//        Main14.getLowestSeedMaximum(input);
        Main14.getLowestSeedMaximum(input2);
    }


}
