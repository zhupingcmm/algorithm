package com.mf.algorithm;

public class CanJump55 {
    public static void main(String[] args) {
        CanJump55 canJump55 = new CanJump55();
        System.out.println(canJump55.canJump(new int[]{3,0,8,2,0,0,1}));
    }

    public boolean canJump(int[] nums) {

        int cover = 0;
        for (int i = 0; i <= cover; i++) {

           cover = Math.max(nums[i] + i, cover);
           if (nums.length -1 <= cover) {
               return true;
           }
        }
        return false;
    }
}
