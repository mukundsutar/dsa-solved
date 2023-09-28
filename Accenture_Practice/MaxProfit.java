package Accenture_Practice;

public class MaxProfit {
    public static int maxProfitDay(int prices[]) {
        int curr = 0;
        int best=0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                curr = prices[i+1] - prices[i];
                if (curr>best) {
                    best=curr;
                }
            }
        }
        return best;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 6, 4, 3};

        System.out.println(maxProfitDay(prices));
    }
}
