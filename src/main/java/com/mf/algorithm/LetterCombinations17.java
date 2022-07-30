package com.mf.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations17 {
    private List<String> result = new ArrayList<>();
    public static void main(String[] args) {
        LetterCombinations17 letterCombinations = new LetterCombinations17();
        letterCombinations.letterCombinations("23");
    }
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        dfs(0, digits, "", result, map);
        System.out.println(result);
        return result;
    }

    private void dfs (int level, String digits, String s, List<String> result, HashMap<String, String> map) {
        if (level == digits.length()) {
            result.add(s);
            return;
        }

        String letters = map.get(String.valueOf(digits.charAt(level)));

        for (int j = 0; j <letters.length(); j++) {
            dfs(level + 1, digits, s + letters.charAt(j), result, map);
        }
    }

}
