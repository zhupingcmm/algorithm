package com.mf.algorithm;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("dog"));

    }

    public int solution(String S) {
        // Implement your solution here
        int cur = 0;
        int pre = 0;
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != 'a') {
                cur = i;
                int len = cur - pre;
                if (len > 3) return -1;
                if (len == 3) continue;
                if (S.charAt(pre) != 'a' && len == 2) count++;
                if (S.charAt(pre) != 'a' && len == 1) count +=2;
                if (len == 0) count +=2;

                pre = cur;
            }
        }
        if (pre == 0 && cur == 0 && count == 2) return -1;

        if (S.length() >0 && S.charAt(S.length() -1) != 'a') count+=2;
        if (S.length() >1 && S.charAt(S.length() - 1) == 'a' && S.charAt(S.length() -2) != 'a') count++;
        return count;
    }
}
