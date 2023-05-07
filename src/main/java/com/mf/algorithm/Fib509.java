package com.mf.algorithm;

public class Fib509 {
    public static void main(String[] args) {
        Fib509 fib509 = new Fib509();
        System.out.println(fib509.fib(4));
    }
    public int fib(int n) {
        if (n < 2) return n;
        int [] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
