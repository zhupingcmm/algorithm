package com.mf.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumTotal120 {
    public static void main(String[] args) {
        MinimumTotal120 minimumTotal = new MinimumTotal120();
        List<List<Integer>>list = new ArrayList<>();
        list.add(Arrays.asList(2));
        list.add(Arrays.asList(3,4));
        list.add(Arrays.asList(6,5,7));
        list.add(Arrays.asList(4,1,8,3));

        int result = minimumTotal.minimumTotal(list);
        System.out.println(result);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int [][] dp = new int[n + 1][n + 1];
        for (int i = n -1; i >= 0 ; i--) {
            for (int j = 0; j <= i ; j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i+1][j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }
}
