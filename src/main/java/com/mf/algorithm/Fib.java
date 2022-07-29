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
}
