package com.mf.algorithm;

import java.util.Stack;

public class IsValidBST98 {

    private long maxValue = Long.MIN_VALUE;
    private TreeNode preNode = null;
//    public boolean isValidBST(TreeNode root) {
//
//        if (root == null) return true;
//        if (!isValidBST(root.left)) return  false;
//
//        if (preNode !=null && preNode.val >= root.val) return false;
//
//        preNode = root;
//        return isValidBST(root.right) && isValidBST(root.left);
//    }


    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        boolean left = isValidBST(root.left);
        if (root.val > maxValue) {
            maxValue = root.val;
        } else {
            return false;
        }
        boolean right = isValidBST(root.right);
        return left && right;
    }

    private boolean dfs (TreeNode node) {
        if (node == null) return true;
        if (!dfs(node.left)) return false;
        if (node.val <= preNode.val) return false;
        preNode = node;
        return dfs(node.right);
    }
}
