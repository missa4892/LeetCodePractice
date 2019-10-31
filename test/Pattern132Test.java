import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Pattern132Test {

    @Test
    public void shouldReturnTrueInScenarioOne() {
        Pattern132 pattern132 = new Pattern132();
        int[] intArr = {-1, 4, 3, 2};
        boolean hasPattern = pattern132.find132pattern(intArr);
        assertEquals(hasPattern, true);
    }

    @Test
    public void shouldReturnTrueInScenarioTwo() {
        Pattern132 pattern132 = new Pattern132();
        int[] intArr = {1, 2, 3, 4};
        boolean hasPattern = pattern132.find132pattern(intArr);
        assertEquals(hasPattern, false);
    }

    @Test
    public void shouldReturnTrueInScenarioThree() {
        Pattern132 pattern132 = new Pattern132();
        int[] intArr = {5, 1, 0, 3, 0, 2, 0};
        boolean hasPattern = pattern132.find132pattern(intArr);
        assertEquals(hasPattern, true);
    }

    @Test
    public void shouldReturnTrueInScenarioFour() {
        Pattern132 pattern132 = new Pattern132();
        int[] intArr = {-2,1,-2};
        boolean hasPattern = pattern132.find132pattern(intArr);
        assertEquals(hasPattern, false);
    }

    @Test
    public void shouldReturnTrueInScenarioFive() {
        Pattern132 pattern132 = new Pattern132();
        int[] intArr = {-2,1,2,-2,1,2};
        boolean hasPattern = pattern132.find132pattern(intArr);
        assertEquals(hasPattern, true);
    }

}