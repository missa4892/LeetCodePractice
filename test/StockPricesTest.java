import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockPricesTest {

    @Test
    void test1() {
        int[] stock_prices = {10, 7, 5, 8, 11, 9};
        int result = StockPrices.getMaxProfit(stock_prices);
        assertEquals(6, result);
    }

    @Test
    void test2() {
        int[] stock_prices = {5, 5, 5, 5, 5};
        int result = StockPrices.getMaxProfit(stock_prices);
        assertEquals(0, result);
    }

    @Test
    void test3() {
        int[] stock_prices = {5, 4, 3, 2, 1};
        int result = StockPrices.getMaxProfit(stock_prices);
        assertEquals(-1, result);
    }

}