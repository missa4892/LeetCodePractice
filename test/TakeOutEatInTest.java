import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TakeOutEatInTest {

    @Test
    void test1() {
        TakeOutEatIn takeOutEatIn = new TakeOutEatIn();
        int[] takeOut = {1, 3, 5};
        int[] dineIn = {2, 4, 6};
        int[] servedOrders = {1, 2, 4, 6, 5, 3};

        boolean result = takeOutEatIn.isFirstComeFirstServed(takeOut, dineIn, servedOrders);

        assertFalse(result);
    }
}