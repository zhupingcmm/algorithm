package com.mf.algorithm;

public class RemoveDuplicates26 {
    public static void main(String[] args) {
        RemoveDuplicates26 removeDuplicates = new RemoveDuplicates26();
        removeDuplicates.removeDuplicates(new int[]{1,1,2});
    }

    public int removeDuplicates (int [] nums) {

        int index = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[index] != nums[i]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }
}
