import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinSubArrayLenTest {

    @Test
    void test1() {
        MinSubArrayLen testSub = new MinSubArrayLen();
        assertEquals(2, testSub.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    @Test
    void test2() {
        MinSubArrayLen testSub = new MinSubArrayLen();
        assertEquals(0, testSub.minSubArrayLen(24, new int[]{2, 3, 1, 2, 4, 3}));
    }

    @Test
    void test3() {
        MinSubArrayLen testSub = new MinSubArrayLen();
        assertEquals(3, testSub.minSubArrayLen(11, new int[]{1,2,3,4,5}));
    }
}