package com.mf.algorithm;

public class MaxProfit122 {
    public static void main(String[] args) {
        MaxProfit122 maxProfit122 = new MaxProfit122();
        maxProfit122.maxProfit(new int[]{7,1,5,3,6});
    }

//    public int maxProfit(int[] prices) {
//        int n = prices.length;
//        if (n<=1) return 0;
//        int [] dp = new int[2];
//        //0-持有股票
//        //1-不持有股票
//        dp[0] = -prices[0];
//        for (int price : prices) {
//            dp[0] = Math.max(dp[0], dp[1] - price);
//            dp[1] = Math.max(dp[1], dp[0] + price);
//        }
//        return dp[1];
//    }

    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {

            int res = prices[i] - prices[i-1];

            if (res > 0) {
                result += res;
            }

        }

        return result;

    }
}
