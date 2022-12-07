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

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']','[');
        map.put('}', '{');
        for (int i = 0; i < s.length(); i++) {
            Character val = s.charAt(i);
            if (map.values().contains(val)) {
                stack.push(s.charAt(i));
            } else {
                if ( stack.isEmpty() || stack.peek() != map.get(val)) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
