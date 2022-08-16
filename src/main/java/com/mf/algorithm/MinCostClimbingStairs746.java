package com.mf.algorithm;

public class MinCostClimbingStairs746 {
    public static void main(String[] args) {
        MinCostClimbingStairs746 minCostClimbingStairs746 = new MinCostClimbingStairs746();
        minCostClimbingStairs746.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1});
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int [] dp = new int[n];
        dp[0] =cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i], dp[i-1]) + cost[i];
        }
        return Math.min(dp[n-1], dp[n-2]);
    }
}
