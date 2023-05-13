package com.mf.algorithm;

public class Rob213 {
    public static void main(String[] args) {
        Rob213 rob213 = new Rob213();
        rob213.rob(new int[]{1});
    }

    public int rob(int[] nums) {
        if (nums.length ==1) return nums[0];
        int max = Integer.MIN_VALUE;
        int len = nums.length;
        int [][] dp = new int[len][2];

        dp[0][0] = 0;
        dp[0][1] = 0;

        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
            dp[i][1] = dp[i-1][0] + nums[i];
        }
        max = Math.max(dp[len-1][0], dp[len-1][1]);


        dp = new int[len][2];

        dp[len-1][0] = 0;
        dp[len-1][1] = 0;
        for (int i = len -2; i >= 0; i--) {
            dp[i][0] = Math.max(dp[i+1][0], dp[i+1][1]);
            dp[i][1] = dp[i+1][0] + nums[i];
        }
        max = Math.max(max, Math.max(dp[0][1], dp[0][0]));


        return max;
    }
}
