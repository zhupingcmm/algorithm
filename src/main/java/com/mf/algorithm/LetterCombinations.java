package com.mf.algorithm;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    private List<String> result = new ArrayList<>();
    public static void main(String[] args) {
        LetterCombinations letterCombinations = new LetterCombinations();
        letterCombinations.letterCombinations("");
    }
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        dfs(digits, 0, map, "");
        return result;
    }

    private void dfs (String digits, int level, Map<Integer, String> map, String s) {
        if (level == digits.length()) {
            result.add(s);
            return;
        }
        Character character =  digits.charAt(level);
        String letters = map.get(Integer.parseInt(String.valueOf(character)));
        for (int i = 0; i < letters.length(); i++) {
            dfs(digits, level + 1, map, s + letters.charAt(i));
        }
    }
}
