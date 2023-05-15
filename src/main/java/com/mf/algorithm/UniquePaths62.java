package com.mf.algorithm;

import java.util.Arrays;

public class UniquePaths62 {
    public static void main(String[] args) {
        UniquePaths62 paths = new UniquePaths62();
        int result = paths.uniquePaths(7,3);
        System.out.println(result);

    }

    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        Arrays.fill(dp[0], 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
//                dp[i][j] = Math.max(dp[i-1][j] + 1, dp[i][j-1] +1);
                dp[i][j] = dp[i-1][j] +  dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
}
