package com.mf.algorithm;

public class LowestCommonAncestor236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;

        // 左
        TreeNode left = lowestCommonAncestor(root.left, p, q);

        // 右
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left !=null && right != null) return root;
        if (left == null && right != null) return right;
        if (left != null && right == null) return left;
        return null;
    }
}
