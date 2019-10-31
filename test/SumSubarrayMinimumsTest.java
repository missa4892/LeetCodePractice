import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumSubarrayMinimumsTest {

    @Test
    void test1() {
        int[] arr = {3,1,2,4};
        assertEquals(17, SumSubarrayMinimums.sumSubarrayMins(arr));
    }

    @Test
    void test2() {
        int[] arr = {3,1,2,4,5};
        assertEquals(30, SumSubarrayMinimums.sumSubarrayMins(arr));
    }
}