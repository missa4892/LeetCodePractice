import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    @Test
    void test1() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        assertEquals(3, mergeIntervals.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}}).length);
    }

}