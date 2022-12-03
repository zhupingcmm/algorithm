package com.mf.algorithm;

public class MoveZero283 {

    public static void main(String[] args) {
        int [] nums = new int[] {0,1,0,3,12};

        MoveZero283 moveZero283 = new MoveZero283();
        moveZero283.moveZero(nums);
        System.out.println(nums.toString());
    }

    public void moveZero(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                nums[left++] = nums[right];
            }
        }


        for (int i = left; i < nums.length ; i++) {
            nums[i] = 0;
        }

    }
}
