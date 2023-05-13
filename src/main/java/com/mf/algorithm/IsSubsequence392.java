package com.mf.algorithm;

public class IsSubsequence392 {
    public static void main(String[] args) {
        IsSubsequence392 isSubsequence392 = new IsSubsequence392();
        System.out.println(isSubsequence392.isSubsequence("abc", "ahbgdc"));;
    }
    public boolean isSubsequence(String s, String t) {
        if ("".equals(s)) return true;
        int m = s.length();
        int n = t.length();
        int [][] dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i-1) == t.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
                if (dp[i][j] >= m) return true;
            }
        }

        return false;

    }
}
