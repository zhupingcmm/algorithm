package com.mf.algorithm;

public class Rob198 {
    public static void main(String[] args) {
        Rob198 rob198 = new Rob198();
        int result = rob198.rob(new int[]{2,1,1,2});
        System.out.println(result);
    }
    public int rob(int[] nums) {
        int len = nums.length;
        // dp [i][j] 表示下表为i
        int [][] dp = new int[len][2];

        dp[0][0] = 0;
        dp[0][1] = nums[0];

        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i-1][1], dp[i-1][0]);
            dp[i][1] = dp[i-1][0] + nums[i];
        }

        return Math.max(dp[len-1][0], dp[len-1][1]);
    }
}
