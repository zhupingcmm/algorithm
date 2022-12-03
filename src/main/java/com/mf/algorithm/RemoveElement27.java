package com.mf.algorithm;

public class RemoveElement27 {
    public static void main(String[] args) {

        RemoveElement27 removeElement27 = new RemoveElement27();
        int result = removeElement27.removeElement(new int[]{3,2,2,3}, 3);
        System.out.println(result);
    }

    public int removeElement(int[] nums, int val) {

        int left = 0;
        for (int right = 0; right < nums.length ; right++) {
            if (nums[right] != val) {
                nums[left++] = nums[right];
            }
        }
        System.out.println(nums.toString());

        return left;
    }
}
