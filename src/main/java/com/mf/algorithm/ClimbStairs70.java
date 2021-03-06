package com.mf.algorithm;

public class ClimbStairs70 {

    public static void main(String[] args) {
        ClimbStairs70 climbStairs70 = new ClimbStairs70();
        climbStairs70.climbStairs(3);

    }

    public int climbStairs(int n) {
        if (n < 2) return n;
        int [] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
