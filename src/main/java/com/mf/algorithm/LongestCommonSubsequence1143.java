package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence1143 {
    private List<List<String>> result = new ArrayList<>();
    public static void main(String[] args) {
        LongestCommonSubsequence1143 longestCommonSubsequence = new LongestCommonSubsequence1143();
        longestCommonSubsequence.longestCommonSubsequence("abcde", "ace");
    }

    public void quick(String [] strings, int level, List<String> list){
        if (strings.length == level) {
            result.add(new ArrayList<>(list));
            return;
        }


        quick(strings, level + 1, list);

        list.add(strings[level]);
        quick(strings, level + 1, list);

        list.remove(list.size() -1);
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int [][] dp = new int[m + 1][n +1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
