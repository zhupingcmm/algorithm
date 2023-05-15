package com.mf.algorithm;

public class Rob198 {
    public static void main(String[] args) {
        Rob198 rob198 = new Rob198();
        int result = rob198.rob(new int[]{2,1,1,2});
        System.out.println(result);
    }
    public int rob(int[] nums) {
        int m = nums.length;
        // dp[i][0] 表示 下标为 i 的人家被偷，偷到最大金额
        // dp[i][1] 表示 下标为 i 的人家不被偷，偷到最大金额
        int [][] dp = new int[m][2];
        dp[0][0] = nums[0];
        dp[0][1] = 0;
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i-1][1] + nums[i];
            dp[i][1] = Math.max(dp[i-1][0], dp[i-1][1]);
        }

        return Math.max(dp[m-1][0], dp[m-1][1]);
    }
}
