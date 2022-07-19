package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis22 {
    public static void main(String[] args) {
        GenerateParenthesis22 generateParenthesis22 = new GenerateParenthesis22();
        generateParenthesis22.generateParenthesis(3);

    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(0, 0, n, "", result);
        System.out.println(result);
        return result;
    }

    public void generate(int left, int right , int n , String s, List<String> result) {
        if (left == n && right == n) {
            result.add(s);
            return;
        }

        if (left < n) {
            generate(left + 1, right, n, s + "(", result);
        }

        if (right < left) {
            generate(left, right + 1, n, s + ")", result);
        }
    }

}
