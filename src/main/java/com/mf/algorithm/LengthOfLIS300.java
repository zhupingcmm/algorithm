package com.mf.algorithm;

import java.util.Arrays;

public class LengthOfLIS300 {
    public static void main(String[] args) {
        LengthOfLIS300 lengthOfLIS300 = new LengthOfLIS300();
        int result = lengthOfLIS300.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18});
        System.out.println(result);
    }

    public int lengthOfLIS(int[] nums) {
        if(nums.length == 1) return 1;
        int len = nums.length;
        // dp[i] 表示 nums 中 第i 位元素的最长子序列
        int [] dp = new int[len];
        // nums 中的每位元素和自己比都是自增 所以dp数组都初始化为1
        Arrays.fill(dp, 1);
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
