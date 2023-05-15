package com.mf.algorithm;

public class IntegerBreak343 {
    public static void main(String[] args) {
        IntegerBreak343 integerBreak343 = new IntegerBreak343();
        int val = integerBreak343.integerBreak(10);
        System.out.println(val);

    }
    public int integerBreak(int n) {
        int [] dp = new int[n+1];
        
        dp [0] = 0;
        dp[1] = 0;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i] = Math.max(dp[i], (i-j)*j);
                dp[i] = Math.max(dp[i], dp[i-j] * j );
            }
        }

        return dp[n];

    }
}
