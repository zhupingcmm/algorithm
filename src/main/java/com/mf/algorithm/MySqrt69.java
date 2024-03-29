package com.mf.algorithm;

public class MySqrt69 {
    public static void main(String[] args) {
        MySqrt69 mySqrt69 = new MySqrt69();
        int a = mySqrt69.mySqrt(8);
        System.out.println(a);
    }

    public int mySqrt(int x) {
        if (x < 2) return x;
        long left = 0;
        long right = x;
        long mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            long res = mid * mid;
            if (res == x) {
                return (int) mid;
            } else if (res < x) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return (int) right;
    }
}
