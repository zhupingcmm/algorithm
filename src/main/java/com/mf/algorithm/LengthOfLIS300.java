package com.mf.algorithm;

import java.util.Arrays;

public class LengthOfLIS300 {
    public static void main(String[] args) {
        LengthOfLIS300 lengthOfLIS300 = new LengthOfLIS300();
        int result = lengthOfLIS300.lengthOfLIS(new int[]{0,1,0,3,2,3});
        System.out.println(result);
    }

    public int lengthOfLIS(int[] nums) {
        int max = Integer.MIN_VALUE;
        int len = nums.length;
        int [] dp = new int[len];
        dp[0] = 1;
        for (int i = 1; i < len; i++) {
            for (int j = 1; j <i ; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = dp[j] + 1;
                }
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
