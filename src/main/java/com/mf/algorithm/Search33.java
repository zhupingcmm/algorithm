package com.mf.algorithm;

public class Search33 {
    public static void main(String[] args) {

        Search33 search33 = new Search33();
        int result = search33.search(new int[]{4,5,6,7,0,1,2}, 0);
        System.out.println(result);
    }
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int mid;
        while (left <= right) {
            mid = (left + right)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[left] <= nums[mid]) {
                // 前半段有序
                if (nums[left] <= target && target <nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // 后半段有序
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid -1;
                }
            }
        }
        return -1;

    }
}
