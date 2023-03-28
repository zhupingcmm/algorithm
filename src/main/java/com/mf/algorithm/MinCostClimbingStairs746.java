package com.mf.algorithm;

public class MinCostClimbingStairs746 {
    public static void main(String[] args) {
        MinCostClimbingStairs746 minCostClimbingStairs746 = new MinCostClimbingStairs746();
        System.out.println(minCostClimbingStairs746.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }

    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int [] dp = new int[len + 1];

        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= len; i++) {
            dp[i] = Math.min(dp[i-2] + cost[i-2], dp[i-1] + cost[i-1]);
        }

        return dp[len];

    }
}
