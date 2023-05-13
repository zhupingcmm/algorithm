package com.mf.algorithm;

public class MaxProfit122 {
    public static void main(String[] args) {
        MaxProfit122 maxProfit122 = new MaxProfit122();
        maxProfit122.maxProfit(new int[]{7,1,5,3,6});
    }

    public int maxProfit(int[] prices) {

        int len = prices.length;
        int [][] dp = new int[len][2];

       dp[0][0] = 0;
       dp[0][1] = -prices[0];

        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
        }

        return dp[len-1][0];
    }

//    public int maxProfit(int[] prices) {
//        int result = 0;
//        for (int i = 1; i < prices.length; i++) {
//
//            int res = prices[i] - prices[i-1];
//
//            if (res > 0) {
//                result += res;
//            }
//
//        }
//
//        return result;
//
//    }
}
