package com.mf.algorithm;

public class Rob198 {
    public static void main(String[] args) {
        Rob198 rob198 = new Rob198();
        int result = rob198.rob(new int[]{1,2,3,1});
        System.out.println(result);
    }
    public int rob(int[] nums) {
        int n = nums.length;

        int [][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = nums[0];

        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
            dp[i][1] = dp[i-1][0] + nums[i];
        }

        return Math.max(dp[n-1][0], dp[n-1][1]);
    }
}
