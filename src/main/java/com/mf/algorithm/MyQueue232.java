package com.mf.algorithm;

import java.util.Stack;

public class MyQueue232 {

    Stack<Integer> in;
    Stack<Integer> out;

    public MyQueue232() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        insert();
        return out.pop();
    }

    public int peek() {
        insert();
        return out.peek();
    }

    public boolean empty() {
        return in.empty() && out.isEmpty();
    }
    private void insert(){
        if (out.empty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
    }
}
