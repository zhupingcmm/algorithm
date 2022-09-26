package com.mf.algorithm;

import java.util.Arrays;

public class MaxProduct152 {
    public static void main(String[] args) {
        MaxProduct152 maxProduct152 = new MaxProduct152();
        maxProduct152.maxProduct(new int[]{2,3,-2,4});
    }

    public int maxProduct(int[] nums) {
        int [] dp = new int[nums.length +1];
        Arrays.fill(dp, 1);
        dp[0] = nums[0];
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1], nums[i]* dp[i-1]);
        }

        return result;
    }
}
