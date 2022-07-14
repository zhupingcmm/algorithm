package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
//        helper(root, result);

        Stack<TreeNode> stack = new Stack<>();
        useStack(root, stack, result);
        return result;
    }
    private void useStack (TreeNode root, Stack<TreeNode> stack, List<Integer> result) {
        while (!stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            result.add(node.val);
            root = node.right;
        }
    }


    private void helper(TreeNode root, List<Integer> result) {
        if (root == null) return;
        if (root.left != null) {
           helper(root.left, result);
        }
        result.add(root.val);
        if (root.right != null) {
            helper(root.right, result);
        }

    }
}
