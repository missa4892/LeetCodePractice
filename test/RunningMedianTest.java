import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningMedianTest {

    @Test
    void test1() {

        int[] stream = {5, 15, 1, 3};
        double[] resultArr = RunningMedian.runningMedian(stream);
        assertEquals(4, resultArr.length);
        assertEquals(5.0, resultArr[0]);
        assertEquals(10.0, resultArr[1]);
        assertEquals(5.0, resultArr[2]);
        assertEquals(4.0, resultArr[3]);
    }

}