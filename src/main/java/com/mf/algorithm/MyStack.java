package com.mf.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {


    Queue<Integer> queue;
    public MyStack() {
        queue = new LinkedList<>();
    }

    // 在push方法中就完成了 栈的构建， 先进后出
    public void push(int x) {
        // 添加到队列尾部，先进先出
        queue.offer(x);
        // 排序
        int size = queue.size();
        while (size-- > 1) {
            // 从 队列头部 去元素放到队列尾部
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();

    }

    public boolean empty() {
         return queue.isEmpty();
    }


    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());
    }
}
