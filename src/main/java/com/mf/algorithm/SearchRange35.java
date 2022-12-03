package com.mf.algorithm;

public class SearchRange35 {

    public static void main(String[] args) {
        SearchRange35 searchInsert35 = new SearchRange35();
        System.out.println(searchInsert35.searchRange(new int[]{5,7,7,8,8,10}, 8));;
    }

    public int[] searchRange(int[] nums, int target) {
        int [] range = new int[]{-1, -1};
        if (nums.length == 0) return range;
        int left = 0;
        int right = nums.length -1;
        // 求左边界
        while (left < right) {
            int mid = (left + right) /2;
            int res = nums[mid];
            if (res >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (nums[left] != target) return range;
        range[0] = left;
        right = nums.length - 1;
        while (left < right) {
            int mid = (left + right + 1)/2;
            int res = nums[mid];
            if (res <= target) {
                left = mid;
            } else {
                right = mid -1;
            }
        }
        range[1] = right;

        return range;
    }
}
