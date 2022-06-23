package com.mf.algorithm;

public class minCostClimbingStairs746 {
    public static void main(String[] args) {
        int [] cost =new int[]{10,15,20};
    }

    public int minCostClimbingStairs(int[] cost) {

        int length = cost.length;
        int dp[] = new int[length];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <length ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
//            Math.max()
        }
        return 0;

    }
}
