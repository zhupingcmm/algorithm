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
            char item = s.charAt(i);
            if (!stack.isEmpty()) {
                if (stack.peek() == item) {
                    stack.pop();
                } else {
                    stack.push(item);
                }
            } else {
                stack.push(item);
            }
        }
        int len = stack.size() -1;
        char [] chars = new char[len + 1];
        while (!stack.isEmpty()) {
            chars[len--] = stack.pop();
        }
        return new String(chars);

    }
}
