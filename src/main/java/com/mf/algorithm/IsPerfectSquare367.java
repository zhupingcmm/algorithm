package com.mf.algorithm;

public class IsPerfectSquare367 {
    public static void main(String[] args) {
        IsPerfectSquare367 isPerfectSquare367 = new IsPerfectSquare367();
        boolean result = isPerfectSquare367.isPerfectSquare(16);
        System.out.println(result);

    }

    public boolean isPerfectSquare(int num) {
        long left = 0;
        long right = num;
        long mid = 0;
        while (left <= right) {
            mid = (left + right) /2;
            long result = mid * mid;
            if (result == num) {
                return true;
            } else if (result < num) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return false;
    }
}
