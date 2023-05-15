package com.mf.algorithm;

public class MaxProfit121 {
    public static void main(String[] args) {
        MaxProfit121 maxProfit121 = new MaxProfit121();
        int result = maxProfit121.maxProfit(new int[]{7,1,5,3,6,4});

        System.out.println(result);
    }
    public int maxProfit(int[] prices) {
        int m = prices.length;
        int [][] dp = new int[m][2];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < m; i++) {
            dp[i][0] = Math.max(dp[i-1][0],  - prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] + prices[i]);
        }

        return Math.max(dp[m-1][0], dp[m-1][1]);
    }
}
