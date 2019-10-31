public class StockPrices {

    /*
            [10, 7, 5, 8, 11, 9]

     */
    public static int getMaxProfit(int[] stockPrices) {

        int minPrice = stockPrices[0];
        int max_profit = Integer.MIN_VALUE;
        for (int i = 1; i < stockPrices.length; i++) {
            int current_price = stockPrices[i];
            int potential_profit = current_price - minPrice;

            max_profit = Math.max(max_profit, potential_profit);

            minPrice = Math.min(current_price, minPrice);
        }
        return max_profit;

    }

    public static int getMaxProfit1(int[] stockPrices) {

        int[] min = getMinsAtIndex(stockPrices);
        int[] max = getMaxsAtIndex(stockPrices);

        int max_profit = Integer.MIN_VALUE;
        for (int i = 0; i < stockPrices.length - 1; i++) {
            int profit = max[i+1] - min[i];
            if (profit > max_profit) {
                max_profit = profit;
            }
        }
        return max_profit;

    }

    private static int[] getMaxsAtIndex(int[] stockPrices) {
        int[] max = new int[stockPrices.length];
        int max_so_far = stockPrices[stockPrices.length - 1];
        max[stockPrices.length - 1] = max_so_far;
        for (int i = stockPrices.length - 1; i >= 0; i--) {
            if (max_so_far < stockPrices[i]) {
                max_so_far = stockPrices[i];
            }
            max[i] = max_so_far;
        }
        return max;
    }

    private static int[] getMinsAtIndex(int[] stockPrices) {
        int[] min = new int[stockPrices.length];
        int min_so_far = stockPrices[0];
        min[0] = min_so_far;
        for (int i = 1; i < stockPrices.length; i++) {
            if (min_so_far > stockPrices[i]) {
                min_so_far = stockPrices[i];
            }
            min[i] = min_so_far;
        }
        return min;
    }
}
