package com.mf.algorithm;

public class MinCostClimbingStairs746 {
    public static void main(String[] args) {
        MinCostClimbingStairs746 minCostClimbingStairs746 = new MinCostClimbingStairs746();
        System.out.println(minCostClimbingStairs746.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }

    public int minCostClimbingStairs(int[] cost) {
        int m = cost.length;
        // dp[i] 表示 cost 下标 为 i  最小花费
        int [] dp = new int[m + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= m; i++) {
            dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
        }

        return dp[m];
    }
}
