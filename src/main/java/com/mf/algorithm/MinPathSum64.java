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
        int [][] dp = grid;
//        Arrays.fill(grid);
        for (int i = m; i > 0 ; i--) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]);
            }

        }
        return dp[0][0];
    }
}
