import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumMinimumElementsofSubarraysTest {

    @Test
    void test1() {
        int[] A = {3,1,2,4};

        int result = SumMinimumElementsofSubarrays.sumSubarrayMins(A);
        assertEquals(17, result);
    }

    @Test
     void test2() {
        int[] A = {1,2,3,4};

        int result = SumMinimumElementsofSubarrays.sumSubarrayMins(A);
        assertEquals(20, result);
    }

}