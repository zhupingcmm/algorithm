package com.mf.algorithm;

public class RemoveDuplicates26 {
    public static void main(String[] args) {
        RemoveDuplicates26 removeDuplicates = new RemoveDuplicates26();
        removeDuplicates.removeDuplicates(new int[]{1,1,2});
    }

    public int removeDuplicates (int [] nums) {

        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }
}
