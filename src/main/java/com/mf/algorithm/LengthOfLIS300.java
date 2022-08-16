package com.mf.algorithm;

import java.util.Arrays;

public class LengthOfLIS300 {
    public static void main(String[] args) {
        LengthOfLIS300 lengthOfLIS300 = new LengthOfLIS300();
        int result = lengthOfLIS300.lengthOfLIS(new int[]{0,1,0,3,2,3});
        System.out.println(result);
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int [] dp = new int[n];

        dp[0] = 1;
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
