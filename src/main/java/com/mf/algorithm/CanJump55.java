package com.mf.algorithm;

public class CanJump55 {
    public static void main(String[] args) {
        CanJump55 canJump55 = new CanJump55();
        System.out.println(canJump55.canJump(new int[]{3,2,1,0,4}));
    }

    public boolean canJump(int[] nums) {

        int cover = 0;
        // 从 第0 为开始计算 能覆盖的范围
        for (int i = 0; i <= cover; i++) {
            // 每次都需要计算覆盖的范围，
            cover = Math.max(nums[i] + i, cover);
            if (cover >= nums.length -1) {
                return true;
            };
        }
        return false;
    }
}
