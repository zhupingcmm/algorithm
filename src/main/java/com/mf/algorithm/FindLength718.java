package com.mf.algorithm;

public class FindLength718 {

    public static void main(String[] args) {
        FindLength718 findLength718 = new FindLength718();
        System.out.println(findLength718.findLength(new int[]{1,2,3,2,1}, new int[]{3,2,1,4,7}));;
    }

    public int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int [][] dp = new int[m + 1][n + 1];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (nums1[i-1] == nums2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                max = Math.max(max, dp[i][j]);
            }

        }

        return max;
    }
}
