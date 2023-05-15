package com.mf.algorithm;

public class Rob213 {
    public static void main(String[] args) {
        Rob213 rob213 = new Rob213();
        rob213.rob(new int[]{1,2,3,1});
    }

    public int rob(int[] nums) {

        int m = nums.length;
        if (m == 1) return nums[0];
        int [][] dp = new int[m][2];
        dp[0][0] = 0;
        dp[0][1] = 0;
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i-1][1] + nums[i];
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0]);
        }

        int max = Math.max(dp[m-1][0], dp[m-1][1]);

        dp = new int[m][2];
        dp[m-1][0] = 0;
        dp[m-1][1] = 0;
        for (int i = m-2; i >= 0; i--) {
            dp[i][0] = dp[i+1][1] + nums[i];
            dp[i][1] = Math.max(dp[i+1][1], dp[i+1][0]);
        }



        return Math.max(max, Math.max(dp[0][0], dp[0][1]));
    }
}
