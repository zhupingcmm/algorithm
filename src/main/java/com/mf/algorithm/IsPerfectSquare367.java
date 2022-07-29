package com.mf.algorithm;

public class IsPerfectSquare367 {
    public static void main(String[] args) {
        IsPerfectSquare367 isPerfectSquare367 = new IsPerfectSquare367();
        boolean result = isPerfectSquare367.isPerfectSquare(16);
        System.out.println(result);

    }

    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        int mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            int target = mid * mid;
            if (target == num) {
                return true;
            } else if (target < num) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }

        return false;
    }
}
