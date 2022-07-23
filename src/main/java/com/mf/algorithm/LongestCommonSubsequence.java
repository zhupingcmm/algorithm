package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {
    private List<List<String>> result = new ArrayList<>();
    public static void main(String[] args) {
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        longestCommonSubsequence.quick(new String[]{"a","b","c","d","e"}, 0, new ArrayList<>());
        System.out.println(longestCommonSubsequence.result.size());
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
        return 0;
    }
}
