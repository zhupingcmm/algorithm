package com.mf.algorithm;

public class Fib {

    public static void main(String[] args) {
        Fib fib = new Fib();
        int result = fib.fib(10);
        System.out.println(result);
    }
    public int fib (int n) {
        return n<=1 ? n : fib(n-1) + fib(n-2);
    }

//    public int fib (int n) {
//        int [] dp = new int[n];
//        dp[0] = 1;
//        dp[1] = 1;
//        for (int i = 2; i < n; i++) {
//            dp[i] = dp[i -1] + dp[i-2];
//        }
//
//        return dp[n -1];
//    }
}
