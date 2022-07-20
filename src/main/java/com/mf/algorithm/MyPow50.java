package com.mf.algorithm;

public class MyPow50 {
    public static void main(String[] args) {

    }
    public double myPow(double x, int n) {
        return  n > 0 ? quick(x, n) : 1.0 /quick(x, -n);
    }

    private double quick(double x, int n) {
        if (n == 0) return 1.0;
        double target = quick(x, n/2);
        return n % 2 == 0 ? target * target : target * target * x;
    }
}
