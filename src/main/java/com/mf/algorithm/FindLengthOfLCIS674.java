package com.mf.algorithm;

import java.util.Arrays;

public class FindLengthOfLCIS674 {
    public static void main(String[] args) {
        FindLengthOfLCIS674 findLengthOfLCIS674 = new FindLengthOfLCIS674();
        System.out.println(findLengthOfLCIS674.findLengthOfLCIS(new int[]{1,3,5,4,7}));;
    }
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int len = nums.length;
        int [] dp = new int[len];
        Arrays.fill(dp, 1);

        for (int i = 1; i < len; i++) {
            if (nums[i] > nums[i-1]) {
                dp[i] = dp[i-1] + 1;
                max = Math.max(dp[i], max);
            }
        }

        return max;

    }
}
