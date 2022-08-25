package com.mf.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class IsValid20 {
    public static void main(String[] args) {
        IsValid20 isValid20 = new IsValid20();
        boolean result = isValid20.isValid("]");
        System.out.println(result);
    }

    public boolean isValid(String s) {
        Map<String, String> map = new HashMap<>();
        map.put(")", "(");
        map.put("]", "[");
        map.put("}", "{");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String item = String.valueOf(s.charAt(i));
            if (!map.containsKey(item)) {
                //左括号
                stack.push(item);
            } else {
                //右括号
                if (stack.isEmpty()) return false;
                if (!Objects.equals(map.get(item), stack.pop())) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
