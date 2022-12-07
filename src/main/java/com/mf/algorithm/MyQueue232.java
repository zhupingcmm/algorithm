package com.mf.algorithm;

import java.util.Stack;

public class MyQueue232 {

    private Stack<Integer> in = new Stack();
    private Stack<Integer> out = new Stack();

    public MyQueue232() {

    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        dataIn();
        return out.pop();
    }

    public int peek() {
        dataIn();
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }


    private void dataIn () {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
    }
}
