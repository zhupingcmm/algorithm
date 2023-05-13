package com.mf.algorithm;

public class MaxProfit123 {
    public static void main(String[] args) {
        MaxProfit123 maxProfit123 = new MaxProfit123();
        maxProfit123.maxProfit(new int[]{3,2,6,5,0,3});
    }

    public int maxProfit(int[] prices) {
        int len = prices.length;
        // dp[i][0] 不操作
        // dp[i][1] 第一次持有
        // dp[i][2] 第一次不持有
        // dp[i][3] 第二次持有
        // dp[i][4] 第二次不持有
        int [][] dp = new int[len][5];
        dp[0][0] = 0;
        dp[0][1] = - prices[0];
        dp[0][2] = 0;
        dp[0][3] = - prices[0];
        dp[0][4] = 0;
        for (int i = 1; i < len; i++) {
            dp[i][0] = dp[i-1][0];
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
            dp[i][2] = Math.max(dp[i-1][2], dp[i-1][1] + prices[i]);
            dp[i][3] = Math.max( dp[i-1][3], dp[i-1][2] - prices[i]);
            dp[i][4] = Math.max(dp[i-1][4], dp[i-1][3] + prices[i]);
        }

        return Math.max(dp[len-1][2], dp[len-1][4]);

    }
}
