package com.mf.algorithm;

public class MaxProfit309 {
    public static void main(String[] args) {
        MaxProfit309 maxProfit309 = new MaxProfit309();
        maxProfit309.maxProfit(new int[]{2,1});
    }
    public int maxProfit(int[] prices) {
        int m = prices.length;
        int n = 4;
        int [][] dp = new int[m][n];
        // 持有
        dp[0][0] = -prices[0];
        // 持续不持有
        dp[0][1] = 0;
        // 卖出
        dp[0][2] = 0;
        // 冷冻期
        dp[0][3] = 0;

        for (int i = 1; i < m; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] -prices[i]);
            dp[i][0] = Math.max(dp[i-1][3] -prices[i], dp[i][0]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][3]);
            dp[i][2] = dp[i-1][0] + prices[i];
            dp[i][3] = dp[i-1][2];

        }
        int [] num = dp[m-1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            max = Math.max(max, num[i]);
        }
        return max;

    }
}
