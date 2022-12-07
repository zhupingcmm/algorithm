package com.mf.algorithm;

import java.util.Stack;

public class RemoveDuplicates1047 {

    public static void main(String[] args) {
        RemoveDuplicates1047 removeDuplicates1047 = new RemoveDuplicates1047();
        System.out.println(removeDuplicates1047.removeDuplicates("abbaca"));

    }

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() || stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }
        }

        char [] chars = new char[stack.size()];

        for (int i = stack.size() -1 ; i >= 0; i--) {
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
}
