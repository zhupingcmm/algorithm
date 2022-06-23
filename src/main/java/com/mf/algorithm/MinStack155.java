package com.mf.algorithm;

import java.util.Stack;

public class MinStack155 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack155(){
        stack = new Stack<>();
        minStack = new Stack<>();

    }

    public void push(int val) {
        stack.push(val);
        if ( minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }

    }

    public int top () {
       return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
