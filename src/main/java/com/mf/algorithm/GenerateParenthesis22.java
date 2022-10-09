package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis22 {
    public static void main(String[] args) {
        GenerateParenthesis22 generateParenthesis22 = new GenerateParenthesis22();
        List<String> abc  = generateParenthesis22.generateParenthesis(3);
        System.out.println(abc.size());
        System.out.println(abc);
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        dfs(0, 0, n,"",  result);
        return result;
    }

    private void dfs(int left, int right, int n,String s , List<String> result){
        if (left == n && right ==n){
            result.add(s);
            return;
        }

        if (left < n) dfs(left + 1, right, n, s + "(", result);
        if (right < left) dfs(left, right + 1, n, s + ")", result);

    }




}
