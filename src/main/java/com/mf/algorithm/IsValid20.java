package com.mf.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class IsValid20 {
    public static void main(String[] args) {
        IsValid20 isValid20 = new IsValid20();
        boolean result = isValid20.isValid(")");
        System.out.println(result);
    }

    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            if (map.containsKey(key)) {
                // 右括号 需要进行判断
                if (stack.isEmpty()) return false;
                Character item = stack.peek();
                if (map.get(key).equals(item)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                // 左括号 直接放入
                stack.push(key);
            }
        }


        return stack.isEmpty();
    }
}
