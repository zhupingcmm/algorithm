package com.mf.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

public class EvalRPN150 {
    public static void main(String[] args) {
        EvalRPN150 evalRPN150 = new EvalRPN150();
        System.out.println( evalRPN150.evalRPN(new String[]{"4","13","5","/","+"}));
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        List<String> operator = Arrays.asList("+","-","*", "/");

        for (int i = 0; i < tokens.length; i++) {
            String item = tokens[i];
            if (operator.contains(item)) {
                int res;
                switch (item) {
                    case "+":
                       res =  stack.pop() + stack.pop();
                       break;
                    case "-":
                        int ele1 = stack.pop();
                        int ele2 = stack.pop();
                        res = ele2 - ele1;
                        break;
                    case "*":
                        res = stack.pop() * stack.pop();
                        break;
                    default:
                        int ele3 = stack.pop();
                        int ele4 = stack.pop();
                        res = ele4 / ele3;
                }
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(item));
            }
        }

        return stack.pop();
    }
}
