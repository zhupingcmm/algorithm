package com.mf.algorithm;

public class CanJump55 {
    public static void main(String[] args) {
        CanJump55 canJump55 = new CanJump55();
        System.out.println(canJump55.canJump(new int[]{3,2,1,0,4}));
    }

    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;

        int cover = 0;
        for (int i = 0; i <= cover; i++) {
            cover = Math.max(cover, nums[i] + i);
            if (cover >= nums.length) return true;
        }
        return false;
    }
}
