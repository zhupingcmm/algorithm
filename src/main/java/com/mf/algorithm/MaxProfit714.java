package com.mf.algorithm;

public class MaxProfit714 {
    public static void main(String[] args) {
        MaxProfit714 maxProfit714 = new MaxProfit714();
        maxProfit714.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2);
    }
    public int maxProfit(int[] prices, int fee) {
        int m = prices.length;
        int[][] dp = new int[m][2];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < m; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] + prices[i] - fee);
        }

        return Math.max(dp[m-1][0], dp[m-1][1]);

    }

}
