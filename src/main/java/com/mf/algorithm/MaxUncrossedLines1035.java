package com.mf.algorithm;

public class MaxUncrossedLines1035 {

    public static void main(String[] args) {
        MaxUncrossedLines1035 maxUncrossedLines1035 = new MaxUncrossedLines1035();
        System.out.println( maxUncrossedLines1035.maxUncrossedLines(new int[]{2,5,1,2,5},  new int[]{10,5,2,1,5,2}));
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int [][] dp = new int[m+1][n+1];

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {
                if (nums1[i -1] == nums2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        return dp[m][n];
    }

}
