package com.mf.algorithm;

public class Search704 {
    public static void main(String[] args) {
        Search704 search701 = new Search704();
        int result = search701.search(new int[]{-1,0,3,5,9,12}, 9);
        System.out.println(result);
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while (left <= right) {
            int mid = (right + left) / 2;
            int res = nums[mid];
            if (res == target) {
                return mid;
            } else if (res < target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }

        return -1;
    }
}
