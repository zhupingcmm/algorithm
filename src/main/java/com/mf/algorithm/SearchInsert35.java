package com.mf.algorithm;

public class SearchInsert35 {
    public static void main(String[] args) {
        SearchInsert35 searchInsert35 = new SearchInsert35();
        int result = searchInsert35.searchInsert(new int[]{1, 3, 5, 6}, 5);
        System.out.println(result);
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) /2;
            int res = nums[mid];
            if (res == target) {
                return mid;
            } else if (res < target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return left;
    }
}
