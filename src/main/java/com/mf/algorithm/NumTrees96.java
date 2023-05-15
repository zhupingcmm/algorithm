package com.mf.algorithm;

public class NumTrees96 {
    public static void main(String[] args) {
        NumTrees96 numTrees96 =  new NumTrees96();
        System.out.println(numTrees96.numTrees(3));
    }
    public int numTrees(int n) {
        int [] dp = new int[n +1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
}
