package com.mf.algorithm;

public class Rob213 {
    public static void main(String[] args) {
        Rob213 rob213 = new Rob213();
        rob213.rob(new int[]{1});
    }

    public int rob(int[] nums) {

        int n = nums.length;
        if (n <=1) return nums[1];
        int [][] dp1 = new int[n][2];
        dp1[0][1] = 0;
        dp1[0][0] = 0;
        for (int i = 1; i < n; i++) {
            dp1[i][1] = dp1[i-1][0] + nums[i];
            dp1[i][0] = Math.max(dp1[i-1][0], dp1[i-1][1]);
        }

        int max = Math.max(dp1[n-1][0], dp1[n-1][1]);

        int [][] dp2 = new int[n][2];
        dp2[n-1][0] =0;
        dp2[n-1][1] =0;
        for (int i = n -2; i >=0 ; i--) {
            dp2[i][1] = dp2[i+1][0] + nums[i];
            dp2[i][0] = Math.max(dp2[i+1][0],dp2[i+1][1]);
        }
       max = Math.max(max, Math.max(dp2[0][0], dp2[0][1]));
        return max;

    }
}
