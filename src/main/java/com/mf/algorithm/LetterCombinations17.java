package com.mf.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations17 {
    HashMap<Character, String> map = new HashMap<>();
    private List<String> result = new ArrayList<>();
    private List<Character> paths = new ArrayList<>();

    public static void main(String[] args) {
        LetterCombinations17 letterCombinations17 = new LetterCombinations17();

        List<String> res = letterCombinations17.letterCombinations("23");
        System.out.println(res);
    }

    public List<String> letterCombinations(String digits) {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        if ("".equals(digits)) return result;
        dfs(0, digits);
        return result;

    }

    private void dfs(int startIndex, String digits) {
        if (paths.size() == digits.length()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < paths.size(); i++) {
                sb.append(paths.get(i));
            }
            result.add(sb.toString());
            return;
        }

        String str = map.get(digits.charAt(startIndex));
        for (int i = 0; i < str.length(); i++) {
            paths.add(str.charAt(i));
            dfs(startIndex + 1, digits);
            paths.remove(paths.size() -1);
        }

    }





}
