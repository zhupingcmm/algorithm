package com.mf.algorithm;

public class UniquePathsWithObstacles63 {
    public static void main(String[] args) {
        UniquePathsWithObstacles63 uniquePathsWithObstacles63 = new UniquePathsWithObstacles63();
//        int [] a = new int[]{0,0,0};
//        int [] b = new int[]{0,1,0};
//        int [] c = new int[]{0,0,0};
//        int [][] abc = new int[3][3];
//        abc[0] = a;
//        abc[1] = b;
//        abc[2] = c;
        int [] a = new int[]{0};
        int [][] abc = new int[1][1];
        abc[0] = a;
        uniquePathsWithObstacles63.uniquePathsWithObstacles(abc);
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] ==1 || obstacleGrid[m-1][n-1] ==1) return 0;

        int [][] dp = new int[m][n];

        for (int i = 0; i < m && obstacleGrid[i][0] != 1; i++) {
            dp[i][0] = 1;
        }

        for (int i = 0; i < n && obstacleGrid[0][i] != 1; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] != 1) {
                    dp[i][j] = dp[i -1][j] + dp[i][j-1];
                }
            }
        }

        return dp[m-1][n-1];
    }
}
