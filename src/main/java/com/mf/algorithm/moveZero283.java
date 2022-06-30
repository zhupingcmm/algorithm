package com.mf.algorithm;

public class moveZero283 {

    public static void main(String[] args) {
        int [] nums = new int[] {0,1,0,3,12};

        moveZero283 moveZero283 = new moveZero283();
        moveZero283.moveZero(nums);
        System.out.println(nums.toString());
    }

    public void moveZero(int[] nums) {

        int lastZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastZeroIndex++] = nums[i];
            }
        }
        for (int i = lastZeroIndex; i < nums.length ; i++) {
            nums[i] = 0;
        }

    }
}
