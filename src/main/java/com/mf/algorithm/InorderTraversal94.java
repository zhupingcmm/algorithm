package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        quick(root, result);

//        Stack<TreeNode> stack = new Stack<>();
        useStack(root, result);
        return result;
    }


    private void dfs (TreeNode node, List<Integer> result) {
        if (node == null) return;
        dfs(node.left, result);
        result.add(node.val);
        dfs(node.right, result);
    }

    private void useStack (TreeNode root, List<Integer> result) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
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

    private void quick(TreeNode root, List<Integer> result) {
        if (root == null) return;
        if (root.left != null) {
            quick(root.left, result);
        }

        result.add(root.val);

        if (root.right != null) {
            quick(root.right, result);
        }
    }
}
