package com.mf.algorithm;

public class MaxProfit188 {
    public static void main(String[] args) {
        MaxProfit188 maxProfit188 = new MaxProfit188();
        maxProfit188.maxProfit(2, new int[]{3,2,6,5,0,3});
    }
    public int maxProfit(int k, int[] prices) {
        int m = prices.length;
        int n = 2*k + 1;
        int [][] dp = new int[m][n];

        //
        dp[0][0] = 0;

        for (int i = 0; i < n; i++) {
            if ( i % 2 != 0) {
                dp[0][i] = -prices[0];
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (j % 2 != 0) dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-1] - prices[i]);
                if (j % 2 ==0)  dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1] + prices[i]);
            }
        }

        return dp[m-1][n-1];

    }
}
