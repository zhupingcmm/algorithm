package com.mf.algorithm;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal144 {

    public static void main(String[] args) {
        PreorderTraversal144 preorderTraversal144 = new PreorderTraversal144();
//        preorderTraversal144.preorderTraversal()
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);

        return result;
    }

    private void helper(TreeNode root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        if (root.left != null) helper(root.left, result);
        if (root.right != null) helper(root.right, result);
    }

}
