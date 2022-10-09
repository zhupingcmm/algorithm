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
        while (left<=right) {
            mid = (right + left) / 2;
            long res = mid * mid;
            if (res == num) {
                return  true;
            } else if (res < num) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return false;
    }
}
