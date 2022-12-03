package com.mf.algorithm;

public class IsPerfectSquare367 {
    public static void main(String[] args) {
        IsPerfectSquare367 isPerfectSquare367 = new IsPerfectSquare367();
        boolean result = isPerfectSquare367.isPerfectSquare(808201);
        System.out.println(result);

    }

    public boolean isPerfectSquare(int num) {

        long left = 0;
        long right = num;
        while (left <= right) {
            long mid = (left + right) / 2;
            long res =  mid * mid;
            if (res < num) {
                left = mid + 1;
            } else if (res > num) {
                right = mid -1;
            } else {
                return true;
            }
        }

        return false;
    }
}
