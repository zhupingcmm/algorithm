package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);

        return result;
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
