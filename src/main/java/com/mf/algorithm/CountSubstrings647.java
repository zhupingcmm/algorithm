package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class CountSubstrings647 {


    public static void main(String[] args) {
        CountSubstrings647 countSubstrings647 = new CountSubstrings647();
        System.out.println(countSubstrings647.countSubstrings("aaa"));
    }

    public int countSubstrings(String s) {
        int len = s.length();
        // dp[i][j] 表示 以i 结尾 和以j结尾 回文子串的个数
        int count = 0;
        boolean [][] dp = new boolean[len][len];
        for (int i = s.length() -1; i >= 0; i--) {
            for (int j = i; j < len ; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 1) {
                        dp[i][j] = true;
                    } else if (dp[i+1][j-1]){
                        dp[i][j] = true;
                    }
                    if (dp[i][j]) count++;
                }
            }
        }
        return count;

    }
}
