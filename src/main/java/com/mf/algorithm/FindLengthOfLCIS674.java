package com.mf.algorithm;

import java.util.Arrays;

public class FindLengthOfLCIS674 {
    public static void main(String[] args) {
        FindLengthOfLCIS674 findLengthOfLCIS674 = new FindLengthOfLCIS674();
        System.out.println(findLengthOfLCIS674.findLengthOfLCIS(new int[]{1,3,5,4,7}));;
    }
    public int findLengthOfLCIS(int[] nums) {


        if (nums.length == 1) return 1;
        int m = nums.length;
        int [] dp = new int[m];
        Arrays.fill(dp, 1);
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < m; i++) {
            if (nums[i] > nums[i-1]) {
                dp[i] = dp[i-1] + 1;
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
