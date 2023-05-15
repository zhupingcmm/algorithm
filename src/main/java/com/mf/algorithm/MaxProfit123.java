package com.mf.algorithm;

public class MaxProfit123 {
    public static void main(String[] args) {
        MaxProfit123 maxProfit123 = new MaxProfit123();
        maxProfit123.maxProfit(new int[]{3,3,5,0,0,3,1,4});
    }

    public int maxProfit(int[] prices) {
        int m = prices.length;
        int [][] dp = new int[m][5];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[0][2] = 0;
        dp[0][3] = - prices[0];
        dp[0][4] = 0;

        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i-1][0];
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
            dp[i][2] = Math.max(dp[i-1][2], dp[i-1][1]  + prices[i]);
            dp[i][3] = Math.max(dp[i-1][3], dp[i-1][2] - prices[i]);
            dp[i][4] = Math.max(dp[i-1][4], dp[i-1][3] + prices[i]);
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            max = Math.max(dp[m-1][i], max);
        }

        return max;

    }
}
