package pl.basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main13Test {

    @Test
    public void shouldSolutionWork() {
        assertEquals(7, Main13.solution(8, 0));
        assertEquals(6, Main13.solution(18, 2));
        assertEquals(10, Main13.solution(10, 10));
    }

    @Test
    public void shouldTravelWork() {
        assertEquals(5, Main13.travelSolution(new int[]{7, 3, 7, 3, 1, 3, 4, 1}));
        assertEquals(3, Main13.travelSolution(new int[]{2, 1, 1, 3, 2, 1, 1, 3}));
        assertEquals(6, Main13.travelSolution(new int[]{7, 5, 2, 7, 2, 7, 4, 7}));
    }
}
