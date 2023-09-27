package Arrays;

public class BuySellStocks {
    public static int buyAndSell(int prices[]) {
        int buyP = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > buyP) {
                int profit = prices[i] - buyP;

                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyP = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        System.out.println(buyAndSell(prices));
    }
}
