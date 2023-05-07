package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence1143 {
    private List<List<String>> result = new ArrayList<>();
    public static void main(String[] args) {
        LongestCommonSubsequence1143 longestCommonSubsequence = new LongestCommonSubsequence1143();
        System.out.println(longestCommonSubsequence.longestCommonSubsequence("abcde", "ace"));
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
        int len1 = text1.length();
        int len2 = text2.length();

        int [][] dp = new int[len1 + 1][len2 +1];
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[len1][len2];
    }
}
