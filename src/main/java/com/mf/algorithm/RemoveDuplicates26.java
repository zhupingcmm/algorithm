package com.mf.algorithm;

public class RemoveDuplicates26 {
    public static void main(String[] args) {
        RemoveDuplicates26 removeDuplicates = new RemoveDuplicates26();
        removeDuplicates.removeDuplicates(new int[]{1,1,2});
    }

    public int removeDuplicates (int [] nums) {
        if (nums == null || nums.length == 0) return 0;
        int left = 0;
        int right = 1;
        while (right < nums.length) {
            if (nums[left] != nums[right]) {
                nums[left + 1] = nums[right];
                left++;
            }
            right++;
        }
        return left + 1;
    }
}
