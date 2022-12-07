package com.mf.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class EvalRPN150 {
    public static void main(String[] args) {
        EvalRPN150 evalRPN150 = new EvalRPN150();
        evalRPN150.evalRPN(new String[]{"4","13","5","/","+"});
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        List <String> operations = Arrays.asList("+", "-", "*", "/");

        for (int i = 0; i < tokens.length; i++) {
            String item = tokens[i];
            if (!operations.contains(item)) {
                stack.push(Integer.parseInt(item));
            } else {
                int res;
                switch (item) {
                    case "*":
                        res =  stack.pop()  *  stack.pop();
                        break;
                    case "+":
                        res =  stack.pop()  +  stack.pop();
                        break;
                    case "-":
                        res = -stack.pop() + stack.pop();
                        break;
                    default:
                        int item1 = stack.pop();
                        int item2 = stack.pop();
                        res = item2 / item1;
                }

               stack.push(res);
            }
        }
        return stack.pop();

    }
}
