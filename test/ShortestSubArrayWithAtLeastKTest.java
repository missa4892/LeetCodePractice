import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestSubArrayWithAtLeastKTest {
    @Test
    void test1() {
        int actual = ShortestSubArrayWithAtLeastK.shortestSubarray(new int[]{1, 7, 1, 2, 7}, 9);
        assertEquals(2, actual);
    }

    @Test
    void test2() {
        int actual = ShortestSubArrayWithAtLeastK.shortestSubarray(new int[]{48,99,37,4,-31}, 140);
        assertEquals(2, actual);
    }

    @Test
    void test3() {
        int actual = ShortestSubArrayWithAtLeastK.shortestSubarray(new int[]{84,-37,32,40,95}, 167);
        assertEquals(3, actual);
    }
}