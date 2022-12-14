package com.mf.algorithm;

public class SearchBST700 {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;

        TreeNode node = null;

        if (val < root.val) {
            node = searchBST(root.left, val);
        }
        if (val > root.val) {
           node = searchBST(root.right, val);
        }
        return node;
    }
}
