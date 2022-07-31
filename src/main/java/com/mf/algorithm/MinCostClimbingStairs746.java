package com.mf.algorithm;

public class MinCostClimbingStairs746 {
    public static void main(String[] args) {
        int [] cost =new int[]{10,15,20};
        MinCostClimbingStairs746 minCostClimbingStairs746 = new MinCostClimbingStairs746();
        minCostClimbingStairs746.minCostClimbingStairs(new int[]{10,15,20});
    }

    public int minCostClimbingStairs(int[] cost) {

        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2;i < dp.length; i++){
            dp[i] = Math.min(dp[i - 1] ,dp[i - 2]) + cost[i];
        }
        return Math.min(dp[cost.length - 1],dp[cost.length - 2]);


    }
}
