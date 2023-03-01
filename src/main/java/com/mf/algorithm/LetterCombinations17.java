package com.mf.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations17 {
    public static void main(String[] args) {
        LetterCombinations17 letterCombinations = new LetterCombinations17();
        System.out.println(letterCombinations.letterCombinations(""));;
    }

    private List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits == null || "".equals(digits)) return result;

        HashMap<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        dfs(0, "", digits, map);
        return result;
    }

    private void dfs(int index, String s, String digits, HashMap<String, String> map){
        if (digits.length() == index) {
            result.add(s);
            return;
        }

        String res = map.get(String.valueOf(digits.charAt(index)));

        for (int i = 0; i < res.length(); i++) {
            dfs(index + 1, s + res.charAt(i),  digits, map);
        }
    }

}
