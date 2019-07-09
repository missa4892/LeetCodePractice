import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class ClimbingStairsTest {

    @Test
    void shouldReturnNumberOfWaysWithBaseCase() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int countWays = climbingStairs.countWays(3);
        assertEquals(3, countWays);
    }

    @Test
    void shouldReturnNumberOfWays() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int countWays = climbingStairs.countWays(4);
        assertEquals(7, countWays);
    }

    @Test
    void shouldNotRunIntoTimeExceeded() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertTimeout(Duration.ofSeconds(3), () -> climbingStairs.countWays(37));
    }
}