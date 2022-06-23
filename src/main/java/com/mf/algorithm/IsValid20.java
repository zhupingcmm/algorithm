package com.mf.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IsValid20 {
    public static void main(String[] args) {
        IsValid20 isValid20 = new IsValid20();
        boolean result = isValid20.isValid(")");
        System.out.println(result);
    }

    public boolean isValid(String s) {
        String [] data = s.split("");
        if (data.length <=1) return false;
        Stack<String> stack = new Stack<>();
        Map<String, String> map = new HashMap<>();
        map.put("]", "[");
        map.put(")", "(");
        map.put("}", "{");
        for (int i = 0; i < data.length; i++) {
            String item = data[i];
            if (!map.keySet().contains(item)) {
                stack.push(item);
            } else {
                if (!stack.isEmpty()) {
                    if (!map.get(item).equals(stack.pop())) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }
}
