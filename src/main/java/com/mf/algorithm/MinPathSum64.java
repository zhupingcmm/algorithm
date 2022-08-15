package com.mf.algorithm;

import java.util.Arrays;

public class MinPathSum64 {
    public static void main(String[] args) {
        MinPathSum64 minPathSum64 = new MinPathSum64();
        int [][] p = new int[3][3];
        p[0] = new int[]{1,3,1};
        p[1] = new int[]{1,5,1};
        p[2] = new int[]{4,2,1};
        minPathSum64.minPathSum(p);
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < m ; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }

        }
        return dp[m-1][n-1];
    }
}
